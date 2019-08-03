package com.apria.ws.payersvcs;

import java.io.Serializable;

public class PayorBenefits implements Serializable {

	private String pyr_bnft_unq_sk;
	private String pyr_bnft_id;
	private String rthme_agrmt_unq_sk;
	private String pyr_bnft_nm;
	private String rptg_pyr_bnft_in;
	private String pyr_bnft_sub_grp_unq_sk;
	private String rptg_pyr_bnft_id;
	private String rptg_pyr_bnft_nm;
	private String agrmt_id;
	private String agrmt_nm;
	private String pyr_bnft_addr_unq_sk;
	private String addr_line_1_tx;
	private String addr_line_2_tx;
	private String city_nm;
	private String st_cd;
	private String zip_cd;
	private String zip_ext_cd;
	private String tlphn_area_nr;
	private String tlphn_prefix_nr;
	private String tlphn_last_nr;
	private String mstr_agrmt_unq_sk;
	private String mstr_agrmt_id;
	private String mstr_agrmt_nm;
	
	
	public String getAddr_line_1_tx() {
		return addr_line_1_tx;
	}
	public void setAddr_line_1_tx(String addr_line_1_tx) {
		this.addr_line_1_tx = addr_line_1_tx;
	}
	public String getAddr_line_2_tx() {
		return addr_line_2_tx;
	}
	public void setAddr_line_2_tx(String addr_line_2_tx) {
		this.addr_line_2_tx = addr_line_2_tx;
	}
	public String getAgrmt_id() {
		return agrmt_id;
	}
	public void setAgrmt_id(String agrmt_id) {
		this.agrmt_id = agrmt_id;
	}
	public String getAgrmt_nm() {
		return agrmt_nm;
	}
	public void setAgrmt_nm(String agrmt_nm) {
		this.agrmt_nm = agrmt_nm;
	}
	public String getCity_nm() {
		return city_nm;
	}
	public void setCity_nm(String city_nm) {
		this.city_nm = city_nm;
	}
	public String getMstr_agrmt_id() {
		return mstr_agrmt_id;
	}
	public void setMstr_agrmt_id(String mstr_agrmt_id) {
		this.mstr_agrmt_id = mstr_agrmt_id;
	}
	public String getMstr_agrmt_nm() {
		return mstr_agrmt_nm;
	}
	public void setMstr_agrmt_nm(String mstr_agrmt_nm) {
		this.mstr_agrmt_nm = mstr_agrmt_nm;
	}
	public String getMstr_agrmt_unq_sk() {
		return mstr_agrmt_unq_sk;
	}
	public void setMstr_agrmt_unq_sk(String mstr_agrmt_unq_sk) {
		this.mstr_agrmt_unq_sk = mstr_agrmt_unq_sk;
	}
	public String getPyr_bnft_addr_unq_sk() {
		return pyr_bnft_addr_unq_sk;
	}
	public void setPyr_bnft_addr_unq_sk(String pyr_bnft_addr_unq_sk) {
		this.pyr_bnft_addr_unq_sk = pyr_bnft_addr_unq_sk;
	}
	public String getPyr_bnft_id() {
		return pyr_bnft_id;
	}
	public void setPyr_bnft_id(String pyr_bnft_id) {
		this.pyr_bnft_id = pyr_bnft_id;
	}
	public String getPyr_bnft_nm() {
		return pyr_bnft_nm;
	}
	public void setPyr_bnft_nm(String pyr_bnft_nm) {
		this.pyr_bnft_nm = pyr_bnft_nm;
	}
	public String getPyr_bnft_sub_grp_unq_sk() {
		return pyr_bnft_sub_grp_unq_sk;
	}
	public void setPyr_bnft_sub_grp_unq_sk(String pyr_bnft_sub_grp_unq_sk) {
		this.pyr_bnft_sub_grp_unq_sk = pyr_bnft_sub_grp_unq_sk;
	}
	public String getPyr_bnft_unq_sk() {
		return pyr_bnft_unq_sk;
	}
	public void setPyr_bnft_unq_sk(String pyr_bnft_unq_sk) {
		this.pyr_bnft_unq_sk = pyr_bnft_unq_sk;
	}
	public String getRptg_pyr_bnft_id() {
		return rptg_pyr_bnft_id;
	}
	public void setRptg_pyr_bnft_id(String rptg_pyr_bnft_id) {
		this.rptg_pyr_bnft_id = rptg_pyr_bnft_id;
	}
	public String getRptg_pyr_bnft_in() {
		return rptg_pyr_bnft_in;
	}
	public void setRptg_pyr_bnft_in(String rptg_pyr_bnft_in) {
		this.rptg_pyr_bnft_in = rptg_pyr_bnft_in;
	}
	public String getRptg_pyr_bnft_nm() {
		return rptg_pyr_bnft_nm;
	}
	public void setRptg_pyr_bnft_nm(String rptg_pyr_bnft_nm) {
		this.rptg_pyr_bnft_nm = rptg_pyr_bnft_nm;
	}
	public String getRthme_agrmt_unq_sk() {
		return rthme_agrmt_unq_sk;
	}
	public void setRthme_agrmt_unq_sk(String rthme_agrmt_unq_sk) {
		this.rthme_agrmt_unq_sk = rthme_agrmt_unq_sk;
	}
	public String getSt_cd() {
		return st_cd;
	}
	public void setSt_cd(String st_cd) {
		this.st_cd = st_cd;
	}
	public String getTlphn_area_nr() {
		return tlphn_area_nr;
	}
	public void setTlphn_area_nr(String tlphn_area_nr) {
		this.tlphn_area_nr = tlphn_area_nr;
	}
	public String getTlphn_last_nr() {
		return tlphn_last_nr;
	}
	public void setTlphn_last_nr(String tlphn_last_nr) {
		this.tlphn_last_nr = tlphn_last_nr;
	}
	public String getTlphn_prefix_nr() {
		return tlphn_prefix_nr;
	}
	public void setTlphn_prefix_nr(String tlphn_prefix_nr) {
		this.tlphn_prefix_nr = tlphn_prefix_nr;
	}
	public String getZip_cd() {
		return zip_cd;
	}
	public void setZip_cd(String zip_cd) {
		this.zip_cd = zip_cd;
	}
	public String getZip_ext_cd() {
		return zip_ext_cd;
	}
	public void setZip_ext_cd(String zip_ext_cd) {
		this.zip_ext_cd = zip_ext_cd;
	}
	
	
	
}
