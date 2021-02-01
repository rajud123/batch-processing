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
@Table(name = "ELIGIBILITY_DETAILS")
public class EligibilityDetails {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "ED_TRADCE_ID")
	private Integer edTraceId;
	
	@Column(name = "BENFIT_AMT")
	private Double benefitAmt;
	
	@Column(name = "CASE_NUM")
	private Integer caseNum;
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "CREATE_DT")
	private Date createDt;
	
	@Column(name = "DENIAL_REASON")
	private String denialReason;
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "PLAN_DT")
	private Date planEndDt;
	
	@Column(name = "PLAN_NAME")
	private String planName;
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "PLAN_START_DT")
	private Date planStartDt;
	
	@Column(name = "PLAN_STATUS")
	private String planStatus;
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "UPDATE_DT")
	private Date updateDt;
}
