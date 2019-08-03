/**
 * AES_MB_IntakeWOList_Exception_Ser.java
 *
 * This file was auto-generated from WSDL
 * by the IBM Web services WSDL2Java emitter.
 * cf070942.33 v102309233842
 */

package AES_MB_IntakeWOList_Lib_1_0;

public class AES_MB_IntakeWOList_Exception_Ser extends com.ibm.ws.webservices.engine.encoding.ser.BeanSerializer {
    /**
     * Constructor
     */
    public AES_MB_IntakeWOList_Exception_Ser(
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType, 
           com.ibm.ws.webservices.engine.description.TypeDesc _typeDesc) {
        super(_javaType, _xmlType, _typeDesc);
    }
    public void serialize(
        javax.xml.namespace.QName name,
        org.xml.sax.Attributes attributes,
        java.lang.Object value,
        com.ibm.ws.webservices.engine.encoding.SerializationContext context)
        throws java.io.IOException
    {
        context.startElement(name, addAttributes(attributes, value, context));
        addElements(value, context);
        context.endElement();
    }
    protected org.xml.sax.Attributes addAttributes(
        org.xml.sax.Attributes attributes,
        java.lang.Object value,
        com.ibm.ws.webservices.engine.encoding.SerializationContext context)
        throws java.io.IOException
    {
        return attributes;
    }
    protected void addElements(
        java.lang.Object value,
        com.ibm.ws.webservices.engine.encoding.SerializationContext context)
        throws java.io.IOException
    {
        AES_MB_IntakeWOList_Exception bean = (AES_MB_IntakeWOList_Exception) value;
        java.lang.Object propValue;
        javax.xml.namespace.QName propQName;
        {
          propQName = QName_0_14;
          propValue = bean.getRequestBO();
          serializeChild(propQName, null, 
              propValue, 
              QName_2_16,
              false,null,context);
          propQName = QName_0_15;
          propValue = bean.getExceptionMessage();
          if (propValue != null && !context.shouldSendXSIType()) {
            context.simpleElement(propQName, null, propValue.toString()); 
          } else {
            serializeChild(propQName, null, 
              propValue, 
              QName_1_6,
              false,null,context);
          }
        }
    }
    private final static javax.xml.namespace.QName QName_0_15 = 
           com.ibm.ws.webservices.engine.utils.QNameTable.createQName(
                  "",
                  "exceptionMessage");
    private final static javax.xml.namespace.QName QName_0_14 = 
           com.ibm.ws.webservices.engine.utils.QNameTable.createQName(
                  "",
                  "requestBO");
    private final static javax.xml.namespace.QName QName_2_16 = 
           com.ibm.ws.webservices.engine.utils.QNameTable.createQName(
                  "http://AES_MB_IntakeWOList_Lib_1_0/com/apria/services/aes/workorderdetails/beans",
                  "AES_MB_IntakeWOList_Request");
    private final static javax.xml.namespace.QName QName_1_6 = 
           com.ibm.ws.webservices.engine.utils.QNameTable.createQName(
                  "http://www.w3.org/2001/XMLSchema",
                  "string");
}
