package com.mhes.domain;

import java.io.Serializable;
import java.time.LocalDateTime;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
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
@Table(name = "dptimetable")
@JsonAutoDetect
public class DpTimeTable implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -9194628483761782232L;

	@Id // primary key
	@GeneratedValue(strategy = GenerationType.IDENTITY) // auto increment
	@Column(name = "autoid")
	private long autoId;

	@Column(name = "profileAutoid")
	private long profileAutoid;

	@Column(name = "firstCommDatetime")
	private LocalDateTime firstCommDatetime;

	@Column(name = "lastCommDatetime")
	private LocalDateTime lastCommDatetime;

	@Column(name = "profileFkId")
	private long profileFkId;

	@Column(name = "insertedBy")
	private String insertedBy;

	@Column(name = "insertedDate")
	private LocalDateTime insertedDate;

	@Column(name = "updatedBy")
	private String updatedBy;

	@Column(name = "updatedDate")
	private LocalDateTime updatedDate;

	@Column(name = "companyAutoid")
	private long companyAutoid;

	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name ="meterAutoid", referencedColumnName = "autoid")
	private MrMeterDetails mrMeterDetails;
	
	public long getAutoId() {
		return autoId;
	}

	public void setAutoId(long autoId) {
		this.autoId = autoId;
	}

	public long getProfileAutoid() {
		return profileAutoid;
	}

	public void setProfileAutoid(long profileAutoid) {
		this.profileAutoid = profileAutoid;
	}

	public LocalDateTime getFirstCommDatetime() {
		return firstCommDatetime;
	}

	public void setFirstCommDatetime(LocalDateTime firstCommDatetime) {
		this.firstCommDatetime = firstCommDatetime;
	}

	public LocalDateTime getLastCommDatetime() {
		return lastCommDatetime;
	}

	public void setLastCommDatetime(LocalDateTime lastCommDatetime) {
		this.lastCommDatetime = lastCommDatetime;
	}

	public long getProfileFkId() {
		return profileFkId;
	}

	public void setProfileFkId(long profileFkId) {
		this.profileFkId = profileFkId;
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

	public long getCompanyAutoid() {
		return companyAutoid;
	}

	public void setCompanyAutoid(long companyAutoid) {
		this.companyAutoid = companyAutoid;
	}

	/**
	 * @return the mrMeterDetails
	 */
	public MrMeterDetails getMrMeterDetails() {
		return mrMeterDetails;
	}

	/**
	 * @param mrMeterDetails the mrMeterDetails to set
	 */
	public void setMrMeterDetails(MrMeterDetails mrMeterDetails) {
		this.mrMeterDetails = mrMeterDetails;
	}

	@Override
	public String toString() {
		return "DpTimeTable [autoId=" + autoId + ", profileAutoid=" + profileAutoid + ", firstCommDatetime="
				+ firstCommDatetime + ", lastCommDatetime=" + lastCommDatetime + ", profileFkId=" + profileFkId
				+ ", insertedBy=" + insertedBy + ", insertedDate=" + insertedDate + ", updatedBy=" + updatedBy
				+ ", updatedDate=" + updatedDate + ", companyAutoid=" + companyAutoid + "]";
	}

}
