package main;

import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.eclipse.jdt.annotation.NonNull;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

/**
 * Mimetype enum generator based on Apacha Tika.
 * Launching the main will build a "MimeType.java" file with is an enum class of all Tika mimetypes founded in org.apache.tika.mime.tika-mimetypes.xml loaded from classloader.
 *
 * @author Charlotte
 */
public class GenerateTikaEnum {

    public static void main(final String[] args) throws IOException, SAXException, ParserConfigurationException {
        final InputStream fileStream = GenerateTikaEnum.class.getResourceAsStream("/org/apache/tika/mime/tika-mimetypes.xml");
        final DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
        final DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
        final Document doc = dBuilder.parse(fileStream);

        // optional, but recommended
        // read this - http://stackoverflow.com/questions/13786607/normalization-in-dom-parsing-with-java-how-does-it-work
        doc.getDocumentElement().normalize();

        System.out.println("Root element :" + doc.getDocumentElement().getNodeName());

        final NodeList nList = doc.getElementsByTagName("mime-type");

        System.out.println("----------------------------");

        final GenerateTikaEnum generateTikaEnum = new GenerateTikaEnum();

        final List<@NonNull MimeType> mimetypes = new ArrayList<>();
        for (int temp = 0; temp < nList.getLength(); temp++) {
            final Node nNode = nList.item(temp);
            if (nNode.getNodeType() == Node.ELEMENT_NODE) {
                final Element mimeTypeElement = (Element) nNode;
                final String type = mimeTypeElement.getAttribute("type");

                if (type != null) {
                    final MimeType mimeType = generateTikaEnum.new MimeType(type);
                    final NodeList globs = mimeTypeElement.getElementsByTagName("glob");
                    for (int i = 0; i < globs.getLength(); i++) {
                        final Element glob = (Element) globs.item(i);
                        final String pattern = glob.getAttribute("pattern");
                        if (pattern != null && pattern.startsWith("*.")) {
                            final String extension = pattern.substring(2);
                            if (extension.length() > 0) {
                                mimeType.addExtension(extension);
                            }
                        }
                    }

                    mimetypes.add(mimeType);
                }
            }
        }

        try {
            final Path file = Paths.get("D:/Projets Java/JTika/javasource/main/MimeType.java");

            final List<@NonNull String> javaLines = new ArrayList<>();

            javaLines.add("package main;");
            javaLines.add("");
            javaLines.add("import java.util.Arrays;");
            javaLines.add("import java.util.List;");
            javaLines.add("");
            javaLines.add("import org.eclipse.jdt.annotation.NonNull;");
            javaLines.add("import org.eclipse.jdt.annotation.Nullable;");
            javaLines.add("");
            javaLines.add("/**");
            javaLines.add(" * MimeType enumation.");
            javaLines.add(" *");
            javaLines.add(" * @author Welle Charlotte");
            javaLines.add(" */");
            javaLines.add("public enum MimeType {");
            javaLines.add("");
            for (final @NonNull MimeType mimeType : mimetypes) {
                final String mimeTypeName = mimeType.getMimeType();
                final String javaConstantName = generateJavaEnumName(mimeTypeName);
                javaLines.add("    /**");
                javaLines.add("     * " + javaConstantName + ".");
                javaLines.add("     */");
                final StringBuilder sb = new StringBuilder();
                sb.append("    ");
                sb.append(javaConstantName);
                sb.append("(\"");
                sb.append(mimeTypeName);
                sb.append("\"");
                final List<@NonNull String> extensions = mimeType.getExtensionsList();
                for (int i = 0; i < extensions.size(); i++) {
                    final String ext = extensions.get(i);
                    sb.append(", \"");
                    sb.append(ext);
                    sb.append("\"");
                }
                sb.append("),");
                final String javaLine = sb.toString();
                assert javaLine != null;
                javaLines.add(javaLine);
                javaLines.add("");
            }
            javaLines.add("    /**");
            javaLines.add("     * UNKNOWN.");
            javaLines.add("     */");
            final StringBuilder sb = new StringBuilder();
            sb.append("    UNKNOWN(\"\");");
            final String javaLine = sb.toString();
            assert javaLine != null;
            javaLines.add(javaLine);
            javaLines.add("");
            javaLines.add("    @NonNull");
            javaLines.add("    private final String value;");
            javaLines.add("    @NonNull");
            javaLines.add("    private List<@NonNull String> extensionsList;");
            javaLines.add("    private final boolean isImage;");
            javaLines.add("    private final boolean isAudio;");
            javaLines.add("    private final boolean isText;");
            javaLines.add("    private final boolean isVideo;");
            javaLines.add("");
            javaLines.add("    MimeType(@NonNull final String value, @NonNull String @NonNull... extensions) {");
            javaLines.add("        this.value = value;");
            javaLines.add("        this.extensionsList = Arrays.asList(extensions);");
            javaLines.add("        this.isImage = value.startsWith(\"image/\");");
            javaLines.add("        this.isAudio = value.startsWith(\"audio/\");");
            javaLines.add("        this.isText = value.startsWith(\"text/\");");
            javaLines.add("        this.isVideo = value.startsWith(\"video/\");");
            javaLines.add("    }");
            javaLines.add("");
            javaLines.add("    /**");
            javaLines.add("     * Get the value.");
            javaLines.add("     * ");
            javaLines.add("     * @return value.");
            javaLines.add("     */");
            javaLines.add("    @NonNull");
            javaLines.add("    public final String getValue() {");
            javaLines.add("        return this.value;");
            javaLines.add("    }");
            javaLines.add("");
            javaLines.add("    /**");
            javaLines.add("     * Is MimeType of type image ?");
            javaLines.add("     * ");
            javaLines.add("     * @return <code>true</code> if MimeType of type image.");
            javaLines.add("     */");
            javaLines.add("    public final boolean isImage() {");
            javaLines.add("        return this.isImage;");
            javaLines.add("    }");
            javaLines.add("");
            javaLines.add("    /**");
            javaLines.add("     * Is MimeType of type audio ?");
            javaLines.add("     * ");
            javaLines.add("     * @return <code>true</code> if MimeType of type audio.");
            javaLines.add("     */");
            javaLines.add("    public final boolean isAudio() {");
            javaLines.add("        return this.isAudio;");
            javaLines.add("    }");
            javaLines.add("");
            javaLines.add("    /**");
            javaLines.add("     * Is MimeType of type text ?");
            javaLines.add("     * ");
            javaLines.add("     * @return <code>true</code> if MimeType of type text.");
            javaLines.add("     */");
            javaLines.add("    public final boolean isText() {");
            javaLines.add("        return this.isText;");
            javaLines.add("    }");
            javaLines.add("");
            javaLines.add("    /**");
            javaLines.add("     * Is MimeType of type video ?");
            javaLines.add("     * ");
            javaLines.add("     * @return <code>true</code> if MimeType of type video.");
            javaLines.add("     */");
            javaLines.add("    public final boolean isVideo() {");
            javaLines.add("        return this.isVideo;");
            javaLines.add("    }");
            javaLines.add("");
            javaLines.add("    /**");
            javaLines.add("     * Get MimeType enum value corresponding to the given String mimeType.");
            javaLines.add("     * ");
            javaLines.add("     * @param mimeType");
            javaLines.add("     * @return MimeType");
            javaLines.add("     */");
            javaLines.add("    @NonNull");
            javaLines.add("    public static final MimeType getMimeType(@Nullable final String mimeType) {");
            javaLines.add("        if (mimeType == null) {");
            javaLines.add("            return UNKNOWN;");
            javaLines.add("        } else {");
            javaLines.add("            for (final MimeType e : MimeType.values()) {");
            javaLines.add("                if (mimeType.equals(e.getValue())) {");
            javaLines.add("                    return e;");
            javaLines.add("                }");
            javaLines.add("            }");
            javaLines.add("        }");
            javaLines.add("        return UNKNOWN;");
            javaLines.add("    }");
            javaLines.add("");
            javaLines.add("    /**");
            javaLines.add("     * Get MimeType enum value corresponding to the given String extension.");
            javaLines.add("     * ");
            javaLines.add("     * @param extension");
            javaLines.add("     * @return MimeType");
            javaLines.add("     */");
            javaLines.add("    @NonNull");
            javaLines.add("    public static final MimeType getMimeTypeByExtension(@Nullable final String extension) {");
            javaLines.add("        if (extension == null || extension.length() == 0) {");
            javaLines.add("            return UNKNOWN;");
            javaLines.add("        } else {");
            javaLines.add("            for (final MimeType e : MimeType.values()) {");
            javaLines.add("                final List<@NonNull String> extensionsList = e.getExtensionsList();");
            javaLines.add("                for (final @NonNull String ext : extensionsList) {");
            javaLines.add("                    if (ext.toLowerCase().equals(extension.toLowerCase())) {");
            javaLines.add("                        return e;");
            javaLines.add("                    }");
            javaLines.add("                }");
            javaLines.add("            }");
            javaLines.add("        }");
            javaLines.add("        return UNKNOWN;");
            javaLines.add("    }");
            javaLines.add("");
            javaLines.add("    /**");
            javaLines.add("     * Get the extensions list.");
            javaLines.add("     * ");
            javaLines.add("     * @return the extensionsList.");
            javaLines.add("     */");
            javaLines.add("    @NonNull");
            javaLines.add("    public final List<@NonNull String> getExtensionsList() {");
            javaLines.add("        return this.extensionsList;");
            javaLines.add("    }");
            javaLines.add("");
            javaLines.add("}");
            javaLines.add("");

            Files.write(file, javaLines, Charset.forName("UTF-8"));
        } catch (final IOException e) {
            Logger.getAnonymousLogger().logp(Level.SEVERE, "GenerateTikaEnum", "main", e.getMessage(), e);
        }
    }

    @NonNull
    private static String generateJavaEnumName(@NonNull final String mimetypeValue) {
        String javaConstantName = mimetypeValue.replace("/", "_").replace("(", "").replace(")", "").replace("-", "_").replace("*", "").replace("+", "_PLUS_").replace(";", "").replace("=", "").replace(".", "_DOT_");
        javaConstantName = javaConstantName.toUpperCase();
        assert javaConstantName != null;
        return javaConstantName;
    }

    private class MimeType {

        @NonNull
        private final String mimeType;
        @NonNull
        private final List<@NonNull String> extensionsList = new ArrayList<>();

        public MimeType(@NonNull final String mimeType) {
            this.mimeType = mimeType;
        }

        /**
         * @return the mimeType
         */
        @NonNull
        public final String getMimeType() {
            return this.mimeType;
        }

        /**
         * @return the extensions list
         */
        @NonNull
        public final List<@NonNull String> getExtensionsList() {
            return this.extensionsList;
        }

        /**
         * Add extension to the list.
         *
         * @param extension
         */
        public void addExtension(@NonNull final String extension) {
            this.extensionsList.add(extension);
        }
    }
}
