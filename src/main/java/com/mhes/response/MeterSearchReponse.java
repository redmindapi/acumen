package com.mhes.response;

import java.io.Serializable;
/**
 * 
 * @author RedMind
 *
 */
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
public class MeterSearchReponse implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -4282789267559497113L;

	private String meterSerialNumber;
	private String locationName;
	private String locationCode;
	private String sourceType;
	private String divisionName;
	private String circleName;
	private LocalDateTime firstCommDatetime;
	private LocalDateTime lastCommDatetime;
	private List<String> errmessage= new ArrayList<>();
	
/*	public MeterSearchReponse(String meterSerialNumber, String locationName, String locationCode, String sourceType,
			String divisionName, String circleName, LocalDateTime firstCommDatetime, LocalDateTime lastCommDatetime) {
		//super();
		this.meterSerialNumber = meterSerialNumber;
		this.locationName = locationName;
		this.locationCode = locationCode;
		this.sourceType = sourceType;
		this.divisionName = divisionName;
		this.circleName = circleName;
		this.firstCommDatetime = firstCommDatetime;
		this.lastCommDatetime = lastCommDatetime;
		this.
	}*/

	/**
	 * @return the errmessage
	 */
	public List<String> getErrmessage() {
		return errmessage;
	}

	/**
	 * @param string the errmessage to set
	 */
	public void setErrmessage(List<String> string) {
		this.errmessage = string;
	}

	public String getMeterSerialNumber() {
		return meterSerialNumber;
	}

	public void setMeterSerialNumber(String meterSerialNumber) {
		this.meterSerialNumber = meterSerialNumber;
	}

	public String getLocationName() {
		return locationName;
	}

	public void setLocationName(String locationName) {
		this.locationName = locationName;
	}

	public String getLocationCode() {
		return locationCode;
	}

	public void setLocationCode(String locationCode) {
		this.locationCode = locationCode;
	}

	public String getSourceType() {
		return sourceType;
	}

	public void setSourceType(String sourceType) {
		this.sourceType = sourceType;
	}

	public String getDivisionName() {
		return divisionName;
	}

	public void setDivisionName(String divisionName) {
		this.divisionName = divisionName;
	}

	public String getCircleName() {
		return circleName;
	}

	public void setCircleName(String circleName) {
		this.circleName = circleName;
	}

	public LocalDateTime getFirstCommDatetime() {
		return firstCommDatetime;
	}

	public void setFirstCommDatetime(LocalDateTime firstCommDatetime) {
		this.firstCommDatetime = firstCommDatetime;
	}

	public LocalDateTime getLastCommDatetime() {
		return lastCommDatetime;
	}

	public void setLastCommDatetime(LocalDateTime lastCommDatetime) {
		this.lastCommDatetime = lastCommDatetime;
	}

	public MeterSearchReponse(String meterSerialNumber, String locationName, String locationCode, String sourceType,
			String divisionName, String circleName, LocalDateTime firstCommDatetime, LocalDateTime lastCommDatetime,
			List<String> errmessage) {
		super();
		this.meterSerialNumber = meterSerialNumber;
		this.locationName = locationName;
		this.locationCode = locationCode;
		this.sourceType = sourceType;
		this.divisionName = divisionName;
		this.circleName = circleName;
		this.firstCommDatetime = firstCommDatetime;
		this.lastCommDatetime = lastCommDatetime;
		this.errmessage = errmessage;
	}
	

	
}
