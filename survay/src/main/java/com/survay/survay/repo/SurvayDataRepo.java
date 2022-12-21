package com.survay.survay.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.survay.survay.entity.Survay;
import com.survay.survay.entity.SurvayData;

@Repository
public interface SurvayDataRepo extends JpaRepository<SurvayData, Long> {

}
