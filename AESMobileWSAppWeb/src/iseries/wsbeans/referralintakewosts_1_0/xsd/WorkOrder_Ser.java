/**
 * WorkOrder_Ser.java
 *
 * This file was auto-generated from WSDL
 * by the IBM Web services WSDL2Java emitter.
 * cf070942.33 v102309233842
 */

package iseries.wsbeans.referralintakewosts_1_0.xsd;

public class WorkOrder_Ser extends com.ibm.ws.webservices.engine.encoding.ser.BeanSerializer {
    /**
     * Constructor
     */
    public WorkOrder_Ser(
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
           elemQName = QName_3_46;
           context.qName2String(elemQName, true);
           elemQName = QName_3_47;
           context.qName2String(elemQName, true);
           elemQName = QName_3_48;
           context.qName2String(elemQName, true);
           elemQName = QName_3_49;
           context.qName2String(elemQName, true);
           elemQName = QName_3_50;
           context.qName2String(elemQName, true);
           elemQName = QName_3_51;
           context.qName2String(elemQName, true);
           elemQName = QName_3_37;
           context.qName2String(elemQName, true);
           elemQName = QName_3_52;
           context.qName2String(elemQName, true);
           elemQName = QName_3_53;
           context.qName2String(elemQName, true);
           elemQName = QName_3_54;
           context.qName2String(elemQName, true);
           elemQName = QName_3_55;
           context.qName2String(elemQName, true);
           elemQName = QName_3_56;
           context.qName2String(elemQName, true);
           elemQName = QName_3_57;
           context.qName2String(elemQName, true);
           elemQName = QName_3_58;
           context.qName2String(elemQName, true);
           elemQName = QName_3_59;
           context.qName2String(elemQName, true);
           elemQName = QName_3_60;
           context.qName2String(elemQName, true);
           elemQName = QName_3_61;
           context.qName2String(elemQName, true);
           elemQName = QName_3_62;
           context.qName2String(elemQName, true);
           elemQName = QName_3_63;
           context.qName2String(elemQName, true);
           elemQName = QName_3_64;
           context.qName2String(elemQName, true);
           elemQName = QName_3_65;
           context.qName2String(elemQName, true);
           elemQName = QName_3_66;
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
        WorkOrder bean = (WorkOrder) value;
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
          propQName = QName_3_46;
          propValue = bean.get_CompleteDate();
          if (propValue != null && !context.shouldSendXSIType()) {
            context.simpleElement(propQName, null, propValue.toString()); 
          } else {
            serializeChild(propQName, null, 
              propValue, 
              QName_1_8,
              false,null,context);
          }
          propQName = QName_3_47;
          propValue = bean.get_CompleteTime();
          if (propValue != null && !context.shouldSendXSIType()) {
            context.simpleElement(propQName, null, propValue.toString()); 
          } else {
            serializeChild(propQName, null, 
              propValue, 
              QName_1_8,
              false,null,context);
          }
          propQName = QName_3_48;
          propValue = bean.get_DeliveryDate();
          if (propValue != null && !context.shouldSendXSIType()) {
            context.simpleElement(propQName, null, propValue.toString()); 
          } else {
            serializeChild(propQName, null, 
              propValue, 
              QName_1_8,
              false,null,context);
          }
          propQName = QName_3_49;
          propValue = bean.get_DeliveryTime();
          if (propValue != null && !context.shouldSendXSIType()) {
            context.simpleElement(propQName, null, propValue.toString()); 
          } else {
            serializeChild(propQName, null, 
              propValue, 
              QName_1_8,
              false,null,context);
          }
          propQName = QName_3_50;
          propValue = bean.get_EQDate();
          if (propValue != null && !context.shouldSendXSIType()) {
            context.simpleElement(propQName, null, propValue.toString()); 
          } else {
            serializeChild(propQName, null, 
              propValue, 
              QName_1_8,
              false,null,context);
          }
          propQName = QName_3_51;
          propValue = bean.get_EQTime();
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
          propQName = QName_3_52;
          propValue = bean.get_Product1();
          if (propValue != null && !context.shouldSendXSIType()) {
            context.simpleElement(propQName, null, propValue.toString()); 
          } else {
            serializeChild(propQName, null, 
              propValue, 
              QName_1_8,
              false,null,context);
          }
          propQName = QName_3_53;
          propValue = bean.get_Product2();
          if (propValue != null && !context.shouldSendXSIType()) {
            context.simpleElement(propQName, null, propValue.toString()); 
          } else {
            serializeChild(propQName, null, 
              propValue, 
              QName_1_8,
              false,null,context);
          }
          propQName = QName_3_54;
          propValue = bean.get_Product3();
          if (propValue != null && !context.shouldSendXSIType()) {
            context.simpleElement(propQName, null, propValue.toString()); 
          } else {
            serializeChild(propQName, null, 
              propValue, 
              QName_1_8,
              false,null,context);
          }
          propQName = QName_3_55;
          propValue = bean.get_Product4();
          if (propValue != null && !context.shouldSendXSIType()) {
            context.simpleElement(propQName, null, propValue.toString()); 
          } else {
            serializeChild(propQName, null, 
              propValue, 
              QName_1_8,
              false,null,context);
          }
          propQName = QName_3_56;
          propValue = bean.get_ReadyDate();
          if (propValue != null && !context.shouldSendXSIType()) {
            context.simpleElement(propQName, null, propValue.toString()); 
          } else {
            serializeChild(propQName, null, 
              propValue, 
              QName_1_8,
              false,null,context);
          }
          propQName = QName_3_57;
          propValue = bean.get_ReadyTime();
          if (propValue != null && !context.shouldSendXSIType()) {
            context.simpleElement(propQName, null, propValue.toString()); 
          } else {
            serializeChild(propQName, null, 
              propValue, 
              QName_1_8,
              false,null,context);
          }
          propQName = QName_3_58;
          propValue = bean.get_WOCreateDate();
          if (propValue != null && !context.shouldSendXSIType()) {
            context.simpleElement(propQName, null, propValue.toString()); 
          } else {
            serializeChild(propQName, null, 
              propValue, 
              QName_1_8,
              false,null,context);
          }
          propQName = QName_3_59;
          propValue = bean.get_WOCreateTime();
          if (propValue != null && !context.shouldSendXSIType()) {
            context.simpleElement(propQName, null, propValue.toString()); 
          } else {
            serializeChild(propQName, null, 
              propValue, 
              QName_1_8,
              false,null,context);
          }
          propQName = QName_3_60;
          propValue = bean.get_WODeliveryAdressLine2();
          if (propValue != null && !context.shouldSendXSIType()) {
            context.simpleElement(propQName, null, propValue.toString()); 
          } else {
            serializeChild(propQName, null, 
              propValue, 
              QName_1_8,
              false,null,context);
          }
          propQName = QName_3_61;
          propValue = bean.get_WODeliveryAdrressLine1();
          if (propValue != null && !context.shouldSendXSIType()) {
            context.simpleElement(propQName, null, propValue.toString()); 
          } else {
            serializeChild(propQName, null, 
              propValue, 
              QName_1_8,
              false,null,context);
          }
          propQName = QName_3_62;
          propValue = bean.get_WODeliveryCity();
          if (propValue != null && !context.shouldSendXSIType()) {
            context.simpleElement(propQName, null, propValue.toString()); 
          } else {
            serializeChild(propQName, null, 
              propValue, 
              QName_1_8,
              false,null,context);
          }
          propQName = QName_3_63;
          propValue = bean.get_WODeliveryState();
          if (propValue != null && !context.shouldSendXSIType()) {
            context.simpleElement(propQName, null, propValue.toString()); 
          } else {
            serializeChild(propQName, null, 
              propValue, 
              QName_1_8,
              false,null,context);
          }
          propQName = QName_3_64;
          propValue = bean.get_WODeliveryZipCode();
          if (propValue != null && !context.shouldSendXSIType()) {
            context.simpleElement(propQName, null, propValue.toString()); 
          } else {
            serializeChild(propQName, null, 
              propValue, 
              QName_1_8,
              false,null,context);
          }
          propQName = QName_3_65;
          propValue = bean.get_WOSatusDesription();
          if (propValue != null && !context.shouldSendXSIType()) {
            context.simpleElement(propQName, null, propValue.toString()); 
          } else {
            serializeChild(propQName, null, 
              propValue, 
              QName_1_8,
              false,null,context);
          }
          propQName = QName_3_66;
          propValue = bean.get_WOStatus();
          if (propValue != null && !context.shouldSendXSIType()) {
            context.simpleElement(propQName, null, propValue.toString()); 
          } else {
            serializeChild(propQName, null, 
              propValue, 
              QName_1_8,
              false,null,context);
          }
          propQName = QName_3_27;
          propValue = bean.get_WorkOrder();
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
    private final static javax.xml.namespace.QName QName_3_27 = 
           com.ibm.ws.webservices.engine.utils.QNameTable.createQName(
                  "http://referralintakewosts_1_0.wsbeans.iseries/xsd",
                  "_WorkOrder");
    private final static javax.xml.namespace.QName QName_3_46 = 
           com.ibm.ws.webservices.engine.utils.QNameTable.createQName(
                  "http://referralintakewosts_1_0.wsbeans.iseries/xsd",
                  "_CompleteDate");
    private final static javax.xml.namespace.QName QName_3_50 = 
           com.ibm.ws.webservices.engine.utils.QNameTable.createQName(
                  "http://referralintakewosts_1_0.wsbeans.iseries/xsd",
                  "_EQDate");
    private final static javax.xml.namespace.QName QName_3_64 = 
           com.ibm.ws.webservices.engine.utils.QNameTable.createQName(
                  "http://referralintakewosts_1_0.wsbeans.iseries/xsd",
                  "_WODeliveryZipCode");
    private final static javax.xml.namespace.QName QName_3_62 = 
           com.ibm.ws.webservices.engine.utils.QNameTable.createQName(
                  "http://referralintakewosts_1_0.wsbeans.iseries/xsd",
                  "_WODeliveryCity");
    private final static javax.xml.namespace.QName QName_3_60 = 
           com.ibm.ws.webservices.engine.utils.QNameTable.createQName(
                  "http://referralintakewosts_1_0.wsbeans.iseries/xsd",
                  "_WODeliveryAdressLine2");
    private final static javax.xml.namespace.QName QName_3_49 = 
           com.ibm.ws.webservices.engine.utils.QNameTable.createQName(
                  "http://referralintakewosts_1_0.wsbeans.iseries/xsd",
                  "_DeliveryTime");
    private final static javax.xml.namespace.QName QName_3_56 = 
           com.ibm.ws.webservices.engine.utils.QNameTable.createQName(
                  "http://referralintakewosts_1_0.wsbeans.iseries/xsd",
                  "_ReadyDate");
    private final static javax.xml.namespace.QName QName_3_47 = 
           com.ibm.ws.webservices.engine.utils.QNameTable.createQName(
                  "http://referralintakewosts_1_0.wsbeans.iseries/xsd",
                  "_CompleteTime");
    private final static javax.xml.namespace.QName QName_3_57 = 
           com.ibm.ws.webservices.engine.utils.QNameTable.createQName(
                  "http://referralintakewosts_1_0.wsbeans.iseries/xsd",
                  "_ReadyTime");
    private final static javax.xml.namespace.QName QName_3_51 = 
           com.ibm.ws.webservices.engine.utils.QNameTable.createQName(
                  "http://referralintakewosts_1_0.wsbeans.iseries/xsd",
                  "_EQTime");
    private final static javax.xml.namespace.QName QName_3_63 = 
           com.ibm.ws.webservices.engine.utils.QNameTable.createQName(
                  "http://referralintakewosts_1_0.wsbeans.iseries/xsd",
                  "_WODeliveryState");
    private final static javax.xml.namespace.QName QName_3_65 = 
           com.ibm.ws.webservices.engine.utils.QNameTable.createQName(
                  "http://referralintakewosts_1_0.wsbeans.iseries/xsd",
                  "_WOSatusDesription");
    private final static javax.xml.namespace.QName QName_3_61 = 
           com.ibm.ws.webservices.engine.utils.QNameTable.createQName(
                  "http://referralintakewosts_1_0.wsbeans.iseries/xsd",
                  "_WODeliveryAdrressLine1");
    private final static javax.xml.namespace.QName QName_1_8 = 
           com.ibm.ws.webservices.engine.utils.QNameTable.createQName(
                  "http://www.w3.org/2001/XMLSchema",
                  "string");
    private final static javax.xml.namespace.QName QName_3_52 = 
           com.ibm.ws.webservices.engine.utils.QNameTable.createQName(
                  "http://referralintakewosts_1_0.wsbeans.iseries/xsd",
                  "_Product1");
    private final static javax.xml.namespace.QName QName_3_48 = 
           com.ibm.ws.webservices.engine.utils.QNameTable.createQName(
                  "http://referralintakewosts_1_0.wsbeans.iseries/xsd",
                  "_DeliveryDate");
    private final static javax.xml.namespace.QName QName_3_53 = 
           com.ibm.ws.webservices.engine.utils.QNameTable.createQName(
                  "http://referralintakewosts_1_0.wsbeans.iseries/xsd",
                  "_Product2");
    private final static javax.xml.namespace.QName QName_3_54 = 
           com.ibm.ws.webservices.engine.utils.QNameTable.createQName(
                  "http://referralintakewosts_1_0.wsbeans.iseries/xsd",
                  "_Product3");
    private final static javax.xml.namespace.QName QName_3_55 = 
           com.ibm.ws.webservices.engine.utils.QNameTable.createQName(
                  "http://referralintakewosts_1_0.wsbeans.iseries/xsd",
                  "_Product4");
    private final static javax.xml.namespace.QName QName_3_30 = 
           com.ibm.ws.webservices.engine.utils.QNameTable.createQName(
                  "http://referralintakewosts_1_0.wsbeans.iseries/xsd",
                  "_Associate");
    private final static javax.xml.namespace.QName QName_3_66 = 
           com.ibm.ws.webservices.engine.utils.QNameTable.createQName(
                  "http://referralintakewosts_1_0.wsbeans.iseries/xsd",
                  "_WOStatus");
    private final static javax.xml.namespace.QName QName_1_20 = 
           com.ibm.ws.webservices.engine.utils.QNameTable.createQName(
                  "http://www.w3.org/2001/XMLSchema",
                  "decimal");
    private final static javax.xml.namespace.QName QName_3_59 = 
           com.ibm.ws.webservices.engine.utils.QNameTable.createQName(
                  "http://referralintakewosts_1_0.wsbeans.iseries/xsd",
                  "_WOCreateTime");
    private final static javax.xml.namespace.QName QName_3_37 = 
           com.ibm.ws.webservices.engine.utils.QNameTable.createQName(
                  "http://referralintakewosts_1_0.wsbeans.iseries/xsd",
                  "_Intake_");
    private final static javax.xml.namespace.QName QName_3_58 = 
           com.ibm.ws.webservices.engine.utils.QNameTable.createQName(
                  "http://referralintakewosts_1_0.wsbeans.iseries/xsd",
                  "_WOCreateDate");
}
