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
@Table(name = "cmsubstation")
@JsonAutoDetect
public class CmSubStation implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8704451726048633903L;

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

	@Column(name = "townAutoid")
	private long townAutoid;

	@Column(name = "subStationCode")
	private String subStationCode;

	@Column(name = "subStationShortName")
	private String subStationShortName;

	@Column(name = "subStationName")
	private String subStationName;

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

	public long getTownAutoid() {
		return townAutoid;
	}

	public void setTownAutoid(long townAutoid) {
		this.townAutoid = townAutoid;
	}

	public String getSubStationCode() {
		return subStationCode;
	}

	public void setSubStationCode(String subStationCode) {
		this.subStationCode = subStationCode;
	}

	public String getSubStationShortName() {
		return subStationShortName;
	}

	public void setSubStationShortName(String subStationShortName) {
		this.subStationShortName = subStationShortName;
	}

	public String getSubStationName() {
		return subStationName;
	}

	public void setSubStationName(String subStationName) {
		this.subStationName = subStationName;
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
		return "CmSubStation [autoId=" + autoId + ", circleAutoid=" + circleAutoid + ", divisionAutoid="
				+ divisionAutoid + ", subdivisionAutoid=" + subdivisionAutoid + ", sectionAutoid=" + sectionAutoid
				+ ", townAutoid=" + townAutoid + ", subStationCode=" + subStationCode + ", subStationShortName="
				+ subStationShortName + ", subStationName=" + subStationName + ", status=" + status + ", insertedBy="
				+ insertedBy + ", insertedDate=" + insertedDate + ", updatedBy=" + updatedBy + ", updatedDate="
				+ updatedDate + "]";
	}

}
