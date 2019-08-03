/**
 * MasterAgreement_Ser.java
 *
 * This file was auto-generated from WSDL
 * by the IBM Web services WSDL2Java emitter.
 * cf10631.06 v81706232132
 */

package com.apria.ws.payersvcs;

public class MasterAgreement_Ser extends com.ibm.ws.webservices.engine.encoding.ser.BeanSerializer {
    /**
     * Constructor
     */
    public MasterAgreement_Ser(
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
           javax.xml.namespace.QName
           elemQName = QName_0_24;
           context.qName2String(elemQName, true);
           elemQName = QName_0_25;
           context.qName2String(elemQName, true);
           elemQName = QName_0_26;
           context.qName2String(elemQName, true);
           elemQName = QName_0_27;
           context.qName2String(elemQName, true);
        return attributes;
    }
    protected void addElements(
        java.lang.Object value,
        com.ibm.ws.webservices.engine.encoding.SerializationContext context)
        throws java.io.IOException
    {
        MasterAgreement bean = (MasterAgreement) value;
        java.lang.Object propValue;
        javax.xml.namespace.QName propQName;
        {
          propQName = QName_0_24;
          propValue = bean.getIsMstrAgrmtValid();
          serializeChild(propQName, null, 
              propValue, 
              QName_1_28,
              true,null,context);
          propQName = QName_0_25;
          propValue = bean.getMstrAgrmtId();
          if (propValue != null && !context.shouldSendXSIType()) {
            context.simpleElement(propQName, null, propValue.toString()); 
          } else {
            serializeChild(propQName, null, 
              propValue, 
              QName_1_23,
              true,null,context);
          }
          propQName = QName_0_26;
          propValue = bean.getMstrAgrmtNm();
          if (propValue != null && !context.shouldSendXSIType()) {
            context.simpleElement(propQName, null, propValue.toString()); 
          } else {
            serializeChild(propQName, null, 
              propValue, 
              QName_1_23,
              true,null,context);
          }
          propQName = QName_0_27;
          propValue = bean.getMstrAgrmtUnqSk();
          if (propValue != null && !context.shouldSendXSIType()) {
            context.simpleElement(propQName, null, propValue.toString()); 
          } else {
            serializeChild(propQName, null, 
              propValue, 
              QName_1_23,
              true,null,context);
          }
        }
    }
    private final static javax.xml.namespace.QName QName_0_25 = 
           com.ibm.ws.webservices.engine.utils.QNameTable.createQName(
                  "http://payersvcs.ws.apria.com",
                  "mstrAgrmtId");
    private final static javax.xml.namespace.QName QName_0_24 = 
           com.ibm.ws.webservices.engine.utils.QNameTable.createQName(
                  "http://payersvcs.ws.apria.com",
                  "isMstrAgrmtValid");
    private final static javax.xml.namespace.QName QName_1_28 = 
           com.ibm.ws.webservices.engine.utils.QNameTable.createQName(
                  "http://www.w3.org/2001/XMLSchema",
                  "boolean");
    private final static javax.xml.namespace.QName QName_0_26 = 
           com.ibm.ws.webservices.engine.utils.QNameTable.createQName(
                  "http://payersvcs.ws.apria.com",
                  "mstrAgrmtNm");
    private final static javax.xml.namespace.QName QName_1_23 = 
           com.ibm.ws.webservices.engine.utils.QNameTable.createQName(
                  "http://www.w3.org/2001/XMLSchema",
                  "string");
    private final static javax.xml.namespace.QName QName_0_27 = 
           com.ibm.ws.webservices.engine.utils.QNameTable.createQName(
                  "http://payersvcs.ws.apria.com",
                  "mstrAgrmtUnqSk");
}
