package com.mhes.domain;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
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
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	//private static long serialVersionUID = 1L;
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY) // auto increment
		@Column(name = "autoid")
		private long autoid;

		@Column(name = "countryAutoid")
		private long countryAutoid;

		@Column(name = "stateAutoid")
		private long stateAutoid;
		
		@Column(name = "districtAutoid")
		private long districtAutoid;
		
		@ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
		@JoinColumn(name ="circleAutoid", referencedColumnName = "autoid")
		private CmCircle cmCircle;

		@ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
		@JoinColumn(name ="divisionAutoid", referencedColumnName = "autoid")
		private CmDivision cmDivision;
		
		@ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
		@JoinColumn(name ="subdivisionAutoid", referencedColumnName = "autoid")
		private CmSubDivision cmSubDivision;

		@ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
		@JoinColumn(name ="sectionAutoid", referencedColumnName = "autoid")
		private CmSection cmSection;

		@ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
		@JoinColumn(name ="townAutoid", referencedColumnName = "autoid")
		private CmTown cmTown;
		
		@ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
		@JoinColumn(name ="substationAutoid", referencedColumnName = "autoid")
		private CmSubStation cmSubStation;
		
		@ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
		@JoinColumn(name ="feederAutoid", referencedColumnName = "autoid")
		private CmFeeder cmFeeder;
		
		@ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
		@JoinColumn(name ="transformerAutoid", referencedColumnName = "autoid")
		private CmTransformer cmTransformer;

		@ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
		@JoinColumn(name ="meterdetailsautoid", referencedColumnName = "autoid")
		private MrMeterDetails mrMeterDetails;

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
		private long companyAutoid;

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
		public long getCompanyAutoid() {
			return companyAutoid;
		}

		/**
		 * @param companyAutoid the companyAutoid to set
		 */
		public void setCompanyAutoid(long companyAutoid) {
			this.companyAutoid = companyAutoid;
		}

		

		/**
		 * @return the countryCode
		 */
		public long getCountryAutoid() {
			return countryAutoid;
		}

		/**
		 * @param countryCode the countryCode to set
		 */
		public void setCountryAutoid(long countryAutoid) {
			this.countryAutoid = countryAutoid;
		}

		/**
		 * @return the cmDivision
		 */
		public CmDivision getCmDivision() {
			return cmDivision;
		}

		/**
		 * @param cmDivision the cmDivision to set
		 */
		public void setCmDivision(CmDivision cmDivision) {
			this.cmDivision = cmDivision;
		}

		/**
		 * @return the cmSubDivision
		 */
		public CmSubDivision getCmSubDivision() {
			return cmSubDivision;
		}

		/**
		 * @param cmSubDivision the cmSubDivision to set
		 */
		public void setCmSubDivision(CmSubDivision cmSubDivision) {
			this.cmSubDivision = cmSubDivision;
		}

		/**
		 * @return the cmTown
		 */
		public CmTown getCmTown() {
			return cmTown;
		}

		/**
		 * @param cmTown the cmTown to set
		 */
		public void setCmTown(CmTown cmTown) {
			this.cmTown = cmTown;
		}

		/**
		 * @return the cmSubStation
		 */
		public CmSubStation getCmSubStation() {
			return cmSubStation;
		}

		/**
		 * @param cmSubStation the cmSubStation to set
		 */
		public void setCmSubStation(CmSubStation cmSubStation) {
			this.cmSubStation = cmSubStation;
		}

		/**
		 * @return the cmFeeder
		 */
		public CmFeeder getCmFeeder() {
			return cmFeeder;
		}

		/**
		 * @param cmFeeder the cmFeeder to set
		 */
		public void setCmFeeder(CmFeeder cmFeeder) {
			this.cmFeeder = cmFeeder;
		}

		/**
		 * @return the cmTransformer
		 */
		public CmTransformer getCmTransformer() {
			return cmTransformer;
		}

		/**
		 * @param cmTransformer the cmTransformer to set
		 */
		public void setCmTransformer(CmTransformer cmTransformer) {
			this.cmTransformer = cmTransformer;
		}

		/**
		 * @return the stateAutoid
		 */
		public long getStateAutoid() {
			return stateAutoid;
		}

		/**
		 * @param stateAutoid the stateAutoid to set
		 */
		public void setStateAutoid(long stateAutoid) {
			this.stateAutoid = stateAutoid;
		}

		/**
		 * @return the districtAutoid
		 */
		public long getDistrictAutoid() {
			return districtAutoid;
		}

		/**
		 * @param districtAutoid the districtAutoid to set		 */
		public void setDistrictAutoid(long districtAutoid) {
		this.districtAutoid = districtAutoid;
		}

		/**
		 * @return the cmCircle
		 */
		public CmCircle getCmCircle() {
			return cmCircle;
		}

		/**
		 * @param cmCircle the cmCircle to set
		 */
		public void setCmCircle(CmCircle cmCircle) {
			this.cmCircle = cmCircle;
		}

		/**
	/ * @return the cmSection
		 */
		public CmSection getCmSection() {
			return cmSection;
		}

		/**
		 * @param cmSection the cmSection to set
		 */
		public void setCmSection(CmSection cmSection) {
			this.cmSection = cmSection;
		}

		/**
		 * @return the mrMeterDetails
		 */
		public MrMeterDetails getMrMeterDetails() {
			return mrMeterDetails;
		}

		/**
		 * @param mrMeterDetails the mrMeterDetails to set
		 */
		public void setMrMeterDetails(MrMeterDetails mrMeterDetails) {
			this.mrMeterDetails = mrMeterDetails;
		}
}