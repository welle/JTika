package main;

import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

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
 * @author Charlotte
 *
 */
public class Main {

    public static void main(final String[] args) throws IOException, SAXException, ParserConfigurationException {
        final InputStream fileStream = Main.class.getResourceAsStream("/org/apache/tika/mime/tika-mimetypes.xml");
        final DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
        final DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
        final Document doc = dBuilder.parse(fileStream);

        // optional, but recommended
        // read this - http://stackoverflow.com/questions/13786607/normalization-in-dom-parsing-with-java-how-does-it-work
        doc.getDocumentElement().normalize();

        System.out.println("Root element :" + doc.getDocumentElement().getNodeName());

        final NodeList nList = doc.getElementsByTagName("mime-type");

        System.out.println("----------------------------");

        final List<String> mimetypes = new ArrayList<>();
        for (int temp = 0; temp < nList.getLength(); temp++) {

            final Node nNode = nList.item(temp);

            if (nNode.getNodeType() == Node.ELEMENT_NODE) {

                final Element eElement = (Element) nNode;

                mimetypes.add(eElement.getAttribute("type"));

            }
        }

        try {
            final Path file = Paths.get("D:/Projets Java/JTika/MimeType.java");

            final List<@NonNull String> javaLines = new ArrayList<>();

            javaLines.add("package aka.jmetadata.main.constants;");
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
            for (int i = 0; i < mimetypes.size(); i++) {
                final String line = mimetypes.get(i);
                String javaConstantName = line.replace("/", "_").replace("(", "").replace(")", "").replace("-", "_").replace("*", "").replace("+", "_PLUS_").replace(";", "").replace("=", "").replace(".", "_DOT_");
                javaConstantName = javaConstantName.toUpperCase();
                javaLines.add("   /**");
                javaLines.add("    * " + javaConstantName + ".");
                javaLines.add("    */");
                final StringBuilder sb = new StringBuilder();
                sb.append("    " + javaConstantName + "(\"" + line + "\")");
                if (i < mimetypes.size() - 1) {
                    sb.append(",");
                } else {
                    sb.append(";");
                }
                final String javaLine = sb.toString();
                assert javaLine != null;
                javaLines.add(javaLine);
                javaLines.add("");
            }
            javaLines.add("    @NonNull");
            javaLines.add("    private final String value;");
            javaLines.add("    private final boolean isImage;");
            javaLines.add("    private final boolean isAudio;");
            javaLines.add("    private final boolean isText;");
            javaLines.add("    private final boolean isVideo;");
            javaLines.add("");
            javaLines.add("    MimeType(@NonNull final String value) {");
            javaLines.add("        this.value = value;");
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
            javaLines.add("     @NonNull");
            javaLines.add("     public final String getValue() {");
            javaLines.add("         return this.value;");
            javaLines.add("     }");
            javaLines.add("");
            javaLines.add("    /**");
            javaLines.add("     * Is MimeType of type image ?");
            javaLines.add("     * ");
            javaLines.add("     * @return <code>true</code> if MimeType of type image.");
            javaLines.add("     */");
            javaLines.add("     public final boolean isImage() {");
            javaLines.add("         return this.isImage;");
            javaLines.add("     }");
            javaLines.add("");
            javaLines.add("    /**");
            javaLines.add("     * Is MimeType of type audio ?");
            javaLines.add("     * ");
            javaLines.add("     * @return <code>true</code> if MimeType of type audio.");
            javaLines.add("     */");
            javaLines.add("     public final boolean isAudio() {");
            javaLines.add("         return this.isAudio;");
            javaLines.add("     }");
            javaLines.add("");
            javaLines.add("    /**");
            javaLines.add("     * Is MimeType of type text ?");
            javaLines.add("     * ");
            javaLines.add("     * @return <code>true</code> if MimeType of type text.");
            javaLines.add("     */");
            javaLines.add("     public final boolean isText() {");
            javaLines.add("         return this.isText;");
            javaLines.add("     }");
            javaLines.add("");
            javaLines.add("    /**");
            javaLines.add("     * Is MimeType of type video ?");
            javaLines.add("     * ");
            javaLines.add("     * @return <code>true</code> if MimeType of type video.");
            javaLines.add("     */");
            javaLines.add("     public final boolean isVideo() {");
            javaLines.add("         return this.isVideo;");
            javaLines.add("     }");
            javaLines.add("");
            javaLines.add("    /**");
            javaLines.add("     * Get MimeType enum value corresponding to the given String mimeType.");
            javaLines.add("     * ");
            javaLines.add("     * @param mimeType");
            javaLines.add("     * @return MimeType");
            javaLines.add("     */");
            javaLines.add("     @Nullable");
            javaLines.add("     public static final MimeType getMimeType(@Nullable final String mimeType) {");
            javaLines.add("         if (mimeType == null) {");
            javaLines.add("             return null;");
            javaLines.add("         } else {");
            javaLines.add("             for (final MimeType e : MimeType.values()) {");
            javaLines.add("                 if (mimeType.equals(e.getValue())) {");
            javaLines.add("                     return e;");
            javaLines.add("                 }");
            javaLines.add("             }");
            javaLines.add("         }");
            javaLines.add("         return null;");
            javaLines.add("     }");
            javaLines.add("");
            javaLines.add("}");
            javaLines.add("");

            Files.write(file, javaLines, Charset.forName("UTF-8"));
        } catch (final IOException e) {
        }

    }

}
