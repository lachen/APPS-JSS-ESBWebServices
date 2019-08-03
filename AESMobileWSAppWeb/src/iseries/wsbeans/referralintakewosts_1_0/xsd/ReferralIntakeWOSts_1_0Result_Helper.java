/**
 * ReferralIntakeWOSts_1_0Result_Helper.java
 *
 * This file was auto-generated from WSDL
 * by the IBM Web services WSDL2Java emitter.
 * cf070942.33 v102309233842
 */

package iseries.wsbeans.referralintakewosts_1_0.xsd;

public class ReferralIntakeWOSts_1_0Result_Helper {
    // Type metadata
    private static final com.ibm.ws.webservices.engine.description.TypeDesc typeDesc =
        new com.ibm.ws.webservices.engine.description.TypeDesc(ReferralIntakeWOSts_1_0Result.class);

    static {
        typeDesc.setOption("buildNum","cf070942.33");
        com.ibm.ws.webservices.engine.description.FieldDesc field = new com.ibm.ws.webservices.engine.description.ElementDesc();
        field.setFieldName("_Intake");
        field.setXmlName(com.ibm.ws.webservices.engine.utils.QNameTable.createQName("http://referralintakewosts_1_0.wsbeans.iseries/xsd", "_Intake"));
        field.setXmlType(com.ibm.ws.webservices.engine.utils.QNameTable.createQName("http://referralintakewosts_1_0.wsbeans.iseries/xsd", "Intake"));
        field.setMinOccursIs0(true);
        field.setMaxOccurs(true);
        typeDesc.addFieldDesc(field);
        field = new com.ibm.ws.webservices.engine.description.ElementDesc();
        field.setFieldName("_IntakeCount");
        field.setXmlName(com.ibm.ws.webservices.engine.utils.QNameTable.createQName("http://referralintakewosts_1_0.wsbeans.iseries/xsd", "_IntakeCount"));
        field.setXmlType(com.ibm.ws.webservices.engine.utils.QNameTable.createQName("http://www.w3.org/2001/XMLSchema", "decimal"));
        field.setMinOccursIs0(true);
        typeDesc.addFieldDesc(field);
        field = new com.ibm.ws.webservices.engine.description.ElementDesc();
        field.setFieldName("_IntakeOverflow");
        field.setXmlName(com.ibm.ws.webservices.engine.utils.QNameTable.createQName("http://referralintakewosts_1_0.wsbeans.iseries/xsd", "_IntakeOverflow"));
        field.setXmlType(com.ibm.ws.webservices.engine.utils.QNameTable.createQName("http://www.w3.org/2001/XMLSchema", "decimal"));
        field.setMinOccursIs0(true);
        typeDesc.addFieldDesc(field);
        field = new com.ibm.ws.webservices.engine.description.ElementDesc();
        field.setFieldName("_RecCount");
        field.setXmlName(com.ibm.ws.webservices.engine.utils.QNameTable.createQName("http://referralintakewosts_1_0.wsbeans.iseries/xsd", "_RecCount"));
        field.setXmlType(com.ibm.ws.webservices.engine.utils.QNameTable.createQName("http://www.w3.org/2001/XMLSchema", "decimal"));
        field.setMinOccursIs0(true);
        typeDesc.addFieldDesc(field);
        field = new com.ibm.ws.webservices.engine.description.ElementDesc();
        field.setFieldName("_RecStatus");
        field.setXmlName(com.ibm.ws.webservices.engine.utils.QNameTable.createQName("http://referralintakewosts_1_0.wsbeans.iseries/xsd", "_RecStatus"));
        field.setXmlType(com.ibm.ws.webservices.engine.utils.QNameTable.createQName("http://www.w3.org/2001/XMLSchema", "string"));
        field.setMinOccursIs0(true);
        typeDesc.addFieldDesc(field);
        field = new com.ibm.ws.webservices.engine.description.ElementDesc();
        field.setFieldName("_WOCount");
        field.setXmlName(com.ibm.ws.webservices.engine.utils.QNameTable.createQName("http://referralintakewosts_1_0.wsbeans.iseries/xsd", "_WOCount"));
        field.setXmlType(com.ibm.ws.webservices.engine.utils.QNameTable.createQName("http://www.w3.org/2001/XMLSchema", "decimal"));
        field.setMinOccursIs0(true);
        typeDesc.addFieldDesc(field);
        field = new com.ibm.ws.webservices.engine.description.ElementDesc();
        field.setFieldName("_WorkOrder");
        field.setXmlName(com.ibm.ws.webservices.engine.utils.QNameTable.createQName("http://referralintakewosts_1_0.wsbeans.iseries/xsd", "_WorkOrder"));
        field.setXmlType(com.ibm.ws.webservices.engine.utils.QNameTable.createQName("http://referralintakewosts_1_0.wsbeans.iseries/xsd", "WorkOrder"));
        field.setMinOccursIs0(true);
        field.setMaxOccurs(true);
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
          new ReferralIntakeWOSts_1_0Result_Ser(
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
          new ReferralIntakeWOSts_1_0Result_Deser(
            javaType, xmlType, typeDesc);
    };

}
