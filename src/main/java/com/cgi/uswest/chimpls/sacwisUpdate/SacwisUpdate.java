package com.cgi.uswest.chimpls.sacwisUpdate;

import java.math.BigDecimal;
import java.sql.Timestamp;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class SacwisUpdate {
	@Id
    @GeneratedValue(strategy=GenerationType.AUTO)
	private BigDecimal id_sacwis_update;
	
    private BigDecimal id_grp;
    private String	cd_grp; //C for case, P for person, F for Foster care
	private BigDecimal cd_type; //1 for address, 2 for phone etc
	private String tx_update;
	private BigDecimal id_cr;
	private Timestamp ts_cr;
	private String cd_stat;
	
	public BigDecimal getId_sacwis_update() {
		return id_sacwis_update;
	}
	public void setId_sacwis_update(BigDecimal id_sacwis_update) {
		this.id_sacwis_update = id_sacwis_update;
	}
	public BigDecimal getId_grp() {
		return id_grp;
	}
	public void setId_grp(BigDecimal id_grp) {
		this.id_grp = id_grp;
	}
	public String getCd_grp() {
		return cd_grp;
	}
	public void setCd_grp(String cd_grp) {
		this.cd_grp = cd_grp;
	}
	
	public BigDecimal getCd_type() {
		return cd_type;
	}
	public void setCd_type(BigDecimal cd_type) {
		this.cd_type = cd_type;
	}
	public String getTx_update() {
		return tx_update;
	}
	public void setTx_update(String tx_update) {
		this.tx_update = tx_update;
	}
	public BigDecimal getId_cr() {
		return id_cr;
	}
	public void setId_cr(BigDecimal id_cr) {
		this.id_cr = id_cr;
	}
	public Timestamp getTs_cr() {
		return ts_cr;
	}
	public void setTs_cr(Timestamp ts_cr) {
		this.ts_cr = ts_cr;
	}
	public String getCd_stat() {
		return cd_stat;
	}
	public void setCd_stat(String cd_stat) {
		this.cd_stat = cd_stat;
	}
	
}
