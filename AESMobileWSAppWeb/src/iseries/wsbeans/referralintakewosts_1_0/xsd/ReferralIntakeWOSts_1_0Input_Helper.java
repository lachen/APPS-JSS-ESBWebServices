/**
 * ReferralIntakeWOSts_1_0Input_Helper.java
 *
 * This file was auto-generated from WSDL
 * by the IBM Web services WSDL2Java emitter.
 * cf070942.33 v102309233842
 */

package iseries.wsbeans.referralintakewosts_1_0.xsd;

public class ReferralIntakeWOSts_1_0Input_Helper {
    // Type metadata
    private static final com.ibm.ws.webservices.engine.description.TypeDesc typeDesc =
        new com.ibm.ws.webservices.engine.description.TypeDesc(ReferralIntakeWOSts_1_0Input.class);

    static {
        typeDesc.setOption("buildNum","cf070942.33");
        com.ibm.ws.webservices.engine.description.FieldDesc field = new com.ibm.ws.webservices.engine.description.ElementDesc();
        field.setFieldName("_BusinessUnit");
        field.setXmlName(com.ibm.ws.webservices.engine.utils.QNameTable.createQName("http://referralintakewosts_1_0.wsbeans.iseries/xsd", "_BusinessUnit"));
        field.setXmlType(com.ibm.ws.webservices.engine.utils.QNameTable.createQName("http://www.w3.org/2001/XMLSchema", "string"));
        field.setMinOccursIs0(true);
        typeDesc.addFieldDesc(field);
        field = new com.ibm.ws.webservices.engine.description.ElementDesc();
        field.setFieldName("_FromDate");
        field.setXmlName(com.ibm.ws.webservices.engine.utils.QNameTable.createQName("http://referralintakewosts_1_0.wsbeans.iseries/xsd", "_FromDate"));
        field.setXmlType(com.ibm.ws.webservices.engine.utils.QNameTable.createQName("http://www.w3.org/2001/XMLSchema", "string"));
        field.setMinOccursIs0(true);
        typeDesc.addFieldDesc(field);
        field = new com.ibm.ws.webservices.engine.description.ElementDesc();
        field.setFieldName("_IntakeStartSeq");
        field.setXmlName(com.ibm.ws.webservices.engine.utils.QNameTable.createQName("http://referralintakewosts_1_0.wsbeans.iseries/xsd", "_IntakeStartSeq"));
        field.setXmlType(com.ibm.ws.webservices.engine.utils.QNameTable.createQName("http://www.w3.org/2001/XMLSchema", "decimal"));
        field.setMinOccursIs0(true);
        typeDesc.addFieldDesc(field);
        field = new com.ibm.ws.webservices.engine.description.ElementDesc();
        field.setFieldName("_ReferralZipCode");
        field.setXmlName(com.ibm.ws.webservices.engine.utils.QNameTable.createQName("http://referralintakewosts_1_0.wsbeans.iseries/xsd", "_ReferralZipCode"));
        field.setXmlType(com.ibm.ws.webservices.engine.utils.QNameTable.createQName("http://www.w3.org/2001/XMLSchema", "string"));
        field.setMinOccursIs0(true);
        typeDesc.addFieldDesc(field);
        field = new com.ibm.ws.webservices.engine.description.ElementDesc();
        field.setFieldName("_ToDate");
        field.setXmlName(com.ibm.ws.webservices.engine.utils.QNameTable.createQName("http://referralintakewosts_1_0.wsbeans.iseries/xsd", "_ToDate"));
        field.setXmlType(com.ibm.ws.webservices.engine.utils.QNameTable.createQName("http://www.w3.org/2001/XMLSchema", "string"));
        field.setMinOccursIs0(true);
        typeDesc.addFieldDesc(field);
    };

    /**
     * Return type metadata object
     */
    public static com.ibm.ws.webservices.engine.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static com.ibm.ws.webservices.engine.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class javaType,  
           javax.xml.namespace.QName xmlType) {
        return 
          new ReferralIntakeWOSts_1_0Input_Ser(
            javaType, xmlType, typeDesc);
    };

    /**
     * Get Custom Deserializer
     */
    public static com.ibm.ws.webservices.engine.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class javaType,  
           javax.xml.namespace.QName xmlType) {
        return 
          new ReferralIntakeWOSts_1_0Input_Deser(
            javaType, xmlType, typeDesc);
    };

}
