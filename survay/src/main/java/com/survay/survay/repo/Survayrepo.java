package com.survay.survay.repo;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.survay.survay.entity.Survay;

@Repository
public interface Survayrepo extends JpaRepository<Survay, Long> {
	@Query(value="select s from Survay s where s.survayId =:id")
	public Optional<Survay> getOneSurvayById(@Param("id") Long id);

}
