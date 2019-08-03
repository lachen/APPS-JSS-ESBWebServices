/**
 * MasterAgreement_Deser.java
 *
 * This file was auto-generated from WSDL
 * by the IBM Web services WSDL2Java emitter.
 * cf10631.06 v81706232132
 */

package com.apria.ws.payersvcs;

public class MasterAgreement_Deser extends com.ibm.ws.webservices.engine.encoding.ser.BeanDeserializer {
    /**
     * Constructor
     */
    public MasterAgreement_Deser(
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType, 
           com.ibm.ws.webservices.engine.description.TypeDesc _typeDesc) {
        super(_javaType, _xmlType, _typeDesc);
    }
    /**
     * Create instance of java bean
     */
    public void createValue() {
        value = new com.apria.ws.payersvcs.MasterAgreement();
    }
    protected boolean tryElementSetFromString(javax.xml.namespace.QName qName, java.lang.String strValue) {
        if (qName==QName_0_24) {
          ((MasterAgreement)value).setIsMstrAgrmtValid(com.ibm.ws.webservices.engine.encoding.ser.SimpleDeserializer.parseBoolean(strValue));
          return true;}
        else if (qName==QName_0_25) {
          ((MasterAgreement)value).setMstrAgrmtId(strValue);
          return true;}
        else if (qName==QName_0_26) {
          ((MasterAgreement)value).setMstrAgrmtNm(strValue);
          return true;}
        else if (qName==QName_0_27) {
          ((MasterAgreement)value).setMstrAgrmtUnqSk(strValue);
          return true;}
        return false;
    }
    protected boolean tryAttributeSetFromString(javax.xml.namespace.QName qName, java.lang.String strValue) {
        return false;
    }
    protected boolean tryElementSetFromObject(javax.xml.namespace.QName qName, java.lang.Object objValue) {
        if (objValue == null) {
          return true;
        }
        return false;
    }
    protected boolean tryElementSetFromList(javax.xml.namespace.QName qName, java.util.List listValue) {
        return false;
    }
    private final static javax.xml.namespace.QName QName_0_25 = 
           com.ibm.ws.webservices.engine.utils.QNameTable.createQName(
                  "http://payersvcs.ws.apria.com",
                  "mstrAgrmtId");
    private final static javax.xml.namespace.QName QName_0_24 = 
           com.ibm.ws.webservices.engine.utils.QNameTable.createQName(
                  "http://payersvcs.ws.apria.com",
                  "isMstrAgrmtValid");
    private final static javax.xml.namespace.QName QName_0_26 = 
           com.ibm.ws.webservices.engine.utils.QNameTable.createQName(
                  "http://payersvcs.ws.apria.com",
                  "mstrAgrmtNm");
    private final static javax.xml.namespace.QName QName_0_27 = 
           com.ibm.ws.webservices.engine.utils.QNameTable.createQName(
                  "http://payersvcs.ws.apria.com",
                  "mstrAgrmtUnqSk");
}
