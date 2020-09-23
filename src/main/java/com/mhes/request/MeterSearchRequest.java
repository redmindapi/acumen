package com.mhes.request;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Date;

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

	  private long circleAutoid;
	  private String circleName;
	  private long divisionAutoid; 
	  private String divisionName; 
	  private long subdivisionAutoid; 
	  private String subdivisionName; 
	  private long sectionAutoid;
	  private String sectionName; 
	  private long townAutoid; 
	  private String townName; 
	  private long substationAutoid; 
	  private String subStationName; 
	  private long feederAutoid; 
	  private String feederName; 
	  private long transformerAutoid; 
	  private String transformerName; 
	  private String manufactureName;
	  private long manufactureautoid;
	  private long yearofManufacture; 
	  private String meterCategory; 
	  private String firmWareVersion; 
	  private String communicated;
	  private Date fromDate; 
	  private Date toDate;
	  private String meterGroup;
	  private String meterSerialNumber;
	 
	  
	  
	 
	public MeterSearchRequest(long circleAutoid, String circleName, long divisionAutoid, String divisionName,
			long subdivisionAutoid, String subdivisionName, long sectionAutoid, String sectionName, long townAutoid,
			String townName, long substationAutoid, String subStationName, long feederAutoid, String feederName,
			long transformerAutoid, String transformerName, String manufactureName, long manufactureautoid,
			long yearofManufacture, String meterCategory, String firmWareVersion, String communicated, Date fromDate,
			Date toDate, String meterGroup, String meterSerialNumber) {
		super();
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
		this.communicated = communicated;
		this.fromDate = fromDate;
		this.toDate = toDate;
		this.meterGroup = meterGroup;
		this.meterSerialNumber = meterSerialNumber;
	}

	public long getCircleAutoid() {
		return circleAutoid;
	}

	public void setCircleAutoid(long circleAutoid) {
		this.circleAutoid = circleAutoid;
	}

	
	  public String getCircleName() { return circleName; }
	  
	  public void setCircleName(String circleName) { this.circleName = circleName;
	  }
	  
	  public long getDivisionAutoid() { return divisionAutoid; }
	  
	  public void setDivisionAutoid(long divisionAutoid) { this.divisionAutoid =
	  divisionAutoid; }
	  
	  public String getDivisionName() { return divisionName; }
	  
	  public void setDivisionName(String divisionName) { this.divisionName =
	  divisionName; }
	  
	  public long getSubdivisionAutoid() { return subdivisionAutoid; }
	  
	  public void setSubdivisionAutoid(long subdivisionAutoid) {
	  this.subdivisionAutoid = subdivisionAutoid; }
	  
	  public String getSubdivisionName() { return subdivisionName; }
	  
	  public void setSubdivisionName(String subdivisionName) { this.subdivisionName
	  = subdivisionName; }
	  
	  public long getSectionAutoid() { return sectionAutoid; }
	  
	  public void setSectionAutoid(long sectionAutoid) { this.sectionAutoid =
	  sectionAutoid; }
	  
	  public String getSectionName() { return sectionName; }
	  
	  public void setSectionName(String sectionName) { this.sectionName =
	  sectionName; }
	  
	  public long getTownAutoid() { return townAutoid; }
	  
	  public void setTownAutoid(long townAutoid) { this.townAutoid = townAutoid; }
	  
	  public String getTownName() { return townName; }
	  
	  public void setTownName(String townName) { this.townName = townName; }
	  
	  public long getSubstationAutoid() { return substationAutoid; }
	  
	  public void setSubstationAutoid(long substationAutoid) {
	  this.substationAutoid = substationAutoid; }
	  
	  public String getSubStationName() { return subStationName; }
	  
	  public void setSubStationName(String subStationName) { this.subStationName =
	  subStationName; }
	  
	  public long getFeederAutoid() { return feederAutoid; }
	  
	  public void setFeederAutoid(long feederAutoid) { this.feederAutoid =
	  feederAutoid; }
	  
	  public String getFeederName() { return feederName; }
	  
	  public void setFeederName(String feederName) { this.feederName = feederName;
	  }
	  
	  public long getTransformerAutoid() { return transformerAutoid; }
	  
	  public void setTransformerAutoid(long transformerAutoid) {
	  this.transformerAutoid = transformerAutoid; }
	  
	  public String getTransformerName() { return transformerName; }
	  
	  public void setTransformerName(String transformerName) { this.transformerName
	  = transformerName; }
	  
	  public String getManufactureName() { return manufactureName; }
	  
	  public void setManufactureName(String manufactureName) { this.manufactureName
	  = manufactureName; }
	  
	  public long getYearofManufacture() { return yearofManufacture; }
	  
	  public void setYearofManufacture(long yearofManufacture) {
	  this.yearofManufacture = yearofManufacture; }
	  
	  public String getMeterCategory() { return meterCategory; }
	  
	  public void setMeterCategory(String meterCategory) { this.meterCategory =
	  meterCategory; }
	  
	  public String getFirmWareVersion() { return firmWareVersion; }
	  
	  public void setFirmWareVersion(String firmWareVersion) { this.firmWareVersion
	  = firmWareVersion; }
	  
	  public String getCommunicated() { return communicated; }
	  
	  public void setCommunicated(String communicated) { this.communicated =
	  communicated; }
	  
	  public Date getFromDate() { return fromDate; }
	  
	  public void setFromDate(Date fromDate) { this.fromDate = fromDate; }
	  
	  public Date getToDate() { return toDate; }
	  
	  public void setToDate(Date toDate) { this.toDate = toDate; }
	  
	  public String getMeterGroup() { return meterGroup; }
	  
	  public void setMeterGroup(String meterGroup) { this.meterGroup = meterGroup;
	  }
	  
	  public String getMeterSerialNumber() { return meterSerialNumber; }
	  
	  public void setMeterSerialNumber(String meterSerialNumber) {
	  this.meterSerialNumber = meterSerialNumber; }
	  /**
		 * @return the manufactureautoid
		 */
		public long getManufactureautoid() {
			return manufactureautoid;
		}

		/**
		 * @param manufactureautoid the manufactureautoid to set
		 */
		public void setManufactureautoid(long manufactureautoid) {
			this.manufactureautoid = manufactureautoid;
		}
	 
}
