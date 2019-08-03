/**
 * Intake_Ser.java
 *
 * This file was auto-generated from WSDL
 * by the IBM Web services WSDL2Java emitter.
 * cf070942.33 v102309233842
 */

package iseries.wsbeans.referralintakewosts_1_0.xsd;

public class Intake_Ser extends com.ibm.ws.webservices.engine.encoding.ser.BeanSerializer {
    /**
     * Constructor
     */
    public Intake_Ser(
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
           elemQName = QName_3_30;
           context.qName2String(elemQName, true);
           elemQName = QName_3_31;
           context.qName2String(elemQName, true);
           elemQName = QName_3_32;
           context.qName2String(elemQName, true);
           elemQName = QName_3_33;
           context.qName2String(elemQName, true);
           elemQName = QName_3_34;
           context.qName2String(elemQName, true);
           elemQName = QName_3_35;
           context.qName2String(elemQName, true);
           elemQName = QName_3_36;
           context.qName2String(elemQName, true);
           elemQName = QName_3_37;
           context.qName2String(elemQName, true);
           elemQName = QName_3_38;
           context.qName2String(elemQName, true);
           elemQName = QName_3_39;
           context.qName2String(elemQName, true);
           elemQName = QName_3_40;
           context.qName2String(elemQName, true);
           elemQName = QName_3_41;
           context.qName2String(elemQName, true);
           elemQName = QName_3_42;
           context.qName2String(elemQName, true);
           elemQName = QName_3_43;
           context.qName2String(elemQName, true);
           elemQName = QName_3_44;
           context.qName2String(elemQName, true);
           elemQName = QName_3_45;
           context.qName2String(elemQName, true);
           elemQName = QName_3_18;
           context.qName2String(elemQName, true);
        return attributes;
    }
    protected void addElements(
        java.lang.Object value,
        com.ibm.ws.webservices.engine.encoding.SerializationContext context)
        throws java.io.IOException
    {
        Intake bean = (Intake) value;
        java.lang.Object propValue;
        javax.xml.namespace.QName propQName;
        {
          propQName = QName_3_30;
          propValue = bean.get_Associate();
          if (propValue != null && !context.shouldSendXSIType()) {
            context.simpleElement(propQName, null, propValue.toString()); 
          } else {
            serializeChild(propQName, null, 
              propValue, 
              QName_1_8,
              false,null,context);
          }
          propQName = QName_3_31;
          propValue = bean.get_FollowpCode();
          if (propValue != null && !context.shouldSendXSIType()) {
            context.simpleElement(propQName, null, propValue.toString()); 
          } else {
            serializeChild(propQName, null, 
              propValue, 
              QName_1_8,
              false,null,context);
          }
          propQName = QName_3_32;
          propValue = bean.get_IntakeCreateDate();
          if (propValue != null && !context.shouldSendXSIType()) {
            context.simpleElement(propQName, null, propValue.toString()); 
          } else {
            serializeChild(propQName, null, 
              propValue, 
              QName_1_8,
              false,null,context);
          }
          propQName = QName_3_33;
          propValue = bean.get_IntakeCreateTime();
          if (propValue != null && !context.shouldSendXSIType()) {
            context.simpleElement(propQName, null, propValue.toString()); 
          } else {
            serializeChild(propQName, null, 
              propValue, 
              QName_1_8,
              false,null,context);
          }
          propQName = QName_3_34;
          propValue = bean.get_IntakeStatus();
          if (propValue != null && !context.shouldSendXSIType()) {
            context.simpleElement(propQName, null, propValue.toString()); 
          } else {
            serializeChild(propQName, null, 
              propValue, 
              QName_1_8,
              false,null,context);
          }
          propQName = QName_3_35;
          propValue = bean.get_IntakeStatusDate();
          if (propValue != null && !context.shouldSendXSIType()) {
            context.simpleElement(propQName, null, propValue.toString()); 
          } else {
            serializeChild(propQName, null, 
              propValue, 
              QName_1_8,
              false,null,context);
          }
          propQName = QName_3_36;
          propValue = bean.get_IntakeStatusTime();
          if (propValue != null && !context.shouldSendXSIType()) {
            context.simpleElement(propQName, null, propValue.toString()); 
          } else {
            serializeChild(propQName, null, 
              propValue, 
              QName_1_8,
              false,null,context);
          }
          propQName = QName_3_37;
          propValue = bean.get_Intake_();
          serializeChild(propQName, null, 
              propValue, 
              QName_1_20,
              false,null,context);
          propQName = QName_3_38;
          propValue = bean.get_PatientFirstName();
          if (propValue != null && !context.shouldSendXSIType()) {
            context.simpleElement(propQName, null, propValue.toString()); 
          } else {
            serializeChild(propQName, null, 
              propValue, 
              QName_1_8,
              false,null,context);
          }
          propQName = QName_3_39;
          propValue = bean.get_PatientID();
          if (propValue != null && !context.shouldSendXSIType()) {
            context.simpleElement(propQName, null, propValue.toString()); 
          } else {
            serializeChild(propQName, null, 
              propValue, 
              QName_1_8,
              false,null,context);
          }
          propQName = QName_3_40;
          propValue = bean.get_PatientLastName();
          if (propValue != null && !context.shouldSendXSIType()) {
            context.simpleElement(propQName, null, propValue.toString()); 
          } else {
            serializeChild(propQName, null, 
              propValue, 
              QName_1_8,
              false,null,context);
          }
          propQName = QName_3_41;
          propValue = bean.get_PatientMI();
          if (propValue != null && !context.shouldSendXSIType()) {
            context.simpleElement(propQName, null, propValue.toString()); 
          } else {
            serializeChild(propQName, null, 
              propValue, 
              QName_1_8,
              false,null,context);
          }
          propQName = QName_3_42;
          propValue = bean.get_PhysicianID();
          if (propValue != null && !context.shouldSendXSIType()) {
            context.simpleElement(propQName, null, propValue.toString()); 
          } else {
            serializeChild(propQName, null, 
              propValue, 
              QName_1_8,
              false,null,context);
          }
          propQName = QName_3_43;
          propValue = bean.get_PhysicianName();
          if (propValue != null && !context.shouldSendXSIType()) {
            context.simpleElement(propQName, null, propValue.toString()); 
          } else {
            serializeChild(propQName, null, 
              propValue, 
              QName_1_8,
              false,null,context);
          }
          propQName = QName_3_44;
          propValue = bean.get_ReferralID();
          if (propValue != null && !context.shouldSendXSIType()) {
            context.simpleElement(propQName, null, propValue.toString()); 
          } else {
            serializeChild(propQName, null, 
              propValue, 
              QName_1_8,
              false,null,context);
          }
          propQName = QName_3_45;
          propValue = bean.get_ReferralName();
          if (propValue != null && !context.shouldSendXSIType()) {
            context.simpleElement(propQName, null, propValue.toString()); 
          } else {
            serializeChild(propQName, null, 
              propValue, 
              QName_1_8,
              false,null,context);
          }
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
        }
    }
    private final static javax.xml.namespace.QName QName_3_41 = 
           com.ibm.ws.webservices.engine.utils.QNameTable.createQName(
                  "http://referralintakewosts_1_0.wsbeans.iseries/xsd",
                  "_PatientMI");
    private final static javax.xml.namespace.QName QName_3_33 = 
           com.ibm.ws.webservices.engine.utils.QNameTable.createQName(
                  "http://referralintakewosts_1_0.wsbeans.iseries/xsd",
                  "_IntakeCreateTime");
    private final static javax.xml.namespace.QName QName_3_35 = 
           com.ibm.ws.webservices.engine.utils.QNameTable.createQName(
                  "http://referralintakewosts_1_0.wsbeans.iseries/xsd",
                  "_IntakeStatusDate");
    private final static javax.xml.namespace.QName QName_3_18 = 
           com.ibm.ws.webservices.engine.utils.QNameTable.createQName(
                  "http://referralintakewosts_1_0.wsbeans.iseries/xsd",
                  "_ReferralZipCode");
    private final static javax.xml.namespace.QName QName_3_40 = 
           com.ibm.ws.webservices.engine.utils.QNameTable.createQName(
                  "http://referralintakewosts_1_0.wsbeans.iseries/xsd",
                  "_PatientLastName");
    private final static javax.xml.namespace.QName QName_3_42 = 
           com.ibm.ws.webservices.engine.utils.QNameTable.createQName(
                  "http://referralintakewosts_1_0.wsbeans.iseries/xsd",
                  "_PhysicianID");
    private final static javax.xml.namespace.QName QName_3_36 = 
           com.ibm.ws.webservices.engine.utils.QNameTable.createQName(
                  "http://referralintakewosts_1_0.wsbeans.iseries/xsd",
                  "_IntakeStatusTime");
    private final static javax.xml.namespace.QName QName_3_45 = 
           com.ibm.ws.webservices.engine.utils.QNameTable.createQName(
                  "http://referralintakewosts_1_0.wsbeans.iseries/xsd",
                  "_ReferralName");
    private final static javax.xml.namespace.QName QName_3_44 = 
           com.ibm.ws.webservices.engine.utils.QNameTable.createQName(
                  "http://referralintakewosts_1_0.wsbeans.iseries/xsd",
                  "_ReferralID");
    private final static javax.xml.namespace.QName QName_1_8 = 
           com.ibm.ws.webservices.engine.utils.QNameTable.createQName(
                  "http://www.w3.org/2001/XMLSchema",
                  "string");
    private final static javax.xml.namespace.QName QName_3_32 = 
           com.ibm.ws.webservices.engine.utils.QNameTable.createQName(
                  "http://referralintakewosts_1_0.wsbeans.iseries/xsd",
                  "_IntakeCreateDate");
    private final static javax.xml.namespace.QName QName_3_30 = 
           com.ibm.ws.webservices.engine.utils.QNameTable.createQName(
                  "http://referralintakewosts_1_0.wsbeans.iseries/xsd",
                  "_Associate");
    private final static javax.xml.namespace.QName QName_3_38 = 
           com.ibm.ws.webservices.engine.utils.QNameTable.createQName(
                  "http://referralintakewosts_1_0.wsbeans.iseries/xsd",
                  "_PatientFirstName");
    private final static javax.xml.namespace.QName QName_3_43 = 
           com.ibm.ws.webservices.engine.utils.QNameTable.createQName(
                  "http://referralintakewosts_1_0.wsbeans.iseries/xsd",
                  "_PhysicianName");
    private final static javax.xml.namespace.QName QName_1_20 = 
           com.ibm.ws.webservices.engine.utils.QNameTable.createQName(
                  "http://www.w3.org/2001/XMLSchema",
                  "decimal");
    private final static javax.xml.namespace.QName QName_3_39 = 
           com.ibm.ws.webservices.engine.utils.QNameTable.createQName(
                  "http://referralintakewosts_1_0.wsbeans.iseries/xsd",
                  "_PatientID");
    private final static javax.xml.namespace.QName QName_3_37 = 
           com.ibm.ws.webservices.engine.utils.QNameTable.createQName(
                  "http://referralintakewosts_1_0.wsbeans.iseries/xsd",
                  "_Intake_");
    private final static javax.xml.namespace.QName QName_3_31 = 
           com.ibm.ws.webservices.engine.utils.QNameTable.createQName(
                  "http://referralintakewosts_1_0.wsbeans.iseries/xsd",
                  "_FollowpCode");
    private final static javax.xml.namespace.QName QName_3_34 = 
           com.ibm.ws.webservices.engine.utils.QNameTable.createQName(
                  "http://referralintakewosts_1_0.wsbeans.iseries/xsd",
                  "_IntakeStatus");
}
