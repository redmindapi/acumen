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
@Table(name = "cmfeeder")
@JsonAutoDetect
public class CmFeeder implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2199240179740459523L;

	@Id // primary key
	@GeneratedValue(strategy = GenerationType.IDENTITY) // auto increment
	@Column(name = "autoid")
	private long autoId;

//	@ManyToOne(cascade = CascadeType.ALL)
//	@JoinColumn(name = "countryAutoid", referencedColumnName = "autoid")
//	private CmCountry cmcountry;
//
//	@ManyToOne(cascade = CascadeType.ALL)
//	@JoinColumn(name = "stateAutoid", referencedColumnName = "autoid")
//	private CmState cmstate;
//
//	@ManyToOne(cascade = CascadeType.ALL)
//	@JoinColumn(name = "districtAutoid", referencedColumnName = "autoid")
//	private CmDistrict cmdistrict;
//
//	@ManyToOne(cascade = CascadeType.ALL)
//	@JoinColumn(name = "circleAutoid", referencedColumnName = "autoid")
//	private CmCircle cmcircle;
//	
//	@ManyToOne(cascade = CascadeType.ALL)
//	@JoinColumn(name = "divisionAutoid", referencedColumnName = "autoid")
//	private CmDivision cmdivision;
//	
//	@ManyToOne(cascade = CascadeType.ALL)
//	@JoinColumn(name = "subdivisionAutoid", referencedColumnName = "autoid")
//	private CmSubDivision cmsubdivision;
//	
//	@ManyToOne(cascade = CascadeType.ALL)
//	@JoinColumn(name = "sectionAutoid", referencedColumnName = "autoid")
//	private CmSection cmsection;
//	
//	@ManyToOne(cascade = CascadeType.ALL)
//	@JoinColumn(name = "townAutoid", referencedColumnName = "autoid")
//	private CmTown cmtown;
//	
//	@ManyToOne(cascade = CascadeType.ALL)
//	@JoinColumn(name = "substationAutoid", referencedColumnName = "autoid")
//	private CmSubStation cmsubstation;

	@Column(name = "circleAutoid")
	private long circleAutoid;

	@Column(name = "divisionAutoid")
	private long divisionAutoid;

	@Column(name = "subdivisionAutoid")
	private long subdivisionAutoid;

	@Column(name = "sectionAutoid")
	private long sectionAutoid;

	@Column(name = "townAutoid")
	private long townAutoid;

	@Column(name = "substationAutoid")
	private long substationAutoid;

	@Column(name = "feederCode")
	private String feederCode;

	@Column(name = "feederShortName")
	private String feederShortName;

	@Column(name = "feederName")
	private String feederName;

	@Column(name = "status")
	private String status;

	@Column(name = "insertedBy")
	private String insertedBy;

	@Column(name = "insertedDate")
	private LocalDateTime insertedDate;

	@Column(name = "updatedBy")
	private String updatedBy;

	@Column(name = "updatedDate")
	private LocalDateTime updatedDate;

	@Column(name = "kvrating")
	private String kvrating;

	@Column(name = "maxloadinampere")
	private String maxloadinampere;

	@Column(name = "kvacapacity")
	private String kvacapacity;

	public long getAutoId() {
		return autoId;
	}

	public void setAutoId(long autoId) {
		this.autoId = autoId;
	}

	public long getCircleAutoid() {
		return circleAutoid;
	}

	public void setCircleAutoid(long circleAutoid) {
		this.circleAutoid = circleAutoid;
	}

	public long getDivisionAutoid() {
		return divisionAutoid;
	}

	public void setDivisionAutoid(long divisionAutoid) {
		this.divisionAutoid = divisionAutoid;
	}

	public long getSubdivisionAutoid() {
		return subdivisionAutoid;
	}

	public void setSubdivisionAutoid(long subdivisionAutoid) {
		this.subdivisionAutoid = subdivisionAutoid;
	}

	public long getSectionAutoid() {
		return sectionAutoid;
	}

	public void setSectionAutoid(long sectionAutoid) {
		this.sectionAutoid = sectionAutoid;
	}

	public long getTownAutoid() {
		return townAutoid;
	}

	public void setTownAutoid(long townAutoid) {
		this.townAutoid = townAutoid;
	}

	public long getSubstationAutoid() {
		return substationAutoid;
	}

	public void setSubstationAutoid(long substationAutoid) {
		this.substationAutoid = substationAutoid;
	}

	public String getFeederCode() {
		return feederCode;
	}

	public void setFeederCode(String feederCode) {
		this.feederCode = feederCode;
	}

	public String getFeederShortName() {
		return feederShortName;
	}

	public void setFeederShortName(String feederShortName) {
		this.feederShortName = feederShortName;
	}

	public String getFeederName() {
		return feederName;
	}

	public void setFeederName(String feederName) {
		this.feederName = feederName;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getInsertedBy() {
		return insertedBy;
	}

	public void setInsertedBy(String insertedBy) {
		this.insertedBy = insertedBy;
	}

	public LocalDateTime getInsertedDate() {
		return insertedDate;
	}

	public void setInsertedDate(LocalDateTime insertedDate) {
		this.insertedDate = insertedDate;
	}

	public String getUpdatedBy() {
		return updatedBy;
	}

	public void setUpdatedBy(String updatedBy) {
		this.updatedBy = updatedBy;
	}

	public String getKvrating() {
		return kvrating;
	}

	public void setKvrating(String kvrating) {
		this.kvrating = kvrating;
	}

	public String getMaxloadinampere() {
		return maxloadinampere;
	}

	public void setMaxloadinampere(String maxloadinampere) {
		this.maxloadinampere = maxloadinampere;
	}

	public String getKvacapacity() {
		return kvacapacity;
	}

	public void setKvacapacity(String kvacapacity) {
		this.kvacapacity = kvacapacity;
	}

	public LocalDateTime getUpdatedDate() {
		return updatedDate;
	}

	public void setUpdatedDate(LocalDateTime updatedDate) {
		this.updatedDate = updatedDate;
	}

	@Override
	public String toString() {
		return "CmFeeder [autoId=" + autoId + ", circleAutoid=" + circleAutoid + ", divisionAutoid=" + divisionAutoid
				+ ", subdivisionAutoid=" + subdivisionAutoid + ", sectionAutoid=" + sectionAutoid + ", townAutoid="
				+ townAutoid + ", substationAutoid=" + substationAutoid + ", feederCode=" + feederCode
				+ ", feederShortName=" + feederShortName + ", feederName=" + feederName + ", status=" + status
				+ ", insertedBy=" + insertedBy + ", insertedDate=" + insertedDate + ", updatedBy=" + updatedBy
				+ ", updatedDate=" + updatedDate + ", kvrating=" + kvrating + ", maxloadinampere=" + maxloadinampere
				+ ", kvacapacity=" + kvacapacity + "]";
	}

}
