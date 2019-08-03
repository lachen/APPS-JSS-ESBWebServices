/**
 * IntakeResult_Deser.java
 *
 * This file was auto-generated from WSDL
 * by the IBM Web services WSDL2Java emitter.
 * cf070942.33 v102309233842
 */

package com.apria.web.services.mobile.out;

public class IntakeResult_Deser extends com.ibm.ws.webservices.engine.encoding.ser.BeanDeserializer {
    /**
     * Constructor
     */
    public IntakeResult_Deser(
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType, 
           com.ibm.ws.webservices.engine.description.TypeDesc _typeDesc) {
        super(_javaType, _xmlType, _typeDesc);
    }
    /**
     * Create instance of java bean
     */
    public void createValue() {
        value = new com.apria.web.services.mobile.out.IntakeResult();
    }
    protected boolean tryElementSetFromString(javax.xml.namespace.QName qName, java.lang.String strValue) {
        if (qName==QName_0_57) {
          ((IntakeResult)value).setIntakeCount(strValue);
          return true;}
        else if (qName==QName_0_58) {
          ((IntakeResult)value).setIntakeOverFlow(strValue);
          return true;}
        else if (qName==QName_0_59) {
          ((IntakeResult)value).setRecCount(strValue);
          return true;}
        else if (qName==QName_0_60) {
          ((IntakeResult)value).setRecStatus(strValue);
          return true;}
        else if (qName==QName_0_12) {
          ((IntakeResult)value).setWOCount(strValue);
          return true;}
        return false;
    }
    protected boolean tryAttributeSetFromString(javax.xml.namespace.QName qName, java.lang.String strValue) {
        return false;
    }
    protected boolean tryElementSetFromObject(javax.xml.namespace.QName qName, java.lang.Object objValue) {
        if (qName==QName_0_82) {
          if (objValue instanceof java.util.List) {
            com.apria.web.services.mobile.out.Intake[] array = new com.apria.web.services.mobile.out.Intake[((java.util.List)objValue).size()];
            ((java.util.List)objValue).toArray(array);
            ((IntakeResult)value).setIntakeList(array);
          } else { 
            ((IntakeResult)value).setIntakeList((com.apria.web.services.mobile.out.Intake[])objValue);}
          return true;}
        return false;
    }
    protected boolean tryElementSetFromList(javax.xml.namespace.QName qName, java.util.List listValue) {
        return false;
    }
    private final static javax.xml.namespace.QName QName_0_59 = 
           com.ibm.ws.webservices.engine.utils.QNameTable.createQName(
                  "",
                  "recCount");
    private final static javax.xml.namespace.QName QName_0_12 = 
           com.ibm.ws.webservices.engine.utils.QNameTable.createQName(
                  "",
                  "WOCount");
    private final static javax.xml.namespace.QName QName_0_82 = 
           com.ibm.ws.webservices.engine.utils.QNameTable.createQName(
                  "",
                  "intakeList");
    private final static javax.xml.namespace.QName QName_0_60 = 
           com.ibm.ws.webservices.engine.utils.QNameTable.createQName(
                  "",
                  "recStatus");
    private final static javax.xml.namespace.QName QName_0_58 = 
           com.ibm.ws.webservices.engine.utils.QNameTable.createQName(
                  "",
                  "intakeOverFlow");
    private final static javax.xml.namespace.QName QName_0_57 = 
           com.ibm.ws.webservices.engine.utils.QNameTable.createQName(
                  "",
                  "intakeCount");
}
