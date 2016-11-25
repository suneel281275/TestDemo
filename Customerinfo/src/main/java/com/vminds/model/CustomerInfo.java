package com.vminds.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;

@Entity
@Table(name = "CUST_INFO_T")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class CustomerInfo implements java.io.Serializable {
	
	
	private static final long serialVersionUID = 1L;
	
     	
	@Id
	@GeneratedValue
	@Column(name = "CUST_ID")
	private int cust_id;
	
	@Column(name = "UND_RGN_CDE")
	private double regionCode;
	
	@Column(name = "GEO_SALE_AREA_CDE")
	private String areaCode;
	
	@Column(name = "ROW_UPDT_RFRN_NUM")
	private String rowUpdateRefNum;
	
	
	@Column(name ="MKT_CDE")
	private int marketCode;
	
	@Column(name = "PREM_EQV_CDE")
	private String premEqvCde;
	
	@Column(name = "MKT_SGA_CDE")
	private String mktSgaCde;
	
	
	public CustomerInfo(){
		
	}

	public int getCust_id() {
		return cust_id;
	}

	public void setCust_id(int cust_id) {
		this.cust_id = cust_id;
	}

	public double getRegionCode() {
		return regionCode;
	}

	public void setRegionCode(double regionCode) {
		this.regionCode = regionCode;
	}

	public String getAreaCode() {
		return areaCode;
	}

	public void setAreaCode(String areaCode) {
		this.areaCode = areaCode;
	}

	public String getRowUpdateRefNum() {
		return rowUpdateRefNum;
	}

	public void setRowUpdateRefNum(String rowUpdateRefNum) {
		this.rowUpdateRefNum = rowUpdateRefNum;
	}

	public int getMarketCode() {
		return marketCode;
	}

	public void setMarketCode(int marketCode) {
		this.marketCode = marketCode;
	}

	public String getPremEqvCde() {
		return premEqvCde;
	}

	public void setPremEqvCde(String premEqvCde) {
		this.premEqvCde = premEqvCde;
	}

	public String getMktSgaCde() {
		return mktSgaCde;
	}

	public void setMktSgaCde(String mktSgaCde) {
		this.mktSgaCde = mktSgaCde;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
}
