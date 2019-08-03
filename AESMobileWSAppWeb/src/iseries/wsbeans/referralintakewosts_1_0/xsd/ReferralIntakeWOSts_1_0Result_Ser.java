/**
 * ReferralIntakeWOSts_1_0Result_Ser.java
 *
 * This file was auto-generated from WSDL
 * by the IBM Web services WSDL2Java emitter.
 * cf070942.33 v102309233842
 */

package iseries.wsbeans.referralintakewosts_1_0.xsd;

public class ReferralIntakeWOSts_1_0Result_Ser extends com.ibm.ws.webservices.engine.encoding.ser.BeanSerializer {
    /**
     * Constructor
     */
    public ReferralIntakeWOSts_1_0Result_Ser(
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
           elemQName = QName_3_21;
           context.qName2String(elemQName, true);
           elemQName = QName_3_22;
           context.qName2String(elemQName, true);
           elemQName = QName_3_23;
           context.qName2String(elemQName, true);
           elemQName = QName_3_24;
           context.qName2String(elemQName, true);
           elemQName = QName_3_25;
           context.qName2String(elemQName, true);
           elemQName = QName_3_26;
           context.qName2String(elemQName, true);
           elemQName = QName_3_27;
           context.qName2String(elemQName, true);
        return attributes;
    }
    protected void addElements(
        java.lang.Object value,
        com.ibm.ws.webservices.engine.encoding.SerializationContext context)
        throws java.io.IOException
    {
        ReferralIntakeWOSts_1_0Result bean = (ReferralIntakeWOSts_1_0Result) value;
        java.lang.Object propValue;
        javax.xml.namespace.QName propQName;
        {
          propQName = QName_3_21;
          {
            propValue = bean.get_Intake();
            if (propValue != null) {
              for (int i=0; i<java.lang.reflect.Array.getLength(propValue); i++) {
                serializeChild(propQName, null, 
                    java.lang.reflect.Array.get(propValue, i), 
                    QName_3_28,
                    true,null,context);
              }
            }
          }
          propQName = QName_3_22;
          propValue = bean.get_IntakeCount();
          serializeChild(propQName, null, 
              propValue, 
              QName_1_20,
              false,null,context);
          propQName = QName_3_23;
          propValue = bean.get_IntakeOverflow();
          serializeChild(propQName, null, 
              propValue, 
              QName_1_20,
              false,null,context);
          propQName = QName_3_24;
          propValue = bean.get_RecCount();
          serializeChild(propQName, null, 
              propValue, 
              QName_1_20,
              false,null,context);
          propQName = QName_3_25;
          propValue = bean.get_RecStatus();
          if (propValue != null && !context.shouldSendXSIType()) {
            context.simpleElement(propQName, null, propValue.toString()); 
          } else {
            serializeChild(propQName, null, 
              propValue, 
              QName_1_8,
              false,null,context);
          }
          propQName = QName_3_26;
          propValue = bean.get_WOCount();
          serializeChild(propQName, null, 
              propValue, 
              QName_1_20,
              false,null,context);
          propQName = QName_3_27;
          {
            propValue = bean.get_WorkOrder();
            if (propValue != null) {
              for (int i=0; i<java.lang.reflect.Array.getLength(propValue); i++) {
                serializeChild(propQName, null, 
                    java.lang.reflect.Array.get(propValue, i), 
                    QName_3_29,
                    true,null,context);
              }
            }
          }
        }
    }
    private final static javax.xml.namespace.QName QName_3_23 = 
           com.ibm.ws.webservices.engine.utils.QNameTable.createQName(
                  "http://referralintakewosts_1_0.wsbeans.iseries/xsd",
                  "_IntakeOverflow");
    private final static javax.xml.namespace.QName QName_3_25 = 
           com.ibm.ws.webservices.engine.utils.QNameTable.createQName(
                  "http://referralintakewosts_1_0.wsbeans.iseries/xsd",
                  "_RecStatus");
    private final static javax.xml.namespace.QName QName_3_24 = 
           com.ibm.ws.webservices.engine.utils.QNameTable.createQName(
                  "http://referralintakewosts_1_0.wsbeans.iseries/xsd",
                  "_RecCount");
    private final static javax.xml.namespace.QName QName_3_21 = 
           com.ibm.ws.webservices.engine.utils.QNameTable.createQName(
                  "http://referralintakewosts_1_0.wsbeans.iseries/xsd",
                  "_Intake");
    private final static javax.xml.namespace.QName QName_3_28 = 
           com.ibm.ws.webservices.engine.utils.QNameTable.createQName(
                  "http://referralintakewosts_1_0.wsbeans.iseries/xsd",
                  "Intake");
    private final static javax.xml.namespace.QName QName_1_20 = 
           com.ibm.ws.webservices.engine.utils.QNameTable.createQName(
                  "http://www.w3.org/2001/XMLSchema",
                  "decimal");
    private final static javax.xml.namespace.QName QName_3_22 = 
           com.ibm.ws.webservices.engine.utils.QNameTable.createQName(
                  "http://referralintakewosts_1_0.wsbeans.iseries/xsd",
                  "_IntakeCount");
    private final static javax.xml.namespace.QName QName_3_27 = 
           com.ibm.ws.webservices.engine.utils.QNameTable.createQName(
                  "http://referralintakewosts_1_0.wsbeans.iseries/xsd",
                  "_WorkOrder");
    private final static javax.xml.namespace.QName QName_1_8 = 
           com.ibm.ws.webservices.engine.utils.QNameTable.createQName(
                  "http://www.w3.org/2001/XMLSchema",
                  "string");
    private final static javax.xml.namespace.QName QName_3_29 = 
           com.ibm.ws.webservices.engine.utils.QNameTable.createQName(
                  "http://referralintakewosts_1_0.wsbeans.iseries/xsd",
                  "WorkOrder");
    private final static javax.xml.namespace.QName QName_3_26 = 
           com.ibm.ws.webservices.engine.utils.QNameTable.createQName(
                  "http://referralintakewosts_1_0.wsbeans.iseries/xsd",
                  "_WOCount");
}
