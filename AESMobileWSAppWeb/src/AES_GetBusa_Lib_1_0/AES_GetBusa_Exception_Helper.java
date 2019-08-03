/**
 * AES_GetBusa_Exception_Helper.java
 *
 * This file was auto-generated from WSDL
 * by the IBM Web services WSDL2Java emitter.
 * cf070942.33 v102309233842
 */

package AES_GetBusa_Lib_1_0;

public class AES_GetBusa_Exception_Helper {
    // Type metadata
    private static final com.ibm.ws.webservices.engine.description.TypeDesc typeDesc =
        new com.ibm.ws.webservices.engine.description.TypeDesc(AES_GetBusa_Exception.class);

    static {
        typeDesc.setOption("buildNum","cf070942.33");
        com.ibm.ws.webservices.engine.description.FieldDesc field = new com.ibm.ws.webservices.engine.description.ElementDesc();
        field.setFieldName("requestBO");
        field.setXmlName(com.ibm.ws.webservices.engine.utils.QNameTable.createQName("", "RequestBO"));
        field.setXmlType(com.ibm.ws.webservices.engine.utils.QNameTable.createQName("http://AES_GetBusa_Lib_1_0/com/apria/services/aes/getbusa/beans", "AES_GetBusa_Request"));
        field.setMinOccursIs0(true);
        typeDesc.addFieldDesc(field);
        field = new com.ibm.ws.webservices.engine.description.ElementDesc();
        field.setFieldName("exceptionMessage");
        field.setXmlName(com.ibm.ws.webservices.engine.utils.QNameTable.createQName("", "ExceptionMessage"));
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
          new AES_GetBusa_Exception_Ser(
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
          new AES_GetBusa_Exception_Deser(
            javaType, xmlType, typeDesc);
    };

    public static java.lang.Object createProxy() {
      return new AES_GetBusa_Lib_1_0.AES_GetBusa_Exception_DeserProxy();
    }
}
