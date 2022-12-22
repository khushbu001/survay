package com.survay.survay.repo;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.survay.survay.entity.Publish;

@Repository
public interface PublishRepo extends JpaRepository<Publish, Long> {

	@Query(value = "select p from Publish p where p.survay.survayId =:id")
	public Optional<Publish> getOnePublishById(@Param("id") Long id);

}