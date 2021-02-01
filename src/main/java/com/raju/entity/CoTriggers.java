package com.raju.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import lombok.Data;

@Data
@Entity
@Table(name = "co_triggers")
public class CoTriggers {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "TRG_ID")
	private Integer trgId;
	
	@Column(name = "CASE_NUM")
	private Integer caseNum;
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "CREATE_DT")
	private Date createDt;
	
	@Column(name = "TRG_STATUS")
	private String trgStatus;
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "UPDATE_DT")
	private Date updateDt;

}
