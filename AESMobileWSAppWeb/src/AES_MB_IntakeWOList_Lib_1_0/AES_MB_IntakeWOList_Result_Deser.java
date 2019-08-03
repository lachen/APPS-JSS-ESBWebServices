/**
 * AES_MB_IntakeWOList_Result_Deser.java
 *
 * This file was auto-generated from WSDL
 * by the IBM Web services WSDL2Java emitter.
 * cf070942.33 v102309233842
 */

package AES_MB_IntakeWOList_Lib_1_0;

public class AES_MB_IntakeWOList_Result_Deser extends com.ibm.ws.webservices.engine.encoding.ser.BeanDeserializer {
    /**
     * Constructor
     */
    public AES_MB_IntakeWOList_Result_Deser(
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType, 
           com.ibm.ws.webservices.engine.description.TypeDesc _typeDesc) {
        super(_javaType, _xmlType, _typeDesc);
    }
    /**
     * Create instance of java bean
     */
    public void createValue() {
        value = new AES_MB_IntakeWOList_Lib_1_0.AES_MB_IntakeWOList_Result();
    }
    protected boolean tryElementSetFromString(javax.xml.namespace.QName qName, java.lang.String strValue) {
        if (qName==QName_0_8) {
          ((AES_MB_IntakeWOList_Result)value).setIntakeCount(strValue);
          return true;}
        else if (qName==QName_0_9) {
          ((AES_MB_IntakeWOList_Result)value).setIntakeOverFlow(strValue);
          return true;}
        else if (qName==QName_0_10) {
          ((AES_MB_IntakeWOList_Result)value).setRecCount(strValue);
          return true;}
        else if (qName==QName_0_11) {
          ((AES_MB_IntakeWOList_Result)value).setRecStatus(strValue);
          return true;}
        else if (qName==QName_0_12) {
          ((AES_MB_IntakeWOList_Result)value).setWOCount(strValue);
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
        if (qName==QName_0_7) {
          AES_MB_IntakeWOList_Lib_1_0.Intake[] array = new AES_MB_IntakeWOList_Lib_1_0.Intake[listValue.size()];
          listValue.toArray(array);
          ((AES_MB_IntakeWOList_Result)value).setIntake(array);
          return true;}
        else if (qName==QName_0_13) {
          AES_MB_IntakeWOList_Lib_1_0.WorkOrder[] array = new AES_MB_IntakeWOList_Lib_1_0.WorkOrder[listValue.size()];
          listValue.toArray(array);
          ((AES_MB_IntakeWOList_Result)value).setWorkOrder(array);
          return true;}
        return false;
    }
    private final static javax.xml.namespace.QName QName_0_13 = 
           com.ibm.ws.webservices.engine.utils.QNameTable.createQName(
                  "",
                  "WorkOrder");
    private final static javax.xml.namespace.QName QName_0_8 = 
           com.ibm.ws.webservices.engine.utils.QNameTable.createQName(
                  "",
                  "IntakeCount");
    private final static javax.xml.namespace.QName QName_0_10 = 
           com.ibm.ws.webservices.engine.utils.QNameTable.createQName(
                  "",
                  "RecCount");
    private final static javax.xml.namespace.QName QName_0_9 = 
           com.ibm.ws.webservices.engine.utils.QNameTable.createQName(
                  "",
                  "IntakeOverFlow");
    private final static javax.xml.namespace.QName QName_0_12 = 
           com.ibm.ws.webservices.engine.utils.QNameTable.createQName(
                  "",
                  "WOCount");
    private final static javax.xml.namespace.QName QName_0_7 = 
           com.ibm.ws.webservices.engine.utils.QNameTable.createQName(
                  "",
                  "Intake");
    private final static javax.xml.namespace.QName QName_0_11 = 
           com.ibm.ws.webservices.engine.utils.QNameTable.createQName(
                  "",
                  "RecStatus");
}
