package com.acumen.iunit.domain;
/**
 * 
 * @author RedMind
 *
 */

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonAutoDetect;

@Entity
@Table(name = "aauserprofile")
@JsonAutoDetect
public class AaUserProfile implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -3661218513710159413L;


	@Id // primary key
	@GeneratedValue(strategy = GenerationType.IDENTITY) // auto increment
	@Column(name = "autoid")
	private Long autoId;
}
