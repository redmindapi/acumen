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
@Table(name = "cmsection")
@JsonAutoDetect
public class CmSection implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -8565614815061199525L;


	@Id // primary key
	@GeneratedValue(strategy = GenerationType.IDENTITY) // auto increment
	@Column(name = "autoid")
	private Long autoId;

	@Column(name = "circleAutoid")
	private long circleAutoid;

	@Column(name = "divisionAutoid")
	private long divisionAutoid;
	
	@Column(name = "subdivisionAutoid")
	private long subdivisionAutoid;
	
	@Column(name = "sectionCode")
	private String sectionCode;

	@Column(name = "sectionShortName")
	private String sectionShortName;

	@Column(name = "sectionName")
	private String sectionName;

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

	public long getCircleAutoid() {
		return circleAutoid;
	}

	public void setCircleAutoid(long circleAutoid) {
		this.circleAutoid = circleAutoid;
	}

	public long getDivisionAutoid() {
		return divisionAutoid;
	}

	public void setDivisionAutoid(long divisionAutoid) {
		this.divisionAutoid = divisionAutoid;
	}

	public long getSubdivisionAutoid() {
		return subdivisionAutoid;
	}

	public void setSubdivisionAutoid(long subdivisionAutoid) {
		this.subdivisionAutoid = subdivisionAutoid;
	}

	public Long getAutoId() {
		return autoId;
	}

	public void setAutoId(Long autoId) {
		this.autoId = autoId;
	}

	public String getSectionCode() {
		return sectionCode;
	}

	public void setSectionCode(String sectionCode) {
		this.sectionCode = sectionCode;
	}

	public String getSectionShortName() {
		return sectionShortName;
	}

	public void setSectionShortName(String sectionShortName) {
		this.sectionShortName = sectionShortName;
	}

	public String getSectionName() {
		return sectionName;
	}

	public void setSectionName(String sectionName) {
		this.sectionName = sectionName;
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
		return "CmSection [autoId=" + autoId + ", circleAutoid=" + circleAutoid + ", divisionAutoid=" + divisionAutoid
				+ ", subdivisionAutoid=" + subdivisionAutoid + ", sectionCode=" + sectionCode + ", sectionShortName="
				+ sectionShortName + ", sectionName=" + sectionName + ", status=" + status + ", insertedBy="
				+ insertedBy + ", insertedDate=" + insertedDate + ", updatedBy=" + updatedBy + ", updatedDate="
				+ updatedDate + "]";
	}

}
