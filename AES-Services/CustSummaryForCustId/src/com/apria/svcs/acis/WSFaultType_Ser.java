/**
 * WSFaultType_Ser.java
 *
 * This file was auto-generated from WSDL
 * by the IBM Web services WSDL2Java emitter.
 * cf230909.32 v3909221945
 */

package com.apria.svcs.acis;

public class WSFaultType_Ser extends com.ibm.ws.webservices.engine.encoding.ser.BeanSerializer {
    /**
     * Constructor
     */
    public WSFaultType_Ser(
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
        WSFaultType bean = (WSFaultType) value;
        java.lang.Object propValue;
        javax.xml.namespace.QName propQName;
        {
          propQName = QName_0_5;
          propValue = bean.getMessage();
          if (propValue != null && !context.shouldSendXSIType()) {
            context.simpleElement(propQName, null, propValue.toString()); 
          } else {
            serializeChild(propQName, null, 
              propValue, 
              QName_1_4,
              true,null,context);
          }
          propQName = QName_0_6;
          propValue = bean.getType();
          if (propValue != null && !context.shouldSendXSIType()) {
            context.simpleElement(propQName, null, propValue.toString()); 
          } else {
            serializeChild(propQName, null, 
              propValue, 
              QName_1_4,
              true,null,context);
          }
          propQName = QName_0_7;
          propValue = bean.getCode();
          if (propValue != null && !context.shouldSendXSIType()) {
            context.simpleElement(propQName, null, propValue.toString()); 
          } else {
            serializeChild(propQName, null, 
              propValue, 
              QName_1_4,
              true,null,context);
          }
          propQName = QName_0_8;
          propValue = bean.getSeverity();
          if (propValue != null && !context.shouldSendXSIType()) {
            context.simpleElement(propQName, null, propValue.toString()); 
          } else {
            serializeChild(propQName, null, 
              propValue, 
              QName_1_4,
              true,null,context);
          }
          propQName = QName_0_9;
          propValue = bean.getState();
          if (propValue != null && !context.shouldSendXSIType()) {
            context.simpleElement(propQName, null, propValue.toString()); 
          } else {
            serializeChild(propQName, null, 
              propValue, 
              QName_1_4,
              true,null,context);
          }
          propQName = QName_0_10;
          propValue = bean.getExceptionState();
          if (propValue != null && !context.shouldSendXSIType()) {
            context.simpleElement(propQName, null, propValue.toString()); 
          } else {
            serializeChild(propQName, null, 
              propValue, 
              QName_1_4,
              true,null,context);
          }
        }
    }
    private final static javax.xml.namespace.QName QName_0_10 = 
           com.ibm.ws.webservices.engine.utils.QNameTable.createQName(
                  "",
                  "exceptionState");
    private final static javax.xml.namespace.QName QName_0_8 = 
           com.ibm.ws.webservices.engine.utils.QNameTable.createQName(
                  "",
                  "severity");
    private final static javax.xml.namespace.QName QName_0_6 = 
           com.ibm.ws.webservices.engine.utils.QNameTable.createQName(
                  "",
                  "type");
    private final static javax.xml.namespace.QName QName_0_7 = 
           com.ibm.ws.webservices.engine.utils.QNameTable.createQName(
                  "",
                  "code");
    private final static javax.xml.namespace.QName QName_0_5 = 
           com.ibm.ws.webservices.engine.utils.QNameTable.createQName(
                  "",
                  "message");
    private final static javax.xml.namespace.QName QName_1_4 = 
           com.ibm.ws.webservices.engine.utils.QNameTable.createQName(
                  "http://www.w3.org/2001/XMLSchema",
                  "string");
    private final static javax.xml.namespace.QName QName_0_9 = 
           com.ibm.ws.webservices.engine.utils.QNameTable.createQName(
                  "",
                  "state");
}
