package com.mhes.response;

import java.io.Serializable;

/**
 * 
 * @author RedMind
 *
 */
public class MeterResponse  implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -7925892594022208015L;
	
	private String meterSerialNumber;
	private String circleName;
	private String divisionName;
	private String message;
	
	
public MeterResponse() {
		//super();
		// TODO Auto-generated constructor stub
	}
		public MeterResponse(String meterSerialNumber, String circleName, String divisionName, String message) {
		//super();
		this.meterSerialNumber = meterSerialNumber;
		this.circleName = circleName;
		this.divisionName = divisionName;
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
	@Override
	public String toString() {
		return "MeterResponse [meterSerialNumber=" + meterSerialNumber + ", circleName=" + circleName
				+ ", divisionName=" + divisionName + ", message=" + message + "]";
	}
	
	
}
