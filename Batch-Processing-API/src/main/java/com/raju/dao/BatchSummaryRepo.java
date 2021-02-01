package com.raju.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.raju.entity.BatchSummary;

public interface BatchSummaryRepo extends JpaRepository<BatchSummary, Integer> {

}
