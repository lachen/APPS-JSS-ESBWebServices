/**
 * ReferralIntakeWOSts_1_0Result_Deser.java
 *
 * This file was auto-generated from WSDL
 * by the IBM Web services WSDL2Java emitter.
 * cf070942.33 v102309233842
 */

package iseries.wsbeans.referralintakewosts_1_0.xsd;

public class ReferralIntakeWOSts_1_0Result_Deser extends com.ibm.ws.webservices.engine.encoding.ser.BeanDeserializer {
    /**
     * Constructor
     */
    public ReferralIntakeWOSts_1_0Result_Deser(
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType, 
           com.ibm.ws.webservices.engine.description.TypeDesc _typeDesc) {
        super(_javaType, _xmlType, _typeDesc);
    }
    /**
     * Create instance of java bean
     */
    public void createValue() {
        value = new iseries.wsbeans.referralintakewosts_1_0.xsd.ReferralIntakeWOSts_1_0Result();
    }
    protected boolean tryElementSetFromString(javax.xml.namespace.QName qName, java.lang.String strValue) {
        if (qName==QName_3_22) {
          ((ReferralIntakeWOSts_1_0Result)value).set_IntakeCount(com.ibm.ws.webservices.engine.encoding.ser.SimpleDeserializer.parseBigDecimal(strValue));
          return true;}
        else if (qName==QName_3_23) {
          ((ReferralIntakeWOSts_1_0Result)value).set_IntakeOverflow(com.ibm.ws.webservices.engine.encoding.ser.SimpleDeserializer.parseBigDecimal(strValue));
          return true;}
        else if (qName==QName_3_24) {
          ((ReferralIntakeWOSts_1_0Result)value).set_RecCount(com.ibm.ws.webservices.engine.encoding.ser.SimpleDeserializer.parseBigDecimal(strValue));
          return true;}
        else if (qName==QName_3_25) {
          ((ReferralIntakeWOSts_1_0Result)value).set_RecStatus(strValue);
          return true;}
        else if (qName==QName_3_26) {
          ((ReferralIntakeWOSts_1_0Result)value).set_WOCount(com.ibm.ws.webservices.engine.encoding.ser.SimpleDeserializer.parseBigDecimal(strValue));
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
        if (qName==QName_3_21) {
          iseries.wsbeans.referralintakewosts_1_0.xsd.Intake[] array = new iseries.wsbeans.referralintakewosts_1_0.xsd.Intake[listValue.size()];
          listValue.toArray(array);
          ((ReferralIntakeWOSts_1_0Result)value).set_Intake(array);
          return true;}
        else if (qName==QName_3_27) {
          iseries.wsbeans.referralintakewosts_1_0.xsd.WorkOrder[] array = new iseries.wsbeans.referralintakewosts_1_0.xsd.WorkOrder[listValue.size()];
          listValue.toArray(array);
          ((ReferralIntakeWOSts_1_0Result)value).set_WorkOrder(array);
          return true;}
        return false;
    }
    private final static javax.xml.namespace.QName QName_3_26 = 
           com.ibm.ws.webservices.engine.utils.QNameTable.createQName(
                  "http://referralintakewosts_1_0.wsbeans.iseries/xsd",
                  "_WOCount");
    private final static javax.xml.namespace.QName QName_3_27 = 
           com.ibm.ws.webservices.engine.utils.QNameTable.createQName(
                  "http://referralintakewosts_1_0.wsbeans.iseries/xsd",
                  "_WorkOrder");
    private final static javax.xml.namespace.QName QName_3_22 = 
           com.ibm.ws.webservices.engine.utils.QNameTable.createQName(
                  "http://referralintakewosts_1_0.wsbeans.iseries/xsd",
                  "_IntakeCount");
    private final static javax.xml.namespace.QName QName_3_25 = 
           com.ibm.ws.webservices.engine.utils.QNameTable.createQName(
                  "http://referralintakewosts_1_0.wsbeans.iseries/xsd",
                  "_RecStatus");
    private final static javax.xml.namespace.QName QName_3_23 = 
           com.ibm.ws.webservices.engine.utils.QNameTable.createQName(
                  "http://referralintakewosts_1_0.wsbeans.iseries/xsd",
                  "_IntakeOverflow");
    private final static javax.xml.namespace.QName QName_3_24 = 
           com.ibm.ws.webservices.engine.utils.QNameTable.createQName(
                  "http://referralintakewosts_1_0.wsbeans.iseries/xsd",
                  "_RecCount");
    private final static javax.xml.namespace.QName QName_3_21 = 
           com.ibm.ws.webservices.engine.utils.QNameTable.createQName(
                  "http://referralintakewosts_1_0.wsbeans.iseries/xsd",
                  "_Intake");
}
