/**
 * ReferralIntakeWOSts_1_0Input_Deser.java
 *
 * This file was auto-generated from WSDL
 * by the IBM Web services WSDL2Java emitter.
 * cf070942.33 v102309233842
 */

package iseries.wsbeans.referralintakewosts_1_0.xsd;

public class ReferralIntakeWOSts_1_0Input_Deser extends com.ibm.ws.webservices.engine.encoding.ser.BeanDeserializer {
    /**
     * Constructor
     */
    public ReferralIntakeWOSts_1_0Input_Deser(
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType, 
           com.ibm.ws.webservices.engine.description.TypeDesc _typeDesc) {
        super(_javaType, _xmlType, _typeDesc);
    }
    /**
     * Create instance of java bean
     */
    public void createValue() {
        value = new iseries.wsbeans.referralintakewosts_1_0.xsd.ReferralIntakeWOSts_1_0Input();
    }
    protected boolean tryElementSetFromString(javax.xml.namespace.QName qName, java.lang.String strValue) {
        if (qName==QName_3_15) {
          ((ReferralIntakeWOSts_1_0Input)value).set_BusinessUnit(strValue);
          return true;}
        else if (qName==QName_3_16) {
          ((ReferralIntakeWOSts_1_0Input)value).set_FromDate(strValue);
          return true;}
        else if (qName==QName_3_17) {
          ((ReferralIntakeWOSts_1_0Input)value).set_IntakeStartSeq(com.ibm.ws.webservices.engine.encoding.ser.SimpleDeserializer.parseBigDecimal(strValue));
          return true;}
        else if (qName==QName_3_18) {
          ((ReferralIntakeWOSts_1_0Input)value).set_ReferralZipCode(strValue);
          return true;}
        else if (qName==QName_3_19) {
          ((ReferralIntakeWOSts_1_0Input)value).set_ToDate(strValue);
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
    private final static javax.xml.namespace.QName QName_3_19 = 
           com.ibm.ws.webservices.engine.utils.QNameTable.createQName(
                  "http://referralintakewosts_1_0.wsbeans.iseries/xsd",
                  "_ToDate");
    private final static javax.xml.namespace.QName QName_3_18 = 
           com.ibm.ws.webservices.engine.utils.QNameTable.createQName(
                  "http://referralintakewosts_1_0.wsbeans.iseries/xsd",
                  "_ReferralZipCode");
    private final static javax.xml.namespace.QName QName_3_16 = 
           com.ibm.ws.webservices.engine.utils.QNameTable.createQName(
                  "http://referralintakewosts_1_0.wsbeans.iseries/xsd",
                  "_FromDate");
    private final static javax.xml.namespace.QName QName_3_17 = 
           com.ibm.ws.webservices.engine.utils.QNameTable.createQName(
                  "http://referralintakewosts_1_0.wsbeans.iseries/xsd",
                  "_IntakeStartSeq");
    private final static javax.xml.namespace.QName QName_3_15 = 
           com.ibm.ws.webservices.engine.utils.QNameTable.createQName(
                  "http://referralintakewosts_1_0.wsbeans.iseries/xsd",
                  "_BusinessUnit");
}
