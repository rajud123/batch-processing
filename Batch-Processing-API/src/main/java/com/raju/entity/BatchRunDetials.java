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
@Table(name = "BATCH_RUN_DTLS")
public class BatchRunDetials {
	@Column(name = "BATCH_RUN_SEQ")
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer batchRunSeq;
	
	@Column(name = "BATCH_NAME")
	private String batchName;
	
	@Column(name = "BATCH_RUN_STATUS")
	private String batchRunStatus;
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "END_DATE")
	private Date endDate;
	
	@Column(name = "INSTANCE_NUM")
	private Integer instanceName;
	
	@Column(name = "START_DATE")
	@Temporal(TemporalType.TIMESTAMP)
	private Date startDate;
}
