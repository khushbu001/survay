package com.survay.survay.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.survay.survay.entity.Publish;
import com.survay.survay.entity.PublishData;

@Repository
public interface PublishDataRepo extends JpaRepository<PublishData, Long> {

}