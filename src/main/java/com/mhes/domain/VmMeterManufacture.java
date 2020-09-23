/**
 * 
 */
package com.mhes.domain;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonAutoDetect;

import java.time.LocalDateTime;
import java.util.List;
import java.io.Serializable;

/**
 * @author SureshKumar
 *
 */
@Entity
@Table(name = "vmmetermanufacture")
@JsonAutoDetect
public class VmMeterManufacture implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 898249171056887586L;

	@Id // primary key
	@GeneratedValue(strategy = GenerationType.IDENTITY) // auto increment
	@Column(name = "autoid")
	private long autoId;

	@Column(name = "manufactureCode")
	private String manufactureCode;

	@Column(name = "manufactureName")
	private String manufactureName;

	@Column(name = "description")
	private String description;

	@Column(name = "manufacured")
	private String manufacured;

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
	private Long companyAutoId;

	@OneToMany(mappedBy = "vmMeterManufacture", cascade = {CascadeType.ALL})
	private List<MrMeterDetails> mrMeterDetails;

	public long getAutoId() {
		return autoId;
	}

	public void setAutoId(long autoId) {
		this.autoId = autoId;
	}

	public String getManufactureCode() {
		return manufactureCode;
	}

	public void setManufactureCode(String manufactureCode) {
		this.manufactureCode = manufactureCode;
	}

	public String getManufactureName() {
		return manufactureName;
	}

	public void setManufactureName(String manufactureName) {
		this.manufactureName = manufactureName;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getManufacured() {
		return manufacured;
	}

	public void setManufacured(String manufacured) {
		this.manufacured = manufacured;
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

	public Long getCompanyAutoId() {
		return companyAutoId;
	}

	public void setCompanyAutoId(Long companyAutoId) {
		this.companyAutoId = companyAutoId;
	}

	/**
	 * @return the mrMeterDetails
	 */
	/*public List<MrMeterDetails> getMrMeterDetails() {
		return mrMeterDetails;
	}*/

	/**
	 * @param mrMeterDetails the mrMeterDetails to set
	 */
	/*public void setMrMeterDetails(List<MrMeterDetails> mrMeterDetails) {
		this.mrMeterDetails = mrMeterDetails;
	}*/

	@Override
	public String toString() {
		return "VmMeterManufacture [autoId=" + autoId + ", manufactureCode=" + manufactureCode + ", manufactureName="
				+ manufactureName + ", description=" + description + ", manufacured=" + manufacured + ", status="
				+ status + ", insertedBy=" + insertedBy + ", insertedDate=" + insertedDate + ", updatedBy=" + updatedBy
				+ ", updatedDate=" + updatedDate + ", companyAutoId=" + companyAutoId + "]";
	}

}