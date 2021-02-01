package com.raju.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.web.multipart.MultipartFile;

import lombok.Data;

@Entity
@Table(name = "CO_PDFS")
@Data
public class CoPdfs {
	@Column(name = "CO_PDF_ID")
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer coPdfId;
	
	@Column(name = "PLAN_STATUS")
	private String planStatus;
	
	@Column(name = "CASE_NUMBER")
	private Integer caseNumber;
	
	@Column(name = "PDF_DOCUMENT")
	private MultipartFile pdfDocument;
	
	@Column(name = "PLAN_NAME")
	private String planName;
}
