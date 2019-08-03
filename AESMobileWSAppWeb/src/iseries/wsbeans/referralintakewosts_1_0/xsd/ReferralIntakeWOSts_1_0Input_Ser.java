/**
 * ReferralIntakeWOSts_1_0Input_Ser.java
 *
 * This file was auto-generated from WSDL
 * by the IBM Web services WSDL2Java emitter.
 * cf070942.33 v102309233842
 */

package iseries.wsbeans.referralintakewosts_1_0.xsd;

public class ReferralIntakeWOSts_1_0Input_Ser extends com.ibm.ws.webservices.engine.encoding.ser.BeanSerializer {
    /**
     * Constructor
     */
    public ReferralIntakeWOSts_1_0Input_Ser(
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
           elemQName = QName_3_15;
           context.qName2String(elemQName, true);
           elemQName = QName_3_16;
           context.qName2String(elemQName, true);
           elemQName = QName_3_17;
           context.qName2String(elemQName, true);
           elemQName = QName_3_18;
           context.qName2String(elemQName, true);
           elemQName = QName_3_19;
           context.qName2String(elemQName, true);
        return attributes;
    }
    protected void addElements(
        java.lang.Object value,
        com.ibm.ws.webservices.engine.encoding.SerializationContext context)
        throws java.io.IOException
    {
        ReferralIntakeWOSts_1_0Input bean = (ReferralIntakeWOSts_1_0Input) value;
        java.lang.Object propValue;
        javax.xml.namespace.QName propQName;
        {
          propQName = QName_3_15;
          propValue = bean.get_BusinessUnit();
          if (propValue != null && !context.shouldSendXSIType()) {
            context.simpleElement(propQName, null, propValue.toString()); 
          } else {
            serializeChild(propQName, null, 
              propValue, 
              QName_1_8,
              false,null,context);
          }
          propQName = QName_3_16;
          propValue = bean.get_FromDate();
          if (propValue != null && !context.shouldSendXSIType()) {
            context.simpleElement(propQName, null, propValue.toString()); 
          } else {
            serializeChild(propQName, null, 
              propValue, 
              QName_1_8,
              false,null,context);
          }
          propQName = QName_3_17;
          propValue = bean.get_IntakeStartSeq();
          serializeChild(propQName, null, 
              propValue, 
              QName_1_20,
              false,null,context);
          propQName = QName_3_18;
          propValue = bean.get_ReferralZipCode();
          if (propValue != null && !context.shouldSendXSIType()) {
            context.simpleElement(propQName, null, propValue.toString()); 
          } else {
            serializeChild(propQName, null, 
              propValue, 
              QName_1_8,
              false,null,context);
          }
          propQName = QName_3_19;
          propValue = bean.get_ToDate();
          if (propValue != null && !context.shouldSendXSIType()) {
            context.simpleElement(propQName, null, propValue.toString()); 
          } else {
            serializeChild(propQName, null, 
              propValue, 
              QName_1_8,
              false,null,context);
          }
        }
    }
    private final static javax.xml.namespace.QName QName_3_19 = 
           com.ibm.ws.webservices.engine.utils.QNameTable.createQName(
                  "http://referralintakewosts_1_0.wsbeans.iseries/xsd",
                  "_ToDate");
    private final static javax.xml.namespace.QName QName_3_18 = 
           com.ibm.ws.webservices.engine.utils.QNameTable.createQName(
                  "http://referralintakewosts_1_0.wsbeans.iseries/xsd",
                  "_ReferralZipCode");
    private final static javax.xml.namespace.QName QName_3_16 = 
           com.ibm.ws.webservices.engine.utils.QNameTable.createQName(
                  "http://referralintakewosts_1_0.wsbeans.iseries/xsd",
                  "_FromDate");
    private final static javax.xml.namespace.QName QName_1_20 = 
           com.ibm.ws.webservices.engine.utils.QNameTable.createQName(
                  "http://www.w3.org/2001/XMLSchema",
                  "decimal");
    private final static javax.xml.namespace.QName QName_3_17 = 
           com.ibm.ws.webservices.engine.utils.QNameTable.createQName(
                  "http://referralintakewosts_1_0.wsbeans.iseries/xsd",
                  "_IntakeStartSeq");
    private final static javax.xml.namespace.QName QName_1_8 = 
           com.ibm.ws.webservices.engine.utils.QNameTable.createQName(
                  "http://www.w3.org/2001/XMLSchema",
                  "string");
    private final static javax.xml.namespace.QName QName_3_15 = 
           com.ibm.ws.webservices.engine.utils.QNameTable.createQName(
                  "http://referralintakewosts_1_0.wsbeans.iseries/xsd",
                  "_BusinessUnit");
}
