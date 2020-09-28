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
@Table(name = "cmcommondetails")
@JsonAutoDetect

public class CmCommonDetails implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7076753061271916048L;

	@Id // primary key
	@GeneratedValue(strategy = GenerationType.IDENTITY) // auto increment
	@Column(name = "autoid")
	private long autoId;

	@Column(name = "commonName")
	private String commonName;

	@Column(name = "commonValue")
	private String commonValue;

	@Column(name = "description")
	private String description;

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

	@Column(name = "companyAutoid")
	private long companyAutoid;

	public long getAutoId() {
		return autoId;
	}

	public void setAutoId(long autoId) {
		this.autoId = autoId;
	}

	public String getCommonName() {
		return commonName;
	}

	public void setCommonName(String commonName) {
		this.commonName = commonName;
	}

	public String getCommonValue() {
		return commonValue;
	}

	public void setCommonValue(String commonValue) {
		this.commonValue = commonValue;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
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

	public long getCompanyAutoid() {
		return companyAutoid;
	}

	public void setCompanyAutoid(long companyAutoid) {
		this.companyAutoid = companyAutoid;
	}

	@Override
	public String toString() {
		return "CmCommonDetails [autoId=" + autoId + ", commonName=" + commonName + ", commonValue=" + commonValue
				+ ", description=" + description + ", status=" + status + ", insertedBy=" + insertedBy
				+ ", insertedDate=" + insertedDate + ", updatedBy=" + updatedBy + ", updatedDate=" + updatedDate
				+ ", companyAutoid=" + companyAutoid + "]";
	}

}
