/**
 * WorkOrder_Deser.java
 *
 * This file was auto-generated from WSDL
 * by the IBM Web services WSDL2Java emitter.
 * cf070942.33 v102309233842
 */

package iseries.wsbeans.referralintakewosts_1_0.xsd;

public class WorkOrder_Deser extends com.ibm.ws.webservices.engine.encoding.ser.BeanDeserializer {
    /**
     * Constructor
     */
    public WorkOrder_Deser(
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType, 
           com.ibm.ws.webservices.engine.description.TypeDesc _typeDesc) {
        super(_javaType, _xmlType, _typeDesc);
    }
    /**
     * Create instance of java bean
     */
    public void createValue() {
        value = new iseries.wsbeans.referralintakewosts_1_0.xsd.WorkOrder();
    }
    protected boolean tryElementSetFromString(javax.xml.namespace.QName qName, java.lang.String strValue) {
        if (qName==QName_3_30) {
          ((WorkOrder)value).set_Associate(strValue);
          return true;}
        else if (qName==QName_3_46) {
          ((WorkOrder)value).set_CompleteDate(strValue);
          return true;}
        else if (qName==QName_3_47) {
          ((WorkOrder)value).set_CompleteTime(strValue);
          return true;}
        else if (qName==QName_3_48) {
          ((WorkOrder)value).set_DeliveryDate(strValue);
          return true;}
        else if (qName==QName_3_49) {
          ((WorkOrder)value).set_DeliveryTime(strValue);
          return true;}
        else if (qName==QName_3_50) {
          ((WorkOrder)value).set_EQDate(strValue);
          return true;}
        else if (qName==QName_3_51) {
          ((WorkOrder)value).set_EQTime(strValue);
          return true;}
        else if (qName==QName_3_37) {
          ((WorkOrder)value).set_Intake_(com.ibm.ws.webservices.engine.encoding.ser.SimpleDeserializer.parseBigDecimal(strValue));
          return true;}
        else if (qName==QName_3_52) {
          ((WorkOrder)value).set_Product1(strValue);
          return true;}
        else if (qName==QName_3_53) {
          ((WorkOrder)value).set_Product2(strValue);
          return true;}
        else if (qName==QName_3_54) {
          ((WorkOrder)value).set_Product3(strValue);
          return true;}
        else if (qName==QName_3_55) {
          ((WorkOrder)value).set_Product4(strValue);
          return true;}
        else if (qName==QName_3_56) {
          ((WorkOrder)value).set_ReadyDate(strValue);
          return true;}
        else if (qName==QName_3_57) {
          ((WorkOrder)value).set_ReadyTime(strValue);
          return true;}
        else if (qName==QName_3_58) {
          ((WorkOrder)value).set_WOCreateDate(strValue);
          return true;}
        else if (qName==QName_3_59) {
          ((WorkOrder)value).set_WOCreateTime(strValue);
          return true;}
        else if (qName==QName_3_60) {
          ((WorkOrder)value).set_WODeliveryAdressLine2(strValue);
          return true;}
        else if (qName==QName_3_61) {
          ((WorkOrder)value).set_WODeliveryAdrressLine1(strValue);
          return true;}
        else if (qName==QName_3_62) {
          ((WorkOrder)value).set_WODeliveryCity(strValue);
          return true;}
        else if (qName==QName_3_63) {
          ((WorkOrder)value).set_WODeliveryState(strValue);
          return true;}
        else if (qName==QName_3_64) {
          ((WorkOrder)value).set_WODeliveryZipCode(strValue);
          return true;}
        else if (qName==QName_3_65) {
          ((WorkOrder)value).set_WOSatusDesription(strValue);
          return true;}
        else if (qName==QName_3_66) {
          ((WorkOrder)value).set_WOStatus(strValue);
          return true;}
        else if (qName==QName_3_27) {
          ((WorkOrder)value).set_WorkOrder(strValue);
          return true;}
        return false;
    }
    protected boolean tryAttributeSetFromString(javax.xml.namespace.QName qName, java.lang.String strValue) {
        return false;
    }
    protected boolean tryElementSetFromObject(javax.xml.namespace.QName qName, java.lang.Object objValue) {
        return false;
    }
    protected boolean tryElementSetFromList(javax.xml.namespace.QName qName, java.util.List listValue) {
        return false;
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
