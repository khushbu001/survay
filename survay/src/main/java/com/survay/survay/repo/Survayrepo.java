package com.survay.survay.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.survay.survay.entity.Survay;

@Repository
public interface Survayrepo extends JpaRepository<Survay, Long> {

}
