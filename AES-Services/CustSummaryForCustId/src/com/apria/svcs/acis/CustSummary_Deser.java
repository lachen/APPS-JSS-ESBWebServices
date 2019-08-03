/**
 * CustSummary_Deser.java
 *
 * This file was auto-generated from WSDL
 * by the IBM Web services WSDL2Java emitter.
 * cf230909.32 v3909221945
 */

package com.apria.svcs.acis;

public class CustSummary_Deser extends com.ibm.ws.webservices.engine.encoding.ser.BeanDeserializer {
    /**
     * Constructor
     */
    public CustSummary_Deser(
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType, 
           com.ibm.ws.webservices.engine.description.TypeDesc _typeDesc) {
        super(_javaType, _xmlType, _typeDesc);
    }
    /**
     * Create instance of java bean
     */
    public void createValue() {
        value = new com.apria.svcs.acis.CustSummary();
    }
    protected boolean tryElementSetFromString(javax.xml.namespace.QName qName, java.lang.String strValue) {
        if (qName==QName_0_0) {
          ((CustSummary)value).setCustDOB(strValue);
          return true;}
        else if (qName==QName_0_1) {
          ((CustSummary)value).setCustFirstName(strValue);
          return true;}
        else if (qName==QName_0_2) {
          ((CustSummary)value).setCustLastName(strValue);
          return true;}
        else if (qName==QName_0_3) {
          ((CustSummary)value).setCustMidItl(strValue);
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
    private final static javax.xml.namespace.QName QName_0_1 = 
           com.ibm.ws.webservices.engine.utils.QNameTable.createQName(
                  "",
                  "custFirstName");
    private final static javax.xml.namespace.QName QName_0_2 = 
           com.ibm.ws.webservices.engine.utils.QNameTable.createQName(
                  "",
                  "custLastName");
    private final static javax.xml.namespace.QName QName_0_3 = 
           com.ibm.ws.webservices.engine.utils.QNameTable.createQName(
                  "",
                  "custMidItl");
    private final static javax.xml.namespace.QName QName_0_0 = 
           com.ibm.ws.webservices.engine.utils.QNameTable.createQName(
                  "",
                  "custDOB");
}
