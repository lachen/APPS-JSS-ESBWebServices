/**
 * AES_MB_IntakeWOList_Result_Helper.java
 *
 * This file was auto-generated from WSDL
 * by the IBM Web services WSDL2Java emitter.
 * cf070942.33 v102309233842
 */

package AES_MB_IntakeWOList_Lib_1_0;

public class AES_MB_IntakeWOList_Result_Helper {
    // Type metadata
    private static final com.ibm.ws.webservices.engine.description.TypeDesc typeDesc =
        new com.ibm.ws.webservices.engine.description.TypeDesc(AES_MB_IntakeWOList_Result.class);

    static {
        typeDesc.setOption("buildNum","cf070942.33");
        com.ibm.ws.webservices.engine.description.FieldDesc field = new com.ibm.ws.webservices.engine.description.ElementDesc();
        field.setFieldName("intake");
        field.setXmlName(com.ibm.ws.webservices.engine.utils.QNameTable.createQName("", "Intake"));
        field.setXmlType(com.ibm.ws.webservices.engine.utils.QNameTable.createQName("http://AES_MB_IntakeWOList_Lib_1_0/com/apria/services/aes/workorderdetails/beans", "Intake"));
        field.setMinOccursIs0(true);
        field.setMaxOccurs(true);
        typeDesc.addFieldDesc(field);
        field = new com.ibm.ws.webservices.engine.description.ElementDesc();
        field.setFieldName("intakeCount");
        field.setXmlName(com.ibm.ws.webservices.engine.utils.QNameTable.createQName("", "IntakeCount"));
        field.setXmlType(com.ibm.ws.webservices.engine.utils.QNameTable.createQName("http://www.w3.org/2001/XMLSchema", "string"));
        field.setMinOccursIs0(true);
        typeDesc.addFieldDesc(field);
        field = new com.ibm.ws.webservices.engine.description.ElementDesc();
        field.setFieldName("intakeOverFlow");
        field.setXmlName(com.ibm.ws.webservices.engine.utils.QNameTable.createQName("", "IntakeOverFlow"));
        field.setXmlType(com.ibm.ws.webservices.engine.utils.QNameTable.createQName("http://www.w3.org/2001/XMLSchema", "string"));
        field.setMinOccursIs0(true);
        typeDesc.addFieldDesc(field);
        field = new com.ibm.ws.webservices.engine.description.ElementDesc();
        field.setFieldName("recCount");
        field.setXmlName(com.ibm.ws.webservices.engine.utils.QNameTable.createQName("", "RecCount"));
        field.setXmlType(com.ibm.ws.webservices.engine.utils.QNameTable.createQName("http://www.w3.org/2001/XMLSchema", "string"));
        field.setMinOccursIs0(true);
        typeDesc.addFieldDesc(field);
        field = new com.ibm.ws.webservices.engine.description.ElementDesc();
        field.setFieldName("recStatus");
        field.setXmlName(com.ibm.ws.webservices.engine.utils.QNameTable.createQName("", "RecStatus"));
        field.setXmlType(com.ibm.ws.webservices.engine.utils.QNameTable.createQName("http://www.w3.org/2001/XMLSchema", "string"));
        field.setMinOccursIs0(true);
        typeDesc.addFieldDesc(field);
        field = new com.ibm.ws.webservices.engine.description.ElementDesc();
        field.setFieldName("WOCount");
        field.setXmlName(com.ibm.ws.webservices.engine.utils.QNameTable.createQName("", "WOCount"));
        field.setXmlType(com.ibm.ws.webservices.engine.utils.QNameTable.createQName("http://www.w3.org/2001/XMLSchema", "string"));
        field.setMinOccursIs0(true);
        typeDesc.addFieldDesc(field);
        field = new com.ibm.ws.webservices.engine.description.ElementDesc();
        field.setFieldName("workOrder");
        field.setXmlName(com.ibm.ws.webservices.engine.utils.QNameTable.createQName("", "WorkOrder"));
        field.setXmlType(com.ibm.ws.webservices.engine.utils.QNameTable.createQName("http://AES_MB_IntakeWOList_Lib_1_0/com/apria/services/aes/workorderdetails/beans", "WorkOrder"));
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
          new AES_MB_IntakeWOList_Result_Ser(
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
          new AES_MB_IntakeWOList_Result_Deser(
            javaType, xmlType, typeDesc);
    };

}
