package com.mhes.domain;

import javax.persistence.*;
import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.time.LocalDateTime;
import java.util.List;
import java.io.Serializable;

/**
 * @author SureshKumar
 *
 */

@Entity
@Table(name = "mrmeterdetails")
@JsonAutoDetect
public class MrMeterDetails implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6328545016937032828L;

	@Id                                                     // primary key
    @GeneratedValue(strategy = GenerationType.IDENTITY)     // auto increment
    @Column(name = "autoid")
    private Long autoId;
	
	@Column(name = "meterSerialNumber")
	private String meterSerialNumber;
	
	@Column(name = "meterName")
	private String meterName;
	
	@Column(name = "sourceType")
	private String sourceType;
	
	@Column(name = "protocalType")
	private String protocalType;
	
	@Column(name = "phase")
	private String phase;
		
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name ="manufactureAutoid", referencedColumnName = "autoid")
	private VmMeterManufacture vmMeterManufacture;
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name ="companyAutoid", referencedColumnName = "autoid")
	private VmCompanyProfile vmCompanyProfile;

	@OneToMany(mappedBy = "mrMeterDetails", cascade = {CascadeType.ALL})
	private List<DpTimeTable> dpTimeTable;
	
	@JsonIgnore
	@OneToMany(mappedBy = "mrMeterDetails", cascade = {CascadeType.ALL})
	private List<MrMetermfDetails> MrMetermfDetails;
    
	@Column(name = "meterMappedDate")
	private LocalDateTime meterMappedDate;
	
	@Column(name = "ipAddress")
	private String ipAddress;
	
	@Column(name = "imeiNumber")
	private String imeiNumber;
	
	@Column(name = "simNumber")
	private String simNumber;
	
	@Column(name = "imsi")
	private String imsi;
	
	@Column(name = "ccid")
	private String ccid;
	
	@Column(name = "installationType")
	private String installationType;
	
	@Column(name = "installationSubtype")
	private String installationSubtype;
	
	@Column(name = "connectionStatus")
	private String connectionStatus;
	
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
	
	@Column(name = "locationAutoid")
	private long locationAutoid;
	
	@Column(name = "deviceId")
	private String deviceId;
	
	@Column(name = "currentRating")
	private String currentRating;
	

	public Long getAutoId() {
		return autoId;
	}

	public void setAutoId(Long autoId) {
		this.autoId = autoId;
	}

	public String getMeterSerialNumber() {
		return meterSerialNumber;
	}

	public void setMeterSerialNumber(String meterSerialNumber) {
		this.meterSerialNumber = meterSerialNumber;
	}

	public String getMeterName() {
		return meterName;
	}

	public void setMeterName(String meterName) {
		this.meterName = meterName;
	}

	public String getSourceType() {
		return sourceType;
	}

	public void setSourceType(String sourceType) {
		this.sourceType = sourceType;
	}

	public String getProtocalType() {
		return protocalType;
	}

	public void setProtocalType(String protocalType) {
		this.protocalType = protocalType;
	}

	public String getPhase() {
		return phase;
	}

	public void setPhase(String phase) {
		this.phase = phase;
	}

	public LocalDateTime getMeterMappedDate() {
		return meterMappedDate;
	}

	public void setMeterMappedDate(LocalDateTime meterMappedDate) {
		this.meterMappedDate = meterMappedDate;
	}

	public String getIpAddress() {
		return ipAddress;
	}

	public void setIpAddress(String ipAddress) {
		this.ipAddress = ipAddress;
	}

	public String getImeiNumber() {
		return imeiNumber;
	}

	public void setImeiNumber(String imeiNumber) {
		this.imeiNumber = imeiNumber;
	}

	public String getSimNumber() {
		return simNumber;
	}

	public void setSimNumber(String simNumber) {
		this.simNumber = simNumber;
	}

	public String getImsi() {
		return imsi;
	}

	public void setImsi(String imsi) {
		this.imsi = imsi;
	}

	public String getCcid() {
		return ccid;
	}

	public void setCcid(String ccid) {
		this.ccid = ccid;
	}

	public String getInstallationType() {
		return installationType;
	}

	public void setInstallationType(String installationType) {
		this.installationType = installationType;
	}

	public String getInstallationSubtype() {
		return installationSubtype;
	}

	public void setInstallationSubtype(String installationSubtype) {
		this.installationSubtype = installationSubtype;
	}

	public String getConnectionStatus() {
		return connectionStatus;
	}

	public void setConnectionStatus(String connectionStatus) {
		this.connectionStatus = connectionStatus;
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

	public long getLocationAutoid() {
		return locationAutoid;
	}

	public void setLocationAutoid(long locationAutoid) {
		this.locationAutoid = locationAutoid;
	}

	public String getDeviceId() {
		return deviceId;
	}

	public void setDeviceId(String deviceId) {
		this.deviceId = deviceId;
	}

	public String getCurrentRating() {
		return currentRating;
	}

	public void setCurrentRating(String currentRating) {
		this.currentRating = currentRating;
	}

	/**
	 * @return the vmCompanyProfile
	 */
	public VmCompanyProfile getVmCompanyProfile() {
		return vmCompanyProfile;
	}

	/**
	 * @param vmCompanyProfile the vmCompanyProfile to set
	 */
	public void setVmCompanyProfile(VmCompanyProfile vmCompanyProfile) {
		this.vmCompanyProfile = vmCompanyProfile;
	}

	/**
	 * @return the vmMeterManufacture
	 */
	public VmMeterManufacture getVmMeterManufacture() {
		return vmMeterManufacture;
	}

	/**
	 * @param vmMeterManufacture the vmMeterManufacture to set
	 */
	public void setVmMeterManufacture(VmMeterManufacture vmMeterManufacture) {
		this.vmMeterManufacture = vmMeterManufacture;
	}

	/**
	 * @return the dpTimeTable
	 */
	public List<DpTimeTable> getDpTimeTable() {
		return dpTimeTable;
	}

	/**
	 * @param dpTimeTable the dpTimeTable to set
	 */
	public void setDpTimeTable(List<DpTimeTable> dpTimeTable) {
		this.dpTimeTable = dpTimeTable;
	}

	/**
	 * @return the mrMetermfDetails
	 */
	public List<MrMetermfDetails> getMrMetermfDetails() {
		return MrMetermfDetails;
	}

	/**
	 * @param mrMetermfDetails the mrMetermfDetails to set
	 */
	public void setMrMetermfDetails(List<MrMetermfDetails> mrMetermfDetails) {
		MrMetermfDetails = mrMetermfDetails;
	}

	@Override
	public String toString() {
		return "MrMeterDetails [autoId=" + autoId + ", meterSerialNumber=" + meterSerialNumber + ", meterName="
				+ meterName + ", sourceType=" + sourceType + ", protocalType=" + protocalType + ", phase=" + phase
				+ ", meterMappedDate=" + meterMappedDate + ", ipAddress=" + ipAddress + ", imeiNumber=" + imeiNumber 
				+ ", simNumber=" + simNumber + ", imsi=" + imsi + ", ccid=" + ccid + ", installationType=" + installationType
				+ ", installationSubtype=" + installationSubtype + ", connectionStatus=" + connectionStatus
				+ ", status=" + status + ", insertedBy=" + insertedBy + ", insertedDate=" + insertedDate
				+ ", updatedBy=" + updatedBy + ", updatedDate=" + updatedDate + ", locationAutoid=" + locationAutoid
				+ ", deviceId=" + deviceId + ", currentRating=" + currentRating + "]";
	}
	
}