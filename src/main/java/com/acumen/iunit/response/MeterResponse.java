package com.acumen.iunit.response;

import java.io.Serializable;

/**
 * 
 * @author RedMind
 *
 */

public class MeterResponse  implements Serializable{

	private static final long serialVersionUID = -7925892594022208015L;
	
	private String meterSerialNumber;
	private String locationName;
	private String locationId;
	private String sourceType;
	private String divisionName;
	private String circleName;
	private String message;

	public MeterResponse() {

		}

	public MeterResponse(String meterSerialNumber, String locationName, String locationId, String sourceType, String divisionName, String circleName, String message) {
		this.meterSerialNumber = meterSerialNumber;
		this.locationName = locationName;
		this.locationId = locationId;
		this.sourceType = sourceType;
		this.divisionName = divisionName;
		this.circleName = circleName;
		this.message = message;
	}

	public String getMeterSerialNumber() {
		return meterSerialNumber;
	}

	public void setMeterSerialNumber(String meterSerialNumber) {
		this.meterSerialNumber = meterSerialNumber;
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

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	/**
	 * @return the locationName
	 */
	public String getLocationName() {
		return locationName;
	}

	/**
	 * @param locationName the locationName to set
	 */
	public void setLocationName(String locationName) {
		this.locationName = locationName;
	}

	/**
	 * @return the locationId
	 */
	public String getLocationId() {
		return locationId;
	}

	/**
	 * @param locationId the locationId to set
	 */
	public void setLocationId(String locationId) {
		this.locationId = locationId;
	}

	/**
	 * @return the sourceType
	 */
	public String getSourceType() {
		return sourceType;
	}

	/**
	 * @param sourceType the sourceType to set
	 */
	public void setSourceType(String sourceType) {
		this.sourceType = sourceType;
	}

	@Override
	public String toString() {
		return "MeterResponse [meterSerialNumber=" + meterSerialNumber + ", locationName=" + locationName
				+ ", locationId=" + locationId + ", sourceType=" + sourceType + ", divisionName=" + divisionName
				+ ", circleName=" + circleName + ", message=" + message + "]";
	}

}