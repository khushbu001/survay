package com.survay.survay.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.survay.survay.dto.PublishDataDTO;
import com.survay.survay.dto.ResponseDataDTO;
import com.survay.survay.entity.PublishData;
import com.survay.survay.entity.ResponseData;
import com.survay.survay.entity.Survay;
import com.survay.survay.service.SurvayService;

@RestController
@ControllerAdvice
@RequestMapping("/api/v1")
public class SurvayController {

	Logger logger = LoggerFactory.getLogger(SurvayController.class);

	@Autowired
	private SurvayService survayService;

	@PostMapping(value = "/survay")
	public ResponseEntity<Object> createSurvay(@RequestBody Survay survay) {

		logger.info("SurvayController::createSurvay::Start");

		Survay s = survayService.createSurvay(survay);
		logger.info("SurvayController::createSurvay::End");

		return ResponseEntity.status(HttpStatus.CREATED).body(s);
	}

	@DeleteMapping(value = "/survay/{id}")
	public ResponseEntity<Object> deleteSurvay(@PathVariable Long id) {

		logger.info("SurvayController::deleteSurvay::Start");
		survayService.deleteSurvayById(id);

		logger.debug("id:{} ", id);
		logger.info("SurvayController::deleteSurvay::End");

		return ResponseEntity.status(HttpStatus.NO_CONTENT).build();

	}

	@GetMapping(value = "/survay/{id}")
	public ResponseEntity<Survay> getOneSurvay(@PathVariable Long id) {

		logger.info("SurvayController::getOneSurvay::Start");

		Survay survay = survayService.getOneSurvay(id);

		logger.debug("id:{} , survay:{} ", id, survay);
		logger.info("SurvayController::getOneSurvay::End");

		return ResponseEntity.status(HttpStatus.OK).body(survay);

	}

	@GetMapping(value = "/survay")
	public ResponseEntity<List<Survay>> getAllSurvay() {

		logger.debug("SurvayController::getAllSurvay::Start");
		List<Survay> allSurvay = survayService.getAllSurvay();
		logger.debug("SurvayController::getAllSurvay::End");

		return ResponseEntity.status(HttpStatus.OK).body(allSurvay);

	}

	@GetMapping(value = "/survay/response/{id}")
	public ResponseEntity<List<ResponseDataDTO>> getResposeDataBySurvayId(@PathVariable Long id) {

		logger.info("SurvayController::getResposeDataBySurvayId::Start");

		List<ResponseDataDTO> responseData = survayService.getResposeDataBySurvayId(id);

		logger.debug("id:{} , responseData:{} ", id, responseData);
		logger.info("SurvayController::getOneSurvay::End");

		return ResponseEntity.status(HttpStatus.OK).body(responseData);

	}

	@GetMapping(value = "/survay/publishdata/{id}")
	public ResponseEntity<PublishDataDTO> getPublishDataBySurvayId(@PathVariable Long id) {

		logger.info("SurvayController::getPublishDataBySurvayId::Start");

		PublishDataDTO publishData = survayService.getPublishDataBySurvayId(id);

		logger.debug("id:{} , publishData:{} ", id, publishData);
		logger.info("SurvayController::getPublishDataBySurvayId::End");

		return ResponseEntity.status(HttpStatus.OK).body(publishData);

	}

}
