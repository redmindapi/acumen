package com.acumen.iunit.domain;

import java.io.Serializable;
import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonAutoDetect;

/**
 * 
 * @author RedMind
 *
 */

@Entity
@Table(name = "cmstate")
@JsonAutoDetect
public class CmState implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 5059684385080492032L;

	@Id // primary key
	@GeneratedValue(strategy = GenerationType.IDENTITY) // auto increment
	@Column(name = "autoid")
	private Long autoId;

	@Column(name = "countryautoid")
	private Long countryAutoid;

	@Column(name = "statecode")
	private String stateCode;

	@Column(name = "stateshortname")
	private String stateShortName;

	@Column(name = "statename")
	private String stateName;

	@Column(name = "status")
	private String status;

	@Column(name = "insertedby")
	private String insertedBy;

	@Column(name = "inserteddate")
	private LocalDateTime insertedDate;

	@Column(name = "updatedby")
	private String updatedBy;

	@Column(name = "updateddate")
	private LocalDateTime updatedDate;

	public Long getAutoId() {
		return autoId;
	}

	public void setAutoId(Long autoId) {
		this.autoId = autoId;
	}

	public Long getCountryAutoid() {
		return countryAutoid;
	}

	public void setCountryAutoid(Long countryAutoid) {
		this.countryAutoid = countryAutoid;
	}

	public String getStateCode() {
		return stateCode;
	}

	public void setStateCode(String stateCode) {
		this.stateCode = stateCode;
	}

	public String getStateShortNname() {
		return stateShortName;
	}

	public void setStateShortname(String stateShortName) {
		this.stateShortName = stateShortName;
	}

	public String getStateName() {
		return stateName;
	}

	public void setStatename(String stateName) {
		this.stateName = stateName;
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
		return "CmState [autoId=" + autoId + ", countryAutoid=" + countryAutoid + ", stateCode=" + stateCode
				+ ", stateShortName=" + stateShortName + ", stateName=" + stateName + ", status=" + status
				+ ", insertedBy=" + insertedBy + ", insertedDate=" + insertedDate + ", updatedBy=" + updatedBy
				+ ", updatedDate=" + updatedDate + "]";
	}

}
