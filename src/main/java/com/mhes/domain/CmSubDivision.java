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
@Table(name = "cmsubdivision")
@JsonAutoDetect
public class CmSubDivision implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -5762079396185048337L;

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

	@Column(name = "circleAutoid")
	private long circleAutoid;

	@Column(name = "divisionAutoid")
	private long divisionAutoid;

	@Column(name = "subdivisionCode")
	private String subdivisionCode;

	@Column(name = "subdivisionShortName")
	private String subdivisionShortName;

	@Column(name = "subdivisionName")
	private String subdivisionName;

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

	public String getSubdivisionCode() {
		return subdivisionCode;
	}

	public void setSubdivisionCode(String subdivisionCode) {
		this.subdivisionCode = subdivisionCode;
	}

	public String getSubdivisionShortName() {
		return subdivisionShortName;
	}

	public void setSubdivisionShortName(String subdivisionShortName) {
		this.subdivisionShortName = subdivisionShortName;
	}

	public String getSubdivisionName() {
		return subdivisionName;
	}

	public void setSubdivisionName(String subdivisionName) {
		this.subdivisionName = subdivisionName;
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

	public LocalDateTime getUpdatedDate() {
		return updatedDate;
	}

	public void setUpdatedDate(LocalDateTime updatedDate) {
		this.updatedDate = updatedDate;
	}

	@Override
	public String toString() {
		return "CmSubDivision [autoId=" + autoId + ", circleAutoid=" + circleAutoid + ", divisionAutoid="
				+ divisionAutoid + ", subdivisionCode=" + subdivisionCode + ", subdivisionShortName="
				+ subdivisionShortName + ", subdivisionName=" + subdivisionName + ", status=" + status + ", insertedBy="
				+ insertedBy + ", insertedDate=" + insertedDate + ", updatedBy=" + updatedBy + ", updatedDate="
				+ updatedDate + "]";
	}

}
