package main;

import java.util.Arrays;
import java.util.List;

import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.jdt.annotation.Nullable;

/**
 * MimeType enumation.
 *
 * @author Welle Charlotte
 */
public enum MimeType {

    /**
     * APPLICATION_ACTIVEMESSAGE.
     */
    APPLICATION_ACTIVEMESSAGE("application/activemessage"),

    /**
     * APPLICATION_ANDREW_INSET.
     */
    APPLICATION_ANDREW_INSET("application/andrew-inset", "ez"),

    /**
     * APPLICATION_APPLEFILE.
     */
    APPLICATION_APPLEFILE("application/applefile"),

    /**
     * APPLICATION_APPLIXWARE.
     */
    APPLICATION_APPLIXWARE("application/applixware", "aw"),

    /**
     * TEXT_ISO19139_PLUS_XML.
     */
    TEXT_ISO19139_PLUS_XML("text/iso19139+xml", "iso19139"),

    /**
     * APPLICATION_ATOM_PLUS_XML.
     */
    APPLICATION_ATOM_PLUS_XML("application/atom+xml", "atom"),

    /**
     * APPLICATION_ATOMCAT_PLUS_XML.
     */
    APPLICATION_ATOMCAT_PLUS_XML("application/atomcat+xml", "atomcat"),

    /**
     * APPLICATION_ATOMICMAIL.
     */
    APPLICATION_ATOMICMAIL("application/atomicmail"),

    /**
     * APPLICATION_ATOMSVC_PLUS_XML.
     */
    APPLICATION_ATOMSVC_PLUS_XML("application/atomsvc+xml", "atomsvc"),

    /**
     * APPLICATION_AUTH_POLICY_PLUS_XML.
     */
    APPLICATION_AUTH_POLICY_PLUS_XML("application/auth-policy+xml"),

    /**
     * APPLICATION_BATCH_SMTP.
     */
    APPLICATION_BATCH_SMTP("application/batch-smtp"),

    /**
     * APPLICATION_BEEP_PLUS_XML.
     */
    APPLICATION_BEEP_PLUS_XML("application/beep+xml"),

    /**
     * APPLICATION_BIZAGI_MODELER.
     */
    APPLICATION_BIZAGI_MODELER("application/bizagi-modeler", "bpm"),

    /**
     * APPLICATION_CALS_1840.
     */
    APPLICATION_CALS_1840("application/cals-1840"),

    /**
     * APPLICATION_CBOR.
     */
    APPLICATION_CBOR("application/cbor", "cbor"),

    /**
     * APPLICATION_CCXML_PLUS_XML.
     */
    APPLICATION_CCXML_PLUS_XML("application/ccxml+xml", "ccxml"),

    /**
     * APPLICATION_CEA_2018_PLUS_XML.
     */
    APPLICATION_CEA_2018_PLUS_XML("application/cea-2018+xml"),

    /**
     * APPLICATION_CELLML_PLUS_XML.
     */
    APPLICATION_CELLML_PLUS_XML("application/cellml+xml"),

    /**
     * APPLICATION_CNRP_PLUS_XML.
     */
    APPLICATION_CNRP_PLUS_XML("application/cnrp+xml"),

    /**
     * APPLICATION_COMMONGROUND.
     */
    APPLICATION_COMMONGROUND("application/commonground"),

    /**
     * APPLICATION_CONFERENCE_INFO_PLUS_XML.
     */
    APPLICATION_CONFERENCE_INFO_PLUS_XML("application/conference-info+xml"),

    /**
     * APPLICATION_CPL_PLUS_XML.
     */
    APPLICATION_CPL_PLUS_XML("application/cpl+xml"),

    /**
     * APPLICATION_CSTA_PLUS_XML.
     */
    APPLICATION_CSTA_PLUS_XML("application/csta+xml"),

    /**
     * APPLICATION_CSTADATA_PLUS_XML.
     */
    APPLICATION_CSTADATA_PLUS_XML("application/cstadata+xml"),

    /**
     * APPLICATION_CU_SEEME.
     */
    APPLICATION_CU_SEEME("application/cu-seeme", "cu"),

    /**
     * APPLICATION_CYBERCASH.
     */
    APPLICATION_CYBERCASH("application/cybercash"),

    /**
     * APPLICATION_DAVMOUNT_PLUS_XML.
     */
    APPLICATION_DAVMOUNT_PLUS_XML("application/davmount+xml", "davmount"),

    /**
     * APPLICATION_DCA_RFT.
     */
    APPLICATION_DCA_RFT("application/dca-rft"),

    /**
     * APPLICATION_DEC_DX.
     */
    APPLICATION_DEC_DX("application/dec-dx"),

    /**
     * APPLICATION_DIALOG_INFO_PLUS_XML.
     */
    APPLICATION_DIALOG_INFO_PLUS_XML("application/dialog-info+xml"),

    /**
     * APPLICATION_DICOM.
     */
    APPLICATION_DICOM("application/dicom"),

    /**
     * APPLICATION_DITA_PLUS_XML.
     */
    APPLICATION_DITA_PLUS_XML("application/dita+xml"),

    /**
     * APPLICATION_DITA_PLUS_XMLFORMATMAP.
     */
    APPLICATION_DITA_PLUS_XMLFORMATMAP("application/dita+xml;format=map", "ditamap"),

    /**
     * APPLICATION_DITA_PLUS_XMLFORMATTOPIC.
     */
    APPLICATION_DITA_PLUS_XMLFORMATTOPIC("application/dita+xml;format=topic", "dita"),

    /**
     * APPLICATION_DITA_PLUS_XMLFORMATTASK.
     */
    APPLICATION_DITA_PLUS_XMLFORMATTASK("application/dita+xml;format=task"),

    /**
     * APPLICATION_DITA_PLUS_XMLFORMATCONCEPT.
     */
    APPLICATION_DITA_PLUS_XMLFORMATCONCEPT("application/dita+xml;format=concept"),

    /**
     * APPLICATION_DITA_PLUS_XMLFORMATVAL.
     */
    APPLICATION_DITA_PLUS_XMLFORMATVAL("application/dita+xml;format=val", "ditaval"),

    /**
     * APPLICATION_DNS.
     */
    APPLICATION_DNS("application/dns"),

    /**
     * APPLICATION_DVCS.
     */
    APPLICATION_DVCS("application/dvcs"),

    /**
     * APPLICATION_ECMASCRIPT.
     */
    APPLICATION_ECMASCRIPT("application/ecmascript", "ecma"),

    /**
     * APPLICATION_EDI_CONSENT.
     */
    APPLICATION_EDI_CONSENT("application/edi-consent"),

    /**
     * APPLICATION_EDI_X12.
     */
    APPLICATION_EDI_X12("application/edi-x12"),

    /**
     * APPLICATION_EDIFACT.
     */
    APPLICATION_EDIFACT("application/edifact"),

    /**
     * APPLICATION_EMMA_PLUS_XML.
     */
    APPLICATION_EMMA_PLUS_XML("application/emma+xml", "emma"),

    /**
     * APPLICATION_EPP_PLUS_XML.
     */
    APPLICATION_EPP_PLUS_XML("application/epp+xml"),

    /**
     * APPLICATION_EPUB_PLUS_ZIP.
     */
    APPLICATION_EPUB_PLUS_ZIP("application/epub+zip", "epub"),

    /**
     * APPLICATION_ESHOP.
     */
    APPLICATION_ESHOP("application/eshop"),

    /**
     * APPLICATION_EXAMPLE.
     */
    APPLICATION_EXAMPLE("application/example"),

    /**
     * APPLICATION_FASTINFOSET.
     */
    APPLICATION_FASTINFOSET("application/fastinfoset"),

    /**
     * APPLICATION_FASTSOAP.
     */
    APPLICATION_FASTSOAP("application/fastsoap"),

    /**
     * APPLICATION_FITS.
     */
    APPLICATION_FITS("application/fits", "fits", "fit", "fts"),

    /**
     * APPLICATION_FONT_TDPFR.
     */
    APPLICATION_FONT_TDPFR("application/font-tdpfr", "pfr"),

    /**
     * APPLICATION_H224.
     */
    APPLICATION_H224("application/h224"),

    /**
     * APPLICATION_HTTP.
     */
    APPLICATION_HTTP("application/http"),

    /**
     * APPLICATION_HYPERSTUDIO.
     */
    APPLICATION_HYPERSTUDIO("application/hyperstudio", "stk"),

    /**
     * APPLICATION_IBE_KEY_REQUEST_PLUS_XML.
     */
    APPLICATION_IBE_KEY_REQUEST_PLUS_XML("application/ibe-key-request+xml"),

    /**
     * APPLICATION_IBE_PKG_REPLY_PLUS_XML.
     */
    APPLICATION_IBE_PKG_REPLY_PLUS_XML("application/ibe-pkg-reply+xml"),

    /**
     * APPLICATION_IBE_PP_DATA.
     */
    APPLICATION_IBE_PP_DATA("application/ibe-pp-data"),

    /**
     * APPLICATION_IGES.
     */
    APPLICATION_IGES("application/iges"),

    /**
     * APPLICATION_ILLUSTRATOR.
     */
    APPLICATION_ILLUSTRATOR("application/illustrator", "ai"),

    /**
     * APPLICATION_IM_ISCOMPOSING_PLUS_XML.
     */
    APPLICATION_IM_ISCOMPOSING_PLUS_XML("application/im-iscomposing+xml"),

    /**
     * APPLICATION_INDEX.
     */
    APPLICATION_INDEX("application/index"),

    /**
     * APPLICATION_INDEX_DOT_CMD.
     */
    APPLICATION_INDEX_DOT_CMD("application/index.cmd"),

    /**
     * APPLICATION_INDEX_DOT_OBJ.
     */
    APPLICATION_INDEX_DOT_OBJ("application/index.obj"),

    /**
     * APPLICATION_INDEX_DOT_RESPONSE.
     */
    APPLICATION_INDEX_DOT_RESPONSE("application/index.response"),

    /**
     * APPLICATION_INDEX_DOT_VND.
     */
    APPLICATION_INDEX_DOT_VND("application/index.vnd"),

    /**
     * APPLICATION_INF.
     */
    APPLICATION_INF("application/inf"),

    /**
     * APPLICATION_IOTP.
     */
    APPLICATION_IOTP("application/iotp"),

    /**
     * APPLICATION_IPP.
     */
    APPLICATION_IPP("application/ipp"),

    /**
     * APPLICATION_ISUP.
     */
    APPLICATION_ISUP("application/isup"),

    /**
     * APPLICATION_JAVA_ARCHIVE.
     */
    APPLICATION_JAVA_ARCHIVE("application/java-archive", "jar"),

    /**
     * APPLICATION_VND_DOT_ANDROID_DOT_PACKAGE_ARCHIVE.
     */
    APPLICATION_VND_DOT_ANDROID_DOT_PACKAGE_ARCHIVE("application/vnd.android.package-archive", "apk"),

    /**
     * APPLICATION_X_TIKA_JAVA_ENTERPRISE_ARCHIVE.
     */
    APPLICATION_X_TIKA_JAVA_ENTERPRISE_ARCHIVE("application/x-tika-java-enterprise-archive", "ear"),

    /**
     * APPLICATION_X_TIKA_JAVA_WEB_ARCHIVE.
     */
    APPLICATION_X_TIKA_JAVA_WEB_ARCHIVE("application/x-tika-java-web-archive", "war"),

    /**
     * APPLICATION_X_TIKA_UNIX_DUMP.
     */
    APPLICATION_X_TIKA_UNIX_DUMP("application/x-tika-unix-dump"),

    /**
     * APPLICATION_JAVA_SERIALIZED_OBJECT.
     */
    APPLICATION_JAVA_SERIALIZED_OBJECT("application/java-serialized-object", "ser"),

    /**
     * APPLICATION_JAVASCRIPT.
     */
    APPLICATION_JAVASCRIPT("application/javascript", "js"),

    /**
     * APPLICATION_JSON.
     */
    APPLICATION_JSON("application/json", "json"),

    /**
     * APPLICATION_JAVA_VM.
     */
    APPLICATION_JAVA_VM("application/java-vm", "class"),

    /**
     * APPLICATION_X_JAVA_JNILIB.
     */
    APPLICATION_X_JAVA_JNILIB("application/x-java-jnilib", "jnilib"),

    /**
     * APPLICATION_KPML_REQUEST_PLUS_XML.
     */
    APPLICATION_KPML_REQUEST_PLUS_XML("application/kpml-request+xml"),

    /**
     * APPLICATION_KPML_RESPONSE_PLUS_XML.
     */
    APPLICATION_KPML_RESPONSE_PLUS_XML("application/kpml-response+xml"),

    /**
     * APPLICATION_LOST_PLUS_XML.
     */
    APPLICATION_LOST_PLUS_XML("application/lost+xml", "lostxml"),

    /**
     * APPLICATION_MAC_BINHEX40.
     */
    APPLICATION_MAC_BINHEX40("application/mac-binhex40", "hqx"),

    /**
     * APPLICATION_MAC_COMPACTPRO.
     */
    APPLICATION_MAC_COMPACTPRO("application/mac-compactpro", "cpt"),

    /**
     * APPLICATION_MACWRITEII.
     */
    APPLICATION_MACWRITEII("application/macwriteii"),

    /**
     * APPLICATION_MARC.
     */
    APPLICATION_MARC("application/marc", "mrc"),

    /**
     * APPLICATION_MATHEMATICA.
     */
    APPLICATION_MATHEMATICA("application/mathematica", "ma", "nb", "mb"),

    /**
     * APPLICATION_MATHML_PLUS_XML.
     */
    APPLICATION_MATHML_PLUS_XML("application/mathml+xml", "mathml"),

    /**
     * APPLICATION_MBMS_ASSOCIATED_PROCEDURE_DESCRIPTION_PLUS_XML.
     */
    APPLICATION_MBMS_ASSOCIATED_PROCEDURE_DESCRIPTION_PLUS_XML("application/mbms-associated-procedure-description+xml"),

    /**
     * APPLICATION_MBMS_DEREGISTER_PLUS_XML.
     */
    APPLICATION_MBMS_DEREGISTER_PLUS_XML("application/mbms-deregister+xml"),

    /**
     * APPLICATION_MBMS_ENVELOPE_PLUS_XML.
     */
    APPLICATION_MBMS_ENVELOPE_PLUS_XML("application/mbms-envelope+xml"),

    /**
     * APPLICATION_MBMS_MSK_PLUS_XML.
     */
    APPLICATION_MBMS_MSK_PLUS_XML("application/mbms-msk+xml"),

    /**
     * APPLICATION_MBMS_MSK_RESPONSE_PLUS_XML.
     */
    APPLICATION_MBMS_MSK_RESPONSE_PLUS_XML("application/mbms-msk-response+xml"),

    /**
     * APPLICATION_MBMS_PROTECTION_DESCRIPTION_PLUS_XML.
     */
    APPLICATION_MBMS_PROTECTION_DESCRIPTION_PLUS_XML("application/mbms-protection-description+xml"),

    /**
     * APPLICATION_MBMS_RECEPTION_REPORT_PLUS_XML.
     */
    APPLICATION_MBMS_RECEPTION_REPORT_PLUS_XML("application/mbms-reception-report+xml"),

    /**
     * APPLICATION_MBMS_REGISTER_PLUS_XML.
     */
    APPLICATION_MBMS_REGISTER_PLUS_XML("application/mbms-register+xml"),

    /**
     * APPLICATION_MBMS_REGISTER_RESPONSE_PLUS_XML.
     */
    APPLICATION_MBMS_REGISTER_RESPONSE_PLUS_XML("application/mbms-register-response+xml"),

    /**
     * APPLICATION_MBMS_USER_SERVICE_DESCRIPTION_PLUS_XML.
     */
    APPLICATION_MBMS_USER_SERVICE_DESCRIPTION_PLUS_XML("application/mbms-user-service-description+xml"),

    /**
     * APPLICATION_MBOX.
     */
    APPLICATION_MBOX("application/mbox", "mbox"),

    /**
     * APPLICATION_MEDIA_CONTROL_PLUS_XML.
     */
    APPLICATION_MEDIA_CONTROL_PLUS_XML("application/media_control+xml"),

    /**
     * APPLICATION_MEDIASERVERCONTROL_PLUS_XML.
     */
    APPLICATION_MEDIASERVERCONTROL_PLUS_XML("application/mediaservercontrol+xml", "mscml"),

    /**
     * APPLICATION_MIKEY.
     */
    APPLICATION_MIKEY("application/mikey"),

    /**
     * APPLICATION_MOSS_KEYS.
     */
    APPLICATION_MOSS_KEYS("application/moss-keys"),

    /**
     * APPLICATION_MOSS_SIGNATURE.
     */
    APPLICATION_MOSS_SIGNATURE("application/moss-signature"),

    /**
     * APPLICATION_MOSSKEY_DATA.
     */
    APPLICATION_MOSSKEY_DATA("application/mosskey-data"),

    /**
     * APPLICATION_MOSSKEY_REQUEST.
     */
    APPLICATION_MOSSKEY_REQUEST("application/mosskey-request"),

    /**
     * APPLICATION_QUICKTIME.
     */
    APPLICATION_QUICKTIME("application/quicktime"),

    /**
     * APPLICATION_MP4.
     */
    APPLICATION_MP4("application/mp4", "mp4s"),

    /**
     * APPLICATION_MPEG4_GENERIC.
     */
    APPLICATION_MPEG4_GENERIC("application/mpeg4-generic"),

    /**
     * APPLICATION_MPEG4_IOD.
     */
    APPLICATION_MPEG4_IOD("application/mpeg4-iod"),

    /**
     * APPLICATION_MPEG4_IOD_XMT.
     */
    APPLICATION_MPEG4_IOD_XMT("application/mpeg4-iod-xmt"),

    /**
     * APPLICATION_MSWORD.
     */
    APPLICATION_MSWORD("application/msword", "doc", "dot"),

    /**
     * APPLICATION_MSWORD2.
     */
    APPLICATION_MSWORD2("application/msword2"),

    /**
     * APPLICATION_MSWORD5.
     */
    APPLICATION_MSWORD5("application/msword5"),

    /**
     * APPLICATION_MXF.
     */
    APPLICATION_MXF("application/mxf", "mxf"),

    /**
     * APPLICATION_NASDATA.
     */
    APPLICATION_NASDATA("application/nasdata"),

    /**
     * APPLICATION_NEWS_CHECKGROUPS.
     */
    APPLICATION_NEWS_CHECKGROUPS("application/news-checkgroups"),

    /**
     * APPLICATION_NEWS_GROUPINFO.
     */
    APPLICATION_NEWS_GROUPINFO("application/news-groupinfo"),

    /**
     * APPLICATION_NEWS_TRANSMISSION.
     */
    APPLICATION_NEWS_TRANSMISSION("application/news-transmission"),

    /**
     * APPLICATION_NSS.
     */
    APPLICATION_NSS("application/nss"),

    /**
     * APPLICATION_OCSP_REQUEST.
     */
    APPLICATION_OCSP_REQUEST("application/ocsp-request"),

    /**
     * APPLICATION_OCSP_RESPONSE.
     */
    APPLICATION_OCSP_RESPONSE("application/ocsp-response"),

    /**
     * APPLICATION_OCTET_STREAM.
     */
    APPLICATION_OCTET_STREAM("application/octet-stream", "bin", "dms", "lha", "lrf", "lzh", "so", "dist", "distz", "pkg", "bpk", "dump", "elc", "deploy"),

    /**
     * APPLICATION_ODA.
     */
    APPLICATION_ODA("application/oda", "oda"),

    /**
     * APPLICATION_OEBPS_PACKAGE_PLUS_XML.
     */
    APPLICATION_OEBPS_PACKAGE_PLUS_XML("application/oebps-package+xml", "opf"),

    /**
     * APPLICATION_OGG.
     */
    APPLICATION_OGG("application/ogg", "ogx"),

    /**
     * APPLICATION_KATE.
     */
    APPLICATION_KATE("application/kate"),

    /**
     * APPLICATION_ONENOTE.
     */
    APPLICATION_ONENOTE("application/onenote", "onetoc", "onetoc2", "onetmp", "onepkg"),

    /**
     * APPLICATION_PARITYFEC.
     */
    APPLICATION_PARITYFEC("application/parityfec"),

    /**
     * APPLICATION_PATCH_OPS_ERROR_PLUS_XML.
     */
    APPLICATION_PATCH_OPS_ERROR_PLUS_XML("application/patch-ops-error+xml", "xer"),

    /**
     * APPLICATION_PDF.
     */
    APPLICATION_PDF("application/pdf", "pdf"),

    /**
     * APPLICATION_PGP_ENCRYPTED.
     */
    APPLICATION_PGP_ENCRYPTED("application/pgp-encrypted", "pgp"),

    /**
     * APPLICATION_PGP_KEYS.
     */
    APPLICATION_PGP_KEYS("application/pgp-keys"),

    /**
     * APPLICATION_PGP_SIGNATURE.
     */
    APPLICATION_PGP_SIGNATURE("application/pgp-signature", "asc", "sig"),

    /**
     * APPLICATION_PICS_RULES.
     */
    APPLICATION_PICS_RULES("application/pics-rules", "prf"),

    /**
     * APPLICATION_PIDF_PLUS_XML.
     */
    APPLICATION_PIDF_PLUS_XML("application/pidf+xml"),

    /**
     * APPLICATION_PIDF_DIFF_PLUS_XML.
     */
    APPLICATION_PIDF_DIFF_PLUS_XML("application/pidf-diff+xml"),

    /**
     * APPLICATION_PKCS10.
     */
    APPLICATION_PKCS10("application/pkcs10", "p10"),

    /**
     * APPLICATION_PKCS7_MIME.
     */
    APPLICATION_PKCS7_MIME("application/pkcs7-mime", "p7m", "p7c"),

    /**
     * APPLICATION_PKCS7_SIGNATURE.
     */
    APPLICATION_PKCS7_SIGNATURE("application/pkcs7-signature", "p7s"),

    /**
     * APPLICATION_PKIX_CERT.
     */
    APPLICATION_PKIX_CERT("application/pkix-cert", "cer"),

    /**
     * APPLICATION_PKIX_CRL.
     */
    APPLICATION_PKIX_CRL("application/pkix-crl", "crl"),

    /**
     * APPLICATION_PKIX_PKIPATH.
     */
    APPLICATION_PKIX_PKIPATH("application/pkix-pkipath", "pkipath"),

    /**
     * APPLICATION_PKIXCMP.
     */
    APPLICATION_PKIXCMP("application/pkixcmp", "pki"),

    /**
     * APPLICATION_PLS_PLUS_XML.
     */
    APPLICATION_PLS_PLUS_XML("application/pls+xml", "pls"),

    /**
     * APPLICATION_POC_SETTINGS_PLUS_XML.
     */
    APPLICATION_POC_SETTINGS_PLUS_XML("application/poc-settings+xml"),

    /**
     * APPLICATION_POSTSCRIPT.
     */
    APPLICATION_POSTSCRIPT("application/postscript", "ps", "eps", "epsf", "epsi"),

    /**
     * APPLICATION_PRS_DOT_ALVESTRAND_DOT_TITRAX_SHEET.
     */
    APPLICATION_PRS_DOT_ALVESTRAND_DOT_TITRAX_SHEET("application/prs.alvestrand.titrax-sheet"),

    /**
     * APPLICATION_PRS_DOT_CWW.
     */
    APPLICATION_PRS_DOT_CWW("application/prs.cww", "cww"),

    /**
     * APPLICATION_PRS_DOT_NPREND.
     */
    APPLICATION_PRS_DOT_NPREND("application/prs.nprend"),

    /**
     * APPLICATION_PRS_DOT_PLUCKER.
     */
    APPLICATION_PRS_DOT_PLUCKER("application/prs.plucker"),

    /**
     * APPLICATION_QSIG.
     */
    APPLICATION_QSIG("application/qsig"),

    /**
     * APPLICATION_RDF_PLUS_XML.
     */
    APPLICATION_RDF_PLUS_XML("application/rdf+xml", "rdf", "owl", "xmp"),

    /**
     * APPLICATION_REGINFO_PLUS_XML.
     */
    APPLICATION_REGINFO_PLUS_XML("application/reginfo+xml", "rif"),

    /**
     * APPLICATION_RELAX_NG_COMPACT_SYNTAX.
     */
    APPLICATION_RELAX_NG_COMPACT_SYNTAX("application/relax-ng-compact-syntax", "rnc"),

    /**
     * APPLICATION_REMOTE_PRINTING.
     */
    APPLICATION_REMOTE_PRINTING("application/remote-printing"),

    /**
     * APPLICATION_RESOURCE_LISTS_PLUS_XML.
     */
    APPLICATION_RESOURCE_LISTS_PLUS_XML("application/resource-lists+xml", "rl"),

    /**
     * APPLICATION_RESOURCE_LISTS_DIFF_PLUS_XML.
     */
    APPLICATION_RESOURCE_LISTS_DIFF_PLUS_XML("application/resource-lists-diff+xml", "rld"),

    /**
     * APPLICATION_RISCOS.
     */
    APPLICATION_RISCOS("application/riscos"),

    /**
     * APPLICATION_RLMI_PLUS_XML.
     */
    APPLICATION_RLMI_PLUS_XML("application/rlmi+xml"),

    /**
     * APPLICATION_RLS_SERVICES_PLUS_XML.
     */
    APPLICATION_RLS_SERVICES_PLUS_XML("application/rls-services+xml", "rs"),

    /**
     * APPLICATION_RSD_PLUS_XML.
     */
    APPLICATION_RSD_PLUS_XML("application/rsd+xml", "rsd"),

    /**
     * APPLICATION_RSS_PLUS_XML.
     */
    APPLICATION_RSS_PLUS_XML("application/rss+xml", "rss"),

    /**
     * APPLICATION_RTF.
     */
    APPLICATION_RTF("application/rtf", "rtf"),

    /**
     * APPLICATION_RTX.
     */
    APPLICATION_RTX("application/rtx"),

    /**
     * APPLICATION_SAMLASSERTION_PLUS_XML.
     */
    APPLICATION_SAMLASSERTION_PLUS_XML("application/samlassertion+xml"),

    /**
     * APPLICATION_SAMLMETADATA_PLUS_XML.
     */
    APPLICATION_SAMLMETADATA_PLUS_XML("application/samlmetadata+xml"),

    /**
     * APPLICATION_SBML_PLUS_XML.
     */
    APPLICATION_SBML_PLUS_XML("application/sbml+xml", "sbml"),

    /**
     * APPLICATION_SCVP_CV_REQUEST.
     */
    APPLICATION_SCVP_CV_REQUEST("application/scvp-cv-request", "scq"),

    /**
     * APPLICATION_SCVP_CV_RESPONSE.
     */
    APPLICATION_SCVP_CV_RESPONSE("application/scvp-cv-response", "scs"),

    /**
     * APPLICATION_SCVP_VP_REQUEST.
     */
    APPLICATION_SCVP_VP_REQUEST("application/scvp-vp-request", "spq"),

    /**
     * APPLICATION_SCVP_VP_RESPONSE.
     */
    APPLICATION_SCVP_VP_RESPONSE("application/scvp-vp-response", "spp"),

    /**
     * APPLICATION_SDP.
     */
    APPLICATION_SDP("application/sdp", "sdp"),

    /**
     * APPLICATION_SEREAL.
     */
    APPLICATION_SEREAL("application/sereal", "srl"),

    /**
     * APPLICATION_SEREALVERSION1.
     */
    APPLICATION_SEREALVERSION1("application/sereal;version=1"),

    /**
     * APPLICATION_SEREALVERSION2.
     */
    APPLICATION_SEREALVERSION2("application/sereal;version=2"),

    /**
     * APPLICATION_SEREALVERSION3.
     */
    APPLICATION_SEREALVERSION3("application/sereal;version=3"),

    /**
     * APPLICATION_SET_PAYMENT.
     */
    APPLICATION_SET_PAYMENT("application/set-payment"),

    /**
     * APPLICATION_SET_PAYMENT_INITIATION.
     */
    APPLICATION_SET_PAYMENT_INITIATION("application/set-payment-initiation", "setpay"),

    /**
     * APPLICATION_SET_REGISTRATION.
     */
    APPLICATION_SET_REGISTRATION("application/set-registration"),

    /**
     * APPLICATION_SET_REGISTRATION_INITIATION.
     */
    APPLICATION_SET_REGISTRATION_INITIATION("application/set-registration-initiation", "setreg"),

    /**
     * APPLICATION_SGML.
     */
    APPLICATION_SGML("application/sgml"),

    /**
     * APPLICATION_SGML_OPEN_CATALOG.
     */
    APPLICATION_SGML_OPEN_CATALOG("application/sgml-open-catalog"),

    /**
     * APPLICATION_SHF_PLUS_XML.
     */
    APPLICATION_SHF_PLUS_XML("application/shf+xml", "shf"),

    /**
     * APPLICATION_SIEVE.
     */
    APPLICATION_SIEVE("application/sieve"),

    /**
     * APPLICATION_SIMPLE_FILTER_PLUS_XML.
     */
    APPLICATION_SIMPLE_FILTER_PLUS_XML("application/simple-filter+xml"),

    /**
     * APPLICATION_SIMPLE_MESSAGE_SUMMARY.
     */
    APPLICATION_SIMPLE_MESSAGE_SUMMARY("application/simple-message-summary"),

    /**
     * APPLICATION_SIMPLESYMBOLCONTAINER.
     */
    APPLICATION_SIMPLESYMBOLCONTAINER("application/simplesymbolcontainer"),

    /**
     * APPLICATION_SLATE.
     */
    APPLICATION_SLATE("application/slate"),

    /**
     * APPLICATION_SMIL_PLUS_XML.
     */
    APPLICATION_SMIL_PLUS_XML("application/smil+xml", "smi", "smil", "sml"),

    /**
     * APPLICATION_SOAP_PLUS_FASTINFOSET.
     */
    APPLICATION_SOAP_PLUS_FASTINFOSET("application/soap+fastinfoset"),

    /**
     * APPLICATION_SOAP_PLUS_XML.
     */
    APPLICATION_SOAP_PLUS_XML("application/soap+xml"),

    /**
     * APPLICATION_SLDWORKS.
     */
    APPLICATION_SLDWORKS("application/sldworks", "sldprt", "sldasm", "slddrw"),

    /**
     * APPLICATION_SPARQL_QUERY.
     */
    APPLICATION_SPARQL_QUERY("application/sparql-query", "rq"),

    /**
     * APPLICATION_SPARQL_RESULTS_PLUS_XML.
     */
    APPLICATION_SPARQL_RESULTS_PLUS_XML("application/sparql-results+xml", "srx"),

    /**
     * APPLICATION_SPIRITS_EVENT_PLUS_XML.
     */
    APPLICATION_SPIRITS_EVENT_PLUS_XML("application/spirits-event+xml"),

    /**
     * APPLICATION_SRGS.
     */
    APPLICATION_SRGS("application/srgs", "gram"),

    /**
     * APPLICATION_SRGS_PLUS_XML.
     */
    APPLICATION_SRGS_PLUS_XML("application/srgs+xml", "grxml"),

    /**
     * APPLICATION_SSML_PLUS_XML.
     */
    APPLICATION_SSML_PLUS_XML("application/ssml+xml", "ssml"),

    /**
     * APPLICATION_TIMESTAMP_QUERY.
     */
    APPLICATION_TIMESTAMP_QUERY("application/timestamp-query"),

    /**
     * APPLICATION_TIMESTAMP_REPLY.
     */
    APPLICATION_TIMESTAMP_REPLY("application/timestamp-reply"),

    /**
     * APPLICATION_TVE_TRIGGER.
     */
    APPLICATION_TVE_TRIGGER("application/tve-trigger"),

    /**
     * APPLICATION_ULPFEC.
     */
    APPLICATION_ULPFEC("application/ulpfec"),

    /**
     * APPLICATION_VEMMI.
     */
    APPLICATION_VEMMI("application/vemmi"),

    /**
     * APPLICATION_VIVIDENCE_DOT_SCRIPTFILE.
     */
    APPLICATION_VIVIDENCE_DOT_SCRIPTFILE("application/vividence.scriptfile"),

    /**
     * APPLICATION_VND_DOT_3GPP_DOT_BSF_PLUS_XML.
     */
    APPLICATION_VND_DOT_3GPP_DOT_BSF_PLUS_XML("application/vnd.3gpp.bsf+xml"),

    /**
     * APPLICATION_VND_DOT_3GPP_DOT_PIC_BW_LARGE.
     */
    APPLICATION_VND_DOT_3GPP_DOT_PIC_BW_LARGE("application/vnd.3gpp.pic-bw-large", "plb"),

    /**
     * APPLICATION_VND_DOT_3GPP_DOT_PIC_BW_SMALL.
     */
    APPLICATION_VND_DOT_3GPP_DOT_PIC_BW_SMALL("application/vnd.3gpp.pic-bw-small", "psb"),

    /**
     * APPLICATION_VND_DOT_3GPP_DOT_PIC_BW_VAR.
     */
    APPLICATION_VND_DOT_3GPP_DOT_PIC_BW_VAR("application/vnd.3gpp.pic-bw-var", "pvb"),

    /**
     * APPLICATION_VND_DOT_3GPP_DOT_SMS.
     */
    APPLICATION_VND_DOT_3GPP_DOT_SMS("application/vnd.3gpp.sms"),

    /**
     * APPLICATION_VND_DOT_3GPP2_DOT_BCMCSINFO_PLUS_XML.
     */
    APPLICATION_VND_DOT_3GPP2_DOT_BCMCSINFO_PLUS_XML("application/vnd.3gpp2.bcmcsinfo+xml"),

    /**
     * APPLICATION_VND_DOT_3GPP2_DOT_SMS.
     */
    APPLICATION_VND_DOT_3GPP2_DOT_SMS("application/vnd.3gpp2.sms"),

    /**
     * APPLICATION_VND_DOT_3GPP2_DOT_TCAP.
     */
    APPLICATION_VND_DOT_3GPP2_DOT_TCAP("application/vnd.3gpp2.tcap", "tcap"),

    /**
     * APPLICATION_VND_DOT_3M_DOT_POST_IT_NOTES.
     */
    APPLICATION_VND_DOT_3M_DOT_POST_IT_NOTES("application/vnd.3m.post-it-notes", "pwn"),

    /**
     * APPLICATION_VND_DOT_ACCPAC_DOT_SIMPLY_DOT_ASO.
     */
    APPLICATION_VND_DOT_ACCPAC_DOT_SIMPLY_DOT_ASO("application/vnd.accpac.simply.aso", "aso"),

    /**
     * APPLICATION_VND_DOT_ACCPAC_DOT_SIMPLY_DOT_IMP.
     */
    APPLICATION_VND_DOT_ACCPAC_DOT_SIMPLY_DOT_IMP("application/vnd.accpac.simply.imp", "imp"),

    /**
     * APPLICATION_VND_DOT_ACUCOBOL.
     */
    APPLICATION_VND_DOT_ACUCOBOL("application/vnd.acucobol", "acu"),

    /**
     * APPLICATION_VND_DOT_ACUCORP.
     */
    APPLICATION_VND_DOT_ACUCORP("application/vnd.acucorp", "atc", "acutc"),

    /**
     * APPLICATION_VND_DOT_ADOBE_DOT_AIR_APPLICATION_INSTALLER_PACKAGE_PLUS_ZIP.
     */
    APPLICATION_VND_DOT_ADOBE_DOT_AIR_APPLICATION_INSTALLER_PACKAGE_PLUS_ZIP("application/vnd.adobe.air-application-installer-package+zip", "air"),

    /**
     * APPLICATION_VND_DOT_ADOBE_DOT_AFTEREFFECTS_DOT_PROJECT.
     */
    APPLICATION_VND_DOT_ADOBE_DOT_AFTEREFFECTS_DOT_PROJECT("application/vnd.adobe.aftereffects.project", "aep"),

    /**
     * APPLICATION_VND_DOT_ADOBE_DOT_AFTEREFFECTS_DOT_TEMPLATE.
     */
    APPLICATION_VND_DOT_ADOBE_DOT_AFTEREFFECTS_DOT_TEMPLATE("application/vnd.adobe.aftereffects.template", "aet"),

    /**
     * APPLICATION_VND_DOT_ADOBE_DOT_XDP_PLUS_XML.
     */
    APPLICATION_VND_DOT_ADOBE_DOT_XDP_PLUS_XML("application/vnd.adobe.xdp+xml", "xdp"),

    /**
     * APPLICATION_VND_DOT_ADOBE_DOT_XFDF.
     */
    APPLICATION_VND_DOT_ADOBE_DOT_XFDF("application/vnd.adobe.xfdf", "xfdf"),

    /**
     * APPLICATION_VND_DOT_AETHER_DOT_IMP.
     */
    APPLICATION_VND_DOT_AETHER_DOT_IMP("application/vnd.aether.imp"),

    /**
     * APPLICATION_VND_DOT_AIRZIP_DOT_FILESECURE_DOT_AZF.
     */
    APPLICATION_VND_DOT_AIRZIP_DOT_FILESECURE_DOT_AZF("application/vnd.airzip.filesecure.azf", "azf"),

    /**
     * APPLICATION_VND_DOT_AIRZIP_DOT_FILESECURE_DOT_AZS.
     */
    APPLICATION_VND_DOT_AIRZIP_DOT_FILESECURE_DOT_AZS("application/vnd.airzip.filesecure.azs", "azs"),

    /**
     * APPLICATION_VND_DOT_AMAZON_DOT_EBOOK.
     */
    APPLICATION_VND_DOT_AMAZON_DOT_EBOOK("application/vnd.amazon.ebook", "azw"),

    /**
     * APPLICATION_VND_DOT_AMERICANDYNAMICS_DOT_ACC.
     */
    APPLICATION_VND_DOT_AMERICANDYNAMICS_DOT_ACC("application/vnd.americandynamics.acc", "acc"),

    /**
     * APPLICATION_VND_DOT_AMIGA_DOT_AMI.
     */
    APPLICATION_VND_DOT_AMIGA_DOT_AMI("application/vnd.amiga.ami", "ami"),

    /**
     * APPLICATION_VND_DOT_ANSER_WEB_CERTIFICATE_ISSUE_INITIATION.
     */
    APPLICATION_VND_DOT_ANSER_WEB_CERTIFICATE_ISSUE_INITIATION("application/vnd.anser-web-certificate-issue-initiation", "cii"),

    /**
     * APPLICATION_VND_DOT_ANSER_WEB_FUNDS_TRANSFER_INITIATION.
     */
    APPLICATION_VND_DOT_ANSER_WEB_FUNDS_TRANSFER_INITIATION("application/vnd.anser-web-funds-transfer-initiation", "fti"),

    /**
     * APPLICATION_VND_DOT_ANTIX_DOT_GAME_COMPONENT.
     */
    APPLICATION_VND_DOT_ANTIX_DOT_GAME_COMPONENT("application/vnd.antix.game-component", "atx"),

    /**
     * APPLICATION_VND_DOT_APPLE_DOT_INSTALLER_PLUS_XML.
     */
    APPLICATION_VND_DOT_APPLE_DOT_INSTALLER_PLUS_XML("application/vnd.apple.installer+xml", "mpkg"),

    /**
     * APPLICATION_VND_DOT_APPLE_DOT_IWORK.
     */
    APPLICATION_VND_DOT_APPLE_DOT_IWORK("application/vnd.apple.iwork"),

    /**
     * APPLICATION_VND_DOT_APPLE_DOT_KEYNOTE.
     */
    APPLICATION_VND_DOT_APPLE_DOT_KEYNOTE("application/vnd.apple.keynote", "key"),

    /**
     * APPLICATION_VND_DOT_APPLE_DOT_PAGES.
     */
    APPLICATION_VND_DOT_APPLE_DOT_PAGES("application/vnd.apple.pages", "pages"),

    /**
     * APPLICATION_VND_DOT_APPLE_DOT_NUMBERS.
     */
    APPLICATION_VND_DOT_APPLE_DOT_NUMBERS("application/vnd.apple.numbers", "numbers"),

    /**
     * APPLICATION_X_TIKA_IWORKS_PROTECTED.
     */
    APPLICATION_X_TIKA_IWORKS_PROTECTED("application/x-tika-iworks-protected"),

    /**
     * APPLICATION_VND_DOT_ARASTRA_DOT_SWI.
     */
    APPLICATION_VND_DOT_ARASTRA_DOT_SWI("application/vnd.arastra.swi", "swi"),

    /**
     * APPLICATION_VND_DOT_AUDIOGRAPH.
     */
    APPLICATION_VND_DOT_AUDIOGRAPH("application/vnd.audiograph"),

    /**
     * APPLICATION_VND_DOT_AUTOPACKAGE.
     */
    APPLICATION_VND_DOT_AUTOPACKAGE("application/vnd.autopackage"),

    /**
     * APPLICATION_VND_DOT_AVISTAR_PLUS_XML.
     */
    APPLICATION_VND_DOT_AVISTAR_PLUS_XML("application/vnd.avistar+xml"),

    /**
     * APPLICATION_VND_DOT_BLUEICE_DOT_MULTIPASS.
     */
    APPLICATION_VND_DOT_BLUEICE_DOT_MULTIPASS("application/vnd.blueice.multipass", "mpm"),

    /**
     * APPLICATION_VND_DOT_BLUETOOTH_DOT_EP_DOT_OOB.
     */
    APPLICATION_VND_DOT_BLUETOOTH_DOT_EP_DOT_OOB("application/vnd.bluetooth.ep.oob"),

    /**
     * APPLICATION_VND_DOT_BMI.
     */
    APPLICATION_VND_DOT_BMI("application/vnd.bmi", "bmi"),

    /**
     * APPLICATION_VND_DOT_BUSINESSOBJECTS.
     */
    APPLICATION_VND_DOT_BUSINESSOBJECTS("application/vnd.businessobjects", "rep"),

    /**
     * APPLICATION_VND_DOT_CAB_JSCRIPT.
     */
    APPLICATION_VND_DOT_CAB_JSCRIPT("application/vnd.cab-jscript"),

    /**
     * APPLICATION_VND_DOT_CANON_CPDL.
     */
    APPLICATION_VND_DOT_CANON_CPDL("application/vnd.canon-cpdl"),

    /**
     * APPLICATION_VND_DOT_CANON_LIPS.
     */
    APPLICATION_VND_DOT_CANON_LIPS("application/vnd.canon-lips"),

    /**
     * APPLICATION_VND_DOT_CENDIO_DOT_THINLINC_DOT_CLIENTCONF.
     */
    APPLICATION_VND_DOT_CENDIO_DOT_THINLINC_DOT_CLIENTCONF("application/vnd.cendio.thinlinc.clientconf"),

    /**
     * APPLICATION_VND_DOT_CHEMDRAW_PLUS_XML.
     */
    APPLICATION_VND_DOT_CHEMDRAW_PLUS_XML("application/vnd.chemdraw+xml", "cdxml"),

    /**
     * APPLICATION_VND_DOT_CHIPNUTS_DOT_KARAOKE_MMD.
     */
    APPLICATION_VND_DOT_CHIPNUTS_DOT_KARAOKE_MMD("application/vnd.chipnuts.karaoke-mmd", "mmd"),

    /**
     * APPLICATION_VND_DOT_CINDERELLA.
     */
    APPLICATION_VND_DOT_CINDERELLA("application/vnd.cinderella", "cdy"),

    /**
     * APPLICATION_VND_DOT_CIRPACK_DOT_ISDN_EXT.
     */
    APPLICATION_VND_DOT_CIRPACK_DOT_ISDN_EXT("application/vnd.cirpack.isdn-ext"),

    /**
     * APPLICATION_VND_DOT_CLAYMORE.
     */
    APPLICATION_VND_DOT_CLAYMORE("application/vnd.claymore", "cla"),

    /**
     * APPLICATION_VND_DOT_CLONK_DOT_C4GROUP.
     */
    APPLICATION_VND_DOT_CLONK_DOT_C4GROUP("application/vnd.clonk.c4group", "c4g", "c4d", "c4f", "c4p", "c4u"),

    /**
     * APPLICATION_VND_DOT_COMMERCE_BATTELLE.
     */
    APPLICATION_VND_DOT_COMMERCE_BATTELLE("application/vnd.commerce-battelle"),

    /**
     * APPLICATION_VND_DOT_COMMONSPACE.
     */
    APPLICATION_VND_DOT_COMMONSPACE("application/vnd.commonspace", "csp"),

    /**
     * APPLICATION_VND_DOT_CONTACT_DOT_CMSG.
     */
    APPLICATION_VND_DOT_CONTACT_DOT_CMSG("application/vnd.contact.cmsg", "cdbcmsg"),

    /**
     * APPLICATION_VND_DOT_COSMOCALLER.
     */
    APPLICATION_VND_DOT_COSMOCALLER("application/vnd.cosmocaller", "cmc"),

    /**
     * APPLICATION_VND_DOT_CRICK_DOT_CLICKER.
     */
    APPLICATION_VND_DOT_CRICK_DOT_CLICKER("application/vnd.crick.clicker", "clkx"),

    /**
     * APPLICATION_VND_DOT_CRICK_DOT_CLICKER_DOT_KEYBOARD.
     */
    APPLICATION_VND_DOT_CRICK_DOT_CLICKER_DOT_KEYBOARD("application/vnd.crick.clicker.keyboard", "clkk"),

    /**
     * APPLICATION_VND_DOT_CRICK_DOT_CLICKER_DOT_PALETTE.
     */
    APPLICATION_VND_DOT_CRICK_DOT_CLICKER_DOT_PALETTE("application/vnd.crick.clicker.palette", "clkp"),

    /**
     * APPLICATION_VND_DOT_CRICK_DOT_CLICKER_DOT_TEMPLATE.
     */
    APPLICATION_VND_DOT_CRICK_DOT_CLICKER_DOT_TEMPLATE("application/vnd.crick.clicker.template", "clkt"),

    /**
     * APPLICATION_VND_DOT_CRICK_DOT_CLICKER_DOT_WORDBANK.
     */
    APPLICATION_VND_DOT_CRICK_DOT_CLICKER_DOT_WORDBANK("application/vnd.crick.clicker.wordbank", "clkw"),

    /**
     * APPLICATION_VND_DOT_CRITICALTOOLS_DOT_WBS_PLUS_XML.
     */
    APPLICATION_VND_DOT_CRITICALTOOLS_DOT_WBS_PLUS_XML("application/vnd.criticaltools.wbs+xml", "wbs"),

    /**
     * APPLICATION_VND_DOT_CTC_POSML.
     */
    APPLICATION_VND_DOT_CTC_POSML("application/vnd.ctc-posml", "pml"),

    /**
     * APPLICATION_VND_DOT_CTCT_DOT_WS_PLUS_XML.
     */
    APPLICATION_VND_DOT_CTCT_DOT_WS_PLUS_XML("application/vnd.ctct.ws+xml"),

    /**
     * APPLICATION_VND_DOT_CUPS_PDF.
     */
    APPLICATION_VND_DOT_CUPS_PDF("application/vnd.cups-pdf"),

    /**
     * APPLICATION_VND_DOT_CUPS_POSTSCRIPT.
     */
    APPLICATION_VND_DOT_CUPS_POSTSCRIPT("application/vnd.cups-postscript"),

    /**
     * APPLICATION_VND_DOT_CUPS_PPD.
     */
    APPLICATION_VND_DOT_CUPS_PPD("application/vnd.cups-ppd", "ppd"),

    /**
     * APPLICATION_VND_DOT_CUPS_RASTER.
     */
    APPLICATION_VND_DOT_CUPS_RASTER("application/vnd.cups-raster"),

    /**
     * APPLICATION_VND_DOT_CUPS_RAW.
     */
    APPLICATION_VND_DOT_CUPS_RAW("application/vnd.cups-raw"),

    /**
     * APPLICATION_VND_DOT_CURL_DOT_CAR.
     */
    APPLICATION_VND_DOT_CURL_DOT_CAR("application/vnd.curl.car", "car"),

    /**
     * APPLICATION_VND_DOT_CURL_DOT_PCURL.
     */
    APPLICATION_VND_DOT_CURL_DOT_PCURL("application/vnd.curl.pcurl", "pcurl"),

    /**
     * APPLICATION_VND_DOT_CYBANK.
     */
    APPLICATION_VND_DOT_CYBANK("application/vnd.cybank"),

    /**
     * APPLICATION_VND_DOT_DATA_VISION_DOT_RDZ.
     */
    APPLICATION_VND_DOT_DATA_VISION_DOT_RDZ("application/vnd.data-vision.rdz", "rdz"),

    /**
     * APPLICATION_VND_DOT_DENOVO_DOT_FCSELAYOUT_LINK.
     */
    APPLICATION_VND_DOT_DENOVO_DOT_FCSELAYOUT_LINK("application/vnd.denovo.fcselayout-link", "fe_launch"),

    /**
     * APPLICATION_VND_DOT_DIR_BI_DOT_PLATE_DL_NOSUFFIX.
     */
    APPLICATION_VND_DOT_DIR_BI_DOT_PLATE_DL_NOSUFFIX("application/vnd.dir-bi.plate-dl-nosuffix"),

    /**
     * APPLICATION_VND_DOT_DNA.
     */
    APPLICATION_VND_DOT_DNA("application/vnd.dna", "dna"),

    /**
     * APPLICATION_VND_DOT_DOLBY_DOT_MLP.
     */
    APPLICATION_VND_DOT_DOLBY_DOT_MLP("application/vnd.dolby.mlp", "mlp"),

    /**
     * APPLICATION_VND_DOT_DOLBY_DOT_MOBILE_DOT_1.
     */
    APPLICATION_VND_DOT_DOLBY_DOT_MOBILE_DOT_1("application/vnd.dolby.mobile.1"),

    /**
     * APPLICATION_VND_DOT_DOLBY_DOT_MOBILE_DOT_2.
     */
    APPLICATION_VND_DOT_DOLBY_DOT_MOBILE_DOT_2("application/vnd.dolby.mobile.2"),

    /**
     * APPLICATION_VND_DOT_DPGRAPH.
     */
    APPLICATION_VND_DOT_DPGRAPH("application/vnd.dpgraph", "dpg"),

    /**
     * APPLICATION_VND_DOT_DREAMFACTORY.
     */
    APPLICATION_VND_DOT_DREAMFACTORY("application/vnd.dreamfactory", "dfac"),

    /**
     * APPLICATION_VND_DOT_DVB_DOT_ESGCONTAINER.
     */
    APPLICATION_VND_DOT_DVB_DOT_ESGCONTAINER("application/vnd.dvb.esgcontainer"),

    /**
     * APPLICATION_VND_DOT_DVB_DOT_IPDCDFTNOTIFACCESS.
     */
    APPLICATION_VND_DOT_DVB_DOT_IPDCDFTNOTIFACCESS("application/vnd.dvb.ipdcdftnotifaccess"),

    /**
     * APPLICATION_VND_DOT_DVB_DOT_IPDCESGACCESS.
     */
    APPLICATION_VND_DOT_DVB_DOT_IPDCESGACCESS("application/vnd.dvb.ipdcesgaccess"),

    /**
     * APPLICATION_VND_DOT_DVB_DOT_IPDCROAMING.
     */
    APPLICATION_VND_DOT_DVB_DOT_IPDCROAMING("application/vnd.dvb.ipdcroaming"),

    /**
     * APPLICATION_VND_DOT_DVB_DOT_IPTV_DOT_ALFEC_BASE.
     */
    APPLICATION_VND_DOT_DVB_DOT_IPTV_DOT_ALFEC_BASE("application/vnd.dvb.iptv.alfec-base"),

    /**
     * APPLICATION_VND_DOT_DVB_DOT_IPTV_DOT_ALFEC_ENHANCEMENT.
     */
    APPLICATION_VND_DOT_DVB_DOT_IPTV_DOT_ALFEC_ENHANCEMENT("application/vnd.dvb.iptv.alfec-enhancement"),

    /**
     * APPLICATION_VND_DOT_DVB_DOT_NOTIF_AGGREGATE_ROOT_PLUS_XML.
     */
    APPLICATION_VND_DOT_DVB_DOT_NOTIF_AGGREGATE_ROOT_PLUS_XML("application/vnd.dvb.notif-aggregate-root+xml"),

    /**
     * APPLICATION_VND_DOT_DVB_DOT_NOTIF_CONTAINER_PLUS_XML.
     */
    APPLICATION_VND_DOT_DVB_DOT_NOTIF_CONTAINER_PLUS_XML("application/vnd.dvb.notif-container+xml"),

    /**
     * APPLICATION_VND_DOT_DVB_DOT_NOTIF_GENERIC_PLUS_XML.
     */
    APPLICATION_VND_DOT_DVB_DOT_NOTIF_GENERIC_PLUS_XML("application/vnd.dvb.notif-generic+xml"),

    /**
     * APPLICATION_VND_DOT_DVB_DOT_NOTIF_IA_MSGLIST_PLUS_XML.
     */
    APPLICATION_VND_DOT_DVB_DOT_NOTIF_IA_MSGLIST_PLUS_XML("application/vnd.dvb.notif-ia-msglist+xml"),

    /**
     * APPLICATION_VND_DOT_DVB_DOT_NOTIF_IA_REGISTRATION_REQUEST_PLUS_XML.
     */
    APPLICATION_VND_DOT_DVB_DOT_NOTIF_IA_REGISTRATION_REQUEST_PLUS_XML("application/vnd.dvb.notif-ia-registration-request+xml"),

    /**
     * APPLICATION_VND_DOT_DVB_DOT_NOTIF_IA_REGISTRATION_RESPONSE_PLUS_XML.
     */
    APPLICATION_VND_DOT_DVB_DOT_NOTIF_IA_REGISTRATION_RESPONSE_PLUS_XML("application/vnd.dvb.notif-ia-registration-response+xml"),

    /**
     * APPLICATION_VND_DOT_DVB_DOT_NOTIF_INIT_PLUS_XML.
     */
    APPLICATION_VND_DOT_DVB_DOT_NOTIF_INIT_PLUS_XML("application/vnd.dvb.notif-init+xml"),

    /**
     * APPLICATION_VND_DOT_DXR.
     */
    APPLICATION_VND_DOT_DXR("application/vnd.dxr"),

    /**
     * APPLICATION_VND_DOT_DYNAGEO.
     */
    APPLICATION_VND_DOT_DYNAGEO("application/vnd.dynageo", "geo"),

    /**
     * APPLICATION_VND_DOT_ECDIS_UPDATE.
     */
    APPLICATION_VND_DOT_ECDIS_UPDATE("application/vnd.ecdis-update"),

    /**
     * APPLICATION_VND_DOT_ECOWIN_DOT_CHART.
     */
    APPLICATION_VND_DOT_ECOWIN_DOT_CHART("application/vnd.ecowin.chart", "mag"),

    /**
     * APPLICATION_VND_DOT_ECOWIN_DOT_FILEREQUEST.
     */
    APPLICATION_VND_DOT_ECOWIN_DOT_FILEREQUEST("application/vnd.ecowin.filerequest"),

    /**
     * APPLICATION_VND_DOT_ECOWIN_DOT_FILEUPDATE.
     */
    APPLICATION_VND_DOT_ECOWIN_DOT_FILEUPDATE("application/vnd.ecowin.fileupdate"),

    /**
     * APPLICATION_VND_DOT_ECOWIN_DOT_SERIES.
     */
    APPLICATION_VND_DOT_ECOWIN_DOT_SERIES("application/vnd.ecowin.series"),

    /**
     * APPLICATION_VND_DOT_ECOWIN_DOT_SERIESREQUEST.
     */
    APPLICATION_VND_DOT_ECOWIN_DOT_SERIESREQUEST("application/vnd.ecowin.seriesrequest"),

    /**
     * APPLICATION_VND_DOT_ECOWIN_DOT_SERIESUPDATE.
     */
    APPLICATION_VND_DOT_ECOWIN_DOT_SERIESUPDATE("application/vnd.ecowin.seriesupdate"),

    /**
     * APPLICATION_VND_DOT_EMCLIENT_DOT_ACCESSREQUEST_PLUS_XML.
     */
    APPLICATION_VND_DOT_EMCLIENT_DOT_ACCESSREQUEST_PLUS_XML("application/vnd.emclient.accessrequest+xml"),

    /**
     * APPLICATION_VND_DOT_ENLIVEN.
     */
    APPLICATION_VND_DOT_ENLIVEN("application/vnd.enliven", "nml"),

    /**
     * APPLICATION_VND_DOT_EPSON_DOT_ESF.
     */
    APPLICATION_VND_DOT_EPSON_DOT_ESF("application/vnd.epson.esf", "esf"),

    /**
     * APPLICATION_VND_DOT_EPSON_DOT_MSF.
     */
    APPLICATION_VND_DOT_EPSON_DOT_MSF("application/vnd.epson.msf", "msf"),

    /**
     * APPLICATION_VND_DOT_EPSON_DOT_QUICKANIME.
     */
    APPLICATION_VND_DOT_EPSON_DOT_QUICKANIME("application/vnd.epson.quickanime", "qam"),

    /**
     * APPLICATION_VND_DOT_EPSON_DOT_SALT.
     */
    APPLICATION_VND_DOT_EPSON_DOT_SALT("application/vnd.epson.salt", "slt"),

    /**
     * APPLICATION_VND_DOT_EPSON_DOT_SSF.
     */
    APPLICATION_VND_DOT_EPSON_DOT_SSF("application/vnd.epson.ssf", "ssf"),

    /**
     * APPLICATION_VND_DOT_ERICSSON_DOT_QUICKCALL.
     */
    APPLICATION_VND_DOT_ERICSSON_DOT_QUICKCALL("application/vnd.ericsson.quickcall"),

    /**
     * APPLICATION_VND_DOT_ESZIGNO3_PLUS_XML.
     */
    APPLICATION_VND_DOT_ESZIGNO3_PLUS_XML("application/vnd.eszigno3+xml", "es3", "et3"),

    /**
     * APPLICATION_VND_DOT_ETSI_DOT_ASIC_E_PLUS_ZIP.
     */
    APPLICATION_VND_DOT_ETSI_DOT_ASIC_E_PLUS_ZIP("application/vnd.etsi.asic-e+zip", "asice"),

    /**
     * APPLICATION_VND_DOT_ETSI_DOT_ASIC_S_PLUS_ZIP.
     */
    APPLICATION_VND_DOT_ETSI_DOT_ASIC_S_PLUS_ZIP("application/vnd.etsi.asic-s+zip", "asics"),

    /**
     * APPLICATION_VND_DOT_ETSI_DOT_AOC_PLUS_XML.
     */
    APPLICATION_VND_DOT_ETSI_DOT_AOC_PLUS_XML("application/vnd.etsi.aoc+xml"),

    /**
     * APPLICATION_VND_DOT_ETSI_DOT_CUG_PLUS_XML.
     */
    APPLICATION_VND_DOT_ETSI_DOT_CUG_PLUS_XML("application/vnd.etsi.cug+xml"),

    /**
     * APPLICATION_VND_DOT_ETSI_DOT_IPTVCOMMAND_PLUS_XML.
     */
    APPLICATION_VND_DOT_ETSI_DOT_IPTVCOMMAND_PLUS_XML("application/vnd.etsi.iptvcommand+xml"),

    /**
     * APPLICATION_VND_DOT_ETSI_DOT_IPTVDISCOVERY_PLUS_XML.
     */
    APPLICATION_VND_DOT_ETSI_DOT_IPTVDISCOVERY_PLUS_XML("application/vnd.etsi.iptvdiscovery+xml"),

    /**
     * APPLICATION_VND_DOT_ETSI_DOT_IPTVPROFILE_PLUS_XML.
     */
    APPLICATION_VND_DOT_ETSI_DOT_IPTVPROFILE_PLUS_XML("application/vnd.etsi.iptvprofile+xml"),

    /**
     * APPLICATION_VND_DOT_ETSI_DOT_IPTVSAD_BC_PLUS_XML.
     */
    APPLICATION_VND_DOT_ETSI_DOT_IPTVSAD_BC_PLUS_XML("application/vnd.etsi.iptvsad-bc+xml"),

    /**
     * APPLICATION_VND_DOT_ETSI_DOT_IPTVSAD_COD_PLUS_XML.
     */
    APPLICATION_VND_DOT_ETSI_DOT_IPTVSAD_COD_PLUS_XML("application/vnd.etsi.iptvsad-cod+xml"),

    /**
     * APPLICATION_VND_DOT_ETSI_DOT_IPTVSAD_NPVR_PLUS_XML.
     */
    APPLICATION_VND_DOT_ETSI_DOT_IPTVSAD_NPVR_PLUS_XML("application/vnd.etsi.iptvsad-npvr+xml"),

    /**
     * APPLICATION_VND_DOT_ETSI_DOT_IPTVUEPROFILE_PLUS_XML.
     */
    APPLICATION_VND_DOT_ETSI_DOT_IPTVUEPROFILE_PLUS_XML("application/vnd.etsi.iptvueprofile+xml"),

    /**
     * APPLICATION_VND_DOT_ETSI_DOT_MCID_PLUS_XML.
     */
    APPLICATION_VND_DOT_ETSI_DOT_MCID_PLUS_XML("application/vnd.etsi.mcid+xml"),

    /**
     * APPLICATION_VND_DOT_ETSI_DOT_SCI_PLUS_XML.
     */
    APPLICATION_VND_DOT_ETSI_DOT_SCI_PLUS_XML("application/vnd.etsi.sci+xml"),

    /**
     * APPLICATION_VND_DOT_ETSI_DOT_SIMSERVS_PLUS_XML.
     */
    APPLICATION_VND_DOT_ETSI_DOT_SIMSERVS_PLUS_XML("application/vnd.etsi.simservs+xml"),

    /**
     * APPLICATION_VND_DOT_EUDORA_DOT_DATA.
     */
    APPLICATION_VND_DOT_EUDORA_DOT_DATA("application/vnd.eudora.data"),

    /**
     * APPLICATION_VND_DOT_EZPIX_ALBUM.
     */
    APPLICATION_VND_DOT_EZPIX_ALBUM("application/vnd.ezpix-album", "ez2"),

    /**
     * APPLICATION_VND_DOT_EZPIX_PACKAGE.
     */
    APPLICATION_VND_DOT_EZPIX_PACKAGE("application/vnd.ezpix-package", "ez3"),

    /**
     * APPLICATION_VND_DOT_F_SECURE_DOT_MOBILE.
     */
    APPLICATION_VND_DOT_F_SECURE_DOT_MOBILE("application/vnd.f-secure.mobile"),

    /**
     * APPLICATION_VND_DOT_FDF.
     */
    APPLICATION_VND_DOT_FDF("application/vnd.fdf", "fdf"),

    /**
     * APPLICATION_VND_DOT_FDSN_DOT_MSEED.
     */
    APPLICATION_VND_DOT_FDSN_DOT_MSEED("application/vnd.fdsn.mseed", "mseed"),

    /**
     * APPLICATION_VND_DOT_FDSN_DOT_SEED.
     */
    APPLICATION_VND_DOT_FDSN_DOT_SEED("application/vnd.fdsn.seed", "seed", "dataless"),

    /**
     * APPLICATION_VND_DOT_FFSNS.
     */
    APPLICATION_VND_DOT_FFSNS("application/vnd.ffsns"),

    /**
     * APPLICATION_VND_DOT_FINTS.
     */
    APPLICATION_VND_DOT_FINTS("application/vnd.fints"),

    /**
     * APPLICATION_VND_DOT_FLOGRAPHIT.
     */
    APPLICATION_VND_DOT_FLOGRAPHIT("application/vnd.flographit", "gph"),

    /**
     * APPLICATION_VND_DOT_FLUXTIME_DOT_CLIP.
     */
    APPLICATION_VND_DOT_FLUXTIME_DOT_CLIP("application/vnd.fluxtime.clip", "ftc"),

    /**
     * APPLICATION_VND_DOT_FONT_FONTFORGE_SFD.
     */
    APPLICATION_VND_DOT_FONT_FONTFORGE_SFD("application/vnd.font-fontforge-sfd"),

    /**
     * APPLICATION_VND_DOT_FRAMEMAKER.
     */
    APPLICATION_VND_DOT_FRAMEMAKER("application/vnd.framemaker", "fm", "frame", "maker", "book"),

    /**
     * APPLICATION_VND_DOT_FROGANS_DOT_FNC.
     */
    APPLICATION_VND_DOT_FROGANS_DOT_FNC("application/vnd.frogans.fnc", "fnc"),

    /**
     * APPLICATION_VND_DOT_FROGANS_DOT_LTF.
     */
    APPLICATION_VND_DOT_FROGANS_DOT_LTF("application/vnd.frogans.ltf", "ltf"),

    /**
     * APPLICATION_VND_DOT_FSC_DOT_WEBLAUNCH.
     */
    APPLICATION_VND_DOT_FSC_DOT_WEBLAUNCH("application/vnd.fsc.weblaunch", "fsc"),

    /**
     * APPLICATION_VND_DOT_FUJITSU_DOT_OASYS.
     */
    APPLICATION_VND_DOT_FUJITSU_DOT_OASYS("application/vnd.fujitsu.oasys", "oas"),

    /**
     * APPLICATION_VND_DOT_FUJITSU_DOT_OASYS2.
     */
    APPLICATION_VND_DOT_FUJITSU_DOT_OASYS2("application/vnd.fujitsu.oasys2", "oa2"),

    /**
     * APPLICATION_VND_DOT_FUJITSU_DOT_OASYS3.
     */
    APPLICATION_VND_DOT_FUJITSU_DOT_OASYS3("application/vnd.fujitsu.oasys3", "oa3"),

    /**
     * APPLICATION_VND_DOT_FUJITSU_DOT_OASYSGP.
     */
    APPLICATION_VND_DOT_FUJITSU_DOT_OASYSGP("application/vnd.fujitsu.oasysgp", "fg5"),

    /**
     * APPLICATION_VND_DOT_FUJITSU_DOT_OASYSPRS.
     */
    APPLICATION_VND_DOT_FUJITSU_DOT_OASYSPRS("application/vnd.fujitsu.oasysprs", "bh2"),

    /**
     * APPLICATION_VND_DOT_FUJIXEROX_DOT_ART_EX.
     */
    APPLICATION_VND_DOT_FUJIXEROX_DOT_ART_EX("application/vnd.fujixerox.art-ex"),

    /**
     * APPLICATION_VND_DOT_FUJIXEROX_DOT_ART4.
     */
    APPLICATION_VND_DOT_FUJIXEROX_DOT_ART4("application/vnd.fujixerox.art4"),

    /**
     * APPLICATION_VND_DOT_FUJIXEROX_DOT_HBPL.
     */
    APPLICATION_VND_DOT_FUJIXEROX_DOT_HBPL("application/vnd.fujixerox.hbpl"),

    /**
     * APPLICATION_VND_DOT_FUJIXEROX_DOT_DDD.
     */
    APPLICATION_VND_DOT_FUJIXEROX_DOT_DDD("application/vnd.fujixerox.ddd", "ddd"),

    /**
     * APPLICATION_VND_DOT_FUJIXEROX_DOT_DOCUWORKS.
     */
    APPLICATION_VND_DOT_FUJIXEROX_DOT_DOCUWORKS("application/vnd.fujixerox.docuworks", "xdw"),

    /**
     * APPLICATION_VND_DOT_FUJIXEROX_DOT_DOCUWORKS_DOT_BINDER.
     */
    APPLICATION_VND_DOT_FUJIXEROX_DOT_DOCUWORKS_DOT_BINDER("application/vnd.fujixerox.docuworks.binder", "xbd"),

    /**
     * APPLICATION_VND_DOT_FUT_MISNET.
     */
    APPLICATION_VND_DOT_FUT_MISNET("application/vnd.fut-misnet"),

    /**
     * APPLICATION_VND_DOT_FUZZYSHEET.
     */
    APPLICATION_VND_DOT_FUZZYSHEET("application/vnd.fuzzysheet", "fzs"),

    /**
     * APPLICATION_VND_DOT_GENOMATIX_DOT_TUXEDO.
     */
    APPLICATION_VND_DOT_GENOMATIX_DOT_TUXEDO("application/vnd.genomatix.tuxedo", "txd"),

    /**
     * APPLICATION_VND_DOT_GEOGEBRA_DOT_FILE.
     */
    APPLICATION_VND_DOT_GEOGEBRA_DOT_FILE("application/vnd.geogebra.file", "ggb"),

    /**
     * APPLICATION_VND_DOT_GEOGEBRA_DOT_TOOL.
     */
    APPLICATION_VND_DOT_GEOGEBRA_DOT_TOOL("application/vnd.geogebra.tool", "ggt"),

    /**
     * APPLICATION_VND_DOT_GEOMETRY_EXPLORER.
     */
    APPLICATION_VND_DOT_GEOMETRY_EXPLORER("application/vnd.geometry-explorer", "gex", "gre"),

    /**
     * APPLICATION_VND_DOT_GMX.
     */
    APPLICATION_VND_DOT_GMX("application/vnd.gmx", "gmx"),

    /**
     * APPLICATION_VND_DOT_GOOGLE_EARTH_DOT_KML_PLUS_XML.
     */
    APPLICATION_VND_DOT_GOOGLE_EARTH_DOT_KML_PLUS_XML("application/vnd.google-earth.kml+xml", "kml"),

    /**
     * APPLICATION_VND_DOT_GOOGLE_EARTH_DOT_KMZ.
     */
    APPLICATION_VND_DOT_GOOGLE_EARTH_DOT_KMZ("application/vnd.google-earth.kmz", "kmz"),

    /**
     * APPLICATION_VND_DOT_GRAFEQ.
     */
    APPLICATION_VND_DOT_GRAFEQ("application/vnd.grafeq", "gqf", "gqs"),

    /**
     * APPLICATION_VND_DOT_GRIDMP.
     */
    APPLICATION_VND_DOT_GRIDMP("application/vnd.gridmp"),

    /**
     * APPLICATION_VND_DOT_GROOVE_ACCOUNT.
     */
    APPLICATION_VND_DOT_GROOVE_ACCOUNT("application/vnd.groove-account", "gac"),

    /**
     * APPLICATION_VND_DOT_GROOVE_HELP.
     */
    APPLICATION_VND_DOT_GROOVE_HELP("application/vnd.groove-help", "ghf"),

    /**
     * APPLICATION_VND_DOT_GROOVE_IDENTITY_MESSAGE.
     */
    APPLICATION_VND_DOT_GROOVE_IDENTITY_MESSAGE("application/vnd.groove-identity-message", "gim"),

    /**
     * APPLICATION_VND_DOT_GROOVE_INJECTOR.
     */
    APPLICATION_VND_DOT_GROOVE_INJECTOR("application/vnd.groove-injector", "grv"),

    /**
     * APPLICATION_VND_DOT_GROOVE_TOOL_MESSAGE.
     */
    APPLICATION_VND_DOT_GROOVE_TOOL_MESSAGE("application/vnd.groove-tool-message", "gtm"),

    /**
     * APPLICATION_VND_DOT_GROOVE_TOOL_TEMPLATE.
     */
    APPLICATION_VND_DOT_GROOVE_TOOL_TEMPLATE("application/vnd.groove-tool-template", "tpl"),

    /**
     * APPLICATION_VND_DOT_GROOVE_VCARD.
     */
    APPLICATION_VND_DOT_GROOVE_VCARD("application/vnd.groove-vcard", "vcg"),

    /**
     * APPLICATION_VND_DOT_HANDHELD_ENTERTAINMENT_PLUS_XML.
     */
    APPLICATION_VND_DOT_HANDHELD_ENTERTAINMENT_PLUS_XML("application/vnd.handheld-entertainment+xml", "zmm"),

    /**
     * APPLICATION_VND_DOT_HBCI.
     */
    APPLICATION_VND_DOT_HBCI("application/vnd.hbci", "hbci"),

    /**
     * APPLICATION_VND_DOT_HCL_BIREPORTS.
     */
    APPLICATION_VND_DOT_HCL_BIREPORTS("application/vnd.hcl-bireports"),

    /**
     * APPLICATION_VND_DOT_HHE_DOT_LESSON_PLAYER.
     */
    APPLICATION_VND_DOT_HHE_DOT_LESSON_PLAYER("application/vnd.hhe.lesson-player", "les"),

    /**
     * APPLICATION_VND_DOT_HP_HPGL.
     */
    APPLICATION_VND_DOT_HP_HPGL("application/vnd.hp-hpgl", "hpgl"),

    /**
     * APPLICATION_VND_DOT_HP_HPID.
     */
    APPLICATION_VND_DOT_HP_HPID("application/vnd.hp-hpid", "hpid"),

    /**
     * APPLICATION_VND_DOT_HP_HPS.
     */
    APPLICATION_VND_DOT_HP_HPS("application/vnd.hp-hps", "hps"),

    /**
     * APPLICATION_VND_DOT_HP_JLYT.
     */
    APPLICATION_VND_DOT_HP_JLYT("application/vnd.hp-jlyt", "jlt"),

    /**
     * APPLICATION_VND_DOT_HP_PCL.
     */
    APPLICATION_VND_DOT_HP_PCL("application/vnd.hp-pcl", "pcl"),

    /**
     * APPLICATION_VND_DOT_HP_PCLXL.
     */
    APPLICATION_VND_DOT_HP_PCLXL("application/vnd.hp-pclxl", "pclxl"),

    /**
     * APPLICATION_VND_DOT_HTTPHONE.
     */
    APPLICATION_VND_DOT_HTTPHONE("application/vnd.httphone"),

    /**
     * APPLICATION_VND_DOT_HYDROSTATIX_DOT_SOF_DATA.
     */
    APPLICATION_VND_DOT_HYDROSTATIX_DOT_SOF_DATA("application/vnd.hydrostatix.sof-data", "sfd-hdstx"),

    /**
     * APPLICATION_VND_DOT_HZN_3D_CROSSWORD.
     */
    APPLICATION_VND_DOT_HZN_3D_CROSSWORD("application/vnd.hzn-3d-crossword", "x3d"),

    /**
     * APPLICATION_VND_DOT_IBM_DOT_AFPLINEDATA.
     */
    APPLICATION_VND_DOT_IBM_DOT_AFPLINEDATA("application/vnd.ibm.afplinedata"),

    /**
     * APPLICATION_VND_DOT_IBM_DOT_ELECTRONIC_MEDIA.
     */
    APPLICATION_VND_DOT_IBM_DOT_ELECTRONIC_MEDIA("application/vnd.ibm.electronic-media"),

    /**
     * APPLICATION_VND_DOT_IBM_DOT_MINIPAY.
     */
    APPLICATION_VND_DOT_IBM_DOT_MINIPAY("application/vnd.ibm.minipay", "mpy"),

    /**
     * APPLICATION_VND_DOT_IBM_DOT_MODCAP.
     */
    APPLICATION_VND_DOT_IBM_DOT_MODCAP("application/vnd.ibm.modcap", "afp", "listafp", "list3820"),

    /**
     * APPLICATION_VND_DOT_IBM_DOT_RIGHTS_MANAGEMENT.
     */
    APPLICATION_VND_DOT_IBM_DOT_RIGHTS_MANAGEMENT("application/vnd.ibm.rights-management", "irm"),

    /**
     * APPLICATION_VND_DOT_IBM_DOT_SECURE_CONTAINER.
     */
    APPLICATION_VND_DOT_IBM_DOT_SECURE_CONTAINER("application/vnd.ibm.secure-container", "sc"),

    /**
     * APPLICATION_VND_DOT_ICCPROFILE.
     */
    APPLICATION_VND_DOT_ICCPROFILE("application/vnd.iccprofile", "icc", "icm"),

    /**
     * APPLICATION_VND_DOT_IGLOADER.
     */
    APPLICATION_VND_DOT_IGLOADER("application/vnd.igloader", "igl"),

    /**
     * APPLICATION_VND_DOT_IMMERVISION_IVP.
     */
    APPLICATION_VND_DOT_IMMERVISION_IVP("application/vnd.immervision-ivp", "ivp"),

    /**
     * APPLICATION_VND_DOT_IMMERVISION_IVU.
     */
    APPLICATION_VND_DOT_IMMERVISION_IVU("application/vnd.immervision-ivu", "ivu"),

    /**
     * APPLICATION_VND_DOT_INFORMEDCONTROL_DOT_RMS_PLUS_XML.
     */
    APPLICATION_VND_DOT_INFORMEDCONTROL_DOT_RMS_PLUS_XML("application/vnd.informedcontrol.rms+xml"),

    /**
     * APPLICATION_VND_DOT_INFORMIX_VISIONARY.
     */
    APPLICATION_VND_DOT_INFORMIX_VISIONARY("application/vnd.informix-visionary"),

    /**
     * APPLICATION_VND_DOT_INTERCON_DOT_FORMNET.
     */
    APPLICATION_VND_DOT_INTERCON_DOT_FORMNET("application/vnd.intercon.formnet", "xpw", "xpx"),

    /**
     * APPLICATION_VND_DOT_INTERTRUST_DOT_DIGIBOX.
     */
    APPLICATION_VND_DOT_INTERTRUST_DOT_DIGIBOX("application/vnd.intertrust.digibox"),

    /**
     * APPLICATION_VND_DOT_INTERTRUST_DOT_NNCP.
     */
    APPLICATION_VND_DOT_INTERTRUST_DOT_NNCP("application/vnd.intertrust.nncp"),

    /**
     * APPLICATION_VND_DOT_INTU_DOT_QBO.
     */
    APPLICATION_VND_DOT_INTU_DOT_QBO("application/vnd.intu.qbo", "qbo"),

    /**
     * APPLICATION_VND_DOT_INTU_DOT_QFX.
     */
    APPLICATION_VND_DOT_INTU_DOT_QFX("application/vnd.intu.qfx", "qfx"),

    /**
     * APPLICATION_VND_DOT_IPTC_DOT_G2_DOT_CONCEPTITEM_PLUS_XML.
     */
    APPLICATION_VND_DOT_IPTC_DOT_G2_DOT_CONCEPTITEM_PLUS_XML("application/vnd.iptc.g2.conceptitem+xml"),

    /**
     * APPLICATION_VND_DOT_IPTC_DOT_G2_DOT_KNOWLEDGEITEM_PLUS_XML.
     */
    APPLICATION_VND_DOT_IPTC_DOT_G2_DOT_KNOWLEDGEITEM_PLUS_XML("application/vnd.iptc.g2.knowledgeitem+xml"),

    /**
     * APPLICATION_VND_DOT_IPTC_DOT_G2_DOT_NEWSITEM_PLUS_XML.
     */
    APPLICATION_VND_DOT_IPTC_DOT_G2_DOT_NEWSITEM_PLUS_XML("application/vnd.iptc.g2.newsitem+xml"),

    /**
     * APPLICATION_VND_DOT_IPTC_DOT_G2_DOT_PACKAGEITEM_PLUS_XML.
     */
    APPLICATION_VND_DOT_IPTC_DOT_G2_DOT_PACKAGEITEM_PLUS_XML("application/vnd.iptc.g2.packageitem+xml"),

    /**
     * APPLICATION_VND_DOT_IPUNPLUGGED_DOT_RCPROFILE.
     */
    APPLICATION_VND_DOT_IPUNPLUGGED_DOT_RCPROFILE("application/vnd.ipunplugged.rcprofile", "rcprofile"),

    /**
     * APPLICATION_VND_DOT_IREPOSITORY_DOT_PACKAGE_PLUS_XML.
     */
    APPLICATION_VND_DOT_IREPOSITORY_DOT_PACKAGE_PLUS_XML("application/vnd.irepository.package+xml", "irp"),

    /**
     * APPLICATION_VND_DOT_IS_XPR.
     */
    APPLICATION_VND_DOT_IS_XPR("application/vnd.is-xpr", "xpr"),

    /**
     * APPLICATION_VND_DOT_JAM.
     */
    APPLICATION_VND_DOT_JAM("application/vnd.jam", "jam"),

    /**
     * APPLICATION_VND_DOT_JAPANNET_DIRECTORY_SERVICE.
     */
    APPLICATION_VND_DOT_JAPANNET_DIRECTORY_SERVICE("application/vnd.japannet-directory-service"),

    /**
     * APPLICATION_VND_DOT_JAPANNET_JPNSTORE_WAKEUP.
     */
    APPLICATION_VND_DOT_JAPANNET_JPNSTORE_WAKEUP("application/vnd.japannet-jpnstore-wakeup"),

    /**
     * APPLICATION_VND_DOT_JAPANNET_PAYMENT_WAKEUP.
     */
    APPLICATION_VND_DOT_JAPANNET_PAYMENT_WAKEUP("application/vnd.japannet-payment-wakeup"),

    /**
     * APPLICATION_VND_DOT_JAPANNET_REGISTRATION.
     */
    APPLICATION_VND_DOT_JAPANNET_REGISTRATION("application/vnd.japannet-registration"),

    /**
     * APPLICATION_VND_DOT_JAPANNET_REGISTRATION_WAKEUP.
     */
    APPLICATION_VND_DOT_JAPANNET_REGISTRATION_WAKEUP("application/vnd.japannet-registration-wakeup"),

    /**
     * APPLICATION_VND_DOT_JAPANNET_SETSTORE_WAKEUP.
     */
    APPLICATION_VND_DOT_JAPANNET_SETSTORE_WAKEUP("application/vnd.japannet-setstore-wakeup"),

    /**
     * APPLICATION_VND_DOT_JAPANNET_VERIFICATION.
     */
    APPLICATION_VND_DOT_JAPANNET_VERIFICATION("application/vnd.japannet-verification"),

    /**
     * APPLICATION_VND_DOT_JAPANNET_VERIFICATION_WAKEUP.
     */
    APPLICATION_VND_DOT_JAPANNET_VERIFICATION_WAKEUP("application/vnd.japannet-verification-wakeup"),

    /**
     * APPLICATION_VND_DOT_JCP_DOT_JAVAME_DOT_MIDLET_RMS.
     */
    APPLICATION_VND_DOT_JCP_DOT_JAVAME_DOT_MIDLET_RMS("application/vnd.jcp.javame.midlet-rms", "rms"),

    /**
     * APPLICATION_VND_DOT_JISP.
     */
    APPLICATION_VND_DOT_JISP("application/vnd.jisp", "jisp"),

    /**
     * APPLICATION_VND_DOT_JOOST_DOT_JODA_ARCHIVE.
     */
    APPLICATION_VND_DOT_JOOST_DOT_JODA_ARCHIVE("application/vnd.joost.joda-archive", "joda"),

    /**
     * APPLICATION_VND_DOT_KAHOOTZ.
     */
    APPLICATION_VND_DOT_KAHOOTZ("application/vnd.kahootz", "ktz", "ktr"),

    /**
     * APPLICATION_VND_DOT_KDE_DOT_KARBON.
     */
    APPLICATION_VND_DOT_KDE_DOT_KARBON("application/vnd.kde.karbon", "karbon"),

    /**
     * APPLICATION_VND_DOT_KDE_DOT_KCHART.
     */
    APPLICATION_VND_DOT_KDE_DOT_KCHART("application/vnd.kde.kchart", "chrt"),

    /**
     * APPLICATION_VND_DOT_KDE_DOT_KFORMULA.
     */
    APPLICATION_VND_DOT_KDE_DOT_KFORMULA("application/vnd.kde.kformula", "kfo"),

    /**
     * APPLICATION_VND_DOT_KDE_DOT_KIVIO.
     */
    APPLICATION_VND_DOT_KDE_DOT_KIVIO("application/vnd.kde.kivio", "flw"),

    /**
     * APPLICATION_VND_DOT_KDE_DOT_KONTOUR.
     */
    APPLICATION_VND_DOT_KDE_DOT_KONTOUR("application/vnd.kde.kontour", "kon"),

    /**
     * APPLICATION_VND_DOT_KDE_DOT_KPRESENTER.
     */
    APPLICATION_VND_DOT_KDE_DOT_KPRESENTER("application/vnd.kde.kpresenter", "kpr", "kpt"),

    /**
     * APPLICATION_VND_DOT_KDE_DOT_KSPREAD.
     */
    APPLICATION_VND_DOT_KDE_DOT_KSPREAD("application/vnd.kde.kspread", "ksp"),

    /**
     * APPLICATION_VND_DOT_KDE_DOT_KWORD.
     */
    APPLICATION_VND_DOT_KDE_DOT_KWORD("application/vnd.kde.kword", "kwd", "kwt"),

    /**
     * APPLICATION_VND_DOT_KENAMEAAPP.
     */
    APPLICATION_VND_DOT_KENAMEAAPP("application/vnd.kenameaapp", "htke"),

    /**
     * APPLICATION_VND_DOT_KIDSPIRATION.
     */
    APPLICATION_VND_DOT_KIDSPIRATION("application/vnd.kidspiration", "kia"),

    /**
     * APPLICATION_VND_DOT_KINAR.
     */
    APPLICATION_VND_DOT_KINAR("application/vnd.kinar", "kne", "knp"),

    /**
     * APPLICATION_VND_DOT_KOAN.
     */
    APPLICATION_VND_DOT_KOAN("application/vnd.koan", "skp", "skd", "skt", "skm"),

    /**
     * APPLICATION_VND_DOT_KODAK_DESCRIPTOR.
     */
    APPLICATION_VND_DOT_KODAK_DESCRIPTOR("application/vnd.kodak-descriptor", "sse"),

    /**
     * APPLICATION_VND_DOT_LIBERTY_REQUEST_PLUS_XML.
     */
    APPLICATION_VND_DOT_LIBERTY_REQUEST_PLUS_XML("application/vnd.liberty-request+xml"),

    /**
     * APPLICATION_VND_DOT_LLAMAGRAPHICS_DOT_LIFE_BALANCE_DOT_DESKTOP.
     */
    APPLICATION_VND_DOT_LLAMAGRAPHICS_DOT_LIFE_BALANCE_DOT_DESKTOP("application/vnd.llamagraphics.life-balance.desktop", "lbd"),

    /**
     * APPLICATION_VND_DOT_LLAMAGRAPHICS_DOT_LIFE_BALANCE_DOT_EXCHANGE_PLUS_XML.
     */
    APPLICATION_VND_DOT_LLAMAGRAPHICS_DOT_LIFE_BALANCE_DOT_EXCHANGE_PLUS_XML("application/vnd.llamagraphics.life-balance.exchange+xml", "lbe"),

    /**
     * APPLICATION_VND_DOT_LOTUS_1_2_3.
     */
    APPLICATION_VND_DOT_LOTUS_1_2_3("application/vnd.lotus-1-2-3", "123"),

    /**
     * APPLICATION_VND_DOT_LOTUS_APPROACH.
     */
    APPLICATION_VND_DOT_LOTUS_APPROACH("application/vnd.lotus-approach", "apr"),

    /**
     * APPLICATION_VND_DOT_LOTUS_FREELANCE.
     */
    APPLICATION_VND_DOT_LOTUS_FREELANCE("application/vnd.lotus-freelance", "pre"),

    /**
     * APPLICATION_VND_DOT_LOTUS_NOTES.
     */
    APPLICATION_VND_DOT_LOTUS_NOTES("application/vnd.lotus-notes", "nsf"),

    /**
     * APPLICATION_VND_DOT_LOTUS_ORGANIZER.
     */
    APPLICATION_VND_DOT_LOTUS_ORGANIZER("application/vnd.lotus-organizer", "org"),

    /**
     * APPLICATION_VND_DOT_LOTUS_SCREENCAM.
     */
    APPLICATION_VND_DOT_LOTUS_SCREENCAM("application/vnd.lotus-screencam"),

    /**
     * APPLICATION_VND_DOT_LOTUS_WORDPRO.
     */
    APPLICATION_VND_DOT_LOTUS_WORDPRO("application/vnd.lotus-wordpro", "lwp"),

    /**
     * APPLICATION_VND_DOT_MACPORTS_DOT_PORTPKG.
     */
    APPLICATION_VND_DOT_MACPORTS_DOT_PORTPKG("application/vnd.macports.portpkg", "portpkg"),

    /**
     * APPLICATION_VND_DOT_MARLIN_DOT_DRM_DOT_ACTIONTOKEN_PLUS_XML.
     */
    APPLICATION_VND_DOT_MARLIN_DOT_DRM_DOT_ACTIONTOKEN_PLUS_XML("application/vnd.marlin.drm.actiontoken+xml"),

    /**
     * APPLICATION_VND_DOT_MARLIN_DOT_DRM_DOT_CONFTOKEN_PLUS_XML.
     */
    APPLICATION_VND_DOT_MARLIN_DOT_DRM_DOT_CONFTOKEN_PLUS_XML("application/vnd.marlin.drm.conftoken+xml"),

    /**
     * APPLICATION_VND_DOT_MARLIN_DOT_DRM_DOT_LICENSE_PLUS_XML.
     */
    APPLICATION_VND_DOT_MARLIN_DOT_DRM_DOT_LICENSE_PLUS_XML("application/vnd.marlin.drm.license+xml"),

    /**
     * APPLICATION_VND_DOT_MARLIN_DOT_DRM_DOT_MDCF.
     */
    APPLICATION_VND_DOT_MARLIN_DOT_DRM_DOT_MDCF("application/vnd.marlin.drm.mdcf"),

    /**
     * APPLICATION_VND_DOT_MCD.
     */
    APPLICATION_VND_DOT_MCD("application/vnd.mcd", "mcd"),

    /**
     * APPLICATION_VND_DOT_MEDCALCDATA.
     */
    APPLICATION_VND_DOT_MEDCALCDATA("application/vnd.medcalcdata", "mc1"),

    /**
     * APPLICATION_VND_DOT_MEDIASTATION_DOT_CDKEY.
     */
    APPLICATION_VND_DOT_MEDIASTATION_DOT_CDKEY("application/vnd.mediastation.cdkey", "cdkey"),

    /**
     * APPLICATION_VND_DOT_MERIDIAN_SLINGSHOT.
     */
    APPLICATION_VND_DOT_MERIDIAN_SLINGSHOT("application/vnd.meridian-slingshot"),

    /**
     * APPLICATION_VND_DOT_MFER.
     */
    APPLICATION_VND_DOT_MFER("application/vnd.mfer", "mwf"),

    /**
     * APPLICATION_VND_DOT_MFMP.
     */
    APPLICATION_VND_DOT_MFMP("application/vnd.mfmp", "mfm"),

    /**
     * APPLICATION_VND_DOT_MICROGRAFX_DOT_FLO.
     */
    APPLICATION_VND_DOT_MICROGRAFX_DOT_FLO("application/vnd.micrografx.flo", "flo"),

    /**
     * APPLICATION_VND_DOT_MICROGRAFX_DOT_IGX.
     */
    APPLICATION_VND_DOT_MICROGRAFX_DOT_IGX("application/vnd.micrografx.igx", "igx"),

    /**
     * APPLICATION_VND_DOT_MIF.
     */
    APPLICATION_VND_DOT_MIF("application/vnd.mif", "mif"),

    /**
     * APPLICATION_VND_DOT_MINDJET_DOT_MINDMANAGER.
     */
    APPLICATION_VND_DOT_MINDJET_DOT_MINDMANAGER("application/vnd.mindjet.mindmanager", "mmp", "mmap", "mmpt", "mmat", "mmmp", "mmas"),

    /**
     * APPLICATION_VND_DOT_MINISOFT_HP3000_SAVE.
     */
    APPLICATION_VND_DOT_MINISOFT_HP3000_SAVE("application/vnd.minisoft-hp3000-save"),

    /**
     * APPLICATION_VND_DOT_MITSUBISHI_DOT_MISTY_GUARD_DOT_TRUSTWEB.
     */
    APPLICATION_VND_DOT_MITSUBISHI_DOT_MISTY_GUARD_DOT_TRUSTWEB("application/vnd.mitsubishi.misty-guard.trustweb"),

    /**
     * APPLICATION_VND_DOT_MOBIUS_DOT_DAF.
     */
    APPLICATION_VND_DOT_MOBIUS_DOT_DAF("application/vnd.mobius.daf", "daf"),

    /**
     * APPLICATION_VND_DOT_MOBIUS_DOT_DIS.
     */
    APPLICATION_VND_DOT_MOBIUS_DOT_DIS("application/vnd.mobius.dis", "dis"),

    /**
     * APPLICATION_VND_DOT_MOBIUS_DOT_MBK.
     */
    APPLICATION_VND_DOT_MOBIUS_DOT_MBK("application/vnd.mobius.mbk", "mbk"),

    /**
     * APPLICATION_VND_DOT_MOBIUS_DOT_MQY.
     */
    APPLICATION_VND_DOT_MOBIUS_DOT_MQY("application/vnd.mobius.mqy", "mqy"),

    /**
     * APPLICATION_VND_DOT_MOBIUS_DOT_MSL.
     */
    APPLICATION_VND_DOT_MOBIUS_DOT_MSL("application/vnd.mobius.msl", "msl"),

    /**
     * APPLICATION_VND_DOT_MOBIUS_DOT_PLC.
     */
    APPLICATION_VND_DOT_MOBIUS_DOT_PLC("application/vnd.mobius.plc", "plc"),

    /**
     * APPLICATION_VND_DOT_MOBIUS_DOT_TXF.
     */
    APPLICATION_VND_DOT_MOBIUS_DOT_TXF("application/vnd.mobius.txf", "txf"),

    /**
     * APPLICATION_VND_DOT_MOPHUN_DOT_APPLICATION.
     */
    APPLICATION_VND_DOT_MOPHUN_DOT_APPLICATION("application/vnd.mophun.application", "mpn"),

    /**
     * APPLICATION_VND_DOT_MOPHUN_DOT_CERTIFICATE.
     */
    APPLICATION_VND_DOT_MOPHUN_DOT_CERTIFICATE("application/vnd.mophun.certificate", "mpc"),

    /**
     * APPLICATION_VND_DOT_MOTOROLA_DOT_FLEXSUITE.
     */
    APPLICATION_VND_DOT_MOTOROLA_DOT_FLEXSUITE("application/vnd.motorola.flexsuite"),

    /**
     * APPLICATION_VND_DOT_MOTOROLA_DOT_FLEXSUITE_DOT_ADSI.
     */
    APPLICATION_VND_DOT_MOTOROLA_DOT_FLEXSUITE_DOT_ADSI("application/vnd.motorola.flexsuite.adsi"),

    /**
     * APPLICATION_VND_DOT_MOTOROLA_DOT_FLEXSUITE_DOT_FIS.
     */
    APPLICATION_VND_DOT_MOTOROLA_DOT_FLEXSUITE_DOT_FIS("application/vnd.motorola.flexsuite.fis"),

    /**
     * APPLICATION_VND_DOT_MOTOROLA_DOT_FLEXSUITE_DOT_GOTAP.
     */
    APPLICATION_VND_DOT_MOTOROLA_DOT_FLEXSUITE_DOT_GOTAP("application/vnd.motorola.flexsuite.gotap"),

    /**
     * APPLICATION_VND_DOT_MOTOROLA_DOT_FLEXSUITE_DOT_KMR.
     */
    APPLICATION_VND_DOT_MOTOROLA_DOT_FLEXSUITE_DOT_KMR("application/vnd.motorola.flexsuite.kmr"),

    /**
     * APPLICATION_VND_DOT_MOTOROLA_DOT_FLEXSUITE_DOT_TTC.
     */
    APPLICATION_VND_DOT_MOTOROLA_DOT_FLEXSUITE_DOT_TTC("application/vnd.motorola.flexsuite.ttc"),

    /**
     * APPLICATION_VND_DOT_MOTOROLA_DOT_FLEXSUITE_DOT_WEM.
     */
    APPLICATION_VND_DOT_MOTOROLA_DOT_FLEXSUITE_DOT_WEM("application/vnd.motorola.flexsuite.wem"),

    /**
     * APPLICATION_VND_DOT_MOTOROLA_DOT_IPRM.
     */
    APPLICATION_VND_DOT_MOTOROLA_DOT_IPRM("application/vnd.motorola.iprm"),

    /**
     * APPLICATION_VND_DOT_MOZILLA_DOT_XUL_PLUS_XML.
     */
    APPLICATION_VND_DOT_MOZILLA_DOT_XUL_PLUS_XML("application/vnd.mozilla.xul+xml", "xul"),

    /**
     * APPLICATION_VND_DOT_MS_ARTGALRY.
     */
    APPLICATION_VND_DOT_MS_ARTGALRY("application/vnd.ms-artgalry", "cil"),

    /**
     * APPLICATION_VND_DOT_MS_ASF.
     */
    APPLICATION_VND_DOT_MS_ASF("application/vnd.ms-asf"),

    /**
     * APPLICATION_VND_DOT_MS_CAB_COMPRESSED.
     */
    APPLICATION_VND_DOT_MS_CAB_COMPRESSED("application/vnd.ms-cab-compressed", "cab"),

    /**
     * APPLICATION_VND_DOT_MS_EXCEL.
     */
    APPLICATION_VND_DOT_MS_EXCEL("application/vnd.ms-excel", "xls", "xlm", "xla", "xlc", "xlt", "xlw", "xll", "xld"),

    /**
     * APPLICATION_VND_DOT_MS_EXCEL_DOT_ADDIN_DOT_MACROENABLED_DOT_12.
     */
    APPLICATION_VND_DOT_MS_EXCEL_DOT_ADDIN_DOT_MACROENABLED_DOT_12("application/vnd.ms-excel.addin.macroenabled.12", "xlam"),

    /**
     * APPLICATION_VND_DOT_MS_EXCEL_DOT_SHEET_DOT_MACROENABLED_DOT_12.
     */
    APPLICATION_VND_DOT_MS_EXCEL_DOT_SHEET_DOT_MACROENABLED_DOT_12("application/vnd.ms-excel.sheet.macroenabled.12", "xlsm"),

    /**
     * APPLICATION_VND_DOT_MS_EXCEL_DOT_SHEET_DOT_BINARY_DOT_MACROENABLED_DOT_12.
     */
    APPLICATION_VND_DOT_MS_EXCEL_DOT_SHEET_DOT_BINARY_DOT_MACROENABLED_DOT_12("application/vnd.ms-excel.sheet.binary.macroenabled.12", "xlsb"),

    /**
     * APPLICATION_VND_DOT_MS_EXCEL_DOT_SHEET_DOT_4.
     */
    APPLICATION_VND_DOT_MS_EXCEL_DOT_SHEET_DOT_4("application/vnd.ms-excel.sheet.4"),

    /**
     * APPLICATION_VND_DOT_MS_EXCEL_DOT_WORKSPACE_DOT_4.
     */
    APPLICATION_VND_DOT_MS_EXCEL_DOT_WORKSPACE_DOT_4("application/vnd.ms-excel.workspace.4"),

    /**
     * APPLICATION_VND_DOT_MS_EXCEL_DOT_SHEET_DOT_3.
     */
    APPLICATION_VND_DOT_MS_EXCEL_DOT_SHEET_DOT_3("application/vnd.ms-excel.sheet.3"),

    /**
     * APPLICATION_VND_DOT_MS_EXCEL_DOT_WORKSPACE_DOT_3.
     */
    APPLICATION_VND_DOT_MS_EXCEL_DOT_WORKSPACE_DOT_3("application/vnd.ms-excel.workspace.3"),

    /**
     * APPLICATION_VND_DOT_MS_EXCEL_DOT_SHEET_DOT_2.
     */
    APPLICATION_VND_DOT_MS_EXCEL_DOT_SHEET_DOT_2("application/vnd.ms-excel.sheet.2"),

    /**
     * APPLICATION_VND_DOT_MS_FONTOBJECT.
     */
    APPLICATION_VND_DOT_MS_FONTOBJECT("application/vnd.ms-fontobject", "eot"),

    /**
     * APPLICATION_VND_DOT_MS_HTMLHELP.
     */
    APPLICATION_VND_DOT_MS_HTMLHELP("application/vnd.ms-htmlhelp", "chm"),

    /**
     * APPLICATION_VND_DOT_MS_IMS.
     */
    APPLICATION_VND_DOT_MS_IMS("application/vnd.ms-ims", "ims"),

    /**
     * APPLICATION_VND_DOT_MS_LRM.
     */
    APPLICATION_VND_DOT_MS_LRM("application/vnd.ms-lrm", "lrm"),

    /**
     * APPLICATION_VND_DOT_MS_OUTLOOK.
     */
    APPLICATION_VND_DOT_MS_OUTLOOK("application/vnd.ms-outlook", "msg"),

    /**
     * APPLICATION_VND_DOT_MS_OUTLOOK_PST.
     */
    APPLICATION_VND_DOT_MS_OUTLOOK_PST("application/vnd.ms-outlook-pst", "pst", "ost"),

    /**
     * APPLICATION_VND_DOT_MS_PKI_DOT_SECCAT.
     */
    APPLICATION_VND_DOT_MS_PKI_DOT_SECCAT("application/vnd.ms-pki.seccat", "cat"),

    /**
     * APPLICATION_VND_DOT_MS_PKI_DOT_STL.
     */
    APPLICATION_VND_DOT_MS_PKI_DOT_STL("application/vnd.ms-pki.stl", "stl"),

    /**
     * APPLICATION_VND_DOT_MS_PLAYREADY_DOT_INITIATOR_PLUS_XML.
     */
    APPLICATION_VND_DOT_MS_PLAYREADY_DOT_INITIATOR_PLUS_XML("application/vnd.ms-playready.initiator+xml"),

    /**
     * APPLICATION_VND_DOT_MS_POWERPOINT.
     */
    APPLICATION_VND_DOT_MS_POWERPOINT("application/vnd.ms-powerpoint", "ppt", "ppz", "pps", "pot", "ppa"),

    /**
     * APPLICATION_VND_DOT_MS_POWERPOINT_DOT_ADDIN_DOT_MACROENABLED_DOT_12.
     */
    APPLICATION_VND_DOT_MS_POWERPOINT_DOT_ADDIN_DOT_MACROENABLED_DOT_12("application/vnd.ms-powerpoint.addin.macroenabled.12", "ppam"),

    /**
     * APPLICATION_VND_DOT_MS_POWERPOINT_DOT_PRESENTATION_DOT_MACROENABLED_DOT_12.
     */
    APPLICATION_VND_DOT_MS_POWERPOINT_DOT_PRESENTATION_DOT_MACROENABLED_DOT_12("application/vnd.ms-powerpoint.presentation.macroenabled.12", "pptm"),

    /**
     * APPLICATION_VND_DOT_MS_POWERPOINT_DOT_SLIDE_DOT_MACROENABLED_DOT_12.
     */
    APPLICATION_VND_DOT_MS_POWERPOINT_DOT_SLIDE_DOT_MACROENABLED_DOT_12("application/vnd.ms-powerpoint.slide.macroenabled.12", "sldm"),

    /**
     * APPLICATION_VND_DOT_MS_POWERPOINT_DOT_SLIDESHOW_DOT_MACROENABLED_DOT_12.
     */
    APPLICATION_VND_DOT_MS_POWERPOINT_DOT_SLIDESHOW_DOT_MACROENABLED_DOT_12("application/vnd.ms-powerpoint.slideshow.macroenabled.12", "ppsm"),

    /**
     * APPLICATION_VND_DOT_MS_POWERPOINT_DOT_TEMPLATE_DOT_MACROENABLED_DOT_12.
     */
    APPLICATION_VND_DOT_MS_POWERPOINT_DOT_TEMPLATE_DOT_MACROENABLED_DOT_12("application/vnd.ms-powerpoint.template.macroenabled.12", "potm"),

    /**
     * APPLICATION_VND_DOT_MS_PROJECT.
     */
    APPLICATION_VND_DOT_MS_PROJECT("application/vnd.ms-project", "mpp", "mpt"),

    /**
     * APPLICATION_X_PROJECT.
     */
    APPLICATION_X_PROJECT("application/x-project", "mpx"),

    /**
     * APPLICATION_VND_DOT_MS_TNEF.
     */
    APPLICATION_VND_DOT_MS_TNEF("application/vnd.ms-tnef"),

    /**
     * APPLICATION_VND_DOT_MS_WMDRM_DOT_LIC_CHLG_REQ.
     */
    APPLICATION_VND_DOT_MS_WMDRM_DOT_LIC_CHLG_REQ("application/vnd.ms-wmdrm.lic-chlg-req"),

    /**
     * APPLICATION_VND_DOT_MS_WMDRM_DOT_LIC_RESP.
     */
    APPLICATION_VND_DOT_MS_WMDRM_DOT_LIC_RESP("application/vnd.ms-wmdrm.lic-resp"),

    /**
     * APPLICATION_VND_DOT_MS_WMDRM_DOT_METER_CHLG_REQ.
     */
    APPLICATION_VND_DOT_MS_WMDRM_DOT_METER_CHLG_REQ("application/vnd.ms-wmdrm.meter-chlg-req"),

    /**
     * APPLICATION_VND_DOT_MS_WMDRM_DOT_METER_RESP.
     */
    APPLICATION_VND_DOT_MS_WMDRM_DOT_METER_RESP("application/vnd.ms-wmdrm.meter-resp"),

    /**
     * APPLICATION_VND_DOT_MS_WORD_DOT_DOCUMENT_DOT_MACROENABLED_DOT_12.
     */
    APPLICATION_VND_DOT_MS_WORD_DOT_DOCUMENT_DOT_MACROENABLED_DOT_12("application/vnd.ms-word.document.macroenabled.12", "docm"),

    /**
     * APPLICATION_VND_DOT_MS_WORD_DOT_TEMPLATE_DOT_MACROENABLED_DOT_12.
     */
    APPLICATION_VND_DOT_MS_WORD_DOT_TEMPLATE_DOT_MACROENABLED_DOT_12("application/vnd.ms-word.template.macroenabled.12", "dotm"),

    /**
     * APPLICATION_VND_DOT_MS_WORKS.
     */
    APPLICATION_VND_DOT_MS_WORKS("application/vnd.ms-works", "wps", "wks", "wcm", "wdb"),

    /**
     * APPLICATION_VND_DOT_MS_WPL.
     */
    APPLICATION_VND_DOT_MS_WPL("application/vnd.ms-wpl", "wpl"),

    /**
     * APPLICATION_VND_DOT_MS_XPSDOCUMENT.
     */
    APPLICATION_VND_DOT_MS_XPSDOCUMENT("application/vnd.ms-xpsdocument", "xps", "oxps"),

    /**
     * APPLICATION_VND_DOT_MSEQ.
     */
    APPLICATION_VND_DOT_MSEQ("application/vnd.mseq", "mseq"),

    /**
     * APPLICATION_VND_DOT_MSIGN.
     */
    APPLICATION_VND_DOT_MSIGN("application/vnd.msign"),

    /**
     * APPLICATION_VND_DOT_MULTIAD_DOT_CREATOR.
     */
    APPLICATION_VND_DOT_MULTIAD_DOT_CREATOR("application/vnd.multiad.creator"),

    /**
     * APPLICATION_VND_DOT_MULTIAD_DOT_CREATOR_DOT_CIF.
     */
    APPLICATION_VND_DOT_MULTIAD_DOT_CREATOR_DOT_CIF("application/vnd.multiad.creator.cif"),

    /**
     * APPLICATION_VND_DOT_MUSIC_NIFF.
     */
    APPLICATION_VND_DOT_MUSIC_NIFF("application/vnd.music-niff"),

    /**
     * APPLICATION_VND_DOT_MUSICIAN.
     */
    APPLICATION_VND_DOT_MUSICIAN("application/vnd.musician", "mus"),

    /**
     * APPLICATION_VND_DOT_MUVEE_DOT_STYLE.
     */
    APPLICATION_VND_DOT_MUVEE_DOT_STYLE("application/vnd.muvee.style", "msty"),

    /**
     * APPLICATION_VND_DOT_NCD_DOT_CONTROL.
     */
    APPLICATION_VND_DOT_NCD_DOT_CONTROL("application/vnd.ncd.control"),

    /**
     * APPLICATION_VND_DOT_NCD_DOT_REFERENCE.
     */
    APPLICATION_VND_DOT_NCD_DOT_REFERENCE("application/vnd.ncd.reference"),

    /**
     * APPLICATION_VND_DOT_NERVANA.
     */
    APPLICATION_VND_DOT_NERVANA("application/vnd.nervana"),

    /**
     * APPLICATION_VND_DOT_NETFPX.
     */
    APPLICATION_VND_DOT_NETFPX("application/vnd.netfpx"),

    /**
     * APPLICATION_VND_DOT_NEUROLANGUAGE_DOT_NLU.
     */
    APPLICATION_VND_DOT_NEUROLANGUAGE_DOT_NLU("application/vnd.neurolanguage.nlu", "nlu"),

    /**
     * APPLICATION_VND_DOT_NOBLENET_DIRECTORY.
     */
    APPLICATION_VND_DOT_NOBLENET_DIRECTORY("application/vnd.noblenet-directory", "nnd"),

    /**
     * APPLICATION_VND_DOT_NOBLENET_SEALER.
     */
    APPLICATION_VND_DOT_NOBLENET_SEALER("application/vnd.noblenet-sealer", "nns"),

    /**
     * APPLICATION_VND_DOT_NOBLENET_WEB.
     */
    APPLICATION_VND_DOT_NOBLENET_WEB("application/vnd.noblenet-web", "nnw"),

    /**
     * APPLICATION_VND_DOT_NOKIA_DOT_CATALOGS.
     */
    APPLICATION_VND_DOT_NOKIA_DOT_CATALOGS("application/vnd.nokia.catalogs"),

    /**
     * APPLICATION_VND_DOT_NOKIA_DOT_CONML_PLUS_WBXML.
     */
    APPLICATION_VND_DOT_NOKIA_DOT_CONML_PLUS_WBXML("application/vnd.nokia.conml+wbxml"),

    /**
     * APPLICATION_VND_DOT_NOKIA_DOT_CONML_PLUS_XML.
     */
    APPLICATION_VND_DOT_NOKIA_DOT_CONML_PLUS_XML("application/vnd.nokia.conml+xml"),

    /**
     * APPLICATION_VND_DOT_NOKIA_DOT_ISDS_RADIO_PRESETS.
     */
    APPLICATION_VND_DOT_NOKIA_DOT_ISDS_RADIO_PRESETS("application/vnd.nokia.isds-radio-presets"),

    /**
     * APPLICATION_VND_DOT_NOKIA_DOT_IPTV_DOT_CONFIG_PLUS_XML.
     */
    APPLICATION_VND_DOT_NOKIA_DOT_IPTV_DOT_CONFIG_PLUS_XML("application/vnd.nokia.iptv.config+xml"),

    /**
     * APPLICATION_VND_DOT_NOKIA_DOT_LANDMARK_PLUS_WBXML.
     */
    APPLICATION_VND_DOT_NOKIA_DOT_LANDMARK_PLUS_WBXML("application/vnd.nokia.landmark+wbxml"),

    /**
     * APPLICATION_VND_DOT_NOKIA_DOT_LANDMARK_PLUS_XML.
     */
    APPLICATION_VND_DOT_NOKIA_DOT_LANDMARK_PLUS_XML("application/vnd.nokia.landmark+xml"),

    /**
     * APPLICATION_VND_DOT_NOKIA_DOT_LANDMARKCOLLECTION_PLUS_XML.
     */
    APPLICATION_VND_DOT_NOKIA_DOT_LANDMARKCOLLECTION_PLUS_XML("application/vnd.nokia.landmarkcollection+xml"),

    /**
     * APPLICATION_VND_DOT_NOKIA_DOT_N_GAGE_DOT_AC_PLUS_XML.
     */
    APPLICATION_VND_DOT_NOKIA_DOT_N_GAGE_DOT_AC_PLUS_XML("application/vnd.nokia.n-gage.ac+xml"),

    /**
     * APPLICATION_VND_DOT_NOKIA_DOT_N_GAGE_DOT_DATA.
     */
    APPLICATION_VND_DOT_NOKIA_DOT_N_GAGE_DOT_DATA("application/vnd.nokia.n-gage.data", "ngdat"),

    /**
     * APPLICATION_VND_DOT_NOKIA_DOT_N_GAGE_DOT_SYMBIAN_DOT_INSTALL.
     */
    APPLICATION_VND_DOT_NOKIA_DOT_N_GAGE_DOT_SYMBIAN_DOT_INSTALL("application/vnd.nokia.n-gage.symbian.install", "n-gage"),

    /**
     * APPLICATION_VND_DOT_NOKIA_DOT_NCD.
     */
    APPLICATION_VND_DOT_NOKIA_DOT_NCD("application/vnd.nokia.ncd"),

    /**
     * APPLICATION_VND_DOT_NOKIA_DOT_PCD_PLUS_WBXML.
     */
    APPLICATION_VND_DOT_NOKIA_DOT_PCD_PLUS_WBXML("application/vnd.nokia.pcd+wbxml"),

    /**
     * APPLICATION_VND_DOT_NOKIA_DOT_PCD_PLUS_XML.
     */
    APPLICATION_VND_DOT_NOKIA_DOT_PCD_PLUS_XML("application/vnd.nokia.pcd+xml"),

    /**
     * APPLICATION_VND_DOT_NOKIA_DOT_RADIO_PRESET.
     */
    APPLICATION_VND_DOT_NOKIA_DOT_RADIO_PRESET("application/vnd.nokia.radio-preset", "rpst"),

    /**
     * APPLICATION_VND_DOT_NOKIA_DOT_RADIO_PRESETS.
     */
    APPLICATION_VND_DOT_NOKIA_DOT_RADIO_PRESETS("application/vnd.nokia.radio-presets", "rpss"),

    /**
     * APPLICATION_VND_DOT_NOVADIGM_DOT_EDM.
     */
    APPLICATION_VND_DOT_NOVADIGM_DOT_EDM("application/vnd.novadigm.edm", "edm"),

    /**
     * APPLICATION_VND_DOT_NOVADIGM_DOT_EDX.
     */
    APPLICATION_VND_DOT_NOVADIGM_DOT_EDX("application/vnd.novadigm.edx", "edx"),

    /**
     * APPLICATION_VND_DOT_NOVADIGM_DOT_EXT.
     */
    APPLICATION_VND_DOT_NOVADIGM_DOT_EXT("application/vnd.novadigm.ext", "ext"),

    /**
     * APPLICATION_VND_DOT_OASIS_DOT_OPENDOCUMENT_DOT_CHART.
     */
    APPLICATION_VND_DOT_OASIS_DOT_OPENDOCUMENT_DOT_CHART("application/vnd.oasis.opendocument.chart", "odc"),

    /**
     * APPLICATION_VND_DOT_OASIS_DOT_OPENDOCUMENT_DOT_CHART_TEMPLATE.
     */
    APPLICATION_VND_DOT_OASIS_DOT_OPENDOCUMENT_DOT_CHART_TEMPLATE("application/vnd.oasis.opendocument.chart-template", "otc"),

    /**
     * APPLICATION_VND_DOT_OASIS_DOT_OPENDOCUMENT_DOT_DATABASE.
     */
    APPLICATION_VND_DOT_OASIS_DOT_OPENDOCUMENT_DOT_DATABASE("application/vnd.oasis.opendocument.database", "odb"),

    /**
     * APPLICATION_VND_DOT_OASIS_DOT_OPENDOCUMENT_DOT_FORMULA.
     */
    APPLICATION_VND_DOT_OASIS_DOT_OPENDOCUMENT_DOT_FORMULA("application/vnd.oasis.opendocument.formula", "odf"),

    /**
     * APPLICATION_VND_DOT_OASIS_DOT_OPENDOCUMENT_DOT_FORMULA_TEMPLATE.
     */
    APPLICATION_VND_DOT_OASIS_DOT_OPENDOCUMENT_DOT_FORMULA_TEMPLATE("application/vnd.oasis.opendocument.formula-template", "odft"),

    /**
     * APPLICATION_VND_DOT_OASIS_DOT_OPENDOCUMENT_DOT_GRAPHICS.
     */
    APPLICATION_VND_DOT_OASIS_DOT_OPENDOCUMENT_DOT_GRAPHICS("application/vnd.oasis.opendocument.graphics", "odg"),

    /**
     * APPLICATION_VND_DOT_OASIS_DOT_OPENDOCUMENT_DOT_GRAPHICS_TEMPLATE.
     */
    APPLICATION_VND_DOT_OASIS_DOT_OPENDOCUMENT_DOT_GRAPHICS_TEMPLATE("application/vnd.oasis.opendocument.graphics-template", "otg"),

    /**
     * APPLICATION_VND_DOT_OASIS_DOT_OPENDOCUMENT_DOT_IMAGE.
     */
    APPLICATION_VND_DOT_OASIS_DOT_OPENDOCUMENT_DOT_IMAGE("application/vnd.oasis.opendocument.image", "odi"),

    /**
     * APPLICATION_VND_DOT_OASIS_DOT_OPENDOCUMENT_DOT_IMAGE_TEMPLATE.
     */
    APPLICATION_VND_DOT_OASIS_DOT_OPENDOCUMENT_DOT_IMAGE_TEMPLATE("application/vnd.oasis.opendocument.image-template", "oti"),

    /**
     * APPLICATION_VND_DOT_OASIS_DOT_OPENDOCUMENT_DOT_PRESENTATION.
     */
    APPLICATION_VND_DOT_OASIS_DOT_OPENDOCUMENT_DOT_PRESENTATION("application/vnd.oasis.opendocument.presentation", "odp"),

    /**
     * APPLICATION_VND_DOT_OASIS_DOT_OPENDOCUMENT_DOT_PRESENTATION_TEMPLATE.
     */
    APPLICATION_VND_DOT_OASIS_DOT_OPENDOCUMENT_DOT_PRESENTATION_TEMPLATE("application/vnd.oasis.opendocument.presentation-template", "otp"),

    /**
     * APPLICATION_VND_DOT_OASIS_DOT_OPENDOCUMENT_DOT_SPREADSHEET.
     */
    APPLICATION_VND_DOT_OASIS_DOT_OPENDOCUMENT_DOT_SPREADSHEET("application/vnd.oasis.opendocument.spreadsheet", "ods"),

    /**
     * APPLICATION_VND_DOT_OASIS_DOT_OPENDOCUMENT_DOT_SPREADSHEET_TEMPLATE.
     */
    APPLICATION_VND_DOT_OASIS_DOT_OPENDOCUMENT_DOT_SPREADSHEET_TEMPLATE("application/vnd.oasis.opendocument.spreadsheet-template", "ots"),

    /**
     * APPLICATION_VND_DOT_OASIS_DOT_OPENDOCUMENT_DOT_TEXT.
     */
    APPLICATION_VND_DOT_OASIS_DOT_OPENDOCUMENT_DOT_TEXT("application/vnd.oasis.opendocument.text", "odt"),

    /**
     * APPLICATION_VND_DOT_OASIS_DOT_OPENDOCUMENT_DOT_TEXT_MASTER.
     */
    APPLICATION_VND_DOT_OASIS_DOT_OPENDOCUMENT_DOT_TEXT_MASTER("application/vnd.oasis.opendocument.text-master", "otm"),

    /**
     * APPLICATION_VND_DOT_OASIS_DOT_OPENDOCUMENT_DOT_TEXT_TEMPLATE.
     */
    APPLICATION_VND_DOT_OASIS_DOT_OPENDOCUMENT_DOT_TEXT_TEMPLATE("application/vnd.oasis.opendocument.text-template", "ott"),

    /**
     * APPLICATION_VND_DOT_OASIS_DOT_OPENDOCUMENT_DOT_TEXT_WEB.
     */
    APPLICATION_VND_DOT_OASIS_DOT_OPENDOCUMENT_DOT_TEXT_WEB("application/vnd.oasis.opendocument.text-web", "oth"),

    /**
     * APPLICATION_VND_DOT_OBN.
     */
    APPLICATION_VND_DOT_OBN("application/vnd.obn"),

    /**
     * APPLICATION_VND_DOT_OLPC_SUGAR.
     */
    APPLICATION_VND_DOT_OLPC_SUGAR("application/vnd.olpc-sugar", "xo"),

    /**
     * APPLICATION_VND_DOT_OMA_SCWS_CONFIG.
     */
    APPLICATION_VND_DOT_OMA_SCWS_CONFIG("application/vnd.oma-scws-config"),

    /**
     * APPLICATION_VND_DOT_OMA_SCWS_HTTP_REQUEST.
     */
    APPLICATION_VND_DOT_OMA_SCWS_HTTP_REQUEST("application/vnd.oma-scws-http-request"),

    /**
     * APPLICATION_VND_DOT_OMA_SCWS_HTTP_RESPONSE.
     */
    APPLICATION_VND_DOT_OMA_SCWS_HTTP_RESPONSE("application/vnd.oma-scws-http-response"),

    /**
     * APPLICATION_VND_DOT_OMA_DOT_BCAST_DOT_ASSOCIATED_PROCEDURE_PARAMETER_PLUS_XML.
     */
    APPLICATION_VND_DOT_OMA_DOT_BCAST_DOT_ASSOCIATED_PROCEDURE_PARAMETER_PLUS_XML("application/vnd.oma.bcast.associated-procedure-parameter+xml"),

    /**
     * APPLICATION_VND_DOT_OMA_DOT_BCAST_DOT_DRM_TRIGGER_PLUS_XML.
     */
    APPLICATION_VND_DOT_OMA_DOT_BCAST_DOT_DRM_TRIGGER_PLUS_XML("application/vnd.oma.bcast.drm-trigger+xml"),

    /**
     * APPLICATION_VND_DOT_OMA_DOT_BCAST_DOT_IMD_PLUS_XML.
     */
    APPLICATION_VND_DOT_OMA_DOT_BCAST_DOT_IMD_PLUS_XML("application/vnd.oma.bcast.imd+xml"),

    /**
     * APPLICATION_VND_DOT_OMA_DOT_BCAST_DOT_LTKM.
     */
    APPLICATION_VND_DOT_OMA_DOT_BCAST_DOT_LTKM("application/vnd.oma.bcast.ltkm"),

    /**
     * APPLICATION_VND_DOT_OMA_DOT_BCAST_DOT_NOTIFICATION_PLUS_XML.
     */
    APPLICATION_VND_DOT_OMA_DOT_BCAST_DOT_NOTIFICATION_PLUS_XML("application/vnd.oma.bcast.notification+xml"),

    /**
     * APPLICATION_VND_DOT_OMA_DOT_BCAST_DOT_PROVISIONINGTRIGGER.
     */
    APPLICATION_VND_DOT_OMA_DOT_BCAST_DOT_PROVISIONINGTRIGGER("application/vnd.oma.bcast.provisioningtrigger"),

    /**
     * APPLICATION_VND_DOT_OMA_DOT_BCAST_DOT_SGBOOT.
     */
    APPLICATION_VND_DOT_OMA_DOT_BCAST_DOT_SGBOOT("application/vnd.oma.bcast.sgboot"),

    /**
     * APPLICATION_VND_DOT_OMA_DOT_BCAST_DOT_SGDD_PLUS_XML.
     */
    APPLICATION_VND_DOT_OMA_DOT_BCAST_DOT_SGDD_PLUS_XML("application/vnd.oma.bcast.sgdd+xml"),

    /**
     * APPLICATION_VND_DOT_OMA_DOT_BCAST_DOT_SGDU.
     */
    APPLICATION_VND_DOT_OMA_DOT_BCAST_DOT_SGDU("application/vnd.oma.bcast.sgdu"),

    /**
     * APPLICATION_VND_DOT_OMA_DOT_BCAST_DOT_SIMPLE_SYMBOL_CONTAINER.
     */
    APPLICATION_VND_DOT_OMA_DOT_BCAST_DOT_SIMPLE_SYMBOL_CONTAINER("application/vnd.oma.bcast.simple-symbol-container"),

    /**
     * APPLICATION_VND_DOT_OMA_DOT_BCAST_DOT_SMARTCARD_TRIGGER_PLUS_XML.
     */
    APPLICATION_VND_DOT_OMA_DOT_BCAST_DOT_SMARTCARD_TRIGGER_PLUS_XML("application/vnd.oma.bcast.smartcard-trigger+xml"),

    /**
     * APPLICATION_VND_DOT_OMA_DOT_BCAST_DOT_SPROV_PLUS_XML.
     */
    APPLICATION_VND_DOT_OMA_DOT_BCAST_DOT_SPROV_PLUS_XML("application/vnd.oma.bcast.sprov+xml"),

    /**
     * APPLICATION_VND_DOT_OMA_DOT_BCAST_DOT_STKM.
     */
    APPLICATION_VND_DOT_OMA_DOT_BCAST_DOT_STKM("application/vnd.oma.bcast.stkm"),

    /**
     * APPLICATION_VND_DOT_OMA_DOT_DCD.
     */
    APPLICATION_VND_DOT_OMA_DOT_DCD("application/vnd.oma.dcd"),

    /**
     * APPLICATION_VND_DOT_OMA_DOT_DCDC.
     */
    APPLICATION_VND_DOT_OMA_DOT_DCDC("application/vnd.oma.dcdc"),

    /**
     * APPLICATION_VND_DOT_OMA_DOT_DD2_PLUS_XML.
     */
    APPLICATION_VND_DOT_OMA_DOT_DD2_PLUS_XML("application/vnd.oma.dd2+xml", "dd2"),

    /**
     * APPLICATION_VND_DOT_OMA_DOT_DRM_DOT_RISD_PLUS_XML.
     */
    APPLICATION_VND_DOT_OMA_DOT_DRM_DOT_RISD_PLUS_XML("application/vnd.oma.drm.risd+xml"),

    /**
     * APPLICATION_VND_DOT_OMA_DOT_GROUP_USAGE_LIST_PLUS_XML.
     */
    APPLICATION_VND_DOT_OMA_DOT_GROUP_USAGE_LIST_PLUS_XML("application/vnd.oma.group-usage-list+xml"),

    /**
     * APPLICATION_VND_DOT_OMA_DOT_POC_DOT_DETAILED_PROGRESS_REPORT_PLUS_XML.
     */
    APPLICATION_VND_DOT_OMA_DOT_POC_DOT_DETAILED_PROGRESS_REPORT_PLUS_XML("application/vnd.oma.poc.detailed-progress-report+xml"),

    /**
     * APPLICATION_VND_DOT_OMA_DOT_POC_DOT_FINAL_REPORT_PLUS_XML.
     */
    APPLICATION_VND_DOT_OMA_DOT_POC_DOT_FINAL_REPORT_PLUS_XML("application/vnd.oma.poc.final-report+xml"),

    /**
     * APPLICATION_VND_DOT_OMA_DOT_POC_DOT_GROUPS_PLUS_XML.
     */
    APPLICATION_VND_DOT_OMA_DOT_POC_DOT_GROUPS_PLUS_XML("application/vnd.oma.poc.groups+xml"),

    /**
     * APPLICATION_VND_DOT_OMA_DOT_POC_DOT_INVOCATION_DESCRIPTOR_PLUS_XML.
     */
    APPLICATION_VND_DOT_OMA_DOT_POC_DOT_INVOCATION_DESCRIPTOR_PLUS_XML("application/vnd.oma.poc.invocation-descriptor+xml"),

    /**
     * APPLICATION_VND_DOT_OMA_DOT_POC_DOT_OPTIMIZED_PROGRESS_REPORT_PLUS_XML.
     */
    APPLICATION_VND_DOT_OMA_DOT_POC_DOT_OPTIMIZED_PROGRESS_REPORT_PLUS_XML("application/vnd.oma.poc.optimized-progress-report+xml"),

    /**
     * APPLICATION_VND_DOT_OMA_DOT_XCAP_DIRECTORY_PLUS_XML.
     */
    APPLICATION_VND_DOT_OMA_DOT_XCAP_DIRECTORY_PLUS_XML("application/vnd.oma.xcap-directory+xml"),

    /**
     * APPLICATION_VND_DOT_OMADS_EMAIL_PLUS_XML.
     */
    APPLICATION_VND_DOT_OMADS_EMAIL_PLUS_XML("application/vnd.omads-email+xml"),

    /**
     * APPLICATION_VND_DOT_OMADS_FILE_PLUS_XML.
     */
    APPLICATION_VND_DOT_OMADS_FILE_PLUS_XML("application/vnd.omads-file+xml"),

    /**
     * APPLICATION_VND_DOT_OMADS_FOLDER_PLUS_XML.
     */
    APPLICATION_VND_DOT_OMADS_FOLDER_PLUS_XML("application/vnd.omads-folder+xml"),

    /**
     * APPLICATION_VND_DOT_OMALOC_SUPL_INIT.
     */
    APPLICATION_VND_DOT_OMALOC_SUPL_INIT("application/vnd.omaloc-supl-init"),

    /**
     * APPLICATION_VND_DOT_OPENOFFICEORG_DOT_EXTENSION.
     */
    APPLICATION_VND_DOT_OPENOFFICEORG_DOT_EXTENSION("application/vnd.openofficeorg.extension", "oxt"),

    /**
     * APPLICATION_VND_DOT_OPENXMLFORMATS_OFFICEDOCUMENT_DOT_PRESENTATIONML_DOT_PRESENTATION.
     */
    APPLICATION_VND_DOT_OPENXMLFORMATS_OFFICEDOCUMENT_DOT_PRESENTATIONML_DOT_PRESENTATION("application/vnd.openxmlformats-officedocument.presentationml.presentation", "pptx", "thmx"),

    /**
     * APPLICATION_VND_DOT_OPENXMLFORMATS_OFFICEDOCUMENT_DOT_PRESENTATIONML_DOT_SLIDE.
     */
    APPLICATION_VND_DOT_OPENXMLFORMATS_OFFICEDOCUMENT_DOT_PRESENTATIONML_DOT_SLIDE("application/vnd.openxmlformats-officedocument.presentationml.slide", "sldx"),

    /**
     * APPLICATION_VND_DOT_OPENXMLFORMATS_OFFICEDOCUMENT_DOT_PRESENTATIONML_DOT_TEMPLATE.
     */
    APPLICATION_VND_DOT_OPENXMLFORMATS_OFFICEDOCUMENT_DOT_PRESENTATIONML_DOT_TEMPLATE("application/vnd.openxmlformats-officedocument.presentationml.template", "potx"),

    /**
     * APPLICATION_VND_DOT_OPENXMLFORMATS_OFFICEDOCUMENT_DOT_PRESENTATIONML_DOT_SLIDESHOW.
     */
    APPLICATION_VND_DOT_OPENXMLFORMATS_OFFICEDOCUMENT_DOT_PRESENTATIONML_DOT_SLIDESHOW("application/vnd.openxmlformats-officedocument.presentationml.slideshow", "ppsx"),

    /**
     * APPLICATION_VND_DOT_OPENXMLFORMATS_OFFICEDOCUMENT_DOT_SPREADSHEETML_DOT_SHEET.
     */
    APPLICATION_VND_DOT_OPENXMLFORMATS_OFFICEDOCUMENT_DOT_SPREADSHEETML_DOT_SHEET("application/vnd.openxmlformats-officedocument.spreadsheetml.sheet", "xlsx"),

    /**
     * APPLICATION_VND_DOT_OPENXMLFORMATS_OFFICEDOCUMENT_DOT_SPREADSHEETML_DOT_TEMPLATE.
     */
    APPLICATION_VND_DOT_OPENXMLFORMATS_OFFICEDOCUMENT_DOT_SPREADSHEETML_DOT_TEMPLATE("application/vnd.openxmlformats-officedocument.spreadsheetml.template", "xltx"),

    /**
     * APPLICATION_VND_DOT_MS_EXCEL_DOT_TEMPLATE_DOT_MACROENABLED_DOT_12.
     */
    APPLICATION_VND_DOT_MS_EXCEL_DOT_TEMPLATE_DOT_MACROENABLED_DOT_12("application/vnd.ms-excel.template.macroenabled.12", "xltm"),

    /**
     * APPLICATION_VND_DOT_OPENXMLFORMATS_OFFICEDOCUMENT_DOT_WORDPROCESSINGML_DOT_DOCUMENT.
     */
    APPLICATION_VND_DOT_OPENXMLFORMATS_OFFICEDOCUMENT_DOT_WORDPROCESSINGML_DOT_DOCUMENT("application/vnd.openxmlformats-officedocument.wordprocessingml.document", "docx"),

    /**
     * APPLICATION_VND_DOT_OPENXMLFORMATS_OFFICEDOCUMENT_DOT_WORDPROCESSINGML_DOT_TEMPLATE.
     */
    APPLICATION_VND_DOT_OPENXMLFORMATS_OFFICEDOCUMENT_DOT_WORDPROCESSINGML_DOT_TEMPLATE("application/vnd.openxmlformats-officedocument.wordprocessingml.template", "dotx"),

    /**
     * APPLICATION_VND_DOT_OSA_DOT_NETDEPLOY.
     */
    APPLICATION_VND_DOT_OSA_DOT_NETDEPLOY("application/vnd.osa.netdeploy"),

    /**
     * APPLICATION_VND_DOT_OSGI_DOT_BUNDLE.
     */
    APPLICATION_VND_DOT_OSGI_DOT_BUNDLE("application/vnd.osgi.bundle"),

    /**
     * APPLICATION_VND_DOT_OSGI_DOT_DP.
     */
    APPLICATION_VND_DOT_OSGI_DOT_DP("application/vnd.osgi.dp", "dp"),

    /**
     * APPLICATION_VND_DOT_OTPS_DOT_CT_KIP_PLUS_XML.
     */
    APPLICATION_VND_DOT_OTPS_DOT_CT_KIP_PLUS_XML("application/vnd.otps.ct-kip+xml"),

    /**
     * APPLICATION_VND_DOT_PALM.
     */
    APPLICATION_VND_DOT_PALM("application/vnd.palm", "pqa", "oprc"),

    /**
     * APPLICATION_VND_DOT_PAOS_DOT_XML.
     */
    APPLICATION_VND_DOT_PAOS_DOT_XML("application/vnd.paos.xml"),

    /**
     * APPLICATION_VND_DOT_PG_DOT_FORMAT.
     */
    APPLICATION_VND_DOT_PG_DOT_FORMAT("application/vnd.pg.format", "str"),

    /**
     * APPLICATION_VND_DOT_PG_DOT_OSASLI.
     */
    APPLICATION_VND_DOT_PG_DOT_OSASLI("application/vnd.pg.osasli", "ei6"),

    /**
     * APPLICATION_VND_DOT_PIACCESS_DOT_APPLICATION_LICENCE.
     */
    APPLICATION_VND_DOT_PIACCESS_DOT_APPLICATION_LICENCE("application/vnd.piaccess.application-licence"),

    /**
     * APPLICATION_VND_DOT_PICSEL.
     */
    APPLICATION_VND_DOT_PICSEL("application/vnd.picsel", "efif"),

    /**
     * APPLICATION_VND_DOT_POC_DOT_GROUP_ADVERTISEMENT_PLUS_XML.
     */
    APPLICATION_VND_DOT_POC_DOT_GROUP_ADVERTISEMENT_PLUS_XML("application/vnd.poc.group-advertisement+xml"),

    /**
     * APPLICATION_VND_DOT_POCKETLEARN.
     */
    APPLICATION_VND_DOT_POCKETLEARN("application/vnd.pocketlearn", "plf"),

    /**
     * APPLICATION_VND_DOT_POWERBUILDER6.
     */
    APPLICATION_VND_DOT_POWERBUILDER6("application/vnd.powerbuilder6", "pbd"),

    /**
     * APPLICATION_VND_DOT_POWERBUILDER6_S.
     */
    APPLICATION_VND_DOT_POWERBUILDER6_S("application/vnd.powerbuilder6-s"),

    /**
     * APPLICATION_VND_DOT_POWERBUILDER7.
     */
    APPLICATION_VND_DOT_POWERBUILDER7("application/vnd.powerbuilder7"),

    /**
     * APPLICATION_VND_DOT_POWERBUILDER7_S.
     */
    APPLICATION_VND_DOT_POWERBUILDER7_S("application/vnd.powerbuilder7-s"),

    /**
     * APPLICATION_VND_DOT_POWERBUILDER75.
     */
    APPLICATION_VND_DOT_POWERBUILDER75("application/vnd.powerbuilder75"),

    /**
     * APPLICATION_VND_DOT_POWERBUILDER75_S.
     */
    APPLICATION_VND_DOT_POWERBUILDER75_S("application/vnd.powerbuilder75-s"),

    /**
     * APPLICATION_VND_DOT_PREMINET.
     */
    APPLICATION_VND_DOT_PREMINET("application/vnd.preminet"),

    /**
     * APPLICATION_VND_DOT_PREVIEWSYSTEMS_DOT_BOX.
     */
    APPLICATION_VND_DOT_PREVIEWSYSTEMS_DOT_BOX("application/vnd.previewsystems.box", "box"),

    /**
     * APPLICATION_VND_DOT_PROTEUS_DOT_MAGAZINE.
     */
    APPLICATION_VND_DOT_PROTEUS_DOT_MAGAZINE("application/vnd.proteus.magazine", "mgz"),

    /**
     * APPLICATION_VND_DOT_PUBLISHARE_DELTA_TREE.
     */
    APPLICATION_VND_DOT_PUBLISHARE_DELTA_TREE("application/vnd.publishare-delta-tree", "qps"),

    /**
     * APPLICATION_VND_DOT_PVI_DOT_PTID1.
     */
    APPLICATION_VND_DOT_PVI_DOT_PTID1("application/vnd.pvi.ptid1", "ptid"),

    /**
     * APPLICATION_VND_DOT_PWG_MULTIPLEXED.
     */
    APPLICATION_VND_DOT_PWG_MULTIPLEXED("application/vnd.pwg-multiplexed"),

    /**
     * APPLICATION_VND_DOT_PWG_XHTML_PRINT_PLUS_XML.
     */
    APPLICATION_VND_DOT_PWG_XHTML_PRINT_PLUS_XML("application/vnd.pwg-xhtml-print+xml"),

    /**
     * APPLICATION_VND_DOT_QUALCOMM_DOT_BREW_APP_RES.
     */
    APPLICATION_VND_DOT_QUALCOMM_DOT_BREW_APP_RES("application/vnd.qualcomm.brew-app-res"),

    /**
     * APPLICATION_VND_DOT_QUARK_DOT_QUARKXPRESS.
     */
    APPLICATION_VND_DOT_QUARK_DOT_QUARKXPRESS("application/vnd.quark.quarkxpress", "qxd", "qxt", "qwd", "qwt", "qxl", "qxb"),

    /**
     * APPLICATION_VND_DOT_RAPID.
     */
    APPLICATION_VND_DOT_RAPID("application/vnd.rapid"),

    /**
     * APPLICATION_VND_DOT_RECORDARE_DOT_MUSICXML.
     */
    APPLICATION_VND_DOT_RECORDARE_DOT_MUSICXML("application/vnd.recordare.musicxml", "mxl"),

    /**
     * APPLICATION_VND_DOT_RECORDARE_DOT_MUSICXML_PLUS_XML.
     */
    APPLICATION_VND_DOT_RECORDARE_DOT_MUSICXML_PLUS_XML("application/vnd.recordare.musicxml+xml", "musicxml"),

    /**
     * APPLICATION_VND_DOT_RENLEARN_DOT_RLPRINT.
     */
    APPLICATION_VND_DOT_RENLEARN_DOT_RLPRINT("application/vnd.renlearn.rlprint"),

    /**
     * APPLICATION_VND_DOT_RIM_DOT_COD.
     */
    APPLICATION_VND_DOT_RIM_DOT_COD("application/vnd.rim.cod", "cod"),

    /**
     * APPLICATION_VND_DOT_RN_REALMEDIA.
     */
    APPLICATION_VND_DOT_RN_REALMEDIA("application/vnd.rn-realmedia", "rm"),

    /**
     * APPLICATION_VND_DOT_ROUTE66_DOT_LINK66_PLUS_XML.
     */
    APPLICATION_VND_DOT_ROUTE66_DOT_LINK66_PLUS_XML("application/vnd.route66.link66+xml", "link66"),

    /**
     * APPLICATION_VND_DOT_RUCKUS_DOT_DOWNLOAD.
     */
    APPLICATION_VND_DOT_RUCKUS_DOT_DOWNLOAD("application/vnd.ruckus.download"),

    /**
     * APPLICATION_VND_DOT_S3SMS.
     */
    APPLICATION_VND_DOT_S3SMS("application/vnd.s3sms"),

    /**
     * APPLICATION_VND_DOT_SBM_DOT_CID.
     */
    APPLICATION_VND_DOT_SBM_DOT_CID("application/vnd.sbm.cid"),

    /**
     * APPLICATION_VND_DOT_SBM_DOT_MID2.
     */
    APPLICATION_VND_DOT_SBM_DOT_MID2("application/vnd.sbm.mid2"),

    /**
     * APPLICATION_VND_DOT_SCRIBUS.
     */
    APPLICATION_VND_DOT_SCRIBUS("application/vnd.scribus"),

    /**
     * APPLICATION_VND_DOT_SEALED_DOT_3DF.
     */
    APPLICATION_VND_DOT_SEALED_DOT_3DF("application/vnd.sealed.3df"),

    /**
     * APPLICATION_VND_DOT_SEALED_DOT_CSF.
     */
    APPLICATION_VND_DOT_SEALED_DOT_CSF("application/vnd.sealed.csf"),

    /**
     * APPLICATION_VND_DOT_SEALED_DOT_DOC.
     */
    APPLICATION_VND_DOT_SEALED_DOT_DOC("application/vnd.sealed.doc"),

    /**
     * APPLICATION_VND_DOT_SEALED_DOT_EML.
     */
    APPLICATION_VND_DOT_SEALED_DOT_EML("application/vnd.sealed.eml"),

    /**
     * APPLICATION_VND_DOT_SEALED_DOT_MHT.
     */
    APPLICATION_VND_DOT_SEALED_DOT_MHT("application/vnd.sealed.mht"),

    /**
     * APPLICATION_VND_DOT_SEALED_DOT_NET.
     */
    APPLICATION_VND_DOT_SEALED_DOT_NET("application/vnd.sealed.net"),

    /**
     * APPLICATION_VND_DOT_SEALED_DOT_PPT.
     */
    APPLICATION_VND_DOT_SEALED_DOT_PPT("application/vnd.sealed.ppt"),

    /**
     * APPLICATION_VND_DOT_SEALED_DOT_TIFF.
     */
    APPLICATION_VND_DOT_SEALED_DOT_TIFF("application/vnd.sealed.tiff"),

    /**
     * APPLICATION_VND_DOT_SEALED_DOT_XLS.
     */
    APPLICATION_VND_DOT_SEALED_DOT_XLS("application/vnd.sealed.xls"),

    /**
     * APPLICATION_VND_DOT_SEALEDMEDIA_DOT_SOFTSEAL_DOT_HTML.
     */
    APPLICATION_VND_DOT_SEALEDMEDIA_DOT_SOFTSEAL_DOT_HTML("application/vnd.sealedmedia.softseal.html"),

    /**
     * APPLICATION_VND_DOT_SEALEDMEDIA_DOT_SOFTSEAL_DOT_PDF.
     */
    APPLICATION_VND_DOT_SEALEDMEDIA_DOT_SOFTSEAL_DOT_PDF("application/vnd.sealedmedia.softseal.pdf"),

    /**
     * APPLICATION_VND_DOT_SEEMAIL.
     */
    APPLICATION_VND_DOT_SEEMAIL("application/vnd.seemail", "see"),

    /**
     * APPLICATION_VND_DOT_SEMA.
     */
    APPLICATION_VND_DOT_SEMA("application/vnd.sema", "sema"),

    /**
     * APPLICATION_VND_DOT_SEMD.
     */
    APPLICATION_VND_DOT_SEMD("application/vnd.semd", "semd"),

    /**
     * APPLICATION_VND_DOT_SEMF.
     */
    APPLICATION_VND_DOT_SEMF("application/vnd.semf", "semf"),

    /**
     * APPLICATION_VND_DOT_SHANA_DOT_INFORMED_DOT_FORMDATA.
     */
    APPLICATION_VND_DOT_SHANA_DOT_INFORMED_DOT_FORMDATA("application/vnd.shana.informed.formdata", "ifm"),

    /**
     * APPLICATION_VND_DOT_SHANA_DOT_INFORMED_DOT_FORMTEMPLATE.
     */
    APPLICATION_VND_DOT_SHANA_DOT_INFORMED_DOT_FORMTEMPLATE("application/vnd.shana.informed.formtemplate", "itp"),

    /**
     * APPLICATION_VND_DOT_SHANA_DOT_INFORMED_DOT_INTERCHANGE.
     */
    APPLICATION_VND_DOT_SHANA_DOT_INFORMED_DOT_INTERCHANGE("application/vnd.shana.informed.interchange", "iif"),

    /**
     * APPLICATION_VND_DOT_SHANA_DOT_INFORMED_DOT_PACKAGE.
     */
    APPLICATION_VND_DOT_SHANA_DOT_INFORMED_DOT_PACKAGE("application/vnd.shana.informed.package", "ipk"),

    /**
     * APPLICATION_VND_DOT_SIMTECH_MINDMAPPER.
     */
    APPLICATION_VND_DOT_SIMTECH_MINDMAPPER("application/vnd.simtech-mindmapper", "twd", "twds"),

    /**
     * APPLICATION_VND_DOT_SMAF.
     */
    APPLICATION_VND_DOT_SMAF("application/vnd.smaf", "mmf"),

    /**
     * APPLICATION_VND_DOT_SMART_DOT_TEACHER.
     */
    APPLICATION_VND_DOT_SMART_DOT_TEACHER("application/vnd.smart.teacher", "teacher"),

    /**
     * APPLICATION_VND_DOT_SOFTWARE602_DOT_FILLER_DOT_FORM_PLUS_XML.
     */
    APPLICATION_VND_DOT_SOFTWARE602_DOT_FILLER_DOT_FORM_PLUS_XML("application/vnd.software602.filler.form+xml"),

    /**
     * APPLICATION_VND_DOT_SOFTWARE602_DOT_FILLER_DOT_FORM_XML_ZIP.
     */
    APPLICATION_VND_DOT_SOFTWARE602_DOT_FILLER_DOT_FORM_XML_ZIP("application/vnd.software602.filler.form-xml-zip"),

    /**
     * APPLICATION_VND_DOT_SOLENT_DOT_SDKM_PLUS_XML.
     */
    APPLICATION_VND_DOT_SOLENT_DOT_SDKM_PLUS_XML("application/vnd.solent.sdkm+xml", "sdkm", "sdkd"),

    /**
     * APPLICATION_VND_DOT_SPOTFIRE_DOT_DXP.
     */
    APPLICATION_VND_DOT_SPOTFIRE_DOT_DXP("application/vnd.spotfire.dxp", "dxp"),

    /**
     * APPLICATION_VND_DOT_SPOTFIRE_DOT_SFS.
     */
    APPLICATION_VND_DOT_SPOTFIRE_DOT_SFS("application/vnd.spotfire.sfs", "sfs"),

    /**
     * APPLICATION_VND_DOT_SSS_COD.
     */
    APPLICATION_VND_DOT_SSS_COD("application/vnd.sss-cod"),

    /**
     * APPLICATION_VND_DOT_SSS_DTF.
     */
    APPLICATION_VND_DOT_SSS_DTF("application/vnd.sss-dtf"),

    /**
     * APPLICATION_VND_DOT_SSS_NTF.
     */
    APPLICATION_VND_DOT_SSS_NTF("application/vnd.sss-ntf"),

    /**
     * APPLICATION_VND_DOT_STARDIVISION_DOT_CALC.
     */
    APPLICATION_VND_DOT_STARDIVISION_DOT_CALC("application/vnd.stardivision.calc", "sdc"),

    /**
     * APPLICATION_VND_DOT_STARDIVISION_DOT_DRAW.
     */
    APPLICATION_VND_DOT_STARDIVISION_DOT_DRAW("application/vnd.stardivision.draw", "sda"),

    /**
     * APPLICATION_VND_DOT_STARDIVISION_DOT_IMPRESS.
     */
    APPLICATION_VND_DOT_STARDIVISION_DOT_IMPRESS("application/vnd.stardivision.impress", "sdd"),

    /**
     * APPLICATION_VND_DOT_STARDIVISION_DOT_MATH.
     */
    APPLICATION_VND_DOT_STARDIVISION_DOT_MATH("application/vnd.stardivision.math", "smf"),

    /**
     * APPLICATION_VND_DOT_STARDIVISION_DOT_WRITER.
     */
    APPLICATION_VND_DOT_STARDIVISION_DOT_WRITER("application/vnd.stardivision.writer", "sdw"),

    /**
     * APPLICATION_X_STAROFFICE_TEMPLATE.
     */
    APPLICATION_X_STAROFFICE_TEMPLATE("application/x-staroffice-template", "vor"),

    /**
     * APPLICATION_VND_DOT_STARDIVISION_DOT_WRITER_GLOBAL.
     */
    APPLICATION_VND_DOT_STARDIVISION_DOT_WRITER_GLOBAL("application/vnd.stardivision.writer-global", "sgl"),

    /**
     * APPLICATION_VND_DOT_STREET_STREAM.
     */
    APPLICATION_VND_DOT_STREET_STREAM("application/vnd.street-stream"),

    /**
     * APPLICATION_VND_DOT_SUN_DOT_XML_DOT_CALC.
     */
    APPLICATION_VND_DOT_SUN_DOT_XML_DOT_CALC("application/vnd.sun.xml.calc", "sxc"),

    /**
     * APPLICATION_VND_DOT_SUN_DOT_XML_DOT_CALC_DOT_TEMPLATE.
     */
    APPLICATION_VND_DOT_SUN_DOT_XML_DOT_CALC_DOT_TEMPLATE("application/vnd.sun.xml.calc.template", "stc"),

    /**
     * APPLICATION_VND_DOT_SUN_DOT_XML_DOT_DRAW.
     */
    APPLICATION_VND_DOT_SUN_DOT_XML_DOT_DRAW("application/vnd.sun.xml.draw", "sxd"),

    /**
     * APPLICATION_VND_DOT_SUN_DOT_XML_DOT_DRAW_DOT_TEMPLATE.
     */
    APPLICATION_VND_DOT_SUN_DOT_XML_DOT_DRAW_DOT_TEMPLATE("application/vnd.sun.xml.draw.template", "std"),

    /**
     * APPLICATION_VND_DOT_SUN_DOT_XML_DOT_IMPRESS.
     */
    APPLICATION_VND_DOT_SUN_DOT_XML_DOT_IMPRESS("application/vnd.sun.xml.impress", "sxi"),

    /**
     * APPLICATION_VND_DOT_SUN_DOT_XML_DOT_IMPRESS_DOT_TEMPLATE.
     */
    APPLICATION_VND_DOT_SUN_DOT_XML_DOT_IMPRESS_DOT_TEMPLATE("application/vnd.sun.xml.impress.template", "sti"),

    /**
     * APPLICATION_VND_DOT_SUN_DOT_XML_DOT_MATH.
     */
    APPLICATION_VND_DOT_SUN_DOT_XML_DOT_MATH("application/vnd.sun.xml.math", "sxm"),

    /**
     * APPLICATION_VND_DOT_SUN_DOT_XML_DOT_WRITER.
     */
    APPLICATION_VND_DOT_SUN_DOT_XML_DOT_WRITER("application/vnd.sun.xml.writer", "sxw"),

    /**
     * APPLICATION_VND_DOT_SUN_DOT_XML_DOT_WRITER_DOT_GLOBAL.
     */
    APPLICATION_VND_DOT_SUN_DOT_XML_DOT_WRITER_DOT_GLOBAL("application/vnd.sun.xml.writer.global", "sxg"),

    /**
     * APPLICATION_VND_DOT_SUN_DOT_XML_DOT_WRITER_DOT_TEMPLATE.
     */
    APPLICATION_VND_DOT_SUN_DOT_XML_DOT_WRITER_DOT_TEMPLATE("application/vnd.sun.xml.writer.template", "stw"),

    /**
     * APPLICATION_VND_DOT_SUN_DOT_WADL_PLUS_XML.
     */
    APPLICATION_VND_DOT_SUN_DOT_WADL_PLUS_XML("application/vnd.sun.wadl+xml"),

    /**
     * APPLICATION_VND_DOT_SUS_CALENDAR.
     */
    APPLICATION_VND_DOT_SUS_CALENDAR("application/vnd.sus-calendar", "sus", "susp"),

    /**
     * APPLICATION_VND_DOT_SVD.
     */
    APPLICATION_VND_DOT_SVD("application/vnd.svd", "svd"),

    /**
     * APPLICATION_VND_DOT_SWIFTVIEW_ICS.
     */
    APPLICATION_VND_DOT_SWIFTVIEW_ICS("application/vnd.swiftview-ics"),

    /**
     * APPLICATION_VND_DOT_SYMBIAN_DOT_INSTALL.
     */
    APPLICATION_VND_DOT_SYMBIAN_DOT_INSTALL("application/vnd.symbian.install", "sis", "sisx"),

    /**
     * APPLICATION_VND_DOT_SYNCML_PLUS_XML.
     */
    APPLICATION_VND_DOT_SYNCML_PLUS_XML("application/vnd.syncml+xml", "xsm"),

    /**
     * APPLICATION_VND_DOT_SYNCML_DOT_DM_PLUS_WBXML.
     */
    APPLICATION_VND_DOT_SYNCML_DOT_DM_PLUS_WBXML("application/vnd.syncml.dm+wbxml", "bdm"),

    /**
     * APPLICATION_VND_DOT_SYNCML_DOT_DM_PLUS_XML.
     */
    APPLICATION_VND_DOT_SYNCML_DOT_DM_PLUS_XML("application/vnd.syncml.dm+xml", "xdm"),

    /**
     * APPLICATION_VND_DOT_SYNCML_DOT_DM_DOT_NOTIFICATION.
     */
    APPLICATION_VND_DOT_SYNCML_DOT_DM_DOT_NOTIFICATION("application/vnd.syncml.dm.notification"),

    /**
     * APPLICATION_VND_DOT_SYNCML_DOT_DS_DOT_NOTIFICATION.
     */
    APPLICATION_VND_DOT_SYNCML_DOT_DS_DOT_NOTIFICATION("application/vnd.syncml.ds.notification"),

    /**
     * APPLICATION_VND_DOT_TAO_DOT_INTENT_MODULE_ARCHIVE.
     */
    APPLICATION_VND_DOT_TAO_DOT_INTENT_MODULE_ARCHIVE("application/vnd.tao.intent-module-archive", "tao"),

    /**
     * APPLICATION_VND_DOT_TCPDUMP_DOT_PCAP.
     */
    APPLICATION_VND_DOT_TCPDUMP_DOT_PCAP("application/vnd.tcpdump.pcap", "pcap", "cap", "dmp"),

    /**
     * APPLICATION_VND_DOT_TMOBILE_LIVETV.
     */
    APPLICATION_VND_DOT_TMOBILE_LIVETV("application/vnd.tmobile-livetv", "tmo"),

    /**
     * APPLICATION_VND_DOT_TRID_DOT_TPT.
     */
    APPLICATION_VND_DOT_TRID_DOT_TPT("application/vnd.trid.tpt", "tpt"),

    /**
     * APPLICATION_VND_DOT_TRISCAPE_DOT_MXS.
     */
    APPLICATION_VND_DOT_TRISCAPE_DOT_MXS("application/vnd.triscape.mxs", "mxs"),

    /**
     * APPLICATION_VND_DOT_TRUEAPP.
     */
    APPLICATION_VND_DOT_TRUEAPP("application/vnd.trueapp", "tra"),

    /**
     * APPLICATION_VND_DOT_TRUEDOC.
     */
    APPLICATION_VND_DOT_TRUEDOC("application/vnd.truedoc"),

    /**
     * APPLICATION_VND_DOT_UFDL.
     */
    APPLICATION_VND_DOT_UFDL("application/vnd.ufdl", "ufd", "ufdl"),

    /**
     * APPLICATION_VND_DOT_UIQ_DOT_THEME.
     */
    APPLICATION_VND_DOT_UIQ_DOT_THEME("application/vnd.uiq.theme", "utz"),

    /**
     * APPLICATION_VND_DOT_UMAJIN.
     */
    APPLICATION_VND_DOT_UMAJIN("application/vnd.umajin", "umj"),

    /**
     * APPLICATION_VND_DOT_UNITY.
     */
    APPLICATION_VND_DOT_UNITY("application/vnd.unity", "unityweb"),

    /**
     * APPLICATION_VND_DOT_UOML_PLUS_XML.
     */
    APPLICATION_VND_DOT_UOML_PLUS_XML("application/vnd.uoml+xml", "uoml"),

    /**
     * APPLICATION_VND_DOT_UPLANET_DOT_ALERT.
     */
    APPLICATION_VND_DOT_UPLANET_DOT_ALERT("application/vnd.uplanet.alert"),

    /**
     * APPLICATION_VND_DOT_UPLANET_DOT_ALERT_WBXML.
     */
    APPLICATION_VND_DOT_UPLANET_DOT_ALERT_WBXML("application/vnd.uplanet.alert-wbxml"),

    /**
     * APPLICATION_VND_DOT_UPLANET_DOT_BEARER_CHOICE.
     */
    APPLICATION_VND_DOT_UPLANET_DOT_BEARER_CHOICE("application/vnd.uplanet.bearer-choice"),

    /**
     * APPLICATION_VND_DOT_UPLANET_DOT_BEARER_CHOICE_WBXML.
     */
    APPLICATION_VND_DOT_UPLANET_DOT_BEARER_CHOICE_WBXML("application/vnd.uplanet.bearer-choice-wbxml"),

    /**
     * APPLICATION_VND_DOT_UPLANET_DOT_CACHEOP.
     */
    APPLICATION_VND_DOT_UPLANET_DOT_CACHEOP("application/vnd.uplanet.cacheop"),

    /**
     * APPLICATION_VND_DOT_UPLANET_DOT_CACHEOP_WBXML.
     */
    APPLICATION_VND_DOT_UPLANET_DOT_CACHEOP_WBXML("application/vnd.uplanet.cacheop-wbxml"),

    /**
     * APPLICATION_VND_DOT_UPLANET_DOT_CHANNEL.
     */
    APPLICATION_VND_DOT_UPLANET_DOT_CHANNEL("application/vnd.uplanet.channel"),

    /**
     * APPLICATION_VND_DOT_UPLANET_DOT_CHANNEL_WBXML.
     */
    APPLICATION_VND_DOT_UPLANET_DOT_CHANNEL_WBXML("application/vnd.uplanet.channel-wbxml"),

    /**
     * APPLICATION_VND_DOT_UPLANET_DOT_LIST.
     */
    APPLICATION_VND_DOT_UPLANET_DOT_LIST("application/vnd.uplanet.list"),

    /**
     * APPLICATION_VND_DOT_UPLANET_DOT_LIST_WBXML.
     */
    APPLICATION_VND_DOT_UPLANET_DOT_LIST_WBXML("application/vnd.uplanet.list-wbxml"),

    /**
     * APPLICATION_VND_DOT_UPLANET_DOT_LISTCMD.
     */
    APPLICATION_VND_DOT_UPLANET_DOT_LISTCMD("application/vnd.uplanet.listcmd"),

    /**
     * APPLICATION_VND_DOT_UPLANET_DOT_LISTCMD_WBXML.
     */
    APPLICATION_VND_DOT_UPLANET_DOT_LISTCMD_WBXML("application/vnd.uplanet.listcmd-wbxml"),

    /**
     * APPLICATION_VND_DOT_UPLANET_DOT_SIGNAL.
     */
    APPLICATION_VND_DOT_UPLANET_DOT_SIGNAL("application/vnd.uplanet.signal"),

    /**
     * APPLICATION_VND_DOT_VCX.
     */
    APPLICATION_VND_DOT_VCX("application/vnd.vcx", "vcx"),

    /**
     * APPLICATION_VND_DOT_VD_STUDY.
     */
    APPLICATION_VND_DOT_VD_STUDY("application/vnd.vd-study"),

    /**
     * APPLICATION_VND_DOT_VECTORWORKS.
     */
    APPLICATION_VND_DOT_VECTORWORKS("application/vnd.vectorworks"),

    /**
     * APPLICATION_VND_DOT_VIDSOFT_DOT_VIDCONFERENCE.
     */
    APPLICATION_VND_DOT_VIDSOFT_DOT_VIDCONFERENCE("application/vnd.vidsoft.vidconference"),

    /**
     * APPLICATION_VND_DOT_VISIO.
     */
    APPLICATION_VND_DOT_VISIO("application/vnd.visio", "vsd", "vst", "vss", "vsw"),

    /**
     * APPLICATION_VND_DOT_MS_VISIO_DOT_DRAWING.
     */
    APPLICATION_VND_DOT_MS_VISIO_DOT_DRAWING("application/vnd.ms-visio.drawing", "vsdx"),

    /**
     * APPLICATION_VND_DOT_MS_VISIO_DOT_TEMPLATE.
     */
    APPLICATION_VND_DOT_MS_VISIO_DOT_TEMPLATE("application/vnd.ms-visio.template", "vstx"),

    /**
     * APPLICATION_VND_DOT_MS_VISIO_DOT_STENCIL.
     */
    APPLICATION_VND_DOT_MS_VISIO_DOT_STENCIL("application/vnd.ms-visio.stencil", "vssx"),

    /**
     * APPLICATION_VND_DOT_MS_VISIO_DOT_DRAWING_DOT_MACROENABLED_DOT_12.
     */
    APPLICATION_VND_DOT_MS_VISIO_DOT_DRAWING_DOT_MACROENABLED_DOT_12("application/vnd.ms-visio.drawing.macroEnabled.12", "vsdm"),

    /**
     * APPLICATION_VND_DOT_MS_VISIO_DOT_TEMPLATE_DOT_MACROENABLED_DOT_12.
     */
    APPLICATION_VND_DOT_MS_VISIO_DOT_TEMPLATE_DOT_MACROENABLED_DOT_12("application/vnd.ms-visio.template.macroEnabled.12", "vstm"),

    /**
     * APPLICATION_VND_DOT_MS_VISIO_DOT_STENCIL_DOT_MACROENABLED_DOT_12.
     */
    APPLICATION_VND_DOT_MS_VISIO_DOT_STENCIL_DOT_MACROENABLED_DOT_12("application/vnd.ms-visio.stencil.macroEnabled.12", "vssm"),

    /**
     * APPLICATION_VND_DOT_VISIONARY.
     */
    APPLICATION_VND_DOT_VISIONARY("application/vnd.visionary", "vis"),

    /**
     * APPLICATION_VND_DOT_VIVIDENCE_DOT_SCRIPTFILE.
     */
    APPLICATION_VND_DOT_VIVIDENCE_DOT_SCRIPTFILE("application/vnd.vividence.scriptfile"),

    /**
     * APPLICATION_VND_DOT_VSF.
     */
    APPLICATION_VND_DOT_VSF("application/vnd.vsf", "vsf"),

    /**
     * APPLICATION_VND_DOT_WAP_DOT_SIC.
     */
    APPLICATION_VND_DOT_WAP_DOT_SIC("application/vnd.wap.sic"),

    /**
     * APPLICATION_VND_DOT_WAP_DOT_SLC.
     */
    APPLICATION_VND_DOT_WAP_DOT_SLC("application/vnd.wap.slc"),

    /**
     * APPLICATION_VND_DOT_WAP_DOT_WBXML.
     */
    APPLICATION_VND_DOT_WAP_DOT_WBXML("application/vnd.wap.wbxml", "wbxml"),

    /**
     * APPLICATION_VND_DOT_WAP_DOT_WMLC.
     */
    APPLICATION_VND_DOT_WAP_DOT_WMLC("application/vnd.wap.wmlc", "wmlc"),

    /**
     * APPLICATION_VND_DOT_WAP_DOT_WMLSCRIPTC.
     */
    APPLICATION_VND_DOT_WAP_DOT_WMLSCRIPTC("application/vnd.wap.wmlscriptc", "wmlsc"),

    /**
     * APPLICATION_VND_DOT_WEBTURBO.
     */
    APPLICATION_VND_DOT_WEBTURBO("application/vnd.webturbo", "wtb"),

    /**
     * APPLICATION_VND_DOT_WFA_DOT_WSC.
     */
    APPLICATION_VND_DOT_WFA_DOT_WSC("application/vnd.wfa.wsc"),

    /**
     * APPLICATION_VND_DOT_WMC.
     */
    APPLICATION_VND_DOT_WMC("application/vnd.wmc"),

    /**
     * APPLICATION_VND_DOT_WMF_DOT_BOOTSTRAP.
     */
    APPLICATION_VND_DOT_WMF_DOT_BOOTSTRAP("application/vnd.wmf.bootstrap"),

    /**
     * APPLICATION_VND_DOT_WORDPERFECT.
     */
    APPLICATION_VND_DOT_WORDPERFECT("application/vnd.wordperfect", "wpd"),

    /**
     * APPLICATION_VND_DOT_WQD.
     */
    APPLICATION_VND_DOT_WQD("application/vnd.wqd", "wqd"),

    /**
     * APPLICATION_VND_DOT_WRQ_HP3000_LABELLED.
     */
    APPLICATION_VND_DOT_WRQ_HP3000_LABELLED("application/vnd.wrq-hp3000-labelled"),

    /**
     * APPLICATION_VND_DOT_WT_DOT_STF.
     */
    APPLICATION_VND_DOT_WT_DOT_STF("application/vnd.wt.stf", "stf"),

    /**
     * APPLICATION_VND_DOT_WV_DOT_CSP_PLUS_WBXML.
     */
    APPLICATION_VND_DOT_WV_DOT_CSP_PLUS_WBXML("application/vnd.wv.csp+wbxml"),

    /**
     * APPLICATION_VND_DOT_WV_DOT_CSP_PLUS_XML.
     */
    APPLICATION_VND_DOT_WV_DOT_CSP_PLUS_XML("application/vnd.wv.csp+xml"),

    /**
     * APPLICATION_VND_DOT_WV_DOT_SSP_PLUS_XML.
     */
    APPLICATION_VND_DOT_WV_DOT_SSP_PLUS_XML("application/vnd.wv.ssp+xml"),

    /**
     * APPLICATION_VND_DOT_XARA.
     */
    APPLICATION_VND_DOT_XARA("application/vnd.xara", "xar"),

    /**
     * APPLICATION_VND_DOT_XFDL.
     */
    APPLICATION_VND_DOT_XFDL("application/vnd.xfdl", "xfdl"),

    /**
     * APPLICATION_VND_DOT_XFDL_DOT_WEBFORM.
     */
    APPLICATION_VND_DOT_XFDL_DOT_WEBFORM("application/vnd.xfdl.webform"),

    /**
     * APPLICATION_VND_DOT_XMI_PLUS_XML.
     */
    APPLICATION_VND_DOT_XMI_PLUS_XML("application/vnd.xmi+xml"),

    /**
     * APPLICATION_VND_DOT_XMPIE_DOT_CPKG.
     */
    APPLICATION_VND_DOT_XMPIE_DOT_CPKG("application/vnd.xmpie.cpkg"),

    /**
     * APPLICATION_VND_DOT_XMPIE_DOT_DPKG.
     */
    APPLICATION_VND_DOT_XMPIE_DOT_DPKG("application/vnd.xmpie.dpkg"),

    /**
     * APPLICATION_VND_DOT_XMPIE_DOT_PLAN.
     */
    APPLICATION_VND_DOT_XMPIE_DOT_PLAN("application/vnd.xmpie.plan"),

    /**
     * APPLICATION_VND_DOT_XMPIE_DOT_PPKG.
     */
    APPLICATION_VND_DOT_XMPIE_DOT_PPKG("application/vnd.xmpie.ppkg"),

    /**
     * APPLICATION_VND_DOT_XMPIE_DOT_XLIM.
     */
    APPLICATION_VND_DOT_XMPIE_DOT_XLIM("application/vnd.xmpie.xlim"),

    /**
     * APPLICATION_VND_DOT_YAMAHA_DOT_HV_DIC.
     */
    APPLICATION_VND_DOT_YAMAHA_DOT_HV_DIC("application/vnd.yamaha.hv-dic", "hvd"),

    /**
     * APPLICATION_VND_DOT_YAMAHA_DOT_HV_SCRIPT.
     */
    APPLICATION_VND_DOT_YAMAHA_DOT_HV_SCRIPT("application/vnd.yamaha.hv-script", "hvs"),

    /**
     * APPLICATION_VND_DOT_YAMAHA_DOT_HV_VOICE.
     */
    APPLICATION_VND_DOT_YAMAHA_DOT_HV_VOICE("application/vnd.yamaha.hv-voice", "hvp"),

    /**
     * APPLICATION_VND_DOT_YAMAHA_DOT_OPENSCOREFORMAT.
     */
    APPLICATION_VND_DOT_YAMAHA_DOT_OPENSCOREFORMAT("application/vnd.yamaha.openscoreformat", "osf"),

    /**
     * APPLICATION_VND_DOT_YAMAHA_DOT_OPENSCOREFORMAT_DOT_OSFPVG_PLUS_XML.
     */
    APPLICATION_VND_DOT_YAMAHA_DOT_OPENSCOREFORMAT_DOT_OSFPVG_PLUS_XML("application/vnd.yamaha.openscoreformat.osfpvg+xml", "osfpvg"),

    /**
     * APPLICATION_VND_DOT_YAMAHA_DOT_SMAF_AUDIO.
     */
    APPLICATION_VND_DOT_YAMAHA_DOT_SMAF_AUDIO("application/vnd.yamaha.smaf-audio", "saf"),

    /**
     * APPLICATION_VND_DOT_YAMAHA_DOT_SMAF_PHRASE.
     */
    APPLICATION_VND_DOT_YAMAHA_DOT_SMAF_PHRASE("application/vnd.yamaha.smaf-phrase", "spf"),

    /**
     * APPLICATION_VND_DOT_YELLOWRIVER_CUSTOM_MENU.
     */
    APPLICATION_VND_DOT_YELLOWRIVER_CUSTOM_MENU("application/vnd.yellowriver-custom-menu", "cmp"),

    /**
     * APPLICATION_VND_DOT_ZUL.
     */
    APPLICATION_VND_DOT_ZUL("application/vnd.zul", "zir", "zirz"),

    /**
     * APPLICATION_VND_DOT_ZZAZZ_DOT_DECK_PLUS_XML.
     */
    APPLICATION_VND_DOT_ZZAZZ_DOT_DECK_PLUS_XML("application/vnd.zzazz.deck+xml", "zaz"),

    /**
     * APPLICATION_VOICEXML_PLUS_XML.
     */
    APPLICATION_VOICEXML_PLUS_XML("application/voicexml+xml", "vxml"),

    /**
     * APPLICATION_WATCHERINFO_PLUS_XML.
     */
    APPLICATION_WATCHERINFO_PLUS_XML("application/watcherinfo+xml"),

    /**
     * APPLICATION_WHOISPP_QUERY.
     */
    APPLICATION_WHOISPP_QUERY("application/whoispp-query"),

    /**
     * APPLICATION_WHOISPP_RESPONSE.
     */
    APPLICATION_WHOISPP_RESPONSE("application/whoispp-response"),

    /**
     * APPLICATION_WINHLP.
     */
    APPLICATION_WINHLP("application/winhlp", "hlp"),

    /**
     * APPLICATION_WITA.
     */
    APPLICATION_WITA("application/wita"),

    /**
     * APPLICATION_WORDPERFECT5_DOT_1.
     */
    APPLICATION_WORDPERFECT5_DOT_1("application/wordperfect5.1"),

    /**
     * APPLICATION_WSDL_PLUS_XML.
     */
    APPLICATION_WSDL_PLUS_XML("application/wsdl+xml", "wsdl"),

    /**
     * APPLICATION_WSPOLICY_PLUS_XML.
     */
    APPLICATION_WSPOLICY_PLUS_XML("application/wspolicy+xml", "wspolicy"),

    /**
     * APPLICATION_X_123.
     */
    APPLICATION_X_123("application/x-123"),

    /**
     * APPLICATION_X_ABIWORD.
     */
    APPLICATION_X_ABIWORD("application/x-abiword", "abw"),

    /**
     * APPLICATION_X_ACE_COMPRESSED.
     */
    APPLICATION_X_ACE_COMPRESSED("application/x-ace-compressed", "ace"),

    /**
     * APPLICATION_X_AXCRYPT.
     */
    APPLICATION_X_AXCRYPT("application/x-axcrypt", "axx"),

    /**
     * APPLICATION_X_ADOBE_INDESIGN.
     */
    APPLICATION_X_ADOBE_INDESIGN("application/x-adobe-indesign", "indd"),

    /**
     * APPLICATION_X_ADOBE_INDESIGN_INTERCHANGE.
     */
    APPLICATION_X_ADOBE_INDESIGN_INTERCHANGE("application/x-adobe-indesign-interchange", "inx"),

    /**
     * APPLICATION_X_APPLE_DISKIMAGE.
     */
    APPLICATION_X_APPLE_DISKIMAGE("application/x-apple-diskimage", "dmg"),

    /**
     * APPLICATION_X_APPLEWORKS.
     */
    APPLICATION_X_APPLEWORKS("application/x-appleworks", "cwk"),

    /**
     * APPLICATION_X_ARCHIVE.
     */
    APPLICATION_X_ARCHIVE("application/x-archive", "ar", "a"),

    /**
     * APPLICATION_X_ARJ.
     */
    APPLICATION_X_ARJ("application/x-arj", "arj"),

    /**
     * APPLICATION_X_AUTHORWARE_BIN.
     */
    APPLICATION_X_AUTHORWARE_BIN("application/x-authorware-bin", "aab", "x32", "u32", "vox"),

    /**
     * APPLICATION_X_AUTHORWARE_MAP.
     */
    APPLICATION_X_AUTHORWARE_MAP("application/x-authorware-map", "aam"),

    /**
     * APPLICATION_X_AUTHORWARE_SEG.
     */
    APPLICATION_X_AUTHORWARE_SEG("application/x-authorware-seg", "aas"),

    /**
     * APPLICATION_X_BCPIO.
     */
    APPLICATION_X_BCPIO("application/x-bcpio", "bcpio"),

    /**
     * APPLICATION_X_BERKELEY_DB.
     */
    APPLICATION_X_BERKELEY_DB("application/x-berkeley-db"),

    /**
     * APPLICATION_X_BERKELEY_DBFORMATHASH.
     */
    APPLICATION_X_BERKELEY_DBFORMATHASH("application/x-berkeley-db;format=hash"),

    /**
     * APPLICATION_X_BERKELEY_DBFORMATBTREE.
     */
    APPLICATION_X_BERKELEY_DBFORMATBTREE("application/x-berkeley-db;format=btree"),

    /**
     * APPLICATION_X_BERKELEY_DBFORMATQUEUE.
     */
    APPLICATION_X_BERKELEY_DBFORMATQUEUE("application/x-berkeley-db;format=queue"),

    /**
     * APPLICATION_X_BERKELEY_DBFORMATLOG.
     */
    APPLICATION_X_BERKELEY_DBFORMATLOG("application/x-berkeley-db;format=log"),

    /**
     * APPLICATION_X_BERKELEY_DBFORMATHASHVERSION2.
     */
    APPLICATION_X_BERKELEY_DBFORMATHASHVERSION2("application/x-berkeley-db;format=hash;version=2"),

    /**
     * APPLICATION_X_BERKELEY_DBFORMATHASHVERSION3.
     */
    APPLICATION_X_BERKELEY_DBFORMATHASHVERSION3("application/x-berkeley-db;format=hash;version=3"),

    /**
     * APPLICATION_X_BERKELEY_DBFORMATHASHVERSION4.
     */
    APPLICATION_X_BERKELEY_DBFORMATHASHVERSION4("application/x-berkeley-db;format=hash;version=4"),

    /**
     * APPLICATION_X_BERKELEY_DBFORMATHASHVERSION5.
     */
    APPLICATION_X_BERKELEY_DBFORMATHASHVERSION5("application/x-berkeley-db;format=hash;version=5"),

    /**
     * APPLICATION_X_BERKELEY_DBFORMATBTREEVERSION2.
     */
    APPLICATION_X_BERKELEY_DBFORMATBTREEVERSION2("application/x-berkeley-db;format=btree;version=2"),

    /**
     * APPLICATION_X_BERKELEY_DBFORMATBTREEVERSION3.
     */
    APPLICATION_X_BERKELEY_DBFORMATBTREEVERSION3("application/x-berkeley-db;format=btree;version=3"),

    /**
     * APPLICATION_X_BERKELEY_DBFORMATBTREEVERSION4.
     */
    APPLICATION_X_BERKELEY_DBFORMATBTREEVERSION4("application/x-berkeley-db;format=btree;version=4"),

    /**
     * APPLICATION_X_BIBTEX_TEXT_FILE.
     */
    APPLICATION_X_BIBTEX_TEXT_FILE("application/x-bibtex-text-file", "bib", "bibtex"),

    /**
     * APPLICATION_X_BITTORRENT.
     */
    APPLICATION_X_BITTORRENT("application/x-bittorrent", "torrent"),

    /**
     * APPLICATION_X_BPLIST.
     */
    APPLICATION_X_BPLIST("application/x-bplist"),

    /**
     * APPLICATION_X_BZIP.
     */
    APPLICATION_X_BZIP("application/x-bzip", "bz", "tbz"),

    /**
     * APPLICATION_X_BZIP2.
     */
    APPLICATION_X_BZIP2("application/x-bzip2", "bz2", "tbz2", "boz"),

    /**
     * APPLICATION_X_CDLINK.
     */
    APPLICATION_X_CDLINK("application/x-cdlink", "vcd"),

    /**
     * APPLICATION_X_CHAT.
     */
    APPLICATION_X_CHAT("application/x-chat", "chat"),

    /**
     * APPLICATION_X_CHESS_PGN.
     */
    APPLICATION_X_CHESS_PGN("application/x-chess-pgn", "pgn"),

    /**
     * APPLICATION_X_CHROME_PACKAGE.
     */
    APPLICATION_X_CHROME_PACKAGE("application/x-chrome-package", "crx"),

    /**
     * APPLICATION_X_COMPRESS.
     */
    APPLICATION_X_COMPRESS("application/x-compress", "z"),

    /**
     * APPLICATION_X_CORELPRESENTATIONS.
     */
    APPLICATION_X_CORELPRESENTATIONS("application/x-corelpresentations", "shw"),

    /**
     * APPLICATION_X_CPIO.
     */
    APPLICATION_X_CPIO("application/x-cpio", "cpio"),

    /**
     * APPLICATION_X_CSH.
     */
    APPLICATION_X_CSH("application/x-csh", "csh", "tcsh"),

    /**
     * APPLICATION_X_DEBIAN_PACKAGE.
     */
    APPLICATION_X_DEBIAN_PACKAGE("application/x-debian-package", "deb", "udeb"),

    /**
     * APPLICATION_X_DEX.
     */
    APPLICATION_X_DEX("application/x-dex", "dex"),

    /**
     * APPLICATION_X_DIRECTOR.
     */
    APPLICATION_X_DIRECTOR("application/x-director", "dir", "dcr", "dxr", "cst", "cct", "cxt", "w3d", "fgd", "swa"),

    /**
     * APPLICATION_X_DOOM.
     */
    APPLICATION_X_DOOM("application/x-doom", "wad"),

    /**
     * APPLICATION_X_DTBNCX_PLUS_XML.
     */
    APPLICATION_X_DTBNCX_PLUS_XML("application/x-dtbncx+xml", "ncx"),

    /**
     * APPLICATION_X_DTBOOK_PLUS_XML.
     */
    APPLICATION_X_DTBOOK_PLUS_XML("application/x-dtbook+xml", "dtb"),

    /**
     * APPLICATION_X_DTBRESOURCE_PLUS_XML.
     */
    APPLICATION_X_DTBRESOURCE_PLUS_XML("application/x-dtbresource+xml", "res"),

    /**
     * APPLICATION_X_DVI.
     */
    APPLICATION_X_DVI("application/x-dvi", "dvi"),

    /**
     * APPLICATION_X_ELC.
     */
    APPLICATION_X_ELC("application/x-elc", "elc"),

    /**
     * APPLICATION_X_ELF.
     */
    APPLICATION_X_ELF("application/x-elf"),

    /**
     * MESSAGE_X_EMLX.
     */
    MESSAGE_X_EMLX("message/x-emlx", "emlx"),

    /**
     * APPLICATION_X_KILLUSTRATOR.
     */
    APPLICATION_X_KILLUSTRATOR("application/x-killustrator", "kil"),

    /**
     * APPLICATION_X_OBJECT.
     */
    APPLICATION_X_OBJECT("application/x-object"),

    /**
     * APPLICATION_X_EXECUTABLE.
     */
    APPLICATION_X_EXECUTABLE("application/x-executable"),

    /**
     * APPLICATION_X_SHAREDLIB.
     */
    APPLICATION_X_SHAREDLIB("application/x-sharedlib"),

    /**
     * APPLICATION_X_COREDUMP.
     */
    APPLICATION_X_COREDUMP("application/x-coredump"),

    /**
     * APPLICATION_X_DOSEXEC.
     */
    APPLICATION_X_DOSEXEC("application/x-dosexec", "exe"),

    /**
     * APPLICATION_X_EMF.
     */
    APPLICATION_X_EMF("application/x-emf", "emf"),

    /**
     * APPLICATION_X_ERDAS_HFA.
     */
    APPLICATION_X_ERDAS_HFA("application/x-erdas-hfa", "hfa"),

    /**
     * APPLICATION_X_FILEMAKER.
     */
    APPLICATION_X_FILEMAKER("application/x-filemaker", "fp7"),

    /**
     * APPLICATION_X_FONT_BDF.
     */
    APPLICATION_X_FONT_BDF("application/x-font-bdf", "bdf"),

    /**
     * APPLICATION_X_FONT_DOS.
     */
    APPLICATION_X_FONT_DOS("application/x-font-dos"),

    /**
     * APPLICATION_X_FONT_FRAMEMAKER.
     */
    APPLICATION_X_FONT_FRAMEMAKER("application/x-font-framemaker"),

    /**
     * APPLICATION_X_FONT_GHOSTSCRIPT.
     */
    APPLICATION_X_FONT_GHOSTSCRIPT("application/x-font-ghostscript", "gsf"),

    /**
     * APPLICATION_X_FONT_LIBGRX.
     */
    APPLICATION_X_FONT_LIBGRX("application/x-font-libgrx"),

    /**
     * APPLICATION_X_FONT_LINUX_PSF.
     */
    APPLICATION_X_FONT_LINUX_PSF("application/x-font-linux-psf", "psf"),

    /**
     * APPLICATION_X_FONT_OTF.
     */
    APPLICATION_X_FONT_OTF("application/x-font-otf", "otf"),

    /**
     * APPLICATION_X_FONT_PCF.
     */
    APPLICATION_X_FONT_PCF("application/x-font-pcf", "pcf"),

    /**
     * APPLICATION_X_FONT_SNF.
     */
    APPLICATION_X_FONT_SNF("application/x-font-snf", "snf"),

    /**
     * APPLICATION_X_FONT_SPEEDO.
     */
    APPLICATION_X_FONT_SPEEDO("application/x-font-speedo"),

    /**
     * APPLICATION_X_FONT_SUNOS_NEWS.
     */
    APPLICATION_X_FONT_SUNOS_NEWS("application/x-font-sunos-news"),

    /**
     * APPLICATION_X_FONT_TTF.
     */
    APPLICATION_X_FONT_TTF("application/x-font-ttf", "ttf", "ttc"),

    /**
     * APPLICATION_X_FONT_TYPE1.
     */
    APPLICATION_X_FONT_TYPE1("application/x-font-type1", "pfa", "pfb"),

    /**
     * APPLICATION_X_FONT_ADOBE_METRIC.
     */
    APPLICATION_X_FONT_ADOBE_METRIC("application/x-font-adobe-metric", "afm", "acfm", "amfm"),

    /**
     * APPLICATION_X_FONT_PRINTER_METRIC.
     */
    APPLICATION_X_FONT_PRINTER_METRIC("application/x-font-printer-metric", "pfm"),

    /**
     * APPLICATION_X_FONT_VFONT.
     */
    APPLICATION_X_FONT_VFONT("application/x-font-vfont"),

    /**
     * APPLICATION_X_FOXMAIL.
     */
    APPLICATION_X_FOXMAIL("application/x-foxmail"),

    /**
     * APPLICATION_X_FUTURESPLASH.
     */
    APPLICATION_X_FUTURESPLASH("application/x-futuresplash", "spl"),

    /**
     * APPLICATION_X_GNUCASH.
     */
    APPLICATION_X_GNUCASH("application/x-gnucash", "gnucash"),

    /**
     * APPLICATION_X_GNUMERIC.
     */
    APPLICATION_X_GNUMERIC("application/x-gnumeric", "gnumeric"),

    /**
     * APPLICATION_X_GRIB.
     */
    APPLICATION_X_GRIB("application/x-grib", "grb", "grb1", "grb2"),

    /**
     * APPLICATION_X_GTAR.
     */
    APPLICATION_X_GTAR("application/x-gtar", "gtar"),

    /**
     * APPLICATION_GZIP.
     */
    APPLICATION_GZIP("application/gzip", "gz", "tgz", "emz"),

    /**
     * APPLICATION_X_HDF.
     */
    APPLICATION_X_HDF("application/x-hdf", "hdf", "he5", "h5"),

    /**
     * APPLICATION_X_HWP.
     */
    APPLICATION_X_HWP("application/x-hwp"),

    /**
     * APPLICATION_X_HWP_V5.
     */
    APPLICATION_X_HWP_V5("application/x-hwp-v5"),

    /**
     * APPLICATION_X_IBOOKS_PLUS_ZIP.
     */
    APPLICATION_X_IBOOKS_PLUS_ZIP("application/x-ibooks+zip", "ibooks"),

    /**
     * APPLICATION_X_ISATAB_INVESTIGATION.
     */
    APPLICATION_X_ISATAB_INVESTIGATION("application/x-isatab-investigation"),

    /**
     * APPLICATION_X_ISATAB.
     */
    APPLICATION_X_ISATAB("application/x-isatab"),

    /**
     * APPLICATION_X_ISATAB_ASSAY.
     */
    APPLICATION_X_ISATAB_ASSAY("application/x-isatab-assay"),

    /**
     * APPLICATION_X_ISO9660_IMAGE.
     */
    APPLICATION_X_ISO9660_IMAGE("application/x-iso9660-image", "iso"),

    /**
     * APPLICATION_X_ITUNES_IPA.
     */
    APPLICATION_X_ITUNES_IPA("application/x-itunes-ipa", "ipa"),

    /**
     * APPLICATION_X_JAVA_JNLP_FILE.
     */
    APPLICATION_X_JAVA_JNLP_FILE("application/x-java-jnlp-file", "jnlp"),

    /**
     * APPLICATION_X_JAVA_PACK200.
     */
    APPLICATION_X_JAVA_PACK200("application/x-java-pack200", "pack"),

    /**
     * APPLICATION_X_KDELNK.
     */
    APPLICATION_X_KDELNK("application/x-kdelnk"),

    /**
     * APPLICATION_X_LATEX.
     */
    APPLICATION_X_LATEX("application/x-latex", "latex"),

    /**
     * APPLICATION_X_LHA.
     */
    APPLICATION_X_LHA("application/x-lha"),

    /**
     * APPLICATION_X_LHARC.
     */
    APPLICATION_X_LHARC("application/x-lharc"),

    /**
     * APPLICATION_X_MOBIPOCKET_EBOOK.
     */
    APPLICATION_X_MOBIPOCKET_EBOOK("application/x-mobipocket-ebook", "prc", "mobi"),

    /**
     * APPLICATION_X_MS_APPLICATION.
     */
    APPLICATION_X_MS_APPLICATION("application/x-ms-application", "application"),

    /**
     * APPLICATION_X_MS_WMD.
     */
    APPLICATION_X_MS_WMD("application/x-ms-wmd", "wmd"),

    /**
     * APPLICATION_X_MS_WMZ.
     */
    APPLICATION_X_MS_WMZ("application/x-ms-wmz", "wmz"),

    /**
     * APPLICATION_X_MS_XBAP.
     */
    APPLICATION_X_MS_XBAP("application/x-ms-xbap", "xbap"),

    /**
     * APPLICATION_X_MSACCESS.
     */
    APPLICATION_X_MSACCESS("application/x-msaccess", "mdb"),

    /**
     * APPLICATION_X_MSBINDER.
     */
    APPLICATION_X_MSBINDER("application/x-msbinder", "obd"),

    /**
     * APPLICATION_X_MSCARDFILE.
     */
    APPLICATION_X_MSCARDFILE("application/x-mscardfile", "crd"),

    /**
     * APPLICATION_X_MSCLIP.
     */
    APPLICATION_X_MSCLIP("application/x-msclip", "clp"),

    /**
     * APPLICATION_X_MSDOWNLOAD.
     */
    APPLICATION_X_MSDOWNLOAD("application/x-msdownload", "dll", "com", "bat"),

    /**
     * APPLICATION_X_MS_INSTALLER.
     */
    APPLICATION_X_MS_INSTALLER("application/x-ms-installer", "msi", "msp", "mst"),

    /**
     * APPLICATION_X_MSDOWNLOADFORMATPE.
     */
    APPLICATION_X_MSDOWNLOADFORMATPE("application/x-msdownload;format=pe"),

    /**
     * APPLICATION_X_MSDOWNLOADFORMATPE32.
     */
    APPLICATION_X_MSDOWNLOADFORMATPE32("application/x-msdownload;format=pe32"),

    /**
     * APPLICATION_X_MSDOWNLOADFORMATPE64.
     */
    APPLICATION_X_MSDOWNLOADFORMATPE64("application/x-msdownload;format=pe64"),

    /**
     * APPLICATION_X_MSDOWNLOADFORMATPE_ITANIUM.
     */
    APPLICATION_X_MSDOWNLOADFORMATPE_ITANIUM("application/x-msdownload;format=pe-itanium"),

    /**
     * APPLICATION_X_MSDOWNLOADFORMATPE_ARMLE.
     */
    APPLICATION_X_MSDOWNLOADFORMATPE_ARMLE("application/x-msdownload;format=pe-armLE"),

    /**
     * APPLICATION_X_MSDOWNLOADFORMATPE_ARM7.
     */
    APPLICATION_X_MSDOWNLOADFORMATPE_ARM7("application/x-msdownload;format=pe-arm7"),

    /**
     * APPLICATION_X_MSMEDIAVIEW.
     */
    APPLICATION_X_MSMEDIAVIEW("application/x-msmediaview", "mvb", "m13", "m14"),

    /**
     * APPLICATION_X_MSMETAFILE.
     */
    APPLICATION_X_MSMETAFILE("application/x-msmetafile", "wmf"),

    /**
     * APPLICATION_X_MSMONEY.
     */
    APPLICATION_X_MSMONEY("application/x-msmoney", "mny"),

    /**
     * APPLICATION_X_MSPUBLISHER.
     */
    APPLICATION_X_MSPUBLISHER("application/x-mspublisher", "pub"),

    /**
     * APPLICATION_X_MSSCHEDULE.
     */
    APPLICATION_X_MSSCHEDULE("application/x-msschedule", "scd"),

    /**
     * APPLICATION_X_MSTERMINAL.
     */
    APPLICATION_X_MSTERMINAL("application/x-msterminal", "trm"),

    /**
     * APPLICATION_X_MSWRITE.
     */
    APPLICATION_X_MSWRITE("application/x-mswrite", "wri"),

    /**
     * APPLICATION_X_MYSQL_DB.
     */
    APPLICATION_X_MYSQL_DB("application/x-mysql-db"),

    /**
     * APPLICATION_X_MYSQL_TABLE_DEFINITION.
     */
    APPLICATION_X_MYSQL_TABLE_DEFINITION("application/x-mysql-table-definition"),

    /**
     * APPLICATION_X_MYSQL_MISAM_INDEX.
     */
    APPLICATION_X_MYSQL_MISAM_INDEX("application/x-mysql-misam-index"),

    /**
     * APPLICATION_X_MYSQL_MISAM_COMPRESSED_INDEX.
     */
    APPLICATION_X_MYSQL_MISAM_COMPRESSED_INDEX("application/x-mysql-misam-compressed-index", "MYI"),

    /**
     * APPLICATION_X_MYSQL_MISAM_DATA.
     */
    APPLICATION_X_MYSQL_MISAM_DATA("application/x-mysql-misam-data", "MYD"),

    /**
     * APPLICATION_X_NETCDF.
     */
    APPLICATION_X_NETCDF("application/x-netcdf", "nc", "cdf"),

    /**
     * APPLICATION_X_PKCS12.
     */
    APPLICATION_X_PKCS12("application/x-pkcs12", "p12", "pfx"),

    /**
     * APPLICATION_X_PKCS7_CERTIFICATES.
     */
    APPLICATION_X_PKCS7_CERTIFICATES("application/x-pkcs7-certificates", "p7b", "spc"),

    /**
     * APPLICATION_X_PKCS7_CERTREQRESP.
     */
    APPLICATION_X_PKCS7_CERTREQRESP("application/x-pkcs7-certreqresp", "p7r"),

    /**
     * APPLICATION_X_PRT.
     */
    APPLICATION_X_PRT("application/x-prt", "prt"),

    /**
     * APPLICATION_X_QUATTRO_PRO.
     */
    APPLICATION_X_QUATTRO_PRO("application/x-quattro-pro", "qpw", "wb1", "wb2", "wb3"),

    /**
     * APPLICATION_XQUERY.
     */
    APPLICATION_XQUERY("application/xquery", "xq", "xquery"),

    /**
     * APPLICATION_X_RAR_COMPRESSED.
     */
    APPLICATION_X_RAR_COMPRESSED("application/x-rar-compressed", "rar"),

    /**
     * APPLICATION_X_ROXIO_TOAST.
     */
    APPLICATION_X_ROXIO_TOAST("application/x-roxio-toast", "toast"),

    /**
     * APPLICATION_X_RPM.
     */
    APPLICATION_X_RPM("application/x-rpm", "rpm"),

    /**
     * APPLICATION_X_SAS.
     */
    APPLICATION_X_SAS("application/x-sas", "sas"),

    /**
     * APPLICATION_X_SAS_PROGRAM_DATA.
     */
    APPLICATION_X_SAS_PROGRAM_DATA("application/x-sas-program-data", "ss7", "sas7bpgm"),

    /**
     * APPLICATION_X_SAS_AUDIT.
     */
    APPLICATION_X_SAS_AUDIT("application/x-sas-audit", "st7", "sas7baud"),

    /**
     * APPLICATION_X_SAS_DATA.
     */
    APPLICATION_X_SAS_DATA("application/x-sas-data", "sd7", "sas7bdat"),

    /**
     * APPLICATION_X_SAS_VIEW.
     */
    APPLICATION_X_SAS_VIEW("application/x-sas-view", "sv7", "sas7bvew"),

    /**
     * APPLICATION_X_SAS_DATA_INDEX.
     */
    APPLICATION_X_SAS_DATA_INDEX("application/x-sas-data-index", "si7", "sas7bndx"),

    /**
     * APPLICATION_X_SAS_CATALOG.
     */
    APPLICATION_X_SAS_CATALOG("application/x-sas-catalog", "sc7", "sas7bcat"),

    /**
     * APPLICATION_X_SAS_ACCESS.
     */
    APPLICATION_X_SAS_ACCESS("application/x-sas-access", "sa7", "sas7bacs"),

    /**
     * APPLICATION_X_SAS_FDB.
     */
    APPLICATION_X_SAS_FDB("application/x-sas-fdb", "sf7", "sas7bfdb"),

    /**
     * APPLICATION_X_SAS_MDDB.
     */
    APPLICATION_X_SAS_MDDB("application/x-sas-mddb", "sm7", "sas7bmdb"),

    /**
     * APPLICATION_X_SAS_DMDB.
     */
    APPLICATION_X_SAS_DMDB("application/x-sas-dmdb", "s7m", "sas7bdmd"),

    /**
     * APPLICATION_X_SAS_ITEMSTOR.
     */
    APPLICATION_X_SAS_ITEMSTOR("application/x-sas-itemstor", "sr7", "sas7bitm"),

    /**
     * APPLICATION_X_SAS_UTILITY.
     */
    APPLICATION_X_SAS_UTILITY("application/x-sas-utility", "su7", "sas7butl"),

    /**
     * APPLICATION_X_SAS_PUTILITY.
     */
    APPLICATION_X_SAS_PUTILITY("application/x-sas-putility", "sp7", "sas7bput"),

    /**
     * APPLICATION_X_SAS_TRANSPORT.
     */
    APPLICATION_X_SAS_TRANSPORT("application/x-sas-transport", "stx"),

    /**
     * APPLICATION_X_SAS_BACKUP.
     */
    APPLICATION_X_SAS_BACKUP("application/x-sas-backup", "sas7bbak"),

    /**
     * APPLICATION_X_SC.
     */
    APPLICATION_X_SC("application/x-sc"),

    /**
     * APPLICATION_X_SH.
     */
    APPLICATION_X_SH("application/x-sh", "sh", "bash"),

    /**
     * APPLICATION_X_SHAR.
     */
    APPLICATION_X_SHAR("application/x-shar", "shar"),

    /**
     * APPLICATION_X_SHAPEFILE.
     */
    APPLICATION_X_SHAPEFILE("application/x-shapefile", "shp"),

    /**
     * APPLICATION_X_SHOCKWAVE_FLASH.
     */
    APPLICATION_X_SHOCKWAVE_FLASH("application/x-shockwave-flash", "swf"),

    /**
     * APPLICATION_X_SILVERLIGHT_APP.
     */
    APPLICATION_X_SILVERLIGHT_APP("application/x-silverlight-app", "xap"),

    /**
     * APPLICATION_X_SNAPPY_FRAMED.
     */
    APPLICATION_X_SNAPPY_FRAMED("application/x-snappy-framed", "sz"),

    /**
     * APPLICATION_X_SFDU.
     */
    APPLICATION_X_SFDU("application/x-sfdu", "sfdu"),

    /**
     * APPLICATION_X_SQLITE3.
     */
    APPLICATION_X_SQLITE3("application/x-sqlite3"),

    /**
     * APPLICATION_X_STUFFIT.
     */
    APPLICATION_X_STUFFIT("application/x-stuffit", "sit"),

    /**
     * APPLICATION_X_STUFFITX.
     */
    APPLICATION_X_STUFFITX("application/x-stuffitx", "sitx"),

    /**
     * APPLICATION_X_SV4CPIO.
     */
    APPLICATION_X_SV4CPIO("application/x-sv4cpio", "sv4cpio"),

    /**
     * APPLICATION_X_SV4CRC.
     */
    APPLICATION_X_SV4CRC("application/x-sv4crc", "sv4crc"),

    /**
     * APPLICATION_X_TAR.
     */
    APPLICATION_X_TAR("application/x-tar", "tar"),

    /**
     * APPLICATION_X_TEX.
     */
    APPLICATION_X_TEX("application/x-tex", "tex"),

    /**
     * APPLICATION_X_TEX_TFM.
     */
    APPLICATION_X_TEX_TFM("application/x-tex-tfm", "tfm"),

    /**
     * APPLICATION_X_TEXINFO.
     */
    APPLICATION_X_TEXINFO("application/x-texinfo", "texinfo", "texi"),

    /**
     * APPLICATION_X_TIKA_MSOFFICE.
     */
    APPLICATION_X_TIKA_MSOFFICE("application/x-tika-msoffice"),

    /**
     * APPLICATION_X_TIKA_MSOFFICE_EMBEDDED.
     */
    APPLICATION_X_TIKA_MSOFFICE_EMBEDDED("application/x-tika-msoffice-embedded"),

    /**
     * APPLICATION_X_TIKA_MSOFFICE_EMBEDDEDFORMATOLE10_NATIVE.
     */
    APPLICATION_X_TIKA_MSOFFICE_EMBEDDEDFORMATOLE10_NATIVE("application/x-tika-msoffice-embedded;format=ole10_native"),

    /**
     * APPLICATION_X_TIKA_MSOFFICE_EMBEDDEDFORMATCOMP_OBJ.
     */
    APPLICATION_X_TIKA_MSOFFICE_EMBEDDEDFORMATCOMP_OBJ("application/x-tika-msoffice-embedded;format=comp_obj"),

    /**
     * APPLICATION_X_TIKA_MSWORKS_SPREADSHEET.
     */
    APPLICATION_X_TIKA_MSWORKS_SPREADSHEET("application/x-tika-msworks-spreadsheet", "xlr"),

    /**
     * APPLICATION_X_TIKA_OLD_EXCEL.
     */
    APPLICATION_X_TIKA_OLD_EXCEL("application/x-tika-old-excel"),

    /**
     * APPLICATION_X_TIKA_OOXML.
     */
    APPLICATION_X_TIKA_OOXML("application/x-tika-ooxml"),

    /**
     * APPLICATION_X_TIKA_OOXML_PROTECTED.
     */
    APPLICATION_X_TIKA_OOXML_PROTECTED("application/x-tika-ooxml-protected"),

    /**
     * APPLICATION_X_TIKA_VISIO_OOXML.
     */
    APPLICATION_X_TIKA_VISIO_OOXML("application/x-tika-visio-ooxml"),

    /**
     * APPLICATION_X_TIKA_STAROFFICE.
     */
    APPLICATION_X_TIKA_STAROFFICE("application/x-tika-staroffice"),

    /**
     * APPLICATION_X_UC2_COMPRESSED.
     */
    APPLICATION_X_UC2_COMPRESSED("application/x-uc2-compressed", "uc2"),

    /**
     * APPLICATION_X_USTAR.
     */
    APPLICATION_X_USTAR("application/x-ustar", "ustar"),

    /**
     * APPLICATION_X_VHD.
     */
    APPLICATION_X_VHD("application/x-vhd"),

    /**
     * APPLICATION_X_VMDK.
     */
    APPLICATION_X_VMDK("application/x-vmdk", "vmdk"),

    /**
     * APPLICATION_X_WAIS_SOURCE.
     */
    APPLICATION_X_WAIS_SOURCE("application/x-wais-source", "src"),

    /**
     * APPLICATION_X_WEBARCHIVE.
     */
    APPLICATION_X_WEBARCHIVE("application/x-webarchive", "webarchive"),

    /**
     * APPLICATION_X_X509_CA_CERT.
     */
    APPLICATION_X_X509_CA_CERT("application/x-x509-ca-cert", "der", "crt"),

    /**
     * APPLICATION_X_XFIG.
     */
    APPLICATION_X_XFIG("application/x-xfig", "fig"),

    /**
     * APPLICATION_X_XPINSTALL.
     */
    APPLICATION_X_XPINSTALL("application/x-xpinstall", "xpi"),

    /**
     * APPLICATION_X_XMIND.
     */
    APPLICATION_X_XMIND("application/x-xmind", "xmind"),

    /**
     * APPLICATION_X_XZ.
     */
    APPLICATION_X_XZ("application/x-xz", "xz"),

    /**
     * APPLICATION_X_ZOO.
     */
    APPLICATION_X_ZOO("application/x-zoo", "zoo"),

    /**
     * APPLICATION_X400_BP.
     */
    APPLICATION_X400_BP("application/x400-bp"),

    /**
     * APPLICATION_XCAP_ATT_PLUS_XML.
     */
    APPLICATION_XCAP_ATT_PLUS_XML("application/xcap-att+xml"),

    /**
     * APPLICATION_XCAP_CAPS_PLUS_XML.
     */
    APPLICATION_XCAP_CAPS_PLUS_XML("application/xcap-caps+xml"),

    /**
     * APPLICATION_XCAP_EL_PLUS_XML.
     */
    APPLICATION_XCAP_EL_PLUS_XML("application/xcap-el+xml"),

    /**
     * APPLICATION_XCAP_ERROR_PLUS_XML.
     */
    APPLICATION_XCAP_ERROR_PLUS_XML("application/xcap-error+xml"),

    /**
     * APPLICATION_XCAP_NS_PLUS_XML.
     */
    APPLICATION_XCAP_NS_PLUS_XML("application/xcap-ns+xml"),

    /**
     * APPLICATION_XCON_CONFERENCE_INFO_DIFF_PLUS_XML.
     */
    APPLICATION_XCON_CONFERENCE_INFO_DIFF_PLUS_XML("application/xcon-conference-info-diff+xml"),

    /**
     * APPLICATION_XCON_CONFERENCE_INFO_PLUS_XML.
     */
    APPLICATION_XCON_CONFERENCE_INFO_PLUS_XML("application/xcon-conference-info+xml"),

    /**
     * APPLICATION_XENC_PLUS_XML.
     */
    APPLICATION_XENC_PLUS_XML("application/xenc+xml", "xenc"),

    /**
     * APPLICATION_XHTML_PLUS_XML.
     */
    APPLICATION_XHTML_PLUS_XML("application/xhtml+xml", "xhtml", "xht"),

    /**
     * APPLICATION_XHTML_VOICE_PLUS_XML.
     */
    APPLICATION_XHTML_VOICE_PLUS_XML("application/xhtml-voice+xml"),

    /**
     * APPLICATION_XML.
     */
    APPLICATION_XML("application/xml", "xml", "xsl", "xsd"),

    /**
     * APPLICATION_XML_DTD.
     */
    APPLICATION_XML_DTD("application/xml-dtd", "dtd"),

    /**
     * APPLICATION_XML_EXTERNAL_PARSED_ENTITY.
     */
    APPLICATION_XML_EXTERNAL_PARSED_ENTITY("application/xml-external-parsed-entity"),

    /**
     * APPLICATION_XMPP_PLUS_XML.
     */
    APPLICATION_XMPP_PLUS_XML("application/xmpp+xml"),

    /**
     * APPLICATION_XOP_PLUS_XML.
     */
    APPLICATION_XOP_PLUS_XML("application/xop+xml", "xop"),

    /**
     * APPLICATION_XSLFO_PLUS_XML.
     */
    APPLICATION_XSLFO_PLUS_XML("application/xslfo+xml", "xslfo", "fo"),

    /**
     * APPLICATION_XSLT_PLUS_XML.
     */
    APPLICATION_XSLT_PLUS_XML("application/xslt+xml", "xslt"),

    /**
     * APPLICATION_XSPF_PLUS_XML.
     */
    APPLICATION_XSPF_PLUS_XML("application/xspf+xml", "xspf"),

    /**
     * APPLICATION_XV_PLUS_XML.
     */
    APPLICATION_XV_PLUS_XML("application/xv+xml", "mxml", "xhvml", "xvml", "xvm"),

    /**
     * APPLICATION_ZIP.
     */
    APPLICATION_ZIP("application/zip", "zip"),

    /**
     * APPLICATION_ZLIB.
     */
    APPLICATION_ZLIB("application/zlib"),

    /**
     * APPLICATION_X_7Z_COMPRESSED.
     */
    APPLICATION_X_7Z_COMPRESSED("application/x-7z-compressed", "7z"),

    /**
     * AUDIO_32KADPCM.
     */
    AUDIO_32KADPCM("audio/32kadpcm"),

    /**
     * AUDIO_3GPP.
     */
    AUDIO_3GPP("audio/3gpp"),

    /**
     * AUDIO_3GPP2.
     */
    AUDIO_3GPP2("audio/3gpp2"),

    /**
     * AUDIO_AC3.
     */
    AUDIO_AC3("audio/ac3"),

    /**
     * AUDIO_ADPCM.
     */
    AUDIO_ADPCM("audio/adpcm", "adp"),

    /**
     * AUDIO_AMR.
     */
    AUDIO_AMR("audio/amr", "amr"),

    /**
     * AUDIO_AMR_WB.
     */
    AUDIO_AMR_WB("audio/amr-wb"),

    /**
     * AUDIO_AMR_WB_PLUS_.
     */
    AUDIO_AMR_WB_PLUS_("audio/amr-wb+"),

    /**
     * AUDIO_ASC.
     */
    AUDIO_ASC("audio/asc"),

    /**
     * AUDIO_BASIC.
     */
    AUDIO_BASIC("audio/basic", "au", "snd"),

    /**
     * AUDIO_BV16.
     */
    AUDIO_BV16("audio/bv16"),

    /**
     * AUDIO_BV32.
     */
    AUDIO_BV32("audio/bv32"),

    /**
     * AUDIO_CLEARMODE.
     */
    AUDIO_CLEARMODE("audio/clearmode"),

    /**
     * AUDIO_CN.
     */
    AUDIO_CN("audio/cn"),

    /**
     * AUDIO_DAT12.
     */
    AUDIO_DAT12("audio/dat12"),

    /**
     * AUDIO_DLS.
     */
    AUDIO_DLS("audio/dls"),

    /**
     * AUDIO_DSR_ES201108.
     */
    AUDIO_DSR_ES201108("audio/dsr-es201108"),

    /**
     * AUDIO_DSR_ES202050.
     */
    AUDIO_DSR_ES202050("audio/dsr-es202050"),

    /**
     * AUDIO_DSR_ES202211.
     */
    AUDIO_DSR_ES202211("audio/dsr-es202211"),

    /**
     * AUDIO_DSR_ES202212.
     */
    AUDIO_DSR_ES202212("audio/dsr-es202212"),

    /**
     * AUDIO_DVI4.
     */
    AUDIO_DVI4("audio/dvi4"),

    /**
     * AUDIO_EAC3.
     */
    AUDIO_EAC3("audio/eac3"),

    /**
     * AUDIO_EVRC.
     */
    AUDIO_EVRC("audio/evrc"),

    /**
     * AUDIO_EVRC_QCP.
     */
    AUDIO_EVRC_QCP("audio/evrc-qcp"),

    /**
     * AUDIO_EVRC0.
     */
    AUDIO_EVRC0("audio/evrc0"),

    /**
     * AUDIO_EVRC1.
     */
    AUDIO_EVRC1("audio/evrc1"),

    /**
     * AUDIO_EVRCB.
     */
    AUDIO_EVRCB("audio/evrcb"),

    /**
     * AUDIO_EVRCB0.
     */
    AUDIO_EVRCB0("audio/evrcb0"),

    /**
     * AUDIO_EVRCB1.
     */
    AUDIO_EVRCB1("audio/evrcb1"),

    /**
     * AUDIO_EVRCWB.
     */
    AUDIO_EVRCWB("audio/evrcwb"),

    /**
     * AUDIO_EVRCWB0.
     */
    AUDIO_EVRCWB0("audio/evrcwb0"),

    /**
     * AUDIO_EVRCWB1.
     */
    AUDIO_EVRCWB1("audio/evrcwb1"),

    /**
     * AUDIO_EXAMPLE.
     */
    AUDIO_EXAMPLE("audio/example"),

    /**
     * AUDIO_G719.
     */
    AUDIO_G719("audio/g719"),

    /**
     * AUDIO_G722.
     */
    AUDIO_G722("audio/g722"),

    /**
     * AUDIO_G7221.
     */
    AUDIO_G7221("audio/g7221"),

    /**
     * AUDIO_G723.
     */
    AUDIO_G723("audio/g723"),

    /**
     * AUDIO_G726_16.
     */
    AUDIO_G726_16("audio/g726-16"),

    /**
     * AUDIO_G726_24.
     */
    AUDIO_G726_24("audio/g726-24"),

    /**
     * AUDIO_G726_32.
     */
    AUDIO_G726_32("audio/g726-32"),

    /**
     * AUDIO_G726_40.
     */
    AUDIO_G726_40("audio/g726-40"),

    /**
     * AUDIO_G728.
     */
    AUDIO_G728("audio/g728"),

    /**
     * AUDIO_G729.
     */
    AUDIO_G729("audio/g729"),

    /**
     * AUDIO_G7291.
     */
    AUDIO_G7291("audio/g7291"),

    /**
     * AUDIO_G729D.
     */
    AUDIO_G729D("audio/g729d"),

    /**
     * AUDIO_G729E.
     */
    AUDIO_G729E("audio/g729e"),

    /**
     * AUDIO_GSM.
     */
    AUDIO_GSM("audio/gsm"),

    /**
     * AUDIO_GSM_EFR.
     */
    AUDIO_GSM_EFR("audio/gsm-efr"),

    /**
     * AUDIO_ILBC.
     */
    AUDIO_ILBC("audio/ilbc"),

    /**
     * AUDIO_L16.
     */
    AUDIO_L16("audio/l16"),

    /**
     * AUDIO_L20.
     */
    AUDIO_L20("audio/l20"),

    /**
     * AUDIO_L24.
     */
    AUDIO_L24("audio/l24"),

    /**
     * AUDIO_L8.
     */
    AUDIO_L8("audio/l8"),

    /**
     * AUDIO_LPC.
     */
    AUDIO_LPC("audio/lpc"),

    /**
     * AUDIO_MIDI.
     */
    AUDIO_MIDI("audio/midi", "mid", "midi", "kar", "rmi"),

    /**
     * AUDIO_MOBILE_XMF.
     */
    AUDIO_MOBILE_XMF("audio/mobile-xmf"),

    /**
     * AUDIO_MP4.
     */
    AUDIO_MP4("audio/mp4", "mp4a", "m4a", "m4b"),

    /**
     * AUDIO_MP4A_LATM.
     */
    AUDIO_MP4A_LATM("audio/mp4a-latm"),

    /**
     * AUDIO_MPA.
     */
    AUDIO_MPA("audio/mpa"),

    /**
     * AUDIO_MPA_ROBUST.
     */
    AUDIO_MPA_ROBUST("audio/mpa-robust"),

    /**
     * AUDIO_MPEG.
     */
    AUDIO_MPEG("audio/mpeg", "mpga", "mp2", "mp2a", "mp3", "m2a", "m3a"),

    /**
     * AUDIO_MPEG4_GENERIC.
     */
    AUDIO_MPEG4_GENERIC("audio/mpeg4-generic"),

    /**
     * AUDIO_OGG.
     */
    AUDIO_OGG("audio/ogg", "oga"),

    /**
     * AUDIO_VORBIS.
     */
    AUDIO_VORBIS("audio/vorbis", "ogg"),

    /**
     * AUDIO_X_OGGFLAC.
     */
    AUDIO_X_OGGFLAC("audio/x-oggflac"),

    /**
     * AUDIO_X_OGGPCM.
     */
    AUDIO_X_OGGPCM("audio/x-oggpcm"),

    /**
     * AUDIO_OPUS.
     */
    AUDIO_OPUS("audio/opus", "opus"),

    /**
     * AUDIO_SPEEX.
     */
    AUDIO_SPEEX("audio/speex", "spx"),

    /**
     * AUDIO_PARITYFEC.
     */
    AUDIO_PARITYFEC("audio/parityfec"),

    /**
     * AUDIO_PCMA.
     */
    AUDIO_PCMA("audio/pcma"),

    /**
     * AUDIO_PCMA_WB.
     */
    AUDIO_PCMA_WB("audio/pcma-wb"),

    /**
     * AUDIO_PCMU_WB.
     */
    AUDIO_PCMU_WB("audio/pcmu-wb"),

    /**
     * AUDIO_PCMU.
     */
    AUDIO_PCMU("audio/pcmu"),

    /**
     * AUDIO_PRS_DOT_SID.
     */
    AUDIO_PRS_DOT_SID("audio/prs.sid"),

    /**
     * AUDIO_QCELP.
     */
    AUDIO_QCELP("audio/qcelp"),

    /**
     * AUDIO_RED.
     */
    AUDIO_RED("audio/red"),

    /**
     * AUDIO_RTP_ENC_AESCM128.
     */
    AUDIO_RTP_ENC_AESCM128("audio/rtp-enc-aescm128"),

    /**
     * AUDIO_RTP_MIDI.
     */
    AUDIO_RTP_MIDI("audio/rtp-midi"),

    /**
     * AUDIO_RTX.
     */
    AUDIO_RTX("audio/rtx"),

    /**
     * AUDIO_SMV.
     */
    AUDIO_SMV("audio/smv"),

    /**
     * AUDIO_SMV0.
     */
    AUDIO_SMV0("audio/smv0"),

    /**
     * AUDIO_SMV_QCP.
     */
    AUDIO_SMV_QCP("audio/smv-qcp"),

    /**
     * AUDIO_SP_MIDI.
     */
    AUDIO_SP_MIDI("audio/sp-midi"),

    /**
     * AUDIO_T140C.
     */
    AUDIO_T140C("audio/t140c"),

    /**
     * AUDIO_T38.
     */
    AUDIO_T38("audio/t38"),

    /**
     * AUDIO_TELEPHONE_EVENT.
     */
    AUDIO_TELEPHONE_EVENT("audio/telephone-event"),

    /**
     * AUDIO_TONE.
     */
    AUDIO_TONE("audio/tone"),

    /**
     * AUDIO_ULPFEC.
     */
    AUDIO_ULPFEC("audio/ulpfec"),

    /**
     * AUDIO_VDVI.
     */
    AUDIO_VDVI("audio/vdvi"),

    /**
     * AUDIO_VMR_WB.
     */
    AUDIO_VMR_WB("audio/vmr-wb"),

    /**
     * AUDIO_VND_DOT_3GPP_DOT_IUFP.
     */
    AUDIO_VND_DOT_3GPP_DOT_IUFP("audio/vnd.3gpp.iufp"),

    /**
     * AUDIO_VND_DOT_4SB.
     */
    AUDIO_VND_DOT_4SB("audio/vnd.4sb"),

    /**
     * AUDIO_VND_DOT_AUDIOKOZ.
     */
    AUDIO_VND_DOT_AUDIOKOZ("audio/vnd.audiokoz"),

    /**
     * AUDIO_VND_DOT_ADOBE_DOT_SOUNDBOOTH.
     */
    AUDIO_VND_DOT_ADOBE_DOT_SOUNDBOOTH("audio/vnd.adobe.soundbooth", "asnd"),

    /**
     * AUDIO_VND_DOT_CELP.
     */
    AUDIO_VND_DOT_CELP("audio/vnd.celp"),

    /**
     * AUDIO_VND_DOT_CISCO_DOT_NSE.
     */
    AUDIO_VND_DOT_CISCO_DOT_NSE("audio/vnd.cisco.nse"),

    /**
     * AUDIO_VND_DOT_CMLES_DOT_RADIO_EVENTS.
     */
    AUDIO_VND_DOT_CMLES_DOT_RADIO_EVENTS("audio/vnd.cmles.radio-events"),

    /**
     * AUDIO_VND_DOT_CNS_DOT_ANP1.
     */
    AUDIO_VND_DOT_CNS_DOT_ANP1("audio/vnd.cns.anp1"),

    /**
     * AUDIO_VND_DOT_CNS_DOT_INF1.
     */
    AUDIO_VND_DOT_CNS_DOT_INF1("audio/vnd.cns.inf1"),

    /**
     * AUDIO_VND_DOT_DIGITAL_WINDS.
     */
    AUDIO_VND_DOT_DIGITAL_WINDS("audio/vnd.digital-winds", "eol"),

    /**
     * AUDIO_VND_DOT_DLNA_DOT_ADTS.
     */
    AUDIO_VND_DOT_DLNA_DOT_ADTS("audio/vnd.dlna.adts"),

    /**
     * AUDIO_VND_DOT_DOLBY_DOT_HEAAC_DOT_1.
     */
    AUDIO_VND_DOT_DOLBY_DOT_HEAAC_DOT_1("audio/vnd.dolby.heaac.1"),

    /**
     * AUDIO_VND_DOT_DOLBY_DOT_HEAAC_DOT_2.
     */
    AUDIO_VND_DOT_DOLBY_DOT_HEAAC_DOT_2("audio/vnd.dolby.heaac.2"),

    /**
     * AUDIO_VND_DOT_DOLBY_DOT_MLP.
     */
    AUDIO_VND_DOT_DOLBY_DOT_MLP("audio/vnd.dolby.mlp"),

    /**
     * AUDIO_VND_DOT_DOLBY_DOT_MPS.
     */
    AUDIO_VND_DOT_DOLBY_DOT_MPS("audio/vnd.dolby.mps"),

    /**
     * AUDIO_VND_DOT_DOLBY_DOT_PL2.
     */
    AUDIO_VND_DOT_DOLBY_DOT_PL2("audio/vnd.dolby.pl2"),

    /**
     * AUDIO_VND_DOT_DOLBY_DOT_PL2X.
     */
    AUDIO_VND_DOT_DOLBY_DOT_PL2X("audio/vnd.dolby.pl2x"),

    /**
     * AUDIO_VND_DOT_DOLBY_DOT_PL2Z.
     */
    AUDIO_VND_DOT_DOLBY_DOT_PL2Z("audio/vnd.dolby.pl2z"),

    /**
     * AUDIO_VND_DOT_DTS.
     */
    AUDIO_VND_DOT_DTS("audio/vnd.dts", "dts"),

    /**
     * AUDIO_VND_DOT_DTS_DOT_HD.
     */
    AUDIO_VND_DOT_DTS_DOT_HD("audio/vnd.dts.hd", "dtshd"),

    /**
     * AUDIO_VND_DOT_EVERAD_DOT_PLJ.
     */
    AUDIO_VND_DOT_EVERAD_DOT_PLJ("audio/vnd.everad.plj"),

    /**
     * AUDIO_VND_DOT_HNS_DOT_AUDIO.
     */
    AUDIO_VND_DOT_HNS_DOT_AUDIO("audio/vnd.hns.audio"),

    /**
     * AUDIO_VND_DOT_LUCENT_DOT_VOICE.
     */
    AUDIO_VND_DOT_LUCENT_DOT_VOICE("audio/vnd.lucent.voice", "lvp"),

    /**
     * AUDIO_VND_DOT_MS_PLAYREADY_DOT_MEDIA_DOT_PYA.
     */
    AUDIO_VND_DOT_MS_PLAYREADY_DOT_MEDIA_DOT_PYA("audio/vnd.ms-playready.media.pya", "pya"),

    /**
     * AUDIO_VND_DOT_NOKIA_DOT_MOBILE_XMF.
     */
    AUDIO_VND_DOT_NOKIA_DOT_MOBILE_XMF("audio/vnd.nokia.mobile-xmf"),

    /**
     * AUDIO_VND_DOT_NORTEL_DOT_VBK.
     */
    AUDIO_VND_DOT_NORTEL_DOT_VBK("audio/vnd.nortel.vbk"),

    /**
     * AUDIO_VND_DOT_NUERA_DOT_ECELP4800.
     */
    AUDIO_VND_DOT_NUERA_DOT_ECELP4800("audio/vnd.nuera.ecelp4800", "ecelp4800"),

    /**
     * AUDIO_VND_DOT_NUERA_DOT_ECELP7470.
     */
    AUDIO_VND_DOT_NUERA_DOT_ECELP7470("audio/vnd.nuera.ecelp7470", "ecelp7470"),

    /**
     * AUDIO_VND_DOT_NUERA_DOT_ECELP9600.
     */
    AUDIO_VND_DOT_NUERA_DOT_ECELP9600("audio/vnd.nuera.ecelp9600", "ecelp9600"),

    /**
     * AUDIO_VND_DOT_OCTEL_DOT_SBC.
     */
    AUDIO_VND_DOT_OCTEL_DOT_SBC("audio/vnd.octel.sbc"),

    /**
     * AUDIO_VND_DOT_QCELP.
     */
    AUDIO_VND_DOT_QCELP("audio/vnd.qcelp"),

    /**
     * AUDIO_VND_DOT_RHETOREX_DOT_32KADPCM.
     */
    AUDIO_VND_DOT_RHETOREX_DOT_32KADPCM("audio/vnd.rhetorex.32kadpcm"),

    /**
     * AUDIO_VND_DOT_SEALEDMEDIA_DOT_SOFTSEAL_DOT_MPEG.
     */
    AUDIO_VND_DOT_SEALEDMEDIA_DOT_SOFTSEAL_DOT_MPEG("audio/vnd.sealedmedia.softseal.mpeg"),

    /**
     * AUDIO_VND_DOT_VMX_DOT_CVSD.
     */
    AUDIO_VND_DOT_VMX_DOT_CVSD("audio/vnd.vmx.cvsd"),

    /**
     * AUDIO_VORBIS_CONFIG.
     */
    AUDIO_VORBIS_CONFIG("audio/vorbis-config"),

    /**
     * AUDIO_X_AAC.
     */
    AUDIO_X_AAC("audio/x-aac", "aac"),

    /**
     * AUDIO_X_ADBCM.
     */
    AUDIO_X_ADBCM("audio/x-adbcm"),

    /**
     * AUDIO_X_AIFF.
     */
    AUDIO_X_AIFF("audio/x-aiff", "aif", "aiff", "aifc"),

    /**
     * AUDIO_X_DEC_BASIC.
     */
    AUDIO_X_DEC_BASIC("audio/x-dec-basic"),

    /**
     * AUDIO_X_DEC_ADBCM.
     */
    AUDIO_X_DEC_ADBCM("audio/x-dec-adbcm"),

    /**
     * AUDIO_X_FLAC.
     */
    AUDIO_X_FLAC("audio/x-flac", "flac"),

    /**
     * AUDIO_X_MOD.
     */
    AUDIO_X_MOD("audio/x-mod", "mod"),

    /**
     * AUDIO_X_MPEGURL.
     */
    AUDIO_X_MPEGURL("audio/x-mpegurl", "m3u"),

    /**
     * AUDIO_X_MS_WAX.
     */
    AUDIO_X_MS_WAX("audio/x-ms-wax", "wax"),

    /**
     * AUDIO_X_MS_WMA.
     */
    AUDIO_X_MS_WMA("audio/x-ms-wma", "wma"),

    /**
     * AUDIO_X_PN_REALAUDIO.
     */
    AUDIO_X_PN_REALAUDIO("audio/x-pn-realaudio", "ram", "ra"),

    /**
     * AUDIO_X_PN_REALAUDIO_PLUGIN.
     */
    AUDIO_X_PN_REALAUDIO_PLUGIN("audio/x-pn-realaudio-plugin", "rmp"),

    /**
     * AUDIO_X_WAV.
     */
    AUDIO_X_WAV("audio/x-wav", "wav"),

    /**
     * CHEMICAL_X_CDX.
     */
    CHEMICAL_X_CDX("chemical/x-cdx", "cdx"),

    /**
     * CHEMICAL_X_CIF.
     */
    CHEMICAL_X_CIF("chemical/x-cif", "cif"),

    /**
     * CHEMICAL_X_CMDF.
     */
    CHEMICAL_X_CMDF("chemical/x-cmdf", "cmdf"),

    /**
     * CHEMICAL_X_CML.
     */
    CHEMICAL_X_CML("chemical/x-cml", "cml"),

    /**
     * CHEMICAL_X_CSML.
     */
    CHEMICAL_X_CSML("chemical/x-csml", "csml"),

    /**
     * CHEMICAL_X_PDB.
     */
    CHEMICAL_X_PDB("chemical/x-pdb", "pdb"),

    /**
     * CHEMICAL_X_XYZ.
     */
    CHEMICAL_X_XYZ("chemical/x-xyz", "xyz"),

    /**
     * IMAGE_X_MS_BMP.
     */
    IMAGE_X_MS_BMP("image/x-ms-bmp", "bmp", "dib"),

    /**
     * IMAGE_X_BPG.
     */
    IMAGE_X_BPG("image/x-bpg", "bpg"),

    /**
     * IMAGE_CGM.
     */
    IMAGE_CGM("image/cgm", "cgm"),

    /**
     * IMAGE_EXAMPLE.
     */
    IMAGE_EXAMPLE("image/example"),

    /**
     * IMAGE_FITS.
     */
    IMAGE_FITS("image/fits"),

    /**
     * IMAGE_G3FAX.
     */
    IMAGE_G3FAX("image/g3fax", "g3"),

    /**
     * IMAGE_GIF.
     */
    IMAGE_GIF("image/gif", "gif"),

    /**
     * IMAGE_ICNS.
     */
    IMAGE_ICNS("image/icns", "icns"),

    /**
     * IMAGE_IEF.
     */
    IMAGE_IEF("image/ief", "ief"),

    /**
     * IMAGE_JP2.
     */
    IMAGE_JP2("image/jp2", "jp2"),

    /**
     * IMAGE_JPEG.
     */
    IMAGE_JPEG("image/jpeg", "jpg", "jpeg", "jpe", "jif", "jfif", "jfi"),

    /**
     * IMAGE_JPM.
     */
    IMAGE_JPM("image/jpm", "jpm", "jpgm"),

    /**
     * IMAGE_JPX.
     */
    IMAGE_JPX("image/jpx", "jpf"),

    /**
     * IMAGE_NAPLPS.
     */
    IMAGE_NAPLPS("image/naplps"),

    /**
     * IMAGE_NITF.
     */
    IMAGE_NITF("image/nitf", "ntf", "nitf"),

    /**
     * IMAGE_PNG.
     */
    IMAGE_PNG("image/png", "png"),

    /**
     * IMAGE_PRS_DOT_BTIF.
     */
    IMAGE_PRS_DOT_BTIF("image/prs.btif", "btif"),

    /**
     * IMAGE_PRS_DOT_PTI.
     */
    IMAGE_PRS_DOT_PTI("image/prs.pti"),

    /**
     * IMAGE_SVG_PLUS_XML.
     */
    IMAGE_SVG_PLUS_XML("image/svg+xml", "svg", "svgz"),

    /**
     * IMAGE_T38.
     */
    IMAGE_T38("image/t38"),

    /**
     * IMAGE_TIFF.
     */
    IMAGE_TIFF("image/tiff", "tiff", "tif"),

    /**
     * IMAGE_TIFF_FX.
     */
    IMAGE_TIFF_FX("image/tiff-fx"),

    /**
     * IMAGE_VND_DOT_ADOBE_DOT_PHOTOSHOP.
     */
    IMAGE_VND_DOT_ADOBE_DOT_PHOTOSHOP("image/vnd.adobe.photoshop", "psd"),

    /**
     * IMAGE_VND_DOT_ADOBE_DOT_PREMIERE.
     */
    IMAGE_VND_DOT_ADOBE_DOT_PREMIERE("image/vnd.adobe.premiere", "ppj"),

    /**
     * IMAGE_VND_DOT_CNS_DOT_INF2.
     */
    IMAGE_VND_DOT_CNS_DOT_INF2("image/vnd.cns.inf2"),

    /**
     * IMAGE_VND_DOT_DJVU.
     */
    IMAGE_VND_DOT_DJVU("image/vnd.djvu", "djvu", "djv"),

    /**
     * IMAGE_VND_DOT_DWG.
     */
    IMAGE_VND_DOT_DWG("image/vnd.dwg", "dwg"),

    /**
     * IMAGE_VND_DOT_DXB.
     */
    IMAGE_VND_DOT_DXB("image/vnd.dxb", "dxb"),

    /**
     * IMAGE_VND_DOT_DXF.
     */
    IMAGE_VND_DOT_DXF("image/vnd.dxf", "dxf"),

    /**
     * IMAGE_VND_DOT_DXFFORMATBINARY.
     */
    IMAGE_VND_DOT_DXFFORMATBINARY("image/vnd.dxf;format=binary"),

    /**
     * IMAGE_VND_DOT_DXFFORMATASCII.
     */
    IMAGE_VND_DOT_DXFFORMATASCII("image/vnd.dxf;format=ascii"),

    /**
     * IMAGE_VND_DOT_FASTBIDSHEET.
     */
    IMAGE_VND_DOT_FASTBIDSHEET("image/vnd.fastbidsheet", "fbs"),

    /**
     * IMAGE_VND_DOT_FPX.
     */
    IMAGE_VND_DOT_FPX("image/vnd.fpx", "fpx"),

    /**
     * IMAGE_VND_DOT_FST.
     */
    IMAGE_VND_DOT_FST("image/vnd.fst", "fst"),

    /**
     * IMAGE_VND_DOT_FUJIXEROX_DOT_EDMICS_MMR.
     */
    IMAGE_VND_DOT_FUJIXEROX_DOT_EDMICS_MMR("image/vnd.fujixerox.edmics-mmr", "mmr"),

    /**
     * IMAGE_VND_DOT_FUJIXEROX_DOT_EDMICS_RLC.
     */
    IMAGE_VND_DOT_FUJIXEROX_DOT_EDMICS_RLC("image/vnd.fujixerox.edmics-rlc", "rlc"),

    /**
     * IMAGE_VND_DOT_GLOBALGRAPHICS_DOT_PGB.
     */
    IMAGE_VND_DOT_GLOBALGRAPHICS_DOT_PGB("image/vnd.globalgraphics.pgb"),

    /**
     * IMAGE_VND_DOT_MICROSOFT_DOT_ICON.
     */
    IMAGE_VND_DOT_MICROSOFT_DOT_ICON("image/vnd.microsoft.icon", "ico"),

    /**
     * IMAGE_VND_DOT_MIX.
     */
    IMAGE_VND_DOT_MIX("image/vnd.mix"),

    /**
     * IMAGE_VND_DOT_MS_MODI.
     */
    IMAGE_VND_DOT_MS_MODI("image/vnd.ms-modi", "mdi"),

    /**
     * IMAGE_VND_DOT_NET_FPX.
     */
    IMAGE_VND_DOT_NET_FPX("image/vnd.net-fpx", "npx"),

    /**
     * IMAGE_VND_DOT_RADIANCE.
     */
    IMAGE_VND_DOT_RADIANCE("image/vnd.radiance"),

    /**
     * IMAGE_VND_DOT_SEALED_DOT_PNG.
     */
    IMAGE_VND_DOT_SEALED_DOT_PNG("image/vnd.sealed.png"),

    /**
     * IMAGE_VND_DOT_SEALEDMEDIA_DOT_SOFTSEAL_DOT_GIF.
     */
    IMAGE_VND_DOT_SEALEDMEDIA_DOT_SOFTSEAL_DOT_GIF("image/vnd.sealedmedia.softseal.gif"),

    /**
     * IMAGE_VND_DOT_SEALEDMEDIA_DOT_SOFTSEAL_DOT_JPG.
     */
    IMAGE_VND_DOT_SEALEDMEDIA_DOT_SOFTSEAL_DOT_JPG("image/vnd.sealedmedia.softseal.jpg"),

    /**
     * IMAGE_VND_DOT_SVF.
     */
    IMAGE_VND_DOT_SVF("image/vnd.svf"),

    /**
     * IMAGE_VND_DOT_WAP_DOT_WBMP.
     */
    IMAGE_VND_DOT_WAP_DOT_WBMP("image/vnd.wap.wbmp", "wbmp"),

    /**
     * IMAGE_WEBP.
     */
    IMAGE_WEBP("image/webp", "webp"),

    /**
     * IMAGE_VND_DOT_XIFF.
     */
    IMAGE_VND_DOT_XIFF("image/vnd.xiff", "xif"),

    /**
     * IMAGE_X_CMU_RASTER.
     */
    IMAGE_X_CMU_RASTER("image/x-cmu-raster", "ras"),

    /**
     * IMAGE_X_CMX.
     */
    IMAGE_X_CMX("image/x-cmx", "cmx"),

    /**
     * IMAGE_X_FREEHAND.
     */
    IMAGE_X_FREEHAND("image/x-freehand", "fh", "fhc", "fh4", "fh40", "fh5", "fh50", "fh7", "fh8", "fh9", "fh10", "fh11", "fh12", "ft7", "ft8", "ft9", "ft10", "ft11", "ft12"),

    /**
     * IMAGE_X_JP2_CODESTREAM.
     */
    IMAGE_X_JP2_CODESTREAM("image/x-jp2-codestream", "j2c"),

    /**
     * IMAGE_X_JP2_CONTAINER.
     */
    IMAGE_X_JP2_CONTAINER("image/x-jp2-container"),

    /**
     * IMAGE_X_NIFF.
     */
    IMAGE_X_NIFF("image/x-niff"),

    /**
     * IMAGE_X_PCX.
     */
    IMAGE_X_PCX("image/x-pcx", "pcx"),

    /**
     * IMAGE_X_PICT.
     */
    IMAGE_X_PICT("image/x-pict", "pic", "pct", "pict"),

    /**
     * IMAGE_X_PORTABLE_ANYMAP.
     */
    IMAGE_X_PORTABLE_ANYMAP("image/x-portable-anymap", "pnm"),

    /**
     * IMAGE_X_PORTABLE_BITMAP.
     */
    IMAGE_X_PORTABLE_BITMAP("image/x-portable-bitmap", "pbm"),

    /**
     * IMAGE_X_PORTABLE_GRAYMAP.
     */
    IMAGE_X_PORTABLE_GRAYMAP("image/x-portable-graymap", "pgm"),

    /**
     * IMAGE_X_PORTABLE_PIXMAP.
     */
    IMAGE_X_PORTABLE_PIXMAP("image/x-portable-pixmap", "ppm"),

    /**
     * IMAGE_X_RAW_ADOBE.
     */
    IMAGE_X_RAW_ADOBE("image/x-raw-adobe", "dng"),

    /**
     * IMAGE_X_RAW_HASSELBLAD.
     */
    IMAGE_X_RAW_HASSELBLAD("image/x-raw-hasselblad", "3fr"),

    /**
     * IMAGE_X_RAW_FUJI.
     */
    IMAGE_X_RAW_FUJI("image/x-raw-fuji", "raf"),

    /**
     * IMAGE_X_RAW_CANON.
     */
    IMAGE_X_RAW_CANON("image/x-raw-canon", "crw", "cr2"),

    /**
     * IMAGE_X_RAW_KODAK.
     */
    IMAGE_X_RAW_KODAK("image/x-raw-kodak", "k25", "kdc", "dcs", "drf"),

    /**
     * IMAGE_X_RAW_MINOLTA.
     */
    IMAGE_X_RAW_MINOLTA("image/x-raw-minolta", "mrw"),

    /**
     * IMAGE_X_RAW_NIKON.
     */
    IMAGE_X_RAW_NIKON("image/x-raw-nikon", "nef", "nrw"),

    /**
     * IMAGE_X_RAW_OLYMPUS.
     */
    IMAGE_X_RAW_OLYMPUS("image/x-raw-olympus", "orf"),

    /**
     * IMAGE_X_RAW_PENTAX.
     */
    IMAGE_X_RAW_PENTAX("image/x-raw-pentax", "ptx", "pef"),

    /**
     * IMAGE_X_RAW_SONY.
     */
    IMAGE_X_RAW_SONY("image/x-raw-sony", "arw", "srf", "sr2"),

    /**
     * IMAGE_X_RAW_SIGMA.
     */
    IMAGE_X_RAW_SIGMA("image/x-raw-sigma", "x3f"),

    /**
     * IMAGE_X_RAW_EPSON.
     */
    IMAGE_X_RAW_EPSON("image/x-raw-epson", "erf"),

    /**
     * IMAGE_X_RAW_MAMIYA.
     */
    IMAGE_X_RAW_MAMIYA("image/x-raw-mamiya", "mef"),

    /**
     * IMAGE_X_RAW_LEAF.
     */
    IMAGE_X_RAW_LEAF("image/x-raw-leaf", "mos"),

    /**
     * IMAGE_X_RAW_PANASONIC.
     */
    IMAGE_X_RAW_PANASONIC("image/x-raw-panasonic", "raw", "rw2"),

    /**
     * IMAGE_X_RAW_PHASEONE.
     */
    IMAGE_X_RAW_PHASEONE("image/x-raw-phaseone", "iiq"),

    /**
     * IMAGE_X_RAW_RED.
     */
    IMAGE_X_RAW_RED("image/x-raw-red", "r3d"),

    /**
     * IMAGE_X_RAW_IMACON.
     */
    IMAGE_X_RAW_IMACON("image/x-raw-imacon", "fff"),

    /**
     * IMAGE_X_RAW_LOGITECH.
     */
    IMAGE_X_RAW_LOGITECH("image/x-raw-logitech", "pxn"),

    /**
     * IMAGE_X_RAW_CASIO.
     */
    IMAGE_X_RAW_CASIO("image/x-raw-casio", "bay"),

    /**
     * IMAGE_X_RAW_RAWZOR.
     */
    IMAGE_X_RAW_RAWZOR("image/x-raw-rawzor", "rwz"),

    /**
     * IMAGE_X_RGB.
     */
    IMAGE_X_RGB("image/x-rgb", "rgb"),

    /**
     * IMAGE_X_XBITMAP.
     */
    IMAGE_X_XBITMAP("image/x-xbitmap", "xbm"),

    /**
     * IMAGE_X_XCF.
     */
    IMAGE_X_XCF("image/x-xcf", "xcf"),

    /**
     * IMAGE_X_XPIXMAP.
     */
    IMAGE_X_XPIXMAP("image/x-xpixmap", "xpm"),

    /**
     * IMAGE_X_XWINDOWDUMP.
     */
    IMAGE_X_XWINDOWDUMP("image/x-xwindowdump", "xwd"),

    /**
     * MESSAGE_CPIM.
     */
    MESSAGE_CPIM("message/cpim"),

    /**
     * MESSAGE_DELIVERY_STATUS.
     */
    MESSAGE_DELIVERY_STATUS("message/delivery-status"),

    /**
     * MESSAGE_DISPOSITION_NOTIFICATION.
     */
    MESSAGE_DISPOSITION_NOTIFICATION("message/disposition-notification"),

    /**
     * MESSAGE_EXAMPLE.
     */
    MESSAGE_EXAMPLE("message/example"),

    /**
     * MESSAGE_EXTERNAL_BODY.
     */
    MESSAGE_EXTERNAL_BODY("message/external-body"),

    /**
     * MESSAGE_GLOBAL.
     */
    MESSAGE_GLOBAL("message/global"),

    /**
     * MESSAGE_GLOBAL_DELIVERY_STATUS.
     */
    MESSAGE_GLOBAL_DELIVERY_STATUS("message/global-delivery-status"),

    /**
     * MESSAGE_GLOBAL_DISPOSITION_NOTIFICATION.
     */
    MESSAGE_GLOBAL_DISPOSITION_NOTIFICATION("message/global-disposition-notification"),

    /**
     * MESSAGE_GLOBAL_HEADERS.
     */
    MESSAGE_GLOBAL_HEADERS("message/global-headers"),

    /**
     * MESSAGE_HTTP.
     */
    MESSAGE_HTTP("message/http"),

    /**
     * MESSAGE_IMDN_PLUS_XML.
     */
    MESSAGE_IMDN_PLUS_XML("message/imdn+xml"),

    /**
     * MESSAGE_NEWS.
     */
    MESSAGE_NEWS("message/news"),

    /**
     * MESSAGE_PARTIAL.
     */
    MESSAGE_PARTIAL("message/partial"),

    /**
     * MESSAGE_RFC822.
     */
    MESSAGE_RFC822("message/rfc822", "eml", "mime", "mht", "mhtml"),

    /**
     * MESSAGE_S_HTTP.
     */
    MESSAGE_S_HTTP("message/s-http"),

    /**
     * MESSAGE_SIP.
     */
    MESSAGE_SIP("message/sip"),

    /**
     * MESSAGE_SIPFRAG.
     */
    MESSAGE_SIPFRAG("message/sipfrag"),

    /**
     * MESSAGE_TRACKING_STATUS.
     */
    MESSAGE_TRACKING_STATUS("message/tracking-status"),

    /**
     * MESSAGE_VND_DOT_SI_DOT_SIMP.
     */
    MESSAGE_VND_DOT_SI_DOT_SIMP("message/vnd.si.simp"),

    /**
     * MODEL_EXAMPLE.
     */
    MODEL_EXAMPLE("model/example"),

    /**
     * MODEL_IGES.
     */
    MODEL_IGES("model/iges", "igs", "iges"),

    /**
     * MODEL_MESH.
     */
    MODEL_MESH("model/mesh", "msh", "mesh", "silo"),

    /**
     * MODEL_VND_DOT_DWF.
     */
    MODEL_VND_DOT_DWF("model/vnd.dwf", "dwf"),

    /**
     * MODEL_VND_DOT_DWFVERSION6.
     */
    MODEL_VND_DOT_DWFVERSION6("model/vnd.dwf;version=6"),

    /**
     * MODEL_VND_DOT_DWFVERSION5.
     */
    MODEL_VND_DOT_DWFVERSION5("model/vnd.dwf;version=5"),

    /**
     * MODEL_VND_DOT_DWFVERSION2.
     */
    MODEL_VND_DOT_DWFVERSION2("model/vnd.dwf;version=2"),

    /**
     * MODEL_VND_DOT_DWFX_PLUS_XPS.
     */
    MODEL_VND_DOT_DWFX_PLUS_XPS("model/vnd.dwfx+xps", "dwfx"),

    /**
     * MODEL_VND_DOT_FLATLAND_DOT_3DML.
     */
    MODEL_VND_DOT_FLATLAND_DOT_3DML("model/vnd.flatland.3dml"),

    /**
     * MODEL_VND_DOT_GDL.
     */
    MODEL_VND_DOT_GDL("model/vnd.gdl", "gdl"),

    /**
     * MODEL_VND_DOT_GS_GDL.
     */
    MODEL_VND_DOT_GS_GDL("model/vnd.gs-gdl"),

    /**
     * MODEL_VND_DOT_GS_DOT_GDL.
     */
    MODEL_VND_DOT_GS_DOT_GDL("model/vnd.gs.gdl"),

    /**
     * MODEL_VND_DOT_GTW.
     */
    MODEL_VND_DOT_GTW("model/vnd.gtw", "gtw"),

    /**
     * MODEL_VND_DOT_MOML_PLUS_XML.
     */
    MODEL_VND_DOT_MOML_PLUS_XML("model/vnd.moml+xml"),

    /**
     * MODEL_VND_DOT_MTS.
     */
    MODEL_VND_DOT_MTS("model/vnd.mts", "mts"),

    /**
     * MODEL_VND_DOT_PARASOLID_DOT_TRANSMIT_DOT_BINARY.
     */
    MODEL_VND_DOT_PARASOLID_DOT_TRANSMIT_DOT_BINARY("model/vnd.parasolid.transmit.binary"),

    /**
     * MODEL_VND_DOT_PARASOLID_DOT_TRANSMIT_DOT_TEXT.
     */
    MODEL_VND_DOT_PARASOLID_DOT_TRANSMIT_DOT_TEXT("model/vnd.parasolid.transmit.text"),

    /**
     * MODEL_VND_DOT_VTU.
     */
    MODEL_VND_DOT_VTU("model/vnd.vtu", "vtu"),

    /**
     * MODEL_VRML.
     */
    MODEL_VRML("model/vrml", "wrl", "vrml"),

    /**
     * MULTIPART_ALTERNATIVE.
     */
    MULTIPART_ALTERNATIVE("multipart/alternative"),

    /**
     * MULTIPART_APPLEDOUBLE.
     */
    MULTIPART_APPLEDOUBLE("multipart/appledouble"),

    /**
     * MULTIPART_BYTERANGES.
     */
    MULTIPART_BYTERANGES("multipart/byteranges"),

    /**
     * MULTIPART_DIGEST.
     */
    MULTIPART_DIGEST("multipart/digest"),

    /**
     * MULTIPART_ENCRYPTED.
     */
    MULTIPART_ENCRYPTED("multipart/encrypted"),

    /**
     * MULTIPART_EXAMPLE.
     */
    MULTIPART_EXAMPLE("multipart/example"),

    /**
     * MULTIPART_FORM_DATA.
     */
    MULTIPART_FORM_DATA("multipart/form-data"),

    /**
     * MULTIPART_HEADER_SET.
     */
    MULTIPART_HEADER_SET("multipart/header-set"),

    /**
     * MULTIPART_MIXED.
     */
    MULTIPART_MIXED("multipart/mixed"),

    /**
     * MULTIPART_PARALLEL.
     */
    MULTIPART_PARALLEL("multipart/parallel"),

    /**
     * MULTIPART_RELATED.
     */
    MULTIPART_RELATED("multipart/related"),

    /**
     * MULTIPART_REPORT.
     */
    MULTIPART_REPORT("multipart/report"),

    /**
     * MULTIPART_SIGNED.
     */
    MULTIPART_SIGNED("multipart/signed"),

    /**
     * MULTIPART_VOICE_MESSAGE.
     */
    MULTIPART_VOICE_MESSAGE("multipart/voice-message"),

    /**
     * APPLICATION_DIF_PLUS_XML.
     */
    APPLICATION_DIF_PLUS_XML("application/dif+xml", "dif"),

    /**
     * TEXT_X_ACTIONSCRIPT.
     */
    TEXT_X_ACTIONSCRIPT("text/x-actionscript", "as"),

    /**
     * TEXT_X_ADA.
     */
    TEXT_X_ADA("text/x-ada", "ada", "adb", "ads"),

    /**
     * TEXT_X_APPLESCRIPT.
     */
    TEXT_X_APPLESCRIPT("text/x-applescript", "applescript"),

    /**
     * TEXT_ASP.
     */
    TEXT_ASP("text/asp", "asp"),

    /**
     * TEXT_ASPDOTNET.
     */
    TEXT_ASPDOTNET("text/aspdotnet", "aspx"),

    /**
     * TEXT_X_ASPECTJ.
     */
    TEXT_X_ASPECTJ("text/x-aspectj", "aj"),

    /**
     * TEXT_X_ASSEMBLY.
     */
    TEXT_X_ASSEMBLY("text/x-assembly", "s", "S", "asm"),

    /**
     * TEXT_CALENDAR.
     */
    TEXT_CALENDAR("text/calendar", "ics", "ifb"),

    /**
     * TEXT_CSS.
     */
    TEXT_CSS("text/css", "css"),

    /**
     * TEXT_CSV.
     */
    TEXT_CSV("text/csv", "csv"),

    /**
     * TEXT_DIRECTORY.
     */
    TEXT_DIRECTORY("text/directory"),

    /**
     * TEXT_DNS.
     */
    TEXT_DNS("text/dns"),

    /**
     * TEXT_ECMASCRIPT.
     */
    TEXT_ECMASCRIPT("text/ecmascript"),

    /**
     * TEXT_ENRICHED.
     */
    TEXT_ENRICHED("text/enriched"),

    /**
     * TEXT_EXAMPLE.
     */
    TEXT_EXAMPLE("text/example"),

    /**
     * TEXT_HTML.
     */
    TEXT_HTML("text/html", "html", "htm"),

    /**
     * TEXT_PARITYFEC.
     */
    TEXT_PARITYFEC("text/parityfec"),

    /**
     * TEXT_PLAIN.
     */
    TEXT_PLAIN("text/plain", "txt", "text", "conf", "cfg", "def", "list", "in", "aart", "ac", "am", "classpath", "cmd", "config", "cwiki", "data", "dcl", "egrm", "ent", "ft", "fn", "fv", "grm", "g", "ihtml", "jmx", "junit", "jx", "manifest", "m4", "mf", "MF", "meta", "n3", "pen", "pod", "pom", "project", "rng", "rnx", "roles", "tld", "types", "vm", "vsl", "wsdd", "xargs", "xcat", "xconf", "xegrm", "xgrm", "xlex", "xlog", "xmap", "xroles", "xsamples", "xsp", "xweb", "xwelcome"),

    /**
     * TEXT_PRS_DOT_FALLENSTEIN_DOT_RST.
     */
    TEXT_PRS_DOT_FALLENSTEIN_DOT_RST("text/prs.fallenstein.rst"),

    /**
     * TEXT_PRS_DOT_LINES_DOT_TAG.
     */
    TEXT_PRS_DOT_LINES_DOT_TAG("text/prs.lines.tag", "dsc"),

    /**
     * TEXT_RED.
     */
    TEXT_RED("text/red"),

    /**
     * TEXT_RFC822_HEADERS.
     */
    TEXT_RFC822_HEADERS("text/rfc822-headers"),

    /**
     * TEXT_RICHTEXT.
     */
    TEXT_RICHTEXT("text/richtext", "rtx"),

    /**
     * TEXT_RTP_ENC_AESCM128.
     */
    TEXT_RTP_ENC_AESCM128("text/rtp-enc-aescm128"),

    /**
     * TEXT_RTX.
     */
    TEXT_RTX("text/rtx"),

    /**
     * TEXT_SGML.
     */
    TEXT_SGML("text/sgml", "sgml", "sgm"),

    /**
     * TEXT_T140.
     */
    TEXT_T140("text/t140"),

    /**
     * TEXT_TAB_SEPARATED_VALUES.
     */
    TEXT_TAB_SEPARATED_VALUES("text/tab-separated-values", "tsv"),

    /**
     * TEXT_TROFF.
     */
    TEXT_TROFF("text/troff", "t", "tr", "roff", "man", "me", "ms"),

    /**
     * TEXT_ULPFEC.
     */
    TEXT_ULPFEC("text/ulpfec"),

    /**
     * TEXT_URI_LIST.
     */
    TEXT_URI_LIST("text/uri-list", "uri", "uris", "urls"),

    /**
     * TEXT_VND_DOT_ABC.
     */
    TEXT_VND_DOT_ABC("text/vnd.abc"),

    /**
     * TEXT_VND_DOT_CURL.
     */
    TEXT_VND_DOT_CURL("text/vnd.curl", "curl"),

    /**
     * TEXT_VND_DOT_CURL_DOT_DCURL.
     */
    TEXT_VND_DOT_CURL_DOT_DCURL("text/vnd.curl.dcurl", "dcurl"),

    /**
     * TEXT_VND_DOT_CURL_DOT_SCURL.
     */
    TEXT_VND_DOT_CURL_DOT_SCURL("text/vnd.curl.scurl", "scurl"),

    /**
     * TEXT_VND_DOT_CURL_DOT_MCURL.
     */
    TEXT_VND_DOT_CURL_DOT_MCURL("text/vnd.curl.mcurl", "mcurl"),

    /**
     * TEXT_VND_DOT_DMCLIENTSCRIPT.
     */
    TEXT_VND_DOT_DMCLIENTSCRIPT("text/vnd.dmclientscript"),

    /**
     * TEXT_VND_DOT_ESMERTEC_DOT_THEME_DESCRIPTOR.
     */
    TEXT_VND_DOT_ESMERTEC_DOT_THEME_DESCRIPTOR("text/vnd.esmertec.theme-descriptor"),

    /**
     * TEXT_VND_DOT_FLY.
     */
    TEXT_VND_DOT_FLY("text/vnd.fly", "fly"),

    /**
     * TEXT_VND_DOT_FMI_DOT_FLEXSTOR.
     */
    TEXT_VND_DOT_FMI_DOT_FLEXSTOR("text/vnd.fmi.flexstor", "flx"),

    /**
     * TEXT_VND_DOT_GRAPHVIZ.
     */
    TEXT_VND_DOT_GRAPHVIZ("text/vnd.graphviz", "gv"),

    /**
     * TEXT_VND_DOT_IN3D_DOT_3DML.
     */
    TEXT_VND_DOT_IN3D_DOT_3DML("text/vnd.in3d.3dml", "3dml"),

    /**
     * TEXT_VND_DOT_IN3D_DOT_SPOT.
     */
    TEXT_VND_DOT_IN3D_DOT_SPOT("text/vnd.in3d.spot", "spot"),

    /**
     * TEXT_VND_DOT_IPTC_DOT_ANPA.
     */
    TEXT_VND_DOT_IPTC_DOT_ANPA("text/vnd.iptc.anpa", "anpa"),

    /**
     * TEXT_VND_DOT_IPTC_DOT_NEWSML.
     */
    TEXT_VND_DOT_IPTC_DOT_NEWSML("text/vnd.iptc.newsml"),

    /**
     * TEXT_VND_DOT_IPTC_DOT_NITF.
     */
    TEXT_VND_DOT_IPTC_DOT_NITF("text/vnd.iptc.nitf"),

    /**
     * TEXT_VND_DOT_LATEX_Z.
     */
    TEXT_VND_DOT_LATEX_Z("text/vnd.latex-z"),

    /**
     * TEXT_VND_DOT_MOTOROLA_DOT_REFLEX.
     */
    TEXT_VND_DOT_MOTOROLA_DOT_REFLEX("text/vnd.motorola.reflex"),

    /**
     * TEXT_VND_DOT_MS_MEDIAPACKAGE.
     */
    TEXT_VND_DOT_MS_MEDIAPACKAGE("text/vnd.ms-mediapackage"),

    /**
     * TEXT_VND_DOT_NET2PHONE_DOT_COMMCENTER_DOT_COMMAND.
     */
    TEXT_VND_DOT_NET2PHONE_DOT_COMMCENTER_DOT_COMMAND("text/vnd.net2phone.commcenter.command"),

    /**
     * TEXT_VND_DOT_SI_DOT_URICATALOGUE.
     */
    TEXT_VND_DOT_SI_DOT_URICATALOGUE("text/vnd.si.uricatalogue"),

    /**
     * TEXT_VND_DOT_SUN_DOT_J2ME_DOT_APP_DESCRIPTOR.
     */
    TEXT_VND_DOT_SUN_DOT_J2ME_DOT_APP_DESCRIPTOR("text/vnd.sun.j2me.app-descriptor", "jad"),

    /**
     * TEXT_VND_DOT_TROLLTECH_DOT_LINGUIST.
     */
    TEXT_VND_DOT_TROLLTECH_DOT_LINGUIST("text/vnd.trolltech.linguist"),

    /**
     * TEXT_VND_DOT_WAP_DOT_SI.
     */
    TEXT_VND_DOT_WAP_DOT_SI("text/vnd.wap.si"),

    /**
     * TEXT_VND_DOT_WAP_DOT_SL.
     */
    TEXT_VND_DOT_WAP_DOT_SL("text/vnd.wap.sl"),

    /**
     * TEXT_VND_DOT_WAP_DOT_WML.
     */
    TEXT_VND_DOT_WAP_DOT_WML("text/vnd.wap.wml", "wml"),

    /**
     * TEXT_VND_DOT_WAP_DOT_WMLSCRIPT.
     */
    TEXT_VND_DOT_WAP_DOT_WMLSCRIPT("text/vnd.wap.wmlscript", "wmls"),

    /**
     * TEXT_VTT.
     */
    TEXT_VTT("text/vtt", "vtt"),

    /**
     * TEXT_X_AWK.
     */
    TEXT_X_AWK("text/x-awk", "awk"),

    /**
     * TEXT_X_BASIC.
     */
    TEXT_X_BASIC("text/x-basic", "bas", "Bas", "BAS"),

    /**
     * TEXT_X_C_PLUS__PLUS_HDR.
     */
    TEXT_X_C_PLUS__PLUS_HDR("text/x-c++hdr", "hpp", "hxx", "hh", "H", "h++", "hp", "HPP"),

    /**
     * TEXT_X_C_PLUS__PLUS_SRC.
     */
    TEXT_X_C_PLUS__PLUS_SRC("text/x-c++src", "cpp", "cxx", "cc", "C", "c++", "CPP"),

    /**
     * TEXT_X_CGI.
     */
    TEXT_X_CGI("text/x-cgi", "cgi"),

    /**
     * TEXT_X_CHDR.
     */
    TEXT_X_CHDR("text/x-chdr", "h"),

    /**
     * TEXT_X_CLOJURE.
     */
    TEXT_X_CLOJURE("text/x-clojure", "clj"),

    /**
     * TEXT_X_COFFEESCRIPT.
     */
    TEXT_X_COFFEESCRIPT("text/x-coffeescript", "coffee"),

    /**
     * TEXT_X_CSRC.
     */
    TEXT_X_CSRC("text/x-csrc", "c"),

    /**
     * TEXT_X_CSHARP.
     */
    TEXT_X_CSHARP("text/x-csharp", "cs"),

    /**
     * TEXT_X_COBOL.
     */
    TEXT_X_COBOL("text/x-cobol", "cbl", "Cbl", "CBL", "cob", "Cob", "COB"),

    /**
     * TEXT_X_COLDFUSION.
     */
    TEXT_X_COLDFUSION("text/x-coldfusion", "cfm", "cfml", "cfc"),

    /**
     * TEXT_X_COMMON_LISP.
     */
    TEXT_X_COMMON_LISP("text/x-common-lisp", "cl", "jl", "lisp", "lsp"),

    /**
     * TEXT_X_DIFF.
     */
    TEXT_X_DIFF("text/x-diff", "diff", "patch"),

    /**
     * TEXT_X_EIFFEL.
     */
    TEXT_X_EIFFEL("text/x-eiffel", "e"),

    /**
     * TEXT_X_EMACS_LISP.
     */
    TEXT_X_EMACS_LISP("text/x-emacs-lisp", "el"),

    /**
     * TEXT_X_ERLANG.
     */
    TEXT_X_ERLANG("text/x-erlang", "erl"),

    /**
     * TEXT_X_EXPECT.
     */
    TEXT_X_EXPECT("text/x-expect", "exp"),

    /**
     * TEXT_X_FORTH.
     */
    TEXT_X_FORTH("text/x-forth", "4th"),

    /**
     * TEXT_X_FORTRAN.
     */
    TEXT_X_FORTRAN("text/x-fortran", "f", "F", "for", "f77", "f90"),

    /**
     * TEXT_X_GO.
     */
    TEXT_X_GO("text/x-go", "go"),

    /**
     * TEXT_X_GROOVY.
     */
    TEXT_X_GROOVY("text/x-groovy", "groovy"),

    /**
     * TEXT_X_HASKELL.
     */
    TEXT_X_HASKELL("text/x-haskell", "hs", "lhs"),

    /**
     * TEXT_X_IDL.
     */
    TEXT_X_IDL("text/x-idl", "idl"),

    /**
     * TEXT_X_INI.
     */
    TEXT_X_INI("text/x-ini", "ini"),

    /**
     * TEXT_X_JAVA_SOURCE.
     */
    TEXT_X_JAVA_SOURCE("text/x-java-source", "java"),

    /**
     * TEXT_X_JAVA_PROPERTIES.
     */
    TEXT_X_JAVA_PROPERTIES("text/x-java-properties", "properties"),

    /**
     * TEXT_X_JSP.
     */
    TEXT_X_JSP("text/x-jsp", "jsp"),

    /**
     * TEXT_X_LESS.
     */
    TEXT_X_LESS("text/x-less", "less"),

    /**
     * TEXT_X_LEX.
     */
    TEXT_X_LEX("text/x-lex", "l"),

    /**
     * TEXT_X_LOG.
     */
    TEXT_X_LOG("text/x-log", "log"),

    /**
     * TEXT_X_LUA.
     */
    TEXT_X_LUA("text/x-lua", "lua"),

    /**
     * TEXT_X_ML.
     */
    TEXT_X_ML("text/x-ml", "ml"),

    /**
     * TEXT_X_MATLAB.
     */
    TEXT_X_MATLAB("text/x-matlab"),

    /**
     * APPLICATION_X_MATLAB_DATA.
     */
    APPLICATION_X_MATLAB_DATA("application/x-matlab-data", "mat"),

    /**
     * TEXT_X_MODULA.
     */
    TEXT_X_MODULA("text/x-modula", "m3", "i3", "mg", "ig"),

    /**
     * TEXT_X_OBJCSRC.
     */
    TEXT_X_OBJCSRC("text/x-objcsrc", "m"),

    /**
     * TEXT_X_OCAML.
     */
    TEXT_X_OCAML("text/x-ocaml", "ocaml", "mli"),

    /**
     * TEXT_X_PASCAL.
     */
    TEXT_X_PASCAL("text/x-pascal", "p", "pp", "pas", "PAS", "dpr"),

    /**
     * TEXT_X_PERL.
     */
    TEXT_X_PERL("text/x-perl", "pl", "pm", "al", "perl"),

    /**
     * TEXT_X_PHP.
     */
    TEXT_X_PHP("text/x-php", "php", "php3", "php4"),

    /**
     * TEXT_X_PROLOG.
     */
    TEXT_X_PROLOG("text/x-prolog", "pro"),

    /**
     * TEXT_X_PYTHON.
     */
    TEXT_X_PYTHON("text/x-python", "py"),

    /**
     * TEXT_X_RST.
     */
    TEXT_X_RST("text/x-rst", "rest", "rst", "restx"),

    /**
     * TEXT_X_REXX.
     */
    TEXT_X_REXX("text/x-rexx", "rexx"),

    /**
     * TEXT_X_RUBY.
     */
    TEXT_X_RUBY("text/x-ruby", "rb"),

    /**
     * TEXT_X_SCALA.
     */
    TEXT_X_SCALA("text/x-scala", "scala"),

    /**
     * TEXT_X_SCHEME.
     */
    TEXT_X_SCHEME("text/x-scheme", "scm"),

    /**
     * TEXT_X_SED.
     */
    TEXT_X_SED("text/x-sed", "sed"),

    /**
     * TEXT_X_SQL.
     */
    TEXT_X_SQL("text/x-sql", "sql"),

    /**
     * TEXT_X_SETEXT.
     */
    TEXT_X_SETEXT("text/x-setext", "etx"),

    /**
     * TEXT_X_STSRC.
     */
    TEXT_X_STSRC("text/x-stsrc", "st"),

    /**
     * TEXT_X_TCL.
     */
    TEXT_X_TCL("text/x-tcl", "itk", "tcl", "tk"),

    /**
     * TEXT_X_TIKA_TEXT_BASED_MESSAGE.
     */
    TEXT_X_TIKA_TEXT_BASED_MESSAGE("text/x-tika-text-based-message"),

    /**
     * TEXT_X_UUENCODE.
     */
    TEXT_X_UUENCODE("text/x-uuencode", "uu"),

    /**
     * TEXT_X_VBASIC.
     */
    TEXT_X_VBASIC("text/x-vbasic", "cls", "Cls", "CLS", "frm", "Frm", "FRM"),

    /**
     * TEXT_X_VBDOTNET.
     */
    TEXT_X_VBDOTNET("text/x-vbdotnet", "vb"),

    /**
     * TEXT_X_VBSCRIPT.
     */
    TEXT_X_VBSCRIPT("text/x-vbscript", "vbs"),

    /**
     * TEXT_X_VCALENDAR.
     */
    TEXT_X_VCALENDAR("text/x-vcalendar", "vcs"),

    /**
     * TEXT_X_VCARD.
     */
    TEXT_X_VCARD("text/x-vcard", "vcf"),

    /**
     * TEXT_X_VERILOG.
     */
    TEXT_X_VERILOG("text/x-verilog", "v"),

    /**
     * TEXT_X_VHDL.
     */
    TEXT_X_VHDL("text/x-vhdl", "vhd", "vhdl"),

    /**
     * TEXT_X_WEB_MARKDOWN.
     */
    TEXT_X_WEB_MARKDOWN("text/x-web-markdown", "md", "mdtext", "mkd", "markdown"),

    /**
     * TEXT_X_YACC.
     */
    TEXT_X_YACC("text/x-yacc", "y"),

    /**
     * TEXT_X_YAML.
     */
    TEXT_X_YAML("text/x-yaml", "yaml"),

    /**
     * VIDEO_3GPP.
     */
    VIDEO_3GPP("video/3gpp", "3gp"),

    /**
     * VIDEO_3GPP_TT.
     */
    VIDEO_3GPP_TT("video/3gpp-tt"),

    /**
     * VIDEO_3GPP2.
     */
    VIDEO_3GPP2("video/3gpp2", "3g2"),

    /**
     * VIDEO_BMPEG.
     */
    VIDEO_BMPEG("video/bmpeg"),

    /**
     * VIDEO_BT656.
     */
    VIDEO_BT656("video/bt656"),

    /**
     * VIDEO_CELB.
     */
    VIDEO_CELB("video/celb"),

    /**
     * VIDEO_DV.
     */
    VIDEO_DV("video/dv"),

    /**
     * VIDEO_EXAMPLE.
     */
    VIDEO_EXAMPLE("video/example"),

    /**
     * VIDEO_H261.
     */
    VIDEO_H261("video/h261", "h261"),

    /**
     * VIDEO_H263.
     */
    VIDEO_H263("video/h263", "h263"),

    /**
     * VIDEO_H263_1998.
     */
    VIDEO_H263_1998("video/h263-1998"),

    /**
     * VIDEO_H263_2000.
     */
    VIDEO_H263_2000("video/h263-2000"),

    /**
     * VIDEO_H264.
     */
    VIDEO_H264("video/h264", "h264"),

    /**
     * VIDEO_JPEG.
     */
    VIDEO_JPEG("video/jpeg", "jpgv"),

    /**
     * VIDEO_JPEG2000.
     */
    VIDEO_JPEG2000("video/jpeg2000"),

    /**
     * VIDEO_MJ2.
     */
    VIDEO_MJ2("video/mj2", "mj2", "mjp2"),

    /**
     * VIDEO_MP1S.
     */
    VIDEO_MP1S("video/mp1s"),

    /**
     * VIDEO_MP2P.
     */
    VIDEO_MP2P("video/mp2p"),

    /**
     * VIDEO_MP2T.
     */
    VIDEO_MP2T("video/mp2t"),

    /**
     * VIDEO_MP4.
     */
    VIDEO_MP4("video/mp4", "mp4", "mp4v", "mpg4"),

    /**
     * VIDEO_MP4V_ES.
     */
    VIDEO_MP4V_ES("video/mp4v-es"),

    /**
     * VIDEO_MPEG.
     */
    VIDEO_MPEG("video/mpeg", "mpeg", "mpg", "mpe", "m1v", "m2v"),

    /**
     * VIDEO_MPEG4_GENERIC.
     */
    VIDEO_MPEG4_GENERIC("video/mpeg4-generic"),

    /**
     * VIDEO_MPV.
     */
    VIDEO_MPV("video/mpv"),

    /**
     * VIDEO_NV.
     */
    VIDEO_NV("video/nv"),

    /**
     * VIDEO_OGG.
     */
    VIDEO_OGG("video/ogg", "ogv"),

    /**
     * VIDEO_DAALA.
     */
    VIDEO_DAALA("video/daala"),

    /**
     * VIDEO_THEORA.
     */
    VIDEO_THEORA("video/theora"),

    /**
     * VIDEO_X_DIRAC.
     */
    VIDEO_X_DIRAC("video/x-dirac", "drc"),

    /**
     * VIDEO_X_OGM.
     */
    VIDEO_X_OGM("video/x-ogm", "ogm"),

    /**
     * VIDEO_X_OGGUVS.
     */
    VIDEO_X_OGGUVS("video/x-ogguvs"),

    /**
     * VIDEO_X_OGGYUV.
     */
    VIDEO_X_OGGYUV("video/x-oggyuv"),

    /**
     * VIDEO_X_OGGRGB.
     */
    VIDEO_X_OGGRGB("video/x-oggrgb"),

    /**
     * VIDEO_PARITYFEC.
     */
    VIDEO_PARITYFEC("video/parityfec"),

    /**
     * VIDEO_POINTER.
     */
    VIDEO_POINTER("video/pointer"),

    /**
     * VIDEO_QUICKTIME.
     */
    VIDEO_QUICKTIME("video/quicktime", "qt", "mov"),

    /**
     * VIDEO_RAW.
     */
    VIDEO_RAW("video/raw"),

    /**
     * VIDEO_RTP_ENC_AESCM128.
     */
    VIDEO_RTP_ENC_AESCM128("video/rtp-enc-aescm128"),

    /**
     * VIDEO_RTX.
     */
    VIDEO_RTX("video/rtx"),

    /**
     * VIDEO_SMPTE292M.
     */
    VIDEO_SMPTE292M("video/smpte292m"),

    /**
     * VIDEO_ULPFEC.
     */
    VIDEO_ULPFEC("video/ulpfec"),

    /**
     * VIDEO_VC1.
     */
    VIDEO_VC1("video/vc1"),

    /**
     * VIDEO_VND_DOT_CCTV.
     */
    VIDEO_VND_DOT_CCTV("video/vnd.cctv"),

    /**
     * VIDEO_VND_DOT_DLNA_DOT_MPEG_TTS.
     */
    VIDEO_VND_DOT_DLNA_DOT_MPEG_TTS("video/vnd.dlna.mpeg-tts"),

    /**
     * VIDEO_VND_DOT_FVT.
     */
    VIDEO_VND_DOT_FVT("video/vnd.fvt", "fvt"),

    /**
     * VIDEO_VND_DOT_HNS_DOT_VIDEO.
     */
    VIDEO_VND_DOT_HNS_DOT_VIDEO("video/vnd.hns.video"),

    /**
     * VIDEO_VND_DOT_IPTVFORUM_DOT_1DPARITYFEC_1010.
     */
    VIDEO_VND_DOT_IPTVFORUM_DOT_1DPARITYFEC_1010("video/vnd.iptvforum.1dparityfec-1010"),

    /**
     * VIDEO_VND_DOT_IPTVFORUM_DOT_1DPARITYFEC_2005.
     */
    VIDEO_VND_DOT_IPTVFORUM_DOT_1DPARITYFEC_2005("video/vnd.iptvforum.1dparityfec-2005"),

    /**
     * VIDEO_VND_DOT_IPTVFORUM_DOT_2DPARITYFEC_1010.
     */
    VIDEO_VND_DOT_IPTVFORUM_DOT_2DPARITYFEC_1010("video/vnd.iptvforum.2dparityfec-1010"),

    /**
     * VIDEO_VND_DOT_IPTVFORUM_DOT_2DPARITYFEC_2005.
     */
    VIDEO_VND_DOT_IPTVFORUM_DOT_2DPARITYFEC_2005("video/vnd.iptvforum.2dparityfec-2005"),

    /**
     * VIDEO_VND_DOT_IPTVFORUM_DOT_TTSAVC.
     */
    VIDEO_VND_DOT_IPTVFORUM_DOT_TTSAVC("video/vnd.iptvforum.ttsavc"),

    /**
     * VIDEO_VND_DOT_IPTVFORUM_DOT_TTSMPEG2.
     */
    VIDEO_VND_DOT_IPTVFORUM_DOT_TTSMPEG2("video/vnd.iptvforum.ttsmpeg2"),

    /**
     * VIDEO_VND_DOT_MOTOROLA_DOT_VIDEO.
     */
    VIDEO_VND_DOT_MOTOROLA_DOT_VIDEO("video/vnd.motorola.video"),

    /**
     * VIDEO_VND_DOT_MOTOROLA_DOT_VIDEOP.
     */
    VIDEO_VND_DOT_MOTOROLA_DOT_VIDEOP("video/vnd.motorola.videop"),

    /**
     * VIDEO_VND_DOT_MPEGURL.
     */
    VIDEO_VND_DOT_MPEGURL("video/vnd.mpegurl", "mxu", "m4u"),

    /**
     * VIDEO_VND_DOT_MS_PLAYREADY_DOT_MEDIA_DOT_PYV.
     */
    VIDEO_VND_DOT_MS_PLAYREADY_DOT_MEDIA_DOT_PYV("video/vnd.ms-playready.media.pyv", "pyv"),

    /**
     * VIDEO_VND_DOT_NOKIA_DOT_INTERLEAVED_MULTIMEDIA.
     */
    VIDEO_VND_DOT_NOKIA_DOT_INTERLEAVED_MULTIMEDIA("video/vnd.nokia.interleaved-multimedia"),

    /**
     * VIDEO_VND_DOT_NOKIA_DOT_VIDEOVOIP.
     */
    VIDEO_VND_DOT_NOKIA_DOT_VIDEOVOIP("video/vnd.nokia.videovoip"),

    /**
     * VIDEO_VND_DOT_OBJECTVIDEO.
     */
    VIDEO_VND_DOT_OBJECTVIDEO("video/vnd.objectvideo"),

    /**
     * VIDEO_VND_DOT_SEALED_DOT_MPEG1.
     */
    VIDEO_VND_DOT_SEALED_DOT_MPEG1("video/vnd.sealed.mpeg1"),

    /**
     * VIDEO_VND_DOT_SEALED_DOT_MPEG4.
     */
    VIDEO_VND_DOT_SEALED_DOT_MPEG4("video/vnd.sealed.mpeg4"),

    /**
     * VIDEO_VND_DOT_SEALED_DOT_SWF.
     */
    VIDEO_VND_DOT_SEALED_DOT_SWF("video/vnd.sealed.swf"),

    /**
     * VIDEO_VND_DOT_SEALEDMEDIA_DOT_SOFTSEAL_DOT_MOV.
     */
    VIDEO_VND_DOT_SEALEDMEDIA_DOT_SOFTSEAL_DOT_MOV("video/vnd.sealedmedia.softseal.mov"),

    /**
     * VIDEO_VND_DOT_VIVO.
     */
    VIDEO_VND_DOT_VIVO("video/vnd.vivo", "viv"),

    /**
     * VIDEO_X_F4V.
     */
    VIDEO_X_F4V("video/x-f4v", "f4v"),

    /**
     * VIDEO_X_FLC.
     */
    VIDEO_X_FLC("video/x-flc", "flc"),

    /**
     * VIDEO_X_FLI.
     */
    VIDEO_X_FLI("video/x-fli", "fli"),

    /**
     * VIDEO_X_FLV.
     */
    VIDEO_X_FLV("video/x-flv", "flv"),

    /**
     * VIDEO_X_JNG.
     */
    VIDEO_X_JNG("video/x-jng", "jng"),

    /**
     * VIDEO_X_M4V.
     */
    VIDEO_X_M4V("video/x-m4v", "m4v"),

    /**
     * VIDEO_X_MNG.
     */
    VIDEO_X_MNG("video/x-mng", "mng"),

    /**
     * VIDEO_X_MS_ASF.
     */
    VIDEO_X_MS_ASF("video/x-ms-asf", "asf", "asx"),

    /**
     * VIDEO_X_MS_WM.
     */
    VIDEO_X_MS_WM("video/x-ms-wm", "wm"),

    /**
     * VIDEO_X_MS_WMV.
     */
    VIDEO_X_MS_WMV("video/x-ms-wmv", "wmv"),

    /**
     * VIDEO_X_MS_WMX.
     */
    VIDEO_X_MS_WMX("video/x-ms-wmx", "wmx"),

    /**
     * VIDEO_X_MS_WVX.
     */
    VIDEO_X_MS_WVX("video/x-ms-wvx", "wvx"),

    /**
     * VIDEO_X_MSVIDEO.
     */
    VIDEO_X_MSVIDEO("video/x-msvideo", "avi"),

    /**
     * VIDEO_X_SGI_MOVIE.
     */
    VIDEO_X_SGI_MOVIE("video/x-sgi-movie", "movie"),

    /**
     * APPLICATION_X_MATROSKA.
     */
    APPLICATION_X_MATROSKA("application/x-matroska"),

    /**
     * VIDEO_X_MATROSKA.
     */
    VIDEO_X_MATROSKA("video/x-matroska", "mkv"),

    /**
     * AUDIO_X_MATROSKA.
     */
    AUDIO_X_MATROSKA("audio/x-matroska", "mka"),

    /**
     * VIDEO_WEBM.
     */
    VIDEO_WEBM("video/webm", "webm"),

    /**
     * X_CONFERENCE_X_COOLTALK.
     */
    X_CONFERENCE_X_COOLTALK("x-conference/x-cooltalk", "ice"),

    /**
     * APPLICATION_X_FICTIONBOOK_PLUS_XML.
     */
    APPLICATION_X_FICTIONBOOK_PLUS_XML("application/x-fictionbook+xml", "fb2"),

    /**
     * TEXT_X_ASCIIDOC.
     */
    TEXT_X_ASCIIDOC("text/x-asciidoc", "asciidoc", "adoc", "ad", "ad.txt", "adoc.txt"),

    /**
     * TEXT_X_D.
     */
    TEXT_X_D("text/x-d", "d"),

    /**
     * TEXT_X_HAML.
     */
    TEXT_X_HAML("text/x-haml", "haml"),

    /**
     * TEXT_X_HAXE.
     */
    TEXT_X_HAXE("text/x-haxe", "hx"),

    /**
     * TEXT_X_RSRC.
     */
    TEXT_X_RSRC("text/x-rsrc", "r"),

    /**
     * UNKNOWN.
     */
    UNKNOWN("");

    @NonNull
    private final String value;
    @NonNull
    private List<@NonNull String> extensionsList;
    private final boolean isImage;
    private final boolean isAudio;
    private final boolean isText;
    private final boolean isVideo;

    MimeType(@NonNull final String value, @NonNull String @NonNull... extensions) {
        this.value = value;
        this.extensionsList = Arrays.asList(extensions);
        this.isImage = value.startsWith("image/");
        this.isAudio = value.startsWith("audio/");
        this.isText = value.startsWith("text/");
        this.isVideo = value.startsWith("video/");
    }

    /**
     * Get the value.
     * 
     * @return value.
     */
    @NonNull
    public final String getValue() {
        return this.value;
    }

    /**
     * Is MimeType of type image ?
     * 
     * @return <code>true</code> if MimeType of type image.
     */
    public final boolean isImage() {
        return this.isImage;
    }

    /**
     * Is MimeType of type audio ?
     * 
     * @return <code>true</code> if MimeType of type audio.
     */
    public final boolean isAudio() {
        return this.isAudio;
    }

    /**
     * Is MimeType of type text ?
     * 
     * @return <code>true</code> if MimeType of type text.
     */
    public final boolean isText() {
        return this.isText;
    }

    /**
     * Is MimeType of type video ?
     * 
     * @return <code>true</code> if MimeType of type video.
     */
    public final boolean isVideo() {
        return this.isVideo;
    }

    /**
     * Get MimeType enum value corresponding to the given String mimeType.
     * 
     * @param mimeType
     * @return MimeType
     */
    @NonNull
    public static final MimeType getMimeType(@Nullable final String mimeType) {
        if (mimeType == null) {
            return UNKNOWN;
        } else {
            for (final MimeType e : MimeType.values()) {
                if (mimeType.equals(e.getValue())) {
                    return e;
                }
            }
        }
        return UNKNOWN;
    }

    /**
     * Get MimeType enum value corresponding to the given String extension.
     * 
     * @param extension
     * @return MimeType
     */
    @NonNull
    public static final MimeType getMimeTypeByExtension(@Nullable final String extension) {
        if (extension == null || extension.length() == 0) {
            return UNKNOWN;
        } else {
            for (final MimeType e : MimeType.values()) {
                final List<@NonNull String> extensionsList = e.getExtensionsList();
                for (final @NonNull String ext : extensionsList) {
                    if (ext.toLowerCase().equals(extension.toLowerCase())) {
                        return e;
                    }
                }
            }
        }
        return UNKNOWN;
    }

    /**
     * Get the extensions list.
     * 
     * @return the extensionsList.
     */
    @NonNull
    public final List<@NonNull String> getExtensionsList() {
        return this.extensionsList;
    }

}

