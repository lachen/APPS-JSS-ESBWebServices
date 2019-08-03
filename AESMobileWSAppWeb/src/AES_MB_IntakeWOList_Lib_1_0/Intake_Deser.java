/**
 * Intake_Deser.java
 *
 * This file was auto-generated from WSDL
 * by the IBM Web services WSDL2Java emitter.
 * cf070942.33 v102309233842
 */

package AES_MB_IntakeWOList_Lib_1_0;

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
        value = new AES_MB_IntakeWOList_Lib_1_0.Intake();
    }
    protected boolean tryElementSetFromString(javax.xml.namespace.QName qName, java.lang.String strValue) {
        if (qName==QName_0_40) {
          ((Intake)value).setAssociate(strValue);
          return true;}
        else if (qName==QName_0_41) {
          ((Intake)value).setFollowpCode(strValue);
          return true;}
        else if (qName==QName_0_42) {
          ((Intake)value).setIIntakeCreateDate(strValue);
          return true;}
        else if (qName==QName_0_43) {
          ((Intake)value).setIntakeCreateTime(strValue);
          return true;}
        else if (qName==QName_0_44) {
          ((Intake)value).setIntakeStatus(strValue);
          return true;}
        else if (qName==QName_0_45) {
          ((Intake)value).setIntakeStatusDate(strValue);
          return true;}
        else if (qName==QName_0_46) {
          ((Intake)value).setIntakeStatusTime(strValue);
          return true;}
        else if (qName==QName_0_47) {
          ((Intake)value).setIntake(strValue);
          return true;}
        else if (qName==QName_0_48) {
          ((Intake)value).setPatientFirstName(strValue);
          return true;}
        else if (qName==QName_0_49) {
          ((Intake)value).setPatientID(strValue);
          return true;}
        else if (qName==QName_0_50) {
          ((Intake)value).setPatientLastName(strValue);
          return true;}
        else if (qName==QName_0_51) {
          ((Intake)value).setPatientMI(strValue);
          return true;}
        else if (qName==QName_0_52) {
          ((Intake)value).setPhysicianID(strValue);
          return true;}
        else if (qName==QName_0_53) {
          ((Intake)value).setPhysicianName(strValue);
          return true;}
        else if (qName==QName_0_54) {
          ((Intake)value).setReferralID(strValue);
          return true;}
        else if (qName==QName_0_55) {
          ((Intake)value).setReferralName(strValue);
          return true;}
        else if (qName==QName_0_56) {
          ((Intake)value).setReferralZipCode(strValue);
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
    private final static javax.xml.namespace.QName QName_0_40 = 
           com.ibm.ws.webservices.engine.utils.QNameTable.createQName(
                  "",
                  "associate");
    private final static javax.xml.namespace.QName QName_0_55 = 
           com.ibm.ws.webservices.engine.utils.QNameTable.createQName(
                  "",
                  "referralName");
    private final static javax.xml.namespace.QName QName_0_43 = 
           com.ibm.ws.webservices.engine.utils.QNameTable.createQName(
                  "",
                  "intakeCreateTime");
    private final static javax.xml.namespace.QName QName_0_53 = 
           com.ibm.ws.webservices.engine.utils.QNameTable.createQName(
                  "",
                  "physicianName");
    private final static javax.xml.namespace.QName QName_0_49 = 
           com.ibm.ws.webservices.engine.utils.QNameTable.createQName(
                  "",
                  "patientID");
    private final static javax.xml.namespace.QName QName_0_42 = 
           com.ibm.ws.webservices.engine.utils.QNameTable.createQName(
                  "",
                  "iIntakeCreateDate");
    private final static javax.xml.namespace.QName QName_0_56 = 
           com.ibm.ws.webservices.engine.utils.QNameTable.createQName(
                  "",
                  "referralZipCode");
    private final static javax.xml.namespace.QName QName_0_45 = 
           com.ibm.ws.webservices.engine.utils.QNameTable.createQName(
                  "",
                  "intakeStatusDate");
    private final static javax.xml.namespace.QName QName_0_46 = 
           com.ibm.ws.webservices.engine.utils.QNameTable.createQName(
                  "",
                  "intakeStatusTime");
    private final static javax.xml.namespace.QName QName_0_41 = 
           com.ibm.ws.webservices.engine.utils.QNameTable.createQName(
                  "",
                  "followpCode");
    private final static javax.xml.namespace.QName QName_0_52 = 
           com.ibm.ws.webservices.engine.utils.QNameTable.createQName(
                  "",
                  "physicianID");
    private final static javax.xml.namespace.QName QName_0_48 = 
           com.ibm.ws.webservices.engine.utils.QNameTable.createQName(
                  "",
                  "patientFirstName");
    private final static javax.xml.namespace.QName QName_0_50 = 
           com.ibm.ws.webservices.engine.utils.QNameTable.createQName(
                  "",
                  "patientLastName");
    private final static javax.xml.namespace.QName QName_0_54 = 
           com.ibm.ws.webservices.engine.utils.QNameTable.createQName(
                  "",
                  "referralID");
    private final static javax.xml.namespace.QName QName_0_51 = 
           com.ibm.ws.webservices.engine.utils.QNameTable.createQName(
                  "",
                  "patientMI");
    private final static javax.xml.namespace.QName QName_0_47 = 
           com.ibm.ws.webservices.engine.utils.QNameTable.createQName(
                  "",
                  "intake");
    private final static javax.xml.namespace.QName QName_0_44 = 
           com.ibm.ws.webservices.engine.utils.QNameTable.createQName(
                  "",
                  "intakeStatus");
}
