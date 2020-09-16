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
@Table(name = "cmcircle")
@JsonAutoDetect
public class CmCircle implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1033601030695175132L;

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

	@Column(name = "circleCode")
	private String circleCode;

	@Column(name = "circleShortName")
	private String circleShortName;

	@Column(name = "circleName")
	private String circleName;

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

	public String getCircleCode() {
		return circleCode;
	}

	public void setCircleCode(String circleCode) {
		this.circleCode = circleCode;
	}

	public String getCircleShortName() {
		return circleShortName;
	}

	public void setCircleShortName(String circleShortName) {
		this.circleShortName = circleShortName;
	}

	public String getCircleName() {
		return circleName;
	}

	public void setCircleName(String circleName) {
		this.circleName = circleName;
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
		return "CmCircle [autoId=" + autoId + ", circleCode=" + circleCode + ", circleShortName=" + circleShortName
				+ ", circleName=" + circleName + ", status=" + status + ", insertedBy=" + insertedBy + ", insertedDate="
				+ insertedDate + ", updatedBy=" + updatedBy + ", updatedDate=" + updatedDate + "]";
	}

}
