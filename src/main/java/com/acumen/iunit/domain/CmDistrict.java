package com.acumen.iunit.domain;

import java.io.Serializable;
import java.time.LocalDateTime;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonAutoDetect;

/**
 * 
 * @author RedMind
 *
 */
@Entity
@Table(name = "cmdistrict")
@JsonAutoDetect
public class CmDistrict implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -8435736573431420804L;

	@Id // primary key
	@GeneratedValue(strategy = GenerationType.IDENTITY) // auto increment
	@Column(name = "autoid")
	private Long autoId;

	@ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	@JoinColumn(name = "countryAutoid", referencedColumnName = "autoid")
	private CmCountry cmCountry;

	@ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	@JoinColumn(name = "stateAutoid", referencedColumnName = "autoid")
	private CmState cmState;

	@Column(name = "districtCode")
	private String districtCode;

	@Column(name = "districtShortName")
	private String districtShortName;

	@Column(name = "districtName")
	private String districtName;

	@Column(name = "status")
	private String status;

	@Column(name = "insertedBy")
	private String insertedBy;

	@Column(name = "insertedDate")
	private LocalDateTime insertedDate;

	@Column(name = "updatedBy")
	private String updatedBy;

	@Column(name = "updatedDate")
	private LocalDateTime updatedDate;

	public Long getAutoId() {
		return autoId;
	}

	public void setAutoId(Long autoId) {
		this.autoId = autoId;
	}

	public CmCountry getCmCountry() {
		return cmCountry;
	}

	public void setCmCountry(CmCountry cmCountry) {
		this.cmCountry = cmCountry;
	}

	public CmState getCmState() {
		return cmState;
	}

	public void setCmState(CmState cmState) {
		this.cmState = cmState;
	}

	public String getDistrictCode() {
		return districtCode;
	}

	public void setDistrictCode(String districtCode) {
		this.districtCode = districtCode;
	}

	public String getDistrictShortName() {
		return districtShortName;
	}

	public void setDistrictShortName(String districtShortName) {
		this.districtShortName = districtShortName;
	}

	public String getDistrictName() {
		return districtName;
	}

	public void setDistrictName(String districtName) {
		this.districtName = districtName;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getInsertedBy() {
		return insertedBy;
	}

	public void setInsertedBy(String insertedBy) {
		this.insertedBy = insertedBy;
	}

	public LocalDateTime getInsertedDate() {
		return insertedDate;
	}

	public void setInsertedDate(LocalDateTime insertedDate) {
		this.insertedDate = insertedDate;
	}

	public String getUpdatedBy() {
		return updatedBy;
	}

	public void setUpdatedBy(String updatedBy) {
		this.updatedBy = updatedBy;
	}

	public LocalDateTime getUpdatedDate() {
		return updatedDate;
	}

	public void setUpdatedDate(LocalDateTime updatedDate) {
		this.updatedDate = updatedDate;
	}

	@Override
	public String toString() {
		return "CmDistrict [autoId=" + autoId + ", cmCountry=" + cmCountry + ", cmState=" + cmState + ", districtCode="
				+ districtCode + ", districtShortName=" + districtShortName + ", districtName=" + districtName
				+ ", status=" + status + ", insertedBy=" + insertedBy + ", insertedDate=" + insertedDate
				+ ", updatedBy=" + updatedBy + ", updatedDate=" + updatedDate + "]";
	}

}
