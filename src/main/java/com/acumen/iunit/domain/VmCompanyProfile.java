/**
 * 
 */
package com.acumen.iunit.domain;

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
@Table(name = "vmcompanyprofile")
@JsonAutoDetect
public class VmCompanyProfile implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -5844895054203707349L;

	@Id // primary key
	@GeneratedValue(strategy = GenerationType.IDENTITY) // auto increment
	@Column(name = "autoid")
	private long autoId;

	@Column(name = "companyCode")
	private String companyCode;

	@Column(name = "companyName")
	private String companyName;

	@Column(name = "description")
	private String description;

	@Column(name = "address1")
	private String address1;

	@Column(name = "address2")
	private String address2;

	@Column(name = "city")
	private String city;

	@Column(name = "state")
	private String state;

	@Column(name = "country")
	private String country;

	@Column(name = "zipcode")
	private long zipcode;

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

	/*@OneToMany(mappedBy = "vmCompanyProfile", cascade = {CascadeType.ALL})
	private List<MrMeterDetails> mrMeterDetails;*/

	public long getAutoId() {
		return autoId;
	}

	public void setAutoId(long autoId) {
		this.autoId = autoId;
	}

	public String getCompanyCode() {
		return companyCode;
	}

	public void setCompanyCode(String companyCode) {
		this.companyCode = companyCode;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getAddress1() {
		return address1;
	}

	public void setAddress1(String address1) {
		this.address1 = address1;
	}

	public String getAddress2() {
		return address2;
	}

	public void setAddress2(String address2) {
		this.address2 = address2;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public long getZipcode() {
		return zipcode;
	}

	public void setZipcode(long zipcode) {
		this.zipcode = zipcode;
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

	/**
	* @return the mrMeterDetails
	*/
	/*public List<MrMeterDetails> getMrMeterDetails()
	{
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
		return "VmCompanyProfile [autoId=" + autoId + ", companyCode=" + companyCode + ", companyName=" + companyName
				+ ", description=" + description + ", address1=" + address1 + ", address2=" + address2 + ", city="
				+ city + ", state=" + state + ", country=" + country + ", zipcode=" + zipcode + ", status=" + status
				+ ", insertedBy=" + insertedBy + ", insertedDate=" + insertedDate + ", updatedBy=" + updatedBy
				+ ", updatedDate=" + updatedDate + "]";
	}

}