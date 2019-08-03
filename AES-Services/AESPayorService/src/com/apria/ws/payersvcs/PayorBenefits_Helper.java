/**
 * PayorBenefits_Helper.java
 *
 * This file was auto-generated from WSDL
 * by the IBM Web services WSDL2Java emitter.
 * cf10631.06 v81706232132
 */

package com.apria.ws.payersvcs;

public class PayorBenefits_Helper {
    // Type metadata
    private static final com.ibm.ws.webservices.engine.description.TypeDesc typeDesc =
        new com.ibm.ws.webservices.engine.description.TypeDesc(PayorBenefits.class);

    static {
        typeDesc.setOption("buildNum","cf10631.06");
        com.ibm.ws.webservices.engine.description.FieldDesc field = new com.ibm.ws.webservices.engine.description.ElementDesc();
        field.setFieldName("pyr_bnft_nm");
        field.setXmlName(com.ibm.ws.webservices.engine.utils.QNameTable.createQName("http://payersvcs.ws.apria.com", "pyr_bnft_nm"));
        field.setXmlType(com.ibm.ws.webservices.engine.utils.QNameTable.createQName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(field);
        field = new com.ibm.ws.webservices.engine.description.ElementDesc();
        field.setFieldName("rptg_pyr_bnft_in");
        field.setXmlName(com.ibm.ws.webservices.engine.utils.QNameTable.createQName("http://payersvcs.ws.apria.com", "rptg_pyr_bnft_in"));
        field.setXmlType(com.ibm.ws.webservices.engine.utils.QNameTable.createQName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(field);
        field = new com.ibm.ws.webservices.engine.description.ElementDesc();
        field.setFieldName("tlphn_prefix_nr");
        field.setXmlName(com.ibm.ws.webservices.engine.utils.QNameTable.createQName("http://payersvcs.ws.apria.com", "tlphn_prefix_nr"));
        field.setXmlType(com.ibm.ws.webservices.engine.utils.QNameTable.createQName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(field);
        field = new com.ibm.ws.webservices.engine.description.ElementDesc();
        field.setFieldName("tlphn_last_nr");
        field.setXmlName(com.ibm.ws.webservices.engine.utils.QNameTable.createQName("http://payersvcs.ws.apria.com", "tlphn_last_nr"));
        field.setXmlType(com.ibm.ws.webservices.engine.utils.QNameTable.createQName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(field);
        field = new com.ibm.ws.webservices.engine.description.ElementDesc();
        field.setFieldName("st_cd");
        field.setXmlName(com.ibm.ws.webservices.engine.utils.QNameTable.createQName("http://payersvcs.ws.apria.com", "st_cd"));
        field.setXmlType(com.ibm.ws.webservices.engine.utils.QNameTable.createQName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(field);
        field = new com.ibm.ws.webservices.engine.description.ElementDesc();
        field.setFieldName("zip_cd");
        field.setXmlName(com.ibm.ws.webservices.engine.utils.QNameTable.createQName("http://payersvcs.ws.apria.com", "zip_cd"));
        field.setXmlType(com.ibm.ws.webservices.engine.utils.QNameTable.createQName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(field);
        field = new com.ibm.ws.webservices.engine.description.ElementDesc();
        field.setFieldName("mstr_agrmt_id");
        field.setXmlName(com.ibm.ws.webservices.engine.utils.QNameTable.createQName("http://payersvcs.ws.apria.com", "mstr_agrmt_id"));
        field.setXmlType(com.ibm.ws.webservices.engine.utils.QNameTable.createQName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(field);
        field = new com.ibm.ws.webservices.engine.description.ElementDesc();
        field.setFieldName("city_nm");
        field.setXmlName(com.ibm.ws.webservices.engine.utils.QNameTable.createQName("http://payersvcs.ws.apria.com", "city_nm"));
        field.setXmlType(com.ibm.ws.webservices.engine.utils.QNameTable.createQName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(field);
        field = new com.ibm.ws.webservices.engine.description.ElementDesc();
        field.setFieldName("agrmt_id");
        field.setXmlName(com.ibm.ws.webservices.engine.utils.QNameTable.createQName("http://payersvcs.ws.apria.com", "agrmt_id"));
        field.setXmlType(com.ibm.ws.webservices.engine.utils.QNameTable.createQName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(field);
        field = new com.ibm.ws.webservices.engine.description.ElementDesc();
        field.setFieldName("addr_line_1_tx");
        field.setXmlName(com.ibm.ws.webservices.engine.utils.QNameTable.createQName("http://payersvcs.ws.apria.com", "addr_line_1_tx"));
        field.setXmlType(com.ibm.ws.webservices.engine.utils.QNameTable.createQName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(field);
        field = new com.ibm.ws.webservices.engine.description.ElementDesc();
        field.setFieldName("mstr_agrmt_unq_sk");
        field.setXmlName(com.ibm.ws.webservices.engine.utils.QNameTable.createQName("http://payersvcs.ws.apria.com", "mstr_agrmt_unq_sk"));
        field.setXmlType(com.ibm.ws.webservices.engine.utils.QNameTable.createQName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(field);
        field = new com.ibm.ws.webservices.engine.description.ElementDesc();
        field.setFieldName("agrmt_nm");
        field.setXmlName(com.ibm.ws.webservices.engine.utils.QNameTable.createQName("http://payersvcs.ws.apria.com", "agrmt_nm"));
        field.setXmlType(com.ibm.ws.webservices.engine.utils.QNameTable.createQName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(field);
        field = new com.ibm.ws.webservices.engine.description.ElementDesc();
        field.setFieldName("pyr_bnft_addr_unq_sk");
        field.setXmlName(com.ibm.ws.webservices.engine.utils.QNameTable.createQName("http://payersvcs.ws.apria.com", "pyr_bnft_addr_unq_sk"));
        field.setXmlType(com.ibm.ws.webservices.engine.utils.QNameTable.createQName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(field);
        field = new com.ibm.ws.webservices.engine.description.ElementDesc();
        field.setFieldName("pyr_bnft_sub_grp_unq_sk");
        field.setXmlName(com.ibm.ws.webservices.engine.utils.QNameTable.createQName("http://payersvcs.ws.apria.com", "pyr_bnft_sub_grp_unq_sk"));
        field.setXmlType(com.ibm.ws.webservices.engine.utils.QNameTable.createQName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(field);
        field = new com.ibm.ws.webservices.engine.description.ElementDesc();
        field.setFieldName("mstr_agrmt_nm");
        field.setXmlName(com.ibm.ws.webservices.engine.utils.QNameTable.createQName("http://payersvcs.ws.apria.com", "mstr_agrmt_nm"));
        field.setXmlType(com.ibm.ws.webservices.engine.utils.QNameTable.createQName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(field);
        field = new com.ibm.ws.webservices.engine.description.ElementDesc();
        field.setFieldName("tlphn_area_nr");
        field.setXmlName(com.ibm.ws.webservices.engine.utils.QNameTable.createQName("http://payersvcs.ws.apria.com", "tlphn_area_nr"));
        field.setXmlType(com.ibm.ws.webservices.engine.utils.QNameTable.createQName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(field);
        field = new com.ibm.ws.webservices.engine.description.ElementDesc();
        field.setFieldName("pyr_bnft_unq_sk");
        field.setXmlName(com.ibm.ws.webservices.engine.utils.QNameTable.createQName("http://payersvcs.ws.apria.com", "pyr_bnft_unq_sk"));
        field.setXmlType(com.ibm.ws.webservices.engine.utils.QNameTable.createQName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(field);
        field = new com.ibm.ws.webservices.engine.description.ElementDesc();
        field.setFieldName("pyr_bnft_id");
        field.setXmlName(com.ibm.ws.webservices.engine.utils.QNameTable.createQName("http://payersvcs.ws.apria.com", "pyr_bnft_id"));
        field.setXmlType(com.ibm.ws.webservices.engine.utils.QNameTable.createQName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(field);
        field = new com.ibm.ws.webservices.engine.description.ElementDesc();
        field.setFieldName("rptg_pyr_bnft_id");
        field.setXmlName(com.ibm.ws.webservices.engine.utils.QNameTable.createQName("http://payersvcs.ws.apria.com", "rptg_pyr_bnft_id"));
        field.setXmlType(com.ibm.ws.webservices.engine.utils.QNameTable.createQName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(field);
        field = new com.ibm.ws.webservices.engine.description.ElementDesc();
        field.setFieldName("rptg_pyr_bnft_nm");
        field.setXmlName(com.ibm.ws.webservices.engine.utils.QNameTable.createQName("http://payersvcs.ws.apria.com", "rptg_pyr_bnft_nm"));
        field.setXmlType(com.ibm.ws.webservices.engine.utils.QNameTable.createQName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(field);
        field = new com.ibm.ws.webservices.engine.description.ElementDesc();
        field.setFieldName("addr_line_2_tx");
        field.setXmlName(com.ibm.ws.webservices.engine.utils.QNameTable.createQName("http://payersvcs.ws.apria.com", "addr_line_2_tx"));
        field.setXmlType(com.ibm.ws.webservices.engine.utils.QNameTable.createQName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(field);
        field = new com.ibm.ws.webservices.engine.description.ElementDesc();
        field.setFieldName("zip_ext_cd");
        field.setXmlName(com.ibm.ws.webservices.engine.utils.QNameTable.createQName("http://payersvcs.ws.apria.com", "zip_ext_cd"));
        field.setXmlType(com.ibm.ws.webservices.engine.utils.QNameTable.createQName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(field);
        field = new com.ibm.ws.webservices.engine.description.ElementDesc();
        field.setFieldName("rthme_agrmt_unq_sk");
        field.setXmlName(com.ibm.ws.webservices.engine.utils.QNameTable.createQName("http://payersvcs.ws.apria.com", "rthme_agrmt_unq_sk"));
        field.setXmlType(com.ibm.ws.webservices.engine.utils.QNameTable.createQName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(field);
    };

    /**
     * Return type metadata object
     */
    public static com.ibm.ws.webservices.engine.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static com.ibm.ws.webservices.engine.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class javaType,  
           javax.xml.namespace.QName xmlType) {
        return 
          new PayorBenefits_Ser(
            javaType, xmlType, typeDesc);
    };

    /**
     * Get Custom Deserializer
     */
    public static com.ibm.ws.webservices.engine.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class javaType,  
           javax.xml.namespace.QName xmlType) {
        return 
          new PayorBenefits_Deser(
            javaType, xmlType, typeDesc);
    };

}
