/**
 * AES_MB_IntakeWOList_Request_Deser.java
 *
 * This file was auto-generated from WSDL
 * by the IBM Web services WSDL2Java emitter.
 * cf070942.33 v102309233842
 */

package AES_MB_IntakeWOList_Lib_1_0;

public class AES_MB_IntakeWOList_Request_Deser extends com.ibm.ws.webservices.engine.encoding.ser.BeanDeserializer {
    /**
     * Constructor
     */
    public AES_MB_IntakeWOList_Request_Deser(
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType, 
           com.ibm.ws.webservices.engine.description.TypeDesc _typeDesc) {
        super(_javaType, _xmlType, _typeDesc);
    }
    /**
     * Create instance of java bean
     */
    public void createValue() {
        value = new AES_MB_IntakeWOList_Lib_1_0.AES_MB_IntakeWOList_Request();
    }
    protected boolean tryElementSetFromString(javax.xml.namespace.QName qName, java.lang.String strValue) {
        if (qName==QName_0_0) {
          ((AES_MB_IntakeWOList_Request)value).setBranch(strValue);
          return true;}
        else if (qName==QName_0_1) {
          ((AES_MB_IntakeWOList_Request)value).setFromDate(strValue);
          return true;}
        else if (qName==QName_0_2) {
          ((AES_MB_IntakeWOList_Request)value).setToDate(strValue);
          return true;}
        else if (qName==QName_0_3) {
          ((AES_MB_IntakeWOList_Request)value).setZipCode(strValue);
          return true;}
        else if (qName==QName_0_4) {
          ((AES_MB_IntakeWOList_Request)value).setBranchHost(strValue);
          return true;}
        else if (qName==QName_0_5) {
          ((AES_MB_IntakeWOList_Request)value).setIntakeStartSeq(strValue);
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
    private final static javax.xml.namespace.QName QName_0_2 = 
           com.ibm.ws.webservices.engine.utils.QNameTable.createQName(
                  "",
                  "toDate");
    private final static javax.xml.namespace.QName QName_0_4 = 
           com.ibm.ws.webservices.engine.utils.QNameTable.createQName(
                  "",
                  "branchHost");
    private final static javax.xml.namespace.QName QName_0_3 = 
           com.ibm.ws.webservices.engine.utils.QNameTable.createQName(
                  "",
                  "zipCode");
    private final static javax.xml.namespace.QName QName_0_1 = 
           com.ibm.ws.webservices.engine.utils.QNameTable.createQName(
                  "",
                  "fromDate");
    private final static javax.xml.namespace.QName QName_0_0 = 
           com.ibm.ws.webservices.engine.utils.QNameTable.createQName(
                  "",
                  "branch");
    private final static javax.xml.namespace.QName QName_0_5 = 
           com.ibm.ws.webservices.engine.utils.QNameTable.createQName(
                  "",
                  "intakeStartSeq");
}
