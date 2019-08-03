/**
 * WorkOrder_Deser.java
 *
 * This file was auto-generated from WSDL
 * by the IBM Web services WSDL2Java emitter.
 * cf070942.33 v102309233842
 */

package AES_MB_IntakeWOList_Lib_1_0;

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
        value = new AES_MB_IntakeWOList_Lib_1_0.WorkOrder();
    }
    protected boolean tryElementSetFromString(javax.xml.namespace.QName qName, java.lang.String strValue) {
        if (qName==QName_0_17) {
          ((WorkOrder)value).setAssociate(strValue);
          return true;}
        else if (qName==QName_0_18) {
          ((WorkOrder)value).setCompleteDate(strValue);
          return true;}
        else if (qName==QName_0_19) {
          ((WorkOrder)value).setCompleteTime(strValue);
          return true;}
        else if (qName==QName_0_20) {
          ((WorkOrder)value).setDeliveryDate(strValue);
          return true;}
        else if (qName==QName_0_21) {
          ((WorkOrder)value).setDeliveryTime(strValue);
          return true;}
        else if (qName==QName_0_22) {
          ((WorkOrder)value).setEQDate(strValue);
          return true;}
        else if (qName==QName_0_23) {
          ((WorkOrder)value).setEQTime(strValue);
          return true;}
        else if (qName==QName_0_7) {
          ((WorkOrder)value).setIntake(strValue);
          return true;}
        else if (qName==QName_0_24) {
          ((WorkOrder)value).setProduct1(strValue);
          return true;}
        else if (qName==QName_0_25) {
          ((WorkOrder)value).setProduct2(strValue);
          return true;}
        else if (qName==QName_0_26) {
          ((WorkOrder)value).setProduct3(strValue);
          return true;}
        else if (qName==QName_0_27) {
          ((WorkOrder)value).setProduct4(strValue);
          return true;}
        else if (qName==QName_0_28) {
          ((WorkOrder)value).setReadyDate(strValue);
          return true;}
        else if (qName==QName_0_29) {
          ((WorkOrder)value).setReadyTime(strValue);
          return true;}
        else if (qName==QName_0_30) {
          ((WorkOrder)value).setWOCreateDate(strValue);
          return true;}
        else if (qName==QName_0_31) {
          ((WorkOrder)value).setWOCreateTime(strValue);
          return true;}
        else if (qName==QName_0_32) {
          ((WorkOrder)value).setDeliveryAdressLine1(strValue);
          return true;}
        else if (qName==QName_0_33) {
          ((WorkOrder)value).setDeliveryAdressLine2(strValue);
          return true;}
        else if (qName==QName_0_34) {
          ((WorkOrder)value).setDeliveryCity(strValue);
          return true;}
        else if (qName==QName_0_35) {
          ((WorkOrder)value).setDeliveryState(strValue);
          return true;}
        else if (qName==QName_0_36) {
          ((WorkOrder)value).setDeliveryZipCode(strValue);
          return true;}
        else if (qName==QName_0_37) {
          ((WorkOrder)value).setWOStatus(strValue);
          return true;}
        else if (qName==QName_0_38) {
          ((WorkOrder)value).setWOStatusDesc(strValue);
          return true;}
        else if (qName==QName_0_39) {
          ((WorkOrder)value).setWorkOrderNO(strValue);
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
    private final static javax.xml.namespace.QName QName_0_31 = 
           com.ibm.ws.webservices.engine.utils.QNameTable.createQName(
                  "",
                  "WOCreateTime");
    private final static javax.xml.namespace.QName QName_0_34 = 
           com.ibm.ws.webservices.engine.utils.QNameTable.createQName(
                  "",
                  "DeliveryCity");
    private final static javax.xml.namespace.QName QName_0_29 = 
           com.ibm.ws.webservices.engine.utils.QNameTable.createQName(
                  "",
                  "ReadyTime");
    private final static javax.xml.namespace.QName QName_0_20 = 
           com.ibm.ws.webservices.engine.utils.QNameTable.createQName(
                  "",
                  "DeliveryDate");
    private final static javax.xml.namespace.QName QName_0_33 = 
           com.ibm.ws.webservices.engine.utils.QNameTable.createQName(
                  "",
                  "DeliveryAdressLine2");
    private final static javax.xml.namespace.QName QName_0_32 = 
           com.ibm.ws.webservices.engine.utils.QNameTable.createQName(
                  "",
                  "DeliveryAdressLine1");
    private final static javax.xml.namespace.QName QName_0_23 = 
           com.ibm.ws.webservices.engine.utils.QNameTable.createQName(
                  "",
                  "EQTime");
    private final static javax.xml.namespace.QName QName_0_27 = 
           com.ibm.ws.webservices.engine.utils.QNameTable.createQName(
                  "",
                  "Product4");
    private final static javax.xml.namespace.QName QName_0_26 = 
           com.ibm.ws.webservices.engine.utils.QNameTable.createQName(
                  "",
                  "Product3");
    private final static javax.xml.namespace.QName QName_0_38 = 
           com.ibm.ws.webservices.engine.utils.QNameTable.createQName(
                  "",
                  "WOStatusDesc");
    private final static javax.xml.namespace.QName QName_0_25 = 
           com.ibm.ws.webservices.engine.utils.QNameTable.createQName(
                  "",
                  "Product2");
    private final static javax.xml.namespace.QName QName_0_24 = 
           com.ibm.ws.webservices.engine.utils.QNameTable.createQName(
                  "",
                  "Product1");
    private final static javax.xml.namespace.QName QName_0_18 = 
           com.ibm.ws.webservices.engine.utils.QNameTable.createQName(
                  "",
                  "CompleteDate");
    private final static javax.xml.namespace.QName QName_0_30 = 
           com.ibm.ws.webservices.engine.utils.QNameTable.createQName(
                  "",
                  "WOCreateDate");
    private final static javax.xml.namespace.QName QName_0_28 = 
           com.ibm.ws.webservices.engine.utils.QNameTable.createQName(
                  "",
                  "ReadyDate");
    private final static javax.xml.namespace.QName QName_0_21 = 
           com.ibm.ws.webservices.engine.utils.QNameTable.createQName(
                  "",
                  "DeliveryTime");
    private final static javax.xml.namespace.QName QName_0_17 = 
           com.ibm.ws.webservices.engine.utils.QNameTable.createQName(
                  "",
                  "Associate");
    private final static javax.xml.namespace.QName QName_0_39 = 
           com.ibm.ws.webservices.engine.utils.QNameTable.createQName(
                  "",
                  "WorkOrderNO");
    private final static javax.xml.namespace.QName QName_0_35 = 
           com.ibm.ws.webservices.engine.utils.QNameTable.createQName(
                  "",
                  "DeliveryState");
    private final static javax.xml.namespace.QName QName_0_7 = 
           com.ibm.ws.webservices.engine.utils.QNameTable.createQName(
                  "",
                  "Intake");
    private final static javax.xml.namespace.QName QName_0_22 = 
           com.ibm.ws.webservices.engine.utils.QNameTable.createQName(
                  "",
                  "EQDate");
    private final static javax.xml.namespace.QName QName_0_36 = 
           com.ibm.ws.webservices.engine.utils.QNameTable.createQName(
                  "",
                  "DeliveryZipCode");
    private final static javax.xml.namespace.QName QName_0_37 = 
           com.ibm.ws.webservices.engine.utils.QNameTable.createQName(
                  "",
                  "WOStatus");
    private final static javax.xml.namespace.QName QName_0_19 = 
           com.ibm.ws.webservices.engine.utils.QNameTable.createQName(
                  "",
                  "CompleteTime");
}
