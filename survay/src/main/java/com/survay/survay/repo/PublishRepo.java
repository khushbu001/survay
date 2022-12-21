package com.survay.survay.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.survay.survay.entity.Publish;
import com.survay.survay.entity.ResponseData;

@Repository
public interface PublishRepo extends JpaRepository<Publish, Long> {

}