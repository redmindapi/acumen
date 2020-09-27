package com.mhes.domain;

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
@Table(name = "cmtown")
@JsonAutoDetect
public class CmTown implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -1632625844411960229L;

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

	@Column(name = "sectionAutoid")
	private long sectionAutoid;

	@Column(name = "townCode")
	private String townCode;

	@Column(name = "townShortName")
	private String townShortName;

	@Column(name = "townName")
	private String townName;

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

	public long getSectionAutoid() {
		return sectionAutoid;
	}

	public void setSectionAutoid(long sectionAutoid) {
		this.sectionAutoid = sectionAutoid;
	}

	public String getTownCode() {
		return townCode;
	}

	public void setTownCode(String townCode) {
		this.townCode = townCode;
	}

	public String getTownShortName() {
		return townShortName;
	}

	public void setTownShortName(String townShortName) {
		this.townShortName = townShortName;
	}

	public String getTownName() {
		return townName;
	}

	public void setTownName(String townName) {
		this.townName = townName;
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
		return "CmTown [autoId=" + autoId + ", circleAutoid=" + circleAutoid + ", divisionAutoid=" + divisionAutoid
				+ ", subdivisionAutoid=" + subdivisionAutoid + ", sectionAutoid=" + sectionAutoid + ", townCode="
				+ townCode + ", townShortName=" + townShortName + ", townName=" + townName + ", status=" + status
				+ ", insertedBy=" + insertedBy + ", insertedDate=" + insertedDate + ", updatedBy=" + updatedBy
				+ ", updatedDate=" + updatedDate + "]";
	}

}
