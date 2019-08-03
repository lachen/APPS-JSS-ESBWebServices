/**
 * PayorBenefits_Ser.java
 *
 * This file was auto-generated from WSDL
 * by the IBM Web services WSDL2Java emitter.
 * cf10631.06 v81706232132
 */

package com.apria.ws.payersvcs;

public class PayorBenefits_Ser extends com.ibm.ws.webservices.engine.encoding.ser.BeanSerializer {
    /**
     * Constructor
     */
    public PayorBenefits_Ser(
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType, 
           com.ibm.ws.webservices.engine.description.TypeDesc _typeDesc) {
        super(_javaType, _xmlType, _typeDesc);
    }
    public void serialize(
        javax.xml.namespace.QName name,
        org.xml.sax.Attributes attributes,
        java.lang.Object value,
        com.ibm.ws.webservices.engine.encoding.SerializationContext context)
        throws java.io.IOException
    {
        context.startElement(name, addAttributes(attributes, value, context));
        addElements(value, context);
        context.endElement();
    }
    protected org.xml.sax.Attributes addAttributes(
        org.xml.sax.Attributes attributes,
        java.lang.Object value,
        com.ibm.ws.webservices.engine.encoding.SerializationContext context)
        throws java.io.IOException
    {
           javax.xml.namespace.QName
           elemQName = QName_0_0;
           context.qName2String(elemQName, true);
           elemQName = QName_0_1;
           context.qName2String(elemQName, true);
           elemQName = QName_0_2;
           context.qName2String(elemQName, true);
           elemQName = QName_0_3;
           context.qName2String(elemQName, true);
           elemQName = QName_0_4;
           context.qName2String(elemQName, true);
           elemQName = QName_0_5;
           context.qName2String(elemQName, true);
           elemQName = QName_0_6;
           context.qName2String(elemQName, true);
           elemQName = QName_0_7;
           context.qName2String(elemQName, true);
           elemQName = QName_0_8;
           context.qName2String(elemQName, true);
           elemQName = QName_0_9;
           context.qName2String(elemQName, true);
           elemQName = QName_0_10;
           context.qName2String(elemQName, true);
           elemQName = QName_0_11;
           context.qName2String(elemQName, true);
           elemQName = QName_0_12;
           context.qName2String(elemQName, true);
           elemQName = QName_0_13;
           context.qName2String(elemQName, true);
           elemQName = QName_0_14;
           context.qName2String(elemQName, true);
           elemQName = QName_0_15;
           context.qName2String(elemQName, true);
           elemQName = QName_0_16;
           context.qName2String(elemQName, true);
           elemQName = QName_0_17;
           context.qName2String(elemQName, true);
           elemQName = QName_0_18;
           context.qName2String(elemQName, true);
           elemQName = QName_0_19;
           context.qName2String(elemQName, true);
           elemQName = QName_0_20;
           context.qName2String(elemQName, true);
           elemQName = QName_0_21;
           context.qName2String(elemQName, true);
           elemQName = QName_0_22;
           context.qName2String(elemQName, true);
        return attributes;
    }
    protected void addElements(
        java.lang.Object value,
        com.ibm.ws.webservices.engine.encoding.SerializationContext context)
        throws java.io.IOException
    {
        PayorBenefits bean = (PayorBenefits) value;
        java.lang.Object propValue;
        javax.xml.namespace.QName propQName;
        {
          propQName = QName_0_0;
          propValue = bean.getPyr_bnft_nm();
          if (propValue != null && !context.shouldSendXSIType()) {
            context.simpleElement(propQName, null, propValue.toString()); 
          } else {
            serializeChild(propQName, null, 
              propValue, 
              QName_1_23,
              true,null,context);
          }
          propQName = QName_0_1;
          propValue = bean.getRptg_pyr_bnft_in();
          if (propValue != null && !context.shouldSendXSIType()) {
            context.simpleElement(propQName, null, propValue.toString()); 
          } else {
            serializeChild(propQName, null, 
              propValue, 
              QName_1_23,
              true,null,context);
          }
          propQName = QName_0_2;
          propValue = bean.getTlphn_prefix_nr();
          if (propValue != null && !context.shouldSendXSIType()) {
            context.simpleElement(propQName, null, propValue.toString()); 
          } else {
            serializeChild(propQName, null, 
              propValue, 
              QName_1_23,
              true,null,context);
          }
          propQName = QName_0_3;
          propValue = bean.getTlphn_last_nr();
          if (propValue != null && !context.shouldSendXSIType()) {
            context.simpleElement(propQName, null, propValue.toString()); 
          } else {
            serializeChild(propQName, null, 
              propValue, 
              QName_1_23,
              true,null,context);
          }
          propQName = QName_0_4;
          propValue = bean.getSt_cd();
          if (propValue != null && !context.shouldSendXSIType()) {
            context.simpleElement(propQName, null, propValue.toString()); 
          } else {
            serializeChild(propQName, null, 
              propValue, 
              QName_1_23,
              true,null,context);
          }
          propQName = QName_0_5;
          propValue = bean.getZip_cd();
          if (propValue != null && !context.shouldSendXSIType()) {
            context.simpleElement(propQName, null, propValue.toString()); 
          } else {
            serializeChild(propQName, null, 
              propValue, 
              QName_1_23,
              true,null,context);
          }
          propQName = QName_0_6;
          propValue = bean.getMstr_agrmt_id();
          if (propValue != null && !context.shouldSendXSIType()) {
            context.simpleElement(propQName, null, propValue.toString()); 
          } else {
            serializeChild(propQName, null, 
              propValue, 
              QName_1_23,
              true,null,context);
          }
          propQName = QName_0_7;
          propValue = bean.getCity_nm();
          if (propValue != null && !context.shouldSendXSIType()) {
            context.simpleElement(propQName, null, propValue.toString()); 
          } else {
            serializeChild(propQName, null, 
              propValue, 
              QName_1_23,
              true,null,context);
          }
          propQName = QName_0_8;
          propValue = bean.getAgrmt_id();
          if (propValue != null && !context.shouldSendXSIType()) {
            context.simpleElement(propQName, null, propValue.toString()); 
          } else {
            serializeChild(propQName, null, 
              propValue, 
              QName_1_23,
              true,null,context);
          }
          propQName = QName_0_9;
          propValue = bean.getAddr_line_1_tx();
          if (propValue != null && !context.shouldSendXSIType()) {
            context.simpleElement(propQName, null, propValue.toString()); 
          } else {
            serializeChild(propQName, null, 
              propValue, 
              QName_1_23,
              true,null,context);
          }
          propQName = QName_0_10;
          propValue = bean.getMstr_agrmt_unq_sk();
          if (propValue != null && !context.shouldSendXSIType()) {
            context.simpleElement(propQName, null, propValue.toString()); 
          } else {
            serializeChild(propQName, null, 
              propValue, 
              QName_1_23,
              true,null,context);
          }
          propQName = QName_0_11;
          propValue = bean.getAgrmt_nm();
          if (propValue != null && !context.shouldSendXSIType()) {
            context.simpleElement(propQName, null, propValue.toString()); 
          } else {
            serializeChild(propQName, null, 
              propValue, 
              QName_1_23,
              true,null,context);
          }
          propQName = QName_0_12;
          propValue = bean.getPyr_bnft_addr_unq_sk();
          if (propValue != null && !context.shouldSendXSIType()) {
            context.simpleElement(propQName, null, propValue.toString()); 
          } else {
            serializeChild(propQName, null, 
              propValue, 
              QName_1_23,
              true,null,context);
          }
          propQName = QName_0_13;
          propValue = bean.getPyr_bnft_sub_grp_unq_sk();
          if (propValue != null && !context.shouldSendXSIType()) {
            context.simpleElement(propQName, null, propValue.toString()); 
          } else {
            serializeChild(propQName, null, 
              propValue, 
              QName_1_23,
              true,null,context);
          }
          propQName = QName_0_14;
          propValue = bean.getMstr_agrmt_nm();
          if (propValue != null && !context.shouldSendXSIType()) {
            context.simpleElement(propQName, null, propValue.toString()); 
          } else {
            serializeChild(propQName, null, 
              propValue, 
              QName_1_23,
              true,null,context);
          }
          propQName = QName_0_15;
          propValue = bean.getTlphn_area_nr();
          if (propValue != null && !context.shouldSendXSIType()) {
            context.simpleElement(propQName, null, propValue.toString()); 
          } else {
            serializeChild(propQName, null, 
              propValue, 
              QName_1_23,
              true,null,context);
          }
          propQName = QName_0_16;
          propValue = bean.getPyr_bnft_unq_sk();
          if (propValue != null && !context.shouldSendXSIType()) {
            context.simpleElement(propQName, null, propValue.toString()); 
          } else {
            serializeChild(propQName, null, 
              propValue, 
              QName_1_23,
              true,null,context);
          }
          propQName = QName_0_17;
          propValue = bean.getPyr_bnft_id();
          if (propValue != null && !context.shouldSendXSIType()) {
            context.simpleElement(propQName, null, propValue.toString()); 
          } else {
            serializeChild(propQName, null, 
              propValue, 
              QName_1_23,
              true,null,context);
          }
          propQName = QName_0_18;
          propValue = bean.getRptg_pyr_bnft_id();
          if (propValue != null && !context.shouldSendXSIType()) {
            context.simpleElement(propQName, null, propValue.toString()); 
          } else {
            serializeChild(propQName, null, 
              propValue, 
              QName_1_23,
              true,null,context);
          }
          propQName = QName_0_19;
          propValue = bean.getRptg_pyr_bnft_nm();
          if (propValue != null && !context.shouldSendXSIType()) {
            context.simpleElement(propQName, null, propValue.toString()); 
          } else {
            serializeChild(propQName, null, 
              propValue, 
              QName_1_23,
              true,null,context);
          }
          propQName = QName_0_20;
          propValue = bean.getAddr_line_2_tx();
          if (propValue != null && !context.shouldSendXSIType()) {
            context.simpleElement(propQName, null, propValue.toString()); 
          } else {
            serializeChild(propQName, null, 
              propValue, 
              QName_1_23,
              true,null,context);
          }
          propQName = QName_0_21;
          propValue = bean.getZip_ext_cd();
          if (propValue != null && !context.shouldSendXSIType()) {
            context.simpleElement(propQName, null, propValue.toString()); 
          } else {
            serializeChild(propQName, null, 
              propValue, 
              QName_1_23,
              true,null,context);
          }
          propQName = QName_0_22;
          propValue = bean.getRthme_agrmt_unq_sk();
          if (propValue != null && !context.shouldSendXSIType()) {
            context.simpleElement(propQName, null, propValue.toString()); 
          } else {
            serializeChild(propQName, null, 
              propValue, 
              QName_1_23,
              true,null,context);
          }
        }
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
    private final static javax.xml.namespace.QName QName_1_23 = 
           com.ibm.ws.webservices.engine.utils.QNameTable.createQName(
                  "http://www.w3.org/2001/XMLSchema",
                  "string");
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
