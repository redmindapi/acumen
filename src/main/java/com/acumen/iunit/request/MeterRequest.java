package com.acumen.iunit.request;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * 
 * @author RedMind
 *
 */

public class MeterRequest implements Serializable{

	private static final long serialVersionUID = -9105232198395924224L;
	private Long  meterAutoId;
	private String meterSerialNumber;
	private String deviceId;
	private String ipAddress;
	private String currentRating;
	private String connectionStatus;
	private String simNumber;
	private Long mfYear;
	private String fwVersion;
	private String meterType;
	private String meterCategory;
	private BigDecimal  voltageMultipiler;
	private BigDecimal currentMultipiler;
	private BigDecimal energyMultipiler;
	private String commonValue;
	private String commonValueInstallationType;
	private String commonValueInstallationSubType;
	private String commonValueSourceType;
	private String circleId;
	private String divisionId;
	private String subDivisionId;
	private String sectionId;
	private String townId;
	private String subStationId;
	private String feederId;
	private String transformerId;
	private String longitude;
	private String latitude;
	private String meterIp;
	private String meterPort;
	private String aunthenticationType;
	private String meterPassword;
	private String systemTitle;
	private String blockCipherKey;
	private String authenticationKey;
	private String referencingName;
	private String isWrapper;
	private String iec;
	private String serialPort;
	private String connectionStatusConnInfo;
	private String vmMeterManufactureAutoId;

	public MeterRequest() {

	}

	public MeterRequest(String meterSerialNumber, String deviceId, String ipAddress, String currentRating,
			String connectionStatus, String simNumber, Long mfYear, String fwVersion, String meterType,
			String meterCategory, BigDecimal voltageMultipiler, BigDecimal currentMultipiler,
			BigDecimal energyMultipiler, String commonValue, String commonValueInstallationType, String commonValueInstallationSubType,
			String commonValueSourceType, String circleId, String divisionId, String subDivisionId,
			String sectionId, String townId, String subStationId, String feederId, String transformerId,
			String longitude, String latitude, String meterIp, String meterPort, String aunthenticationType,
			String meterPassword, String systemTitle, String blockCipherKey, String authenticationKey,
			String referencingName, String isWrapper, String iec, String serialPort, String connectionStatusConnInfo,
			String vmMeterManufactureAutoId,Long  meterAutoId) {
		this.meterSerialNumber = meterSerialNumber;
		this.deviceId = deviceId;
		this.ipAddress = ipAddress;
		this.currentRating = currentRating;
		this.connectionStatus = connectionStatus;
		this.simNumber = simNumber;
		this.mfYear = mfYear;
		this.fwVersion = fwVersion;
		this.meterType = meterType;
		this.meterCategory = meterCategory;
		this.voltageMultipiler = voltageMultipiler;
		this.currentMultipiler = currentMultipiler;
		this.energyMultipiler = energyMultipiler;
		this.commonValue = commonValue;
		this.commonValueInstallationType = commonValueInstallationType;
		this.commonValueInstallationSubType = commonValueInstallationSubType;
		this.commonValueSourceType = commonValueSourceType;
		this.circleId = circleId;
		this.divisionId = divisionId;
		this.subDivisionId = subDivisionId;
		this.sectionId = sectionId;
		this.townId = townId;
		this.subStationId = subStationId;
		this.feederId = feederId;
		this.transformerId = transformerId;
		this.longitude = longitude;
		this.latitude = latitude;
		this.meterIp = meterIp;
		this.meterPort = meterPort;
		this.aunthenticationType = aunthenticationType;
		this.meterPassword = meterPassword;
		this.systemTitle = systemTitle;
		this.blockCipherKey = blockCipherKey;
		this.authenticationKey = authenticationKey;
		this.referencingName = referencingName;
		this.isWrapper = isWrapper;
		this.iec = iec;
		this.serialPort = serialPort;
		this.connectionStatusConnInfo = connectionStatusConnInfo;
		this.vmMeterManufactureAutoId = vmMeterManufactureAutoId;
		this.meterAutoId=meterAutoId;
	}

	public Long getMeterAutoId() {
		return meterAutoId;
	}

	public void setMeterAutoId(Long meterAutoId) {
		this.meterAutoId = meterAutoId;
	}

	public String getMeterSerialNumber() {
		return meterSerialNumber;
	}

	public void setMeterSerialNumber(String meterSerialNumber) {
		this.meterSerialNumber = meterSerialNumber;
	}

	public String getDeviceId() {
		return deviceId;
	}

	public void setDeviceId(String deviceId) {
		this.deviceId = deviceId;
	}

	public String getIpAddress() {
		return ipAddress;
	}

	public void setIpAddress(String ipAddress) {
		this.ipAddress = ipAddress;
	}

	public String getCurrentRating() {
		return currentRating;
	}

	public void setCurrentRating(String currentRating) {
		this.currentRating = currentRating;
	}

	public String getConnectionStatus() {
		return connectionStatus;
	}

	public void setConnectionStatus(String connectionStatus) {
		this.connectionStatus = connectionStatus;
	}

	public String getSimNumber() {
		return simNumber;
	}

	public void setSimNumber(String simNumber) {
		this.simNumber = simNumber;
	}

	public Long getMfYear() {
		return mfYear;
	}

	public void setMfYear(Long mfYear) {
		this.mfYear = mfYear;
	}

	public String getFwVersion() {
		return fwVersion;
	}

	public void setFwVersion(String fwVersion) {
		this.fwVersion = fwVersion;
	}

	public String getMeterType() {
		return meterType;
	}

	public void setMeterType(String meterType) {
		this.meterType = meterType;
	}

	public String getMeterCategory() {
		return meterCategory;
	}

	public void setMeterCategory(String meterCategory) {
		this.meterCategory = meterCategory;
	}

	public BigDecimal getVoltageMultipiler() {
		return voltageMultipiler;
	}

	public void setVoltageMultipiler(BigDecimal voltageMultipiler) {
		this.voltageMultipiler = voltageMultipiler;
	}

	public BigDecimal getCurrentMultipiler() {
		return currentMultipiler;
	}

	public void setCurrentMultipiler(BigDecimal currentMultipiler) {
		this.currentMultipiler = currentMultipiler;
	}

	public BigDecimal getEnergyMultipiler() {
		return energyMultipiler;
	}

	public void setEnergyMultipiler(BigDecimal energyMultipiler) {
		this.energyMultipiler = energyMultipiler;
	}

	public String getCommonValue() {
		return commonValue;
	}

	public void setCommonValue(String commonValue) {
		this.commonValue = commonValue;
	}

	public String getCommonValueInstallationType() {
		return commonValueInstallationType;
	}

	public void setCommonValueInstallationType(String commonValueInstallationType) {
		this.commonValueInstallationType = commonValueInstallationType;
	}

	public String getCommonValueInstallationSubType() {
		return commonValueInstallationSubType;
	}

	public void setCommonValueInstallationSubType(String commonValueInstallationSubType) {
		this.commonValueInstallationSubType = commonValueInstallationSubType;
	}

	public String getCommonValueSourceType() {
		return commonValueSourceType;
	}

	public void setCommonValueSourceType(String commonValueSourceType) {
		this.commonValueSourceType = commonValueSourceType;
	}

	public String getCircleId() {
		return circleId;
	}
	public void setCircleId(String circleId) {
		this.circleId = circleId;
	}

	public void setCircleName(String circleId) {
		this.circleId = circleId;
	}

	public String getDivisionId() {
		return divisionId;
	}

	public void setDivisionId(String divisionId) {
		this.divisionId = divisionId;
	}

	public String getSubDivisionId() {
		return subDivisionId;
	}

	public void setSubDivisionId(String subDivisionId) {
		this.subDivisionId = subDivisionId;
	}

	public String getSectionId() {
		return sectionId;
	}

	public void setSectionId(String sectionId) {
		this.sectionId = sectionId;
	}

	public String getTownId() {
		return townId;
	}

	public void setTownId(String townId) {
		this.townId = townId;
	}

	public String getSubStationId() {
		return subStationId;
	}

	public void setSubStationId(String subStationId) {
		this.subStationId = subStationId;
	}

	public String getFeederId() {
		return feederId;
	}

	public void setFeederId(String feederId) {
		this.feederId = feederId;
	}

	public String getTransformerId() {
		return transformerId;
	}

	public void setTransformerId(String transformerId) {
		this.transformerId = transformerId;
	}

	public String getLongitude() {
		return longitude;
	}

	public void setLongitude(String longitude) {
		this.longitude = longitude;
	}

	public String getLatitude() {
		return latitude;
	}

	public void setLatitude(String latitude) {
		this.latitude = latitude;
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

	public String getConnectionStatusConnInfo() {
		return connectionStatusConnInfo;
	}

	public void setConnectionStatusConnInfo(String connectionStatusConnInfo) {
		this.connectionStatusConnInfo = connectionStatusConnInfo;
	}

	/**
	 * @return the vmMeterManufactureAutoId
	 */
	public String getVmMeterManufactureAutoId() {
		return vmMeterManufactureAutoId;
	}

	/**
	 * @param vmMeterManufactureAutoId the vmMeterManufactureAutoId to set
	 */
	public void setVmMeterManufactureAutoId(String vmMeterManufactureAutoId) {
		this.vmMeterManufactureAutoId = vmMeterManufactureAutoId;
	}

	@Override
	public String toString() {
		return "AddMeterRequest [meterSerialNumber=" + meterSerialNumber + ", deviceId=" + deviceId + ", ipAddress="
				+ ipAddress + ", currentRating=" + currentRating + ", connectionStatus=" + connectionStatus
				+ ", simNumber=" + simNumber + ", mfYear=" + mfYear + ", fwVersion=" + fwVersion + ", meterType="
				+ meterType + ", meterCategory=" + meterCategory + ", voltageMultipiler=" + voltageMultipiler
				+ ", currentMultipiler=" + currentMultipiler + ", energyMultipiler=" + energyMultipiler
				+ ", commonValue=" + commonValue + ", commonValueInstallationType=" + commonValueInstallationType
				+ ", commonValueInstallationSubType=" + commonValueInstallationSubType + ", commonValueSourceType=" + commonValueSourceType
				+ ", circleId=" + circleId + ", divisionId=" + divisionId + ", subDivisionId="
				+ subDivisionId + ", sectionId=" + sectionId + ", townId=" + townId + ", subStationId="
				+ subStationId + ", feederId=" + feederId + ", transformerId=" + transformerId
				+ ", longitude=" + longitude + ", latitude=" + latitude + ", meterIp=" + meterIp + ", meterPort="
				+ meterPort + ", aunthenticationType=" + aunthenticationType + ", meterPassword=" + meterPassword
				+ ", systemTitle=" + systemTitle + ", blockCipherKey=" + blockCipherKey + ", authenticationKey="
				+ authenticationKey + ", referencingName=" + referencingName + ", isWrapper=" + isWrapper + ", iec="
				+ iec + ", serialPort=" + serialPort + ", connectionStatusConnInfo=" + connectionStatusConnInfo
				+ ", vmMeterManufactureAutoId="+ vmMeterManufactureAutoId + ", meterAutoId=" +meterAutoId + "]";
	}
	 
	 
}
