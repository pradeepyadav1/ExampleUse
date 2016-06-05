package com.tech.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.tech.dao.interfaces.ClassificationDao;
import com.tech.dao.interfaces.GenericDAO;
import com.tech.dao.model.Classification;
import com.tech.service.interfaces.ClassificationService;


@Service("classificationService")
@Transactional
public class ClassificationServiceImpl extends AbstractService<Classification, Long> implements ClassificationService {

	@Autowired
	ClassificationDao classificationDao;
	
	@Override
	protected GenericDAO<Classification, Long> getDao() {
		return classificationDao;
	}
	
}