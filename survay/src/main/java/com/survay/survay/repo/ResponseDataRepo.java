package com.survay.survay.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.survay.survay.entity.Response;
import com.survay.survay.entity.ResponseData;

@Repository
public interface ResponseDataRepo extends JpaRepository<ResponseData, Long> {

}