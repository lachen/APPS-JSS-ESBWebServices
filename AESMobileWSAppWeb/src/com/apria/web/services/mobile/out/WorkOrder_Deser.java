/**
 * WorkOrder_Deser.java
 *
 * This file was auto-generated from WSDL
 * by the IBM Web services WSDL2Java emitter.
 * cf070942.33 v102309233842
 */

package com.apria.web.services.mobile.out;

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
        value = new com.apria.web.services.mobile.out.WorkOrder();
    }
    protected boolean tryElementSetFromString(javax.xml.namespace.QName qName, java.lang.String strValue) {
        if (qName==QName_0_40) {
          ((WorkOrder)value).setAssociate(strValue);
          return true;}
        else if (qName==QName_0_66) {
          ((WorkOrder)value).setCompleteDate(strValue);
          return true;}
        else if (qName==QName_0_67) {
          ((WorkOrder)value).setCompleteTime(strValue);
          return true;}
        else if (qName==QName_0_68) {
          ((WorkOrder)value).setDeliveryDate(strValue);
          return true;}
        else if (qName==QName_0_69) {
          ((WorkOrder)value).setDeliveryTime(strValue);
          return true;}
        else if (qName==QName_0_22) {
          ((WorkOrder)value).setEQDate(strValue);
          return true;}
        else if (qName==QName_0_23) {
          ((WorkOrder)value).setEQTime(strValue);
          return true;}
        else if (qName==QName_0_70) {
          ((WorkOrder)value).setProduct1(strValue);
          return true;}
        else if (qName==QName_0_71) {
          ((WorkOrder)value).setProduct2(strValue);
          return true;}
        else if (qName==QName_0_72) {
          ((WorkOrder)value).setProduct3(strValue);
          return true;}
        else if (qName==QName_0_73) {
          ((WorkOrder)value).setProduct4(strValue);
          return true;}
        else if (qName==QName_0_74) {
          ((WorkOrder)value).setReadyDate(strValue);
          return true;}
        else if (qName==QName_0_75) {
          ((WorkOrder)value).setReadyTime(strValue);
          return true;}
        else if (qName==QName_0_30) {
          ((WorkOrder)value).setWOCreateDate(strValue);
          return true;}
        else if (qName==QName_0_31) {
          ((WorkOrder)value).setWOCreateTime(strValue);
          return true;}
        else if (qName==QName_0_76) {
          ((WorkOrder)value).setDeliveryAdressLine1(strValue);
          return true;}
        else if (qName==QName_0_77) {
          ((WorkOrder)value).setDeliveryAdressLine2(strValue);
          return true;}
        else if (qName==QName_0_78) {
          ((WorkOrder)value).setDeliveryCity(strValue);
          return true;}
        else if (qName==QName_0_79) {
          ((WorkOrder)value).setDeliveryState(strValue);
          return true;}
        else if (qName==QName_0_80) {
          ((WorkOrder)value).setDeliveryZipCode(strValue);
          return true;}
        else if (qName==QName_0_37) {
          ((WorkOrder)value).setWOStatus(strValue);
          return true;}
        else if (qName==QName_0_38) {
          ((WorkOrder)value).setWOStatusDesc(strValue);
          return true;}
        else if (qName==QName_0_81) {
          ((WorkOrder)value).setWorkOrderNO(strValue);
          return true;}
        else if (qName==QName_0_63) {
          ((WorkOrder)value).setIntakeNo(strValue);
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
    private final static javax.xml.namespace.QName QName_0_79 = 
           com.ibm.ws.webservices.engine.utils.QNameTable.createQName(
                  "",
                  "deliveryState");
    private final static javax.xml.namespace.QName QName_0_67 = 
           com.ibm.ws.webservices.engine.utils.QNameTable.createQName(
                  "",
                  "completeTime");
    private final static javax.xml.namespace.QName QName_0_23 = 
           com.ibm.ws.webservices.engine.utils.QNameTable.createQName(
                  "",
                  "EQTime");
    private final static javax.xml.namespace.QName QName_0_78 = 
           com.ibm.ws.webservices.engine.utils.QNameTable.createQName(
                  "",
                  "deliveryCity");
    private final static javax.xml.namespace.QName QName_0_63 = 
           com.ibm.ws.webservices.engine.utils.QNameTable.createQName(
                  "",
                  "intakeNo");
    private final static javax.xml.namespace.QName QName_0_73 = 
           com.ibm.ws.webservices.engine.utils.QNameTable.createQName(
                  "",
                  "product4");
    private final static javax.xml.namespace.QName QName_0_72 = 
           com.ibm.ws.webservices.engine.utils.QNameTable.createQName(
                  "",
                  "product3");
    private final static javax.xml.namespace.QName QName_0_71 = 
           com.ibm.ws.webservices.engine.utils.QNameTable.createQName(
                  "",
                  "product2");
    private final static javax.xml.namespace.QName QName_0_74 = 
           com.ibm.ws.webservices.engine.utils.QNameTable.createQName(
                  "",
                  "readyDate");
    private final static javax.xml.namespace.QName QName_0_40 = 
           com.ibm.ws.webservices.engine.utils.QNameTable.createQName(
                  "",
                  "associate");
    private final static javax.xml.namespace.QName QName_0_38 = 
           com.ibm.ws.webservices.engine.utils.QNameTable.createQName(
                  "",
                  "WOStatusDesc");
    private final static javax.xml.namespace.QName QName_0_68 = 
           com.ibm.ws.webservices.engine.utils.QNameTable.createQName(
                  "",
                  "deliveryDate");
    private final static javax.xml.namespace.QName QName_0_70 = 
           com.ibm.ws.webservices.engine.utils.QNameTable.createQName(
                  "",
                  "product1");
    private final static javax.xml.namespace.QName QName_0_30 = 
           com.ibm.ws.webservices.engine.utils.QNameTable.createQName(
                  "",
                  "WOCreateDate");
    private final static javax.xml.namespace.QName QName_0_77 = 
           com.ibm.ws.webservices.engine.utils.QNameTable.createQName(
                  "",
                  "deliveryAdressLine2");
    private final static javax.xml.namespace.QName QName_0_76 = 
           com.ibm.ws.webservices.engine.utils.QNameTable.createQName(
                  "",
                  "deliveryAdressLine1");
    private final static javax.xml.namespace.QName QName_0_80 = 
           com.ibm.ws.webservices.engine.utils.QNameTable.createQName(
                  "",
                  "deliveryZipCode");
    private final static javax.xml.namespace.QName QName_0_66 = 
           com.ibm.ws.webservices.engine.utils.QNameTable.createQName(
                  "",
                  "completeDate");
    private final static javax.xml.namespace.QName QName_0_22 = 
           com.ibm.ws.webservices.engine.utils.QNameTable.createQName(
                  "",
                  "EQDate");
    private final static javax.xml.namespace.QName QName_0_75 = 
           com.ibm.ws.webservices.engine.utils.QNameTable.createQName(
                  "",
                  "readyTime");
    private final static javax.xml.namespace.QName QName_0_69 = 
           com.ibm.ws.webservices.engine.utils.QNameTable.createQName(
                  "",
                  "deliveryTime");
    private final static javax.xml.namespace.QName QName_0_37 = 
           com.ibm.ws.webservices.engine.utils.QNameTable.createQName(
                  "",
                  "WOStatus");
    private final static javax.xml.namespace.QName QName_0_81 = 
           com.ibm.ws.webservices.engine.utils.QNameTable.createQName(
                  "",
                  "workOrderNO");
}
