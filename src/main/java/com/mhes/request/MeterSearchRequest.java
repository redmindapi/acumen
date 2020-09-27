package com.mhes.request;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * 
 * @author RedMind
 *
 */

public class MeterSearchRequest implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3609045011097645848L;
	private String circleAutoid;
	private String circleName;
	private String divisionAutoid; 
	private String divisionName; 
	private String subdivisionAutoid; 
	private String subdivisionName; 
	private String sectionAutoid;
	private String sectionName; 
	private String townAutoid; 
	private String townName; 
	private String substationAutoid; 
	private String subStationName; 
	private String feederAutoid; 
	private String feederName; 
	private String transformerAutoid; 
	private String transformerName; 
	private String manufactureName;
	private String manufactureautoid;
	private String yearofManufacture; 
	private String meterCategory; 
	private String meterType;
	private String firmWareVersion; 
	private String communicationStatus;
	private LocalDateTime fromDate; 
	private LocalDateTime toDate;
	private String meterGroup;
	private String meterSerialNumber;
	
	public MeterSearchRequest(String circleAutoid, String circleName, String divisionAutoid, String divisionName,
			String subdivisionAutoid, String subdivisionName, String sectionAutoid, String sectionName, String townAutoid,
			String townName, String substationAutoid, String subStationName, String feederAutoid, String feederName,
			String transformerAutoid, String transformerName, String manufactureName, String manufactureautoid,
			String yearofManufacture, String meterCategory, String firmWareVersion, String communicationStatus, LocalDateTime fromDate,
			LocalDateTime toDate, String meterGroup, String meterSerialNumber) {
		this.circleAutoid = circleAutoid;
		this.circleName = circleName;
		this.divisionAutoid = divisionAutoid;
		this.divisionName = divisionName;
		this.subdivisionAutoid = subdivisionAutoid;
		this.subdivisionName = subdivisionName;
		this.sectionAutoid = sectionAutoid;
		this.sectionName = sectionName;
		this.townAutoid = townAutoid;
		this.townName = townName;
		this.substationAutoid = substationAutoid;
		this.subStationName = subStationName;
		this.feederAutoid = feederAutoid;
		this.feederName = feederName;
		this.transformerAutoid = transformerAutoid;
		this.transformerName = transformerName;
		this.manufactureName = manufactureName;
		this.manufactureautoid = manufactureautoid;
		this.yearofManufacture = yearofManufacture;
		this.meterCategory = meterCategory;
		this.firmWareVersion = firmWareVersion;
		this.communicationStatus = communicationStatus;
		this.fromDate = fromDate;
		this.toDate = toDate;
		this.meterGroup = meterGroup;
		this.meterSerialNumber = meterSerialNumber;
	}

	public String getCircleAutoid() {
		return circleAutoid;
	}

	public void setCircleAutoid(String circleAutoid) {
		this.circleAutoid = circleAutoid;
	}

	public String getCircleName() { 
		return circleName;
	}

	public void setCircleName(String circleName) { 
		this.circleName = circleName;
	}

	public String getDivisionAutoid() { 
		return divisionAutoid; 
	}

	public void setDivisionAutoid(String divisionAutoid) { 
		this.divisionAutoid = divisionAutoid;
	}

	public String getDivisionName() { 
		return divisionName;
	}

	public void setDivisionName(String divisionName) { 
		this.divisionName = divisionName;
	}
	
	public String getSubdivisionAutoid() { 
		return subdivisionAutoid; 
	}
	
	public void setSubdivisionAutoid(String subdivisionAutoid) {
		this.subdivisionAutoid = subdivisionAutoid;
	}
	public String getSubdivisionName() { 
		return subdivisionName;
	}
	public void setSubdivisionName(String subdivisionName) { 
		this.subdivisionName = subdivisionName;
	}

	public String getSectionAutoid() { 
		return sectionAutoid;
	}

	public void setSectionAutoid(String sectionAutoid) { 
		this.sectionAutoid = sectionAutoid;
	}

	public String getSectionName() { 
		return sectionName;
	}

	public void setSectionName(String sectionName) { 
		this.sectionName = sectionName;
	}

	public String getTownAutoid() { 
		return townAutoid;
	}

	public void setTownAutoid(String townAutoid) { 
		this.townAutoid = townAutoid;
	}

	public String getTownName() { 
		return townName;
	}

	public void setTownName(String townName) {
		this.townName = townName;
	}

	public String getSubstationAutoid() {
		return substationAutoid;
	}

	public void setSubstationAutoid(String substationAutoid) {
		this.substationAutoid = substationAutoid;
	 }

	public String getSubStationName() {
		return subStationName;
	}

	public void setSubStationName(String subStationName) { 
		this.subStationName = subStationName;
	}

	public String getFeederAutoid() { 
		return feederAutoid;
	}

	public void setFeederAutoid(String feederAutoid) { 
		this.feederAutoid = feederAutoid;
	}

	public String getFeederName() { 
		return feederName;
	}

	public void setFeederName(String feederName) { 
		this.feederName = feederName;
	}

	public String getTransformerAutoid() { 
		return transformerAutoid; 
	}

	public void setTransformerAutoid(String transformerAutoid) {
		this.transformerAutoid = transformerAutoid;
	}

	public String getTransformerName() {
		return transformerName;
	}

	public void setTransformerName(String transformerName) {
		this.transformerName = transformerName;
	}

	public String getManufactureName() { 
		return manufactureName;
	}

	public void setManufactureName(String manufactureName) {
		this.manufactureName = manufactureName;
	}

	public String getYearofManufacture() {
		return yearofManufacture;
	}

	public void setYearofManufacture(String yearofManufacture) {
		this.yearofManufacture = yearofManufacture;
	}

	public String getMeterCategory() { 
		return meterCategory;
	}

	public void setMeterCategory(String meterCategory) {
		this.meterCategory = meterCategory;
	}

	public String getFirmWareVersion() { 
		return firmWareVersion;
	}
	  
	public void setFirmWareVersion(String firmWareVersion) {
		this.firmWareVersion = firmWareVersion;
	}

	public String getCommunicationStatus() { 
		return communicationStatus;
	}
	  
	public void setCommunicationStatus(String communicationStatus) { 
		this.communicationStatus = communicationStatus;
	}
	  
	public LocalDateTime getFromDate() { 
		return fromDate;
	}

	public void setFromDate(LocalDateTime fromDate) { 
		this.fromDate = fromDate;
	}

	public LocalDateTime getToDate() { 
		return toDate;
	}

	public void setToDate(LocalDateTime toDate) { 
		this.toDate = toDate;
	}

	public String getMeterGroup() {
		return meterGroup;
	}

	public void setMeterGroup(String meterGroup) {
		this.meterGroup = meterGroup;
	}

	public String getMeterSerialNumber() {
		return meterSerialNumber;
	}

	public void setMeterSerialNumber(String meterSerialNumber) {
	  this.meterSerialNumber = meterSerialNumber;
	}
	
	  /**
	 * @return the manufactureautoid
	 */
	public String getManufactureautoid() {
		return manufactureautoid;
	}
	
	/**
	 * @param manufactureautoid the manufactureautoid to set
	 */
	public void setManufactureautoid(String manufactureautoid) {
		this.manufactureautoid = manufactureautoid;
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

}