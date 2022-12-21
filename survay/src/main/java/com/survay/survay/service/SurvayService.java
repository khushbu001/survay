package com.survay.survay.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import com.survay.survay.entity.Publish;
import com.survay.survay.entity.PublishData;
import com.survay.survay.entity.Response;
import com.survay.survay.entity.ResponseData;
import com.survay.survay.entity.Survay;
import com.survay.survay.repo.PublishDataRepo;
import com.survay.survay.repo.ResponseDataRepo;
import com.survay.survay.repo.ResponseRepo;
import com.survay.survay.repo.Survayrepo;


import jakarta.transaction.Transactional;

@Service
public class SurvayService {
	@Autowired
	private Survayrepo survayRepo;

	@Autowired
	private PublishDataRepo publishDataRepo;

	@Autowired
	private ResponseRepo responseRepo;

	@Autowired
	private ResponseDataRepo responseDataRepo;

	static final Logger LOG = LoggerFactory.getLogger(SurvayService.class);

	@Transactional
	public Survay createSurvay(Survay survay) {

		LOG.info("SurvayService::createSurvay::Start");
		Survay s = survayRepo.save(survay);
		Publish publish = new Publish();
		publish.setPublishData(survay.getPublish().getPublishData());
		publishDataRepo.save(publish.getPublishData());

		List<Response> respList = survay.getResponse();
		for (Response r : respList) {
			responseRepo.save(r);
			//ResponseData responseData = r.getResponseData();
			//responseDataRepo.save(responseData);
		}
		LOG.info("SurvayService::createSurvay::End");

		return s;
	}

	public void deleteSurvayById(Long id) {
		LOG.info("SurvayService::deleteSurvayById::Start");
		LOG.debug("id: {}", id);

		survayRepo.deleteById(id);

		LOG.info("SurvayService::deleteSurvayById::End");
	}

	public Survay getOneSurvay(Long id) {

		LOG.info("SurvayService::getOneSurvay::Start");

		LOG.debug("id: {}", id);
		Optional<Survay> s = survayRepo.findById(id);
		Survay s1 = new Survay();
		if (s.isPresent()) {
			s1 = s.get();
		}
		LOG.info("SurvayService::getOneSurvay::End");

		return s1;
	}

	public List<Survay> getAllSurvay() {

		LOG.debug("SurvayService::getAllSurvay::Start");

		List<Survay> allSurvay = new ArrayList<>();
		survayRepo.findAll().forEach(allSurvay::add);

		LOG.debug("SurvayService::getAllSurvay::End");

		return allSurvay;
	}

	public PublishData getPublishDataBySurvayId(@PathVariable Long id) {

		LOG.info("SurvayService::getPublishDataBySurvayId::Start");

		Optional<Survay> survay = survayRepo.findById(id);
		com.survay.survay.response.Survay survay1 = new com.survay.survay.response.Survay();
		if (survay.isPresent()) {
			survay1 = survay.get();
		}
		Publish publish = new Publish();
		if (survay1.getPublish() != null) {
			publish = survay1.getPublish();
		}
		LOG.info("id:{} , publish:{} ", id, publish);

		PublishData publishData = new PublishData();
		if (publish.getPublishData() != null) {
			publishData = publish.getPublishData();
		}
		LOG.info("id:{} , publishData:{} ", id, publishData);

		LOG.info("SurvayService::getPublishDataBySurvayId::End");

		return publishData;

	}

	public List<ResponseData> getResposeDataBySurvayId(@PathVariable Long id) {

		LOG.info("SurvayService::getResposeDataBySurvayId::Start");

		Optional<Survay> survay = survayRepo.findById(id);
		LOG.debug("id:{} , survay:{} ", id, survay);
		Survay survay1 = new Survay();
		if (survay.isPresent()) {
			survay1 = survay.get();
		}
		List<Response> list = new ArrayList<>();
		if (survay1.getResponse() != null) {
			list = survay1.getResponse();
		}
		List<ResponseData> reponseData = new ArrayList<>();
		for (Response l : list) {
			if (l == null)
				continue;
			reponseData.add(l.getResponseData());

		}

		LOG.info("SurvayController::getOneSurvay::End");

		return reponseData;

	}

}
