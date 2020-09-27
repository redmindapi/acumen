package com.mhes.util;

import java.io.Serializable;

public class MeterSearchInputCriteria implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -2418992796396915157L;

	private Boolean networkSection = false;
	private Boolean meterManufacturer = false;
	private Boolean meterCommunication = false;
	private String queryExecutedSection = "DEFAULT";

	public MeterSearchInputCriteria() {

	}

	public MeterSearchInputCriteria(Boolean networkSection, Boolean meterManufacturer, Boolean meterCommunication,
			String queryExecutedSection) {
		this.networkSection = networkSection;
		this.meterManufacturer = meterManufacturer;
		this.meterCommunication = meterCommunication;
		this.queryExecutedSection = queryExecutedSection;
	}

	/**
	 * @return the networkSection
	 */
	public Boolean getNetworkSection() {
		return networkSection;
	}
	/**
	 * @param networkSection the networkSection to set
	 */
	public void setNetworkSection(Boolean networkSection) {
		this.networkSection = networkSection;
	}
	/**
	 * @return the meterManufacturer
	 */
	public Boolean getMeterManufacturer() {
		return meterManufacturer;
	}
	/**
	 * @param meterManufacturer the meterManufacturer to set
	 */
	public void setMeterManufacturer(Boolean meterManufacturer) {
		this.meterManufacturer = meterManufacturer;
	}
	/**
	 * @return the meterCommunication
	 */
	public Boolean getMeterCommunication() {
		return meterCommunication;
	}
	/**
	 * @param meterCommunication the meterCommunication to set
	 */
	public void setMeterCommunication(Boolean meterCommunication) {
		this.meterCommunication = meterCommunication;
	}

	/**
	 * @return the queryExecutedSection
	 */
	public String getQueryExecutedSection() {
		return queryExecutedSection;
	}

	/**
	 * @param queryExecutedSection the queryExecutedSection to set
	 */
	public void setQueryExecutedSection(String queryExecutedSection) {
		this.queryExecutedSection = queryExecutedSection;
	}

}