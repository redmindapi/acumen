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
@Table(name = "cmdivision")
@JsonAutoDetect
public class CmDivision implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4053789500108664433L;

	@Id // primary key
	@GeneratedValue(strategy = GenerationType.IDENTITY) // auto increment
	@Column(name = "autoid")
	private Long autoId;

	@Column(name = "circleAutoid")
	private long circleAutoid;

	@Column(name = "divisionCode")
	private String divisionCode;

	@Column(name = "divisionShortName")
	private String divisionShortName;

	@Column(name = "divisionName")
	private String divisionName;

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

	public long getCircleAutoid() {
		return circleAutoid;
	}

	public void setCircleAutoid(long circleAutoid) {
		this.circleAutoid = circleAutoid;
	}

	public String getDivisionCode() {
		return divisionCode;
	}

	public void setDivisionCode(String divisionCode) {
		this.divisionCode = divisionCode;
	}

	public String getDivisionShortName() {
		return divisionShortName;
	}

	public void setDivisionShortName(String divisionShortName) {
		this.divisionShortName = divisionShortName;
	}

	public String getDivisionName() {
		return divisionName;
	}

	public void setDivisionName(String divisionName) {
		this.divisionName = divisionName;
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
		return "CmDivision [autoId=" + autoId + ", circleAutoid=" + circleAutoid + ", divisionCode=" + divisionCode
				+ ", divisionShortName=" + divisionShortName + ", divisionName=" + divisionName + ", status=" + status
				+ ", insertedBy=" + insertedBy + ", insertedDate=" + insertedDate + ", updatedBy=" + updatedBy
				+ ", updatedDate=" + updatedDate + "]";
	}

}
