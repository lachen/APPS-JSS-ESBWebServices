/**
 * Intake_Deser.java
 *
 * This file was auto-generated from WSDL
 * by the IBM Web services WSDL2Java emitter.
 * cf070942.33 v102309233842
 */

package iseries.wsbeans.referralintakewosts_1_0.xsd;

public class Intake_Deser extends com.ibm.ws.webservices.engine.encoding.ser.BeanDeserializer {
    /**
     * Constructor
     */
    public Intake_Deser(
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType, 
           com.ibm.ws.webservices.engine.description.TypeDesc _typeDesc) {
        super(_javaType, _xmlType, _typeDesc);
    }
    /**
     * Create instance of java bean
     */
    public void createValue() {
        value = new iseries.wsbeans.referralintakewosts_1_0.xsd.Intake();
    }
    protected boolean tryElementSetFromString(javax.xml.namespace.QName qName, java.lang.String strValue) {
        if (qName==QName_3_30) {
          ((Intake)value).set_Associate(strValue);
          return true;}
        else if (qName==QName_3_31) {
          ((Intake)value).set_FollowpCode(strValue);
          return true;}
        else if (qName==QName_3_32) {
          ((Intake)value).set_IntakeCreateDate(strValue);
          return true;}
        else if (qName==QName_3_33) {
          ((Intake)value).set_IntakeCreateTime(strValue);
          return true;}
        else if (qName==QName_3_34) {
          ((Intake)value).set_IntakeStatus(strValue);
          return true;}
        else if (qName==QName_3_35) {
          ((Intake)value).set_IntakeStatusDate(strValue);
          return true;}
        else if (qName==QName_3_36) {
          ((Intake)value).set_IntakeStatusTime(strValue);
          return true;}
        else if (qName==QName_3_37) {
          ((Intake)value).set_Intake_(com.ibm.ws.webservices.engine.encoding.ser.SimpleDeserializer.parseBigDecimal(strValue));
          return true;}
        else if (qName==QName_3_38) {
          ((Intake)value).set_PatientFirstName(strValue);
          return true;}
        else if (qName==QName_3_39) {
          ((Intake)value).set_PatientID(strValue);
          return true;}
        else if (qName==QName_3_40) {
          ((Intake)value).set_PatientLastName(strValue);
          return true;}
        else if (qName==QName_3_41) {
          ((Intake)value).set_PatientMI(strValue);
          return true;}
        else if (qName==QName_3_42) {
          ((Intake)value).set_PhysicianID(strValue);
          return true;}
        else if (qName==QName_3_43) {
          ((Intake)value).set_PhysicianName(strValue);
          return true;}
        else if (qName==QName_3_44) {
          ((Intake)value).set_ReferralID(strValue);
          return true;}
        else if (qName==QName_3_45) {
          ((Intake)value).set_ReferralName(strValue);
          return true;}
        else if (qName==QName_3_18) {
          ((Intake)value).set_ReferralZipCode(strValue);
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
    private final static javax.xml.namespace.QName QName_3_31 = 
           com.ibm.ws.webservices.engine.utils.QNameTable.createQName(
                  "http://referralintakewosts_1_0.wsbeans.iseries/xsd",
                  "_FollowpCode");
    private final static javax.xml.namespace.QName QName_3_36 = 
           com.ibm.ws.webservices.engine.utils.QNameTable.createQName(
                  "http://referralintakewosts_1_0.wsbeans.iseries/xsd",
                  "_IntakeStatusTime");
    private final static javax.xml.namespace.QName QName_3_45 = 
           com.ibm.ws.webservices.engine.utils.QNameTable.createQName(
                  "http://referralintakewosts_1_0.wsbeans.iseries/xsd",
                  "_ReferralName");
    private final static javax.xml.namespace.QName QName_3_37 = 
           com.ibm.ws.webservices.engine.utils.QNameTable.createQName(
                  "http://referralintakewosts_1_0.wsbeans.iseries/xsd",
                  "_Intake_");
    private final static javax.xml.namespace.QName QName_3_32 = 
           com.ibm.ws.webservices.engine.utils.QNameTable.createQName(
                  "http://referralintakewosts_1_0.wsbeans.iseries/xsd",
                  "_IntakeCreateDate");
    private final static javax.xml.namespace.QName QName_3_42 = 
           com.ibm.ws.webservices.engine.utils.QNameTable.createQName(
                  "http://referralintakewosts_1_0.wsbeans.iseries/xsd",
                  "_PhysicianID");
    private final static javax.xml.namespace.QName QName_3_39 = 
           com.ibm.ws.webservices.engine.utils.QNameTable.createQName(
                  "http://referralintakewosts_1_0.wsbeans.iseries/xsd",
                  "_PatientID");
    private final static javax.xml.namespace.QName QName_3_30 = 
           com.ibm.ws.webservices.engine.utils.QNameTable.createQName(
                  "http://referralintakewosts_1_0.wsbeans.iseries/xsd",
                  "_Associate");
    private final static javax.xml.namespace.QName QName_3_40 = 
           com.ibm.ws.webservices.engine.utils.QNameTable.createQName(
                  "http://referralintakewosts_1_0.wsbeans.iseries/xsd",
                  "_PatientLastName");
    private final static javax.xml.namespace.QName QName_3_34 = 
           com.ibm.ws.webservices.engine.utils.QNameTable.createQName(
                  "http://referralintakewosts_1_0.wsbeans.iseries/xsd",
                  "_IntakeStatus");
    private final static javax.xml.namespace.QName QName_3_35 = 
           com.ibm.ws.webservices.engine.utils.QNameTable.createQName(
                  "http://referralintakewosts_1_0.wsbeans.iseries/xsd",
                  "_IntakeStatusDate");
    private final static javax.xml.namespace.QName QName_3_18 = 
           com.ibm.ws.webservices.engine.utils.QNameTable.createQName(
                  "http://referralintakewosts_1_0.wsbeans.iseries/xsd",
                  "_ReferralZipCode");
    private final static javax.xml.namespace.QName QName_3_33 = 
           com.ibm.ws.webservices.engine.utils.QNameTable.createQName(
                  "http://referralintakewosts_1_0.wsbeans.iseries/xsd",
                  "_IntakeCreateTime");
    private final static javax.xml.namespace.QName QName_3_38 = 
           com.ibm.ws.webservices.engine.utils.QNameTable.createQName(
                  "http://referralintakewosts_1_0.wsbeans.iseries/xsd",
                  "_PatientFirstName");
    private final static javax.xml.namespace.QName QName_3_43 = 
           com.ibm.ws.webservices.engine.utils.QNameTable.createQName(
                  "http://referralintakewosts_1_0.wsbeans.iseries/xsd",
                  "_PhysicianName");
    private final static javax.xml.namespace.QName QName_3_41 = 
           com.ibm.ws.webservices.engine.utils.QNameTable.createQName(
                  "http://referralintakewosts_1_0.wsbeans.iseries/xsd",
                  "_PatientMI");
    private final static javax.xml.namespace.QName QName_3_44 = 
           com.ibm.ws.webservices.engine.utils.QNameTable.createQName(
                  "http://referralintakewosts_1_0.wsbeans.iseries/xsd",
                  "_ReferralID");
}
