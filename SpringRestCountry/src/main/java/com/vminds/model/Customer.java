package com.vminds.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;
import org.codehaus.jackson.annotate.JsonProperty;

@Entity
@Table(name = "Customer_Tab")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Customer implements java.io.Serializable {
	
	private static final long serialVersionUID = 1L;
	
	
	@Id
	@GeneratedValue
	@Column(name = "CUST_ID")
	private int cust_id;
	
	@Column(name = "CUST_TYP_CDE")
	private String cust_typ_cde;
	
	@Column(name = "ROW_UPDT_RFRN_NUM")
	private int row_updt_rfrn_num;
	
	@Column(name = "CUST_NME")
	private String cust_nme;
	
	@Column(name = "DUNS_NUM")
	private int duns_num;
	
	@Column(name = "CUST_ASOC_CDE")
	private String cust_asoc_cde;
	
	
	public Customer(){
		
	}
	
	public int getCust_id() {
		return cust_id;
	}
	public void setCust_id(int cust_id) {
		this.cust_id = cust_id;
	}
	public String getCust_typ_cde() {
		return cust_typ_cde;
	}
	public void setCust_typ_cde(String cust_typ_cde) {
		this.cust_typ_cde = cust_typ_cde;
	}
	public int getRow_updt_rfrn_num() {
		return row_updt_rfrn_num;
	}
	public void setRow_updt_rfrn_num(int row_updt_rfrn_num) {
		this.row_updt_rfrn_num = row_updt_rfrn_num;
	}
	public String getCust_nme() {
		return cust_nme;
	}
	public void setCust_nme(String cust_nme) {
		this.cust_nme = cust_nme;
	}
	public int getDuns_num() {
		return duns_num;
	}
	public void setDuns_num(int duns_num) {
		this.duns_num = duns_num;
	}
	public String getCust_asoc_cde() {
		return cust_asoc_cde;
	}
	public void setCust_asoc_cde(String cust_asoc_cde) {
		this.cust_asoc_cde = cust_asoc_cde;
	}

	public Customer(@JsonProperty("cust_id") int cust_id, @JsonProperty("cust_typ_cde") String cust_typ_cde,
			@JsonProperty("row_updt_rfrn_num") int row_updt_rfrn_num, @JsonProperty("cust_nme") String cust_nme,
			@JsonProperty("duns_num")int duns_num,@JsonProperty("cust_asoc_cde") String cust_asoc_cde) {
		this.cust_id = cust_id;
		this.cust_typ_cde = cust_typ_cde;
		this.row_updt_rfrn_num = row_updt_rfrn_num;
		this.cust_nme = cust_nme;
		this.duns_num = duns_num;
		this.cust_asoc_cde = cust_asoc_cde;
	}
	
}

