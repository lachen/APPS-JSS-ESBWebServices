/**
 * PayorBenefits_Deser.java
 *
 * This file was auto-generated from WSDL
 * by the IBM Web services WSDL2Java emitter.
 * cf10631.06 v81706232132
 */

package com.apria.ws.payersvcs;

public class PayorBenefits_Deser extends com.ibm.ws.webservices.engine.encoding.ser.BeanDeserializer {
    /**
     * Constructor
     */
    public PayorBenefits_Deser(
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType, 
           com.ibm.ws.webservices.engine.description.TypeDesc _typeDesc) {
        super(_javaType, _xmlType, _typeDesc);
    }
    /**
     * Create instance of java bean
     */
    public void createValue() {
        value = new com.apria.ws.payersvcs.PayorBenefits();
    }
    protected boolean tryElementSetFromString(javax.xml.namespace.QName qName, java.lang.String strValue) {
        if (qName==QName_0_0) {
          ((PayorBenefits)value).setPyr_bnft_nm(strValue);
          return true;}
        else if (qName==QName_0_1) {
          ((PayorBenefits)value).setRptg_pyr_bnft_in(strValue);
          return true;}
        else if (qName==QName_0_2) {
          ((PayorBenefits)value).setTlphn_prefix_nr(strValue);
          return true;}
        else if (qName==QName_0_3) {
          ((PayorBenefits)value).setTlphn_last_nr(strValue);
          return true;}
        else if (qName==QName_0_4) {
          ((PayorBenefits)value).setSt_cd(strValue);
          return true;}
        else if (qName==QName_0_5) {
          ((PayorBenefits)value).setZip_cd(strValue);
          return true;}
        else if (qName==QName_0_6) {
          ((PayorBenefits)value).setMstr_agrmt_id(strValue);
          return true;}
        else if (qName==QName_0_7) {
          ((PayorBenefits)value).setCity_nm(strValue);
          return true;}
        else if (qName==QName_0_8) {
          ((PayorBenefits)value).setAgrmt_id(strValue);
          return true;}
        else if (qName==QName_0_9) {
          ((PayorBenefits)value).setAddr_line_1_tx(strValue);
          return true;}
        else if (qName==QName_0_10) {
          ((PayorBenefits)value).setMstr_agrmt_unq_sk(strValue);
          return true;}
        else if (qName==QName_0_11) {
          ((PayorBenefits)value).setAgrmt_nm(strValue);
          return true;}
        else if (qName==QName_0_12) {
          ((PayorBenefits)value).setPyr_bnft_addr_unq_sk(strValue);
          return true;}
        else if (qName==QName_0_13) {
          ((PayorBenefits)value).setPyr_bnft_sub_grp_unq_sk(strValue);
          return true;}
        else if (qName==QName_0_14) {
          ((PayorBenefits)value).setMstr_agrmt_nm(strValue);
          return true;}
        else if (qName==QName_0_15) {
          ((PayorBenefits)value).setTlphn_area_nr(strValue);
          return true;}
        else if (qName==QName_0_16) {
          ((PayorBenefits)value).setPyr_bnft_unq_sk(strValue);
          return true;}
        else if (qName==QName_0_17) {
          ((PayorBenefits)value).setPyr_bnft_id(strValue);
          return true;}
        else if (qName==QName_0_18) {
          ((PayorBenefits)value).setRptg_pyr_bnft_id(strValue);
          return true;}
        else if (qName==QName_0_19) {
          ((PayorBenefits)value).setRptg_pyr_bnft_nm(strValue);
          return true;}
        else if (qName==QName_0_20) {
          ((PayorBenefits)value).setAddr_line_2_tx(strValue);
          return true;}
        else if (qName==QName_0_21) {
          ((PayorBenefits)value).setZip_ext_cd(strValue);
          return true;}
        else if (qName==QName_0_22) {
          ((PayorBenefits)value).setRthme_agrmt_unq_sk(strValue);
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
    private final static javax.xml.namespace.QName QName_0_20 = 
           com.ibm.ws.webservices.engine.utils.QNameTable.createQName(
                  "http://payersvcs.ws.apria.com",
                  "addr_line_2_tx");
    private final static javax.xml.namespace.QName QName_0_16 = 
           com.ibm.ws.webservices.engine.utils.QNameTable.createQName(
                  "http://payersvcs.ws.apria.com",
                  "pyr_bnft_unq_sk");
    private final static javax.xml.namespace.QName QName_0_13 = 
           com.ibm.ws.webservices.engine.utils.QNameTable.createQName(
                  "http://payersvcs.ws.apria.com",
                  "pyr_bnft_sub_grp_unq_sk");
    private final static javax.xml.namespace.QName QName_0_3 = 
           com.ibm.ws.webservices.engine.utils.QNameTable.createQName(
                  "http://payersvcs.ws.apria.com",
                  "tlphn_last_nr");
    private final static javax.xml.namespace.QName QName_0_4 = 
           com.ibm.ws.webservices.engine.utils.QNameTable.createQName(
                  "http://payersvcs.ws.apria.com",
                  "st_cd");
    private final static javax.xml.namespace.QName QName_0_0 = 
           com.ibm.ws.webservices.engine.utils.QNameTable.createQName(
                  "http://payersvcs.ws.apria.com",
                  "pyr_bnft_nm");
    private final static javax.xml.namespace.QName QName_0_8 = 
           com.ibm.ws.webservices.engine.utils.QNameTable.createQName(
                  "http://payersvcs.ws.apria.com",
                  "agrmt_id");
    private final static javax.xml.namespace.QName QName_0_19 = 
           com.ibm.ws.webservices.engine.utils.QNameTable.createQName(
                  "http://payersvcs.ws.apria.com",
                  "rptg_pyr_bnft_nm");
    private final static javax.xml.namespace.QName QName_0_17 = 
           com.ibm.ws.webservices.engine.utils.QNameTable.createQName(
                  "http://payersvcs.ws.apria.com",
                  "pyr_bnft_id");
    private final static javax.xml.namespace.QName QName_0_21 = 
           com.ibm.ws.webservices.engine.utils.QNameTable.createQName(
                  "http://payersvcs.ws.apria.com",
                  "zip_ext_cd");
    private final static javax.xml.namespace.QName QName_0_18 = 
           com.ibm.ws.webservices.engine.utils.QNameTable.createQName(
                  "http://payersvcs.ws.apria.com",
                  "rptg_pyr_bnft_id");
    private final static javax.xml.namespace.QName QName_0_7 = 
           com.ibm.ws.webservices.engine.utils.QNameTable.createQName(
                  "http://payersvcs.ws.apria.com",
                  "city_nm");
    private final static javax.xml.namespace.QName QName_0_1 = 
           com.ibm.ws.webservices.engine.utils.QNameTable.createQName(
                  "http://payersvcs.ws.apria.com",
                  "rptg_pyr_bnft_in");
    private final static javax.xml.namespace.QName QName_0_15 = 
           com.ibm.ws.webservices.engine.utils.QNameTable.createQName(
                  "http://payersvcs.ws.apria.com",
                  "tlphn_area_nr");
    private final static javax.xml.namespace.QName QName_0_10 = 
           com.ibm.ws.webservices.engine.utils.QNameTable.createQName(
                  "http://payersvcs.ws.apria.com",
                  "mstr_agrmt_unq_sk");
    private final static javax.xml.namespace.QName QName_0_12 = 
           com.ibm.ws.webservices.engine.utils.QNameTable.createQName(
                  "http://payersvcs.ws.apria.com",
                  "pyr_bnft_addr_unq_sk");
    private final static javax.xml.namespace.QName QName_0_14 = 
           com.ibm.ws.webservices.engine.utils.QNameTable.createQName(
                  "http://payersvcs.ws.apria.com",
                  "mstr_agrmt_nm");
    private final static javax.xml.namespace.QName QName_0_6 = 
           com.ibm.ws.webservices.engine.utils.QNameTable.createQName(
                  "http://payersvcs.ws.apria.com",
                  "mstr_agrmt_id");
    private final static javax.xml.namespace.QName QName_0_5 = 
           com.ibm.ws.webservices.engine.utils.QNameTable.createQName(
                  "http://payersvcs.ws.apria.com",
                  "zip_cd");
    private final static javax.xml.namespace.QName QName_0_11 = 
           com.ibm.ws.webservices.engine.utils.QNameTable.createQName(
                  "http://payersvcs.ws.apria.com",
                  "agrmt_nm");
    private final static javax.xml.namespace.QName QName_0_2 = 
           com.ibm.ws.webservices.engine.utils.QNameTable.createQName(
                  "http://payersvcs.ws.apria.com",
                  "tlphn_prefix_nr");
    private final static javax.xml.namespace.QName QName_0_9 = 
           com.ibm.ws.webservices.engine.utils.QNameTable.createQName(
                  "http://payersvcs.ws.apria.com",
                  "addr_line_1_tx");
    private final static javax.xml.namespace.QName QName_0_22 = 
           com.ibm.ws.webservices.engine.utils.QNameTable.createQName(
                  "http://payersvcs.ws.apria.com",
                  "rthme_agrmt_unq_sk");
}
