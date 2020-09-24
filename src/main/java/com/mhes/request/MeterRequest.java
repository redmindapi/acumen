package com.mhes.request;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * 
 * @author RedMind
 *
 */
public class MeterRequest implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -9105232198395924224L;
	
	
	private String meterSerialNumber;
	private String deviceId;
	private String ipAddress;
	private String currentRating;
	private String connectionStatus;
	private String simNumber;
	
	private long mfYear;
	private String fwVersion;
	private String meterType;
	private String meterCategory;
	private BigDecimal  voltageMultipiler;
	private BigDecimal currentMultipiler;
	private BigDecimal energyMultipiler;
	
	private String commonValue;
	private String commonValueInstallType;
	private String commonValueSubType;
	private String commonValueSourceType;
	
	private String circleName;
	private String divisionName;
	private String subdivisionName;
	private String sectionName;
	private String townName;
	private String subStationName;
	private String feederName;
	private String transformerName;
	
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
	 
	public MeterRequest(String meterSerialNumber, String deviceId, String ipAddress, String currentRating,
			String connectionStatus, String simNumber, long mfYear, String fwVersion, String meterType,
			String meterCategory, BigDecimal voltageMultipiler, BigDecimal currentMultipiler,
			BigDecimal energyMultipiler, String commonValue, String commonValueInstallType, String commonValueSubType,
			String commonValueSourceType, String circleName, String divisionName, String subdivisionName,
			String sectionName, String townName, String subStationName, String feederName, String transformerName,
			String longitude, String latitude, String meterIp, String meterPort, String aunthenticationType,
			String meterPassword, String systemTitle, String blockCipherKey, String authenticationKey,
			String referencingName, String isWrapper, String iec, String serialPort, String connectionStatusConnInfo) {
		//super();
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
		this.commonValueInstallType = commonValueInstallType;
		this.commonValueSubType = commonValueSubType;
		this.commonValueSourceType = commonValueSourceType;
		this.circleName = circleName;
		this.divisionName = divisionName;
		this.subdivisionName = subdivisionName;
		this.sectionName = sectionName;
		this.townName = townName;
		this.subStationName = subStationName;
		this.feederName = feederName;
		this.transformerName = transformerName;
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

	public long getMfYear() {
		return mfYear;
	}

	public void setMfYear(long mfYear) {
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

	public String getCommonValueInstallType() {
		return commonValueInstallType;
	}

	public void setCommonValueInstallType(String commonValueInstallType) {
		this.commonValueInstallType = commonValueInstallType;
	}

	public String getCommonValueSubType() {
		return commonValueSubType;
	}

	public void setCommonValueSubType(String commonValueSubType) {
		this.commonValueSubType = commonValueSubType;
	}

	public String getCommonValueSourceType() {
		return commonValueSourceType;
	}

	public void setCommonValueSourceType(String commonValueSourceType) {
		this.commonValueSourceType = commonValueSourceType;
	}

	public String getCircleName() {
		return circleName;
	}

	public void setCircleName(String circleName) {
		this.circleName = circleName;
	}

	public String getDivisionName() {
		return divisionName;
	}

	public void setDivisionName(String divisionName) {
		this.divisionName = divisionName;
	}

	public String getSubdivisionName() {
		return subdivisionName;
	}

	public void setSubdivisionName(String subdivisionName) {
		this.subdivisionName = subdivisionName;
	}

	public String getSectionName() {
		return sectionName;
	}

	public void setSectionName(String sectionName) {
		this.sectionName = sectionName;
	}

	public String getTownName() {
		return townName;
	}

	public void setTownName(String townName) {
		this.townName = townName;
	}

	public String getSubStationName() {
		return subStationName;
	}

	public void setSubStationName(String subStationName) {
		this.subStationName = subStationName;
	}

	public String getFeederName() {
		return feederName;
	}

	public void setFeederName(String feederName) {
		this.feederName = feederName;
	}

	public String getTransformerName() {
		return transformerName;
	}

	public void setTransformerName(String transformerName) {
		this.transformerName = transformerName;
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

	@Override
	public String toString() {
		return "AddMeterRequest [meterSerialNumber=" + meterSerialNumber + ", deviceId=" + deviceId + ", ipAddress="
				+ ipAddress + ", currentRating=" + currentRating + ", connectionStatus=" + connectionStatus
				+ ", simNumber=" + simNumber + ", mfYear=" + mfYear + ", fwVersion=" + fwVersion + ", meterType="
				+ meterType + ", meterCategory=" + meterCategory + ", voltageMultipiler=" + voltageMultipiler
				+ ", currentMultipiler=" + currentMultipiler + ", energyMultipiler=" + energyMultipiler
				+ ", commonValue=" + commonValue + ", commonValueInstallType=" + commonValueInstallType
				+ ", commonValueSubType=" + commonValueSubType + ", commonValueSourceType=" + commonValueSourceType
				+ ", circleName=" + circleName + ", divisionName=" + divisionName + ", subdivisionName="
				+ subdivisionName + ", sectionName=" + sectionName + ", townName=" + townName + ", subStationName="
				+ subStationName + ", feederName=" + feederName + ", transformerName=" + transformerName
				+ ", longitude=" + longitude + ", latitude=" + latitude + ", meterIp=" + meterIp + ", meterPort="
				+ meterPort + ", aunthenticationType=" + aunthenticationType + ", meterPassword=" + meterPassword
				+ ", systemTitle=" + systemTitle + ", blockCipherKey=" + blockCipherKey + ", authenticationKey="
				+ authenticationKey + ", referencingName=" + referencingName + ", isWrapper=" + isWrapper + ", iec="
				+ iec + ", serialPort=" + serialPort + ", connectionStatusConnInfo=" + connectionStatusConnInfo + "]";
	}
	 
	 
}
