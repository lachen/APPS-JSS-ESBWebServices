/**
 * RthmeAgreement_Deser.java
 *
 * This file was auto-generated from WSDL
 * by the IBM Web services WSDL2Java emitter.
 * cf10631.06 v81706232132
 */

package com.apria.ws.payersvcs;

public class RthmeAgreement_Deser extends com.ibm.ws.webservices.engine.encoding.ser.BeanDeserializer {
    /**
     * Constructor
     */
    public RthmeAgreement_Deser(
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType, 
           com.ibm.ws.webservices.engine.description.TypeDesc _typeDesc) {
        super(_javaType, _xmlType, _typeDesc);
    }
    /**
     * Create instance of java bean
     */
    public void createValue() {
        value = new com.apria.ws.payersvcs.RthmeAgreement();
    }
    protected boolean tryElementSetFromString(javax.xml.namespace.QName qName, java.lang.String strValue) {
        if (qName==QName_0_29) {
          ((RthmeAgreement)value).setAgrmtNm(strValue);
          return true;}
        else if (qName==QName_0_30) {
          ((RthmeAgreement)value).setIsRthmeAgrmtValid(com.ibm.ws.webservices.engine.encoding.ser.SimpleDeserializer.parseBoolean(strValue));
          return true;}
        else if (qName==QName_0_31) {
          ((RthmeAgreement)value).setAgrmtId(strValue);
          return true;}
        else if (qName==QName_0_32) {
          ((RthmeAgreement)value).setAgrmtUnqSk(strValue);
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
    private final static javax.xml.namespace.QName QName_0_31 = 
           com.ibm.ws.webservices.engine.utils.QNameTable.createQName(
                  "http://payersvcs.ws.apria.com",
                  "agrmtId");
    private final static javax.xml.namespace.QName QName_0_29 = 
           com.ibm.ws.webservices.engine.utils.QNameTable.createQName(
                  "http://payersvcs.ws.apria.com",
                  "agrmtNm");
    private final static javax.xml.namespace.QName QName_0_32 = 
           com.ibm.ws.webservices.engine.utils.QNameTable.createQName(
                  "http://payersvcs.ws.apria.com",
                  "agrmtUnqSk");
    private final static javax.xml.namespace.QName QName_0_30 = 
           com.ibm.ws.webservices.engine.utils.QNameTable.createQName(
                  "http://payersvcs.ws.apria.com",
                  "isRthmeAgrmtValid");
}
