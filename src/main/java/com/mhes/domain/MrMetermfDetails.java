package com.mhes.domain;
import java.io.Serializable;
import java.math.BigDecimal;
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
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * 
 * @author RedMind
 *
 */
@Entity
@Table(name = "mrmetermfdetails")
@JsonAutoDetect
public class MrMetermfDetails implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id // primary key
	@GeneratedValue(strategy = GenerationType.IDENTITY) // auto increment
	@Column(name = "autoid")
	private long autoId;

	@Column(name = "mfYear")
	private long mfYear;
	
	@Column(name = "fwVersion")
	private String fwVersion;
	
	@Column(name = "fwDate")
	private LocalDateTime fwDate;
	
	@Column(name = "meterType")
	private String meterType;
	
	@Column(name = "meterCategory")
	private String meterCategory;
	
	@Column(name = "voltageMultipiler")
	private BigDecimal  voltageMultipiler;
	
	@Column(name = "currentMultipiler")
	private BigDecimal currentMultipiler;
	
	@Column(name = "energyMultipiler")
	private BigDecimal energyMultipiler;
	
	@Column(name = "insertedBy")
	private String insertedBy;
	
	@Column(name = "insertedDate")
	private LocalDateTime insertedDate;
	
	@Column(name = "updatedBy")
	private String updatedBy;
	
	@Column(name = "updatedDate")
	private LocalDateTime updatedDate;
	
	@Column(name = "companyAutoid")
	private Long companyAutoid;

	@JsonIgnore
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name ="meterDetailsAutoid", referencedColumnName = "autoid")
	private MrMeterDetails mrMeterDetails;

	/**
	 * @return the autoId
	 */
	public long getAutoId() {
		return autoId;
	}

	/**
	 * @param autoId the autoId to set
	 */
	public void setAutoId(long autoId) {
		this.autoId = autoId;
	}

	/**
	 * @return the mfYear
	 */
	public long getMfYear() {
		return mfYear;
	}

	/**
	 * @param mfYear the mfYear to set
	 */
	public void setMfYear(long mfYear) {
		this.mfYear = mfYear;
	}

	/**
	 * @return the fwVersion
	 */
	public String getFwVersion() {
		return fwVersion;
	}

	/**
	 * @param fwVersion the fwVersion to set
	 */
	public void setFwVersion(String fwVersion) {
		this.fwVersion = fwVersion;
	}

	/**
	 * @return the fwDate
	 */
	public LocalDateTime getFwDate() {
		return fwDate;
	}

	/**
	 * @param fwDate the fwDate to set
	 */
	public void setFwDate(LocalDateTime fwDate) {
		this.fwDate = fwDate;
	}

	/**
	 * @return the meterType
	 */
	public String getMeterType() {
		return meterType;
	}

	/**
	 * @param meterType the meterType to set
	 */
	public void setMeterType(String meterType) {
		this.meterType = meterType;
	}

	/**
	 * @return the meterCategory
	 */
	public String getMeterCategory() {
		return meterCategory;
	}

	/**
	 * @param meterCategory the meterCategory to set
	 */
	public void setMeterCategory(String meterCategory) {
		this.meterCategory = meterCategory;
	}

	/**
	 * @return the voltageMultipiler
	 */
	public BigDecimal getVoltageMultipiler() {
		return voltageMultipiler;
	}

	/**
	 * @param voltageMultipiler the voltageMultipiler to set
	 */
	public void setVoltageMultipiler(BigDecimal voltageMultipiler) {
		this.voltageMultipiler = voltageMultipiler;
	}

	/**
	 * @return the currentMultipiler
	 */
	public BigDecimal getCurrentMultipiler() {
		return currentMultipiler;
	}

	/**
	 * @param currentMultipiler the currentMultipiler to set
	 */
	public void setCurrentMultipiler(BigDecimal currentMultipiler) {
		this.currentMultipiler = currentMultipiler;
	}

	/**
	 * @return the energyMultipiler
	 */
	public BigDecimal getEnergyMultipiler() {
		return energyMultipiler;
	}

	/**
	 * @param energyMultipiler the energyMultipiler to set
	 */
	public void setEnergyMultipiler(BigDecimal energyMultipiler) {
		this.energyMultipiler = energyMultipiler;
	}

	/**
	 * @return the insertedBy
	 */
	public String getInsertedBy() {
		return insertedBy;
	}

	/**
	 * @param insertedBy the insertedBy to set
	 */
	public void setInsertedBy(String insertedBy) {
		this.insertedBy = insertedBy;
	}


	public LocalDateTime getInsertedDate() {
		return insertedDate;
	}

	public void setInsertedDate(LocalDateTime insertedDate) {
		this.insertedDate = insertedDate;
	}

	/**
	 * @return the updatedBy
	 */
	public String getUpdatedBy() {
		return updatedBy;
	}

	/**
	 * @param updatedBy the updatedBy to set
	 */
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
	 * @return the companyAutoid
	 */
	public Long getCompanyAutoid() {
		return companyAutoid;
	}

	/**
	 * @param companyAutoid the companyAutoid to set
	 */
	public void setCompanyAutoid(Long companyAutoid) {
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


}
