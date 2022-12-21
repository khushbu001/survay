package com.survay.survay.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.survay.survay.entity.SurvayPassword;
import com.survay.survay.entity.SurvayURL;

@Repository
public interface SurvayURLRepo extends JpaRepository<SurvayURL, Long> {

}