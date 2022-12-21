package com.survay.survay.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.survay.survay.entity.SurvayData;
import com.survay.survay.entity.SurvayPassword;

@Repository
public interface SurvayPasswordRepo extends JpaRepository<SurvayPassword, Long> {

}
