package com.acumen.iunit.domain;

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
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonAutoDetect;

/**
 * 
 * @author RedMind
 *
 */
@Entity
@Table(name = "mrmeterconnectioninfo")
@JsonAutoDetect
public class MrMeterConnectionInfo implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8494369919936201959L;

	@Id                                                     // primary key
    @GeneratedValue(strategy = GenerationType.IDENTITY)     // auto increment
    @Column(name = "autoid")
    private Long autoId;
	

	//@Column(name = "companyAutoid")
   // private long companyAutoid;
	
	@ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name ="companyAutoid", referencedColumnName = "autoid")
	private VmCompanyProfile vmCompanyProfile;
	
	
	  @ManyToOne(cascade = CascadeType.ALL)
	  @JoinColumn(name ="meterAutoid", referencedColumnName = "autoid") 
	  private MrMeterDetails mrMeterDetails;
	 
	
	//@Column(name = "meterAutoid")
    //private long meterAutoid;
	
	@Column(name = "meterIp")
    private String meterIp;
	
	@Column(name = "meterPort")
    private String meterPort;
	
	@Column(name = "aunthenticationType")
    private String aunthenticationType;
	
	@Column(name = "meterPassword")
    private String meterPassword;
	
	@Column(name = "systemTitle")
    private String systemTitle;
	
	@Column(name = "blockCipherKey")
    private String blockCipherKey;
	
	@Column(name = "authenticationKey")
    private String authenticationKey;
	
	@Column(name = "referencingName")
    private String referencingName;
	
	@Column(name = "isWrapper")
    private String isWrapper;
	
	@Column(name = "iec")
    private String iec;
	
	@Column(name = "serialPort")
    private String serialPort;
	
	@Column(name = "connectionStatus")
    private String connectionStatus;
	
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

	public VmCompanyProfile getVmCompanyProfile() {
		return vmCompanyProfile;
	}

	public void setVmCompanyProfile(VmCompanyProfile vmCompanyProfile) {
		this.vmCompanyProfile = vmCompanyProfile;
	}

	public MrMeterDetails getMrMeterDetails() {
		return mrMeterDetails;
	}

	public void setMrMeterDetails(MrMeterDetails mrMeterDetails) {
		this.mrMeterDetails = mrMeterDetails;
	}

	public String getMeterIp() {
		return meterIp;
	}

	public void setMeterIp(String meterIp) {
		this.meterIp = meterIp;
	}

	public String getMeterPort() {
		return meterPort;
	}

	public void setMeterPort(String meterPort) {
		this.meterPort = meterPort;
	}

	public String getAunthenticationType() {
		return aunthenticationType;
	}

	public void setAunthenticationType(String aunthenticationType) {
		this.aunthenticationType = aunthenticationType;
	}

	public String getMeterPassword() {
		return meterPassword;
	}

	public void setMeterPassword(String meterPassword) {
		this.meterPassword = meterPassword;
	}

	public String getSystemTitle() {
		return systemTitle;
	}

	public void setSystemTitle(String systemTitle) {
		this.systemTitle = systemTitle;
	}

	public String getBlockCipherKey() {
		return blockCipherKey;
	}

	public void setBlockCipherKey(String blockCipherKey) {
		this.blockCipherKey = blockCipherKey;
	}

	public String getAuthenticationKey() {
		return authenticationKey;
	}

	public void setAuthenticationKey(String authenticationKey) {
		this.authenticationKey = authenticationKey;
	}

	public String getReferencingName() {
		return referencingName;
	}

	public void setReferencingName(String referencingName) {
		this.referencingName = referencingName;
	}

	public String getIsWrapper() {
		return isWrapper;
	}

	public void setIsWrapper(String isWrapper) {
		this.isWrapper = isWrapper;
	}

	public String getIec() {
		return iec;
	}

	public void setIec(String iec) {
		this.iec = iec;
	}

	public String getSerialPort() {
		return serialPort;
	}

	public void setSerialPort(String serialPort) {
		this.serialPort = serialPort;
	}

	public String getConnectionStatus() {
		return connectionStatus;
	}

	public void setConnectionStatus(String connectionStatus) {
		this.connectionStatus = connectionStatus;
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
		return "MrMeterConnectionInfo [autoId=" + autoId + ", vmCompanyProfile=" + vmCompanyProfile
				+ ", mrMeterDetails=" + mrMeterDetails + ", meterIp=" + meterIp + ", meterPort=" + meterPort
				+ ", aunthenticationType=" + aunthenticationType + ", meterPassword=" + meterPassword + ", systemTitle="
				+ systemTitle + ", blockCipherKey=" + blockCipherKey + ", authenticationKey=" + authenticationKey
				+ ", referencingName=" + referencingName + ", isWrapper=" + isWrapper + ", iec=" + iec + ", serialPort="
				+ serialPort + ", connectionStatus=" + connectionStatus + ", insertedBy=" + insertedBy
				+ ", insertedDate=" + insertedDate + ", updatedBy=" + updatedBy + ", updatedDate=" + updatedDate + "]";
	}
	
	
}
