package com.mhes.domain;

import java.io.Serializable;
import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonAutoDetect;

/**
 * 
 * @author RedMind
 *
 */
@Entity
@Table(name = "mrmeterlocation")
@JsonAutoDetect
public class MrMeterLocation implements Serializable {
	
	private static final long serialVersionUID = 1L;
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY) // auto increment
		@Column(name = "autoid")
		private long autoid;

		@Column(name = "lacationCode")
		private String lacationCode;

		@Column(name = "lacationName")
		private String lacationName;

		@Column(name = "latitude")
		private String latitude;
		
		@Column(name = "longitude")
		private String longitude;
		
		@Column(name = "pinCode")
		private String pinCode;
		
		@Column(name = "status")
		private String status;
		
		@Column(name = "meterDetailsAutoid")
		private String meterDetailsAutoid;
		
		@Column(name = "insertedBy")
		private String insertedBy;
		
		@Column(name = "insertedDate")
		private LocalDateTime insertedDate;
		
		@Column(name = "Transformer")
		private String transformer;
	
		@Column(name = "updatedBy")
		private String updatedBy;
		
		@Column(name = "updatedDate")
		private LocalDateTime updatedDate;
		
		@Column(name = "consumption_zone")
		private String consumptionZone;
		
		@Column(name = "companyAutoid")
		private String companyAutoid;

		/**
		 * @return the autoid
		 */
		public long getAutoid() {
			return autoid;
		}

		/**
		 * @param autoid the autoid to set
		 */
		public void setAutoid(long autoid) {
			this.autoid = autoid;
		}

		/**
		 * @return the lacationCode
		 */
		public String getLacationCode() {
			return lacationCode;
		}

		/**
		 * @param lacationCode the lacationCode to set
		 */
		public void setLacationCode(String lacationCode) {
			this.lacationCode = lacationCode;
		}

		/**
		 * @return the lacationName
		 */
		public String getLacationName() {
			return lacationName;
		}

		/**
		 * @param lacationName the lacationName to set
		 */
		public void setLacationName(String lacationName) {
			this.lacationName = lacationName;
		}

		/**
		 * @return the latitude
		 */
		public String getLatitude() {
			return latitude;
		}

		/**
		 * @param latitude the latitude to set
		 */
		public void setLatitude(String latitude) {
			this.latitude = latitude;
		}

		/**
		 * @return the longitude
		 */
		public String getLongitude() {
			return longitude;
		}

		/**
		 * @param longitude the longitude to set
		 */
		public void setLongitude(String longitude) {
			this.longitude = longitude;
		}

		/**
		 * @return the pinCode
		 */
		public String getPinCode() {
			return pinCode;
		}

		/**
		 * @param pinCode the pinCode to set
		 */
		public void setPinCode(String pinCode) {
			this.pinCode = pinCode;
		}

		/**
		 * @return the status
		 */
		public String getStatus() {
			return status;
		}

		/**
		 * @param status the status to set
		 */
		public void setStatus(String status) {
			this.status = status;
		}

		/**
		 * @return the meterDetailsAutoid
		 */
		public String getMeterDetailsAutoid() {
			return meterDetailsAutoid;
		}

		/**
		 * @param meterDetailsAutoid the meterDetailsAutoid to set
		 */
		public void setMeterDetailsAutoid(String meterDetailsAutoid) {
			this.meterDetailsAutoid = meterDetailsAutoid;
		}

		/**
		 * @return the insertedBy
		 */
		public String getInsertedBy() {
			return insertedBy;
		}

		/**
		 * @param insertedBy the insertedBy to set
		 */
		public void setInsertedBy(String insertedBy) {
			this.insertedBy = insertedBy;
		}

		/**
		 * @return the insertedDate
		 */
		public LocalDateTime getInsertedDate() {
			return insertedDate;
		}

		/**
		 * @param insertedDate the insertedDate to set
		 */
		public void setInsertedDate(LocalDateTime insertedDate) {
			this.insertedDate = insertedDate;
		}

		/**
		 * @return the transformer
		 */
		public String getTransformer() {
			return transformer;
		}

		/**
		 * @param transformer the transformer to set
		 */
		public void setTransformer(String transformer) {
			this.transformer = transformer;
		}

		/**
		 * @return the updatedBy
		 */
		public String getUpdatedBy() {
			return updatedBy;
		}

		/**
		 * @param updatedBy the updatedBy to set
		 */
		public void setUpdatedBy(String updatedBy) {
			this.updatedBy = updatedBy;
		}

		/**
		 * @return the updatedDate
		 */
		public LocalDateTime getUpdatedDate() {
			return updatedDate;
		}

		/**
		 * @param updatedDate the updatedDate to set
		 */
		public void setUpdatedDate(LocalDateTime updatedDate) {
			this.updatedDate = updatedDate;
		}

		/**
		 * @return the consumptionZone
		 */
		public String getConsumptionZone() {
			return consumptionZone;
		}

		/**
		 * @param consumptionZone the consumptionZone to set
		 */
		public void setConsumptionZone(String consumptionZone) {
			this.consumptionZone = consumptionZone;
		}

		/**
		 * @return the companyAutoid
		 */
		public String getCompanyAutoid() {
			return companyAutoid;
		}

		/**
		 * @param companyAutoid the companyAutoid to set
		 */
		public void setCompanyAutoid(String companyAutoid) {
			this.companyAutoid = companyAutoid;
		}

		

}
