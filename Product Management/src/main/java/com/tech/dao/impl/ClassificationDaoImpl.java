package com.tech.dao.impl;

import org.springframework.stereotype.Repository;

import com.tech.dao.interfaces.ClassificationDao;
import com.tech.dao.model.Classification;

@Repository("classificationDao")
public class ClassificationDaoImpl extends AbstractDAO<Classification, Long> implements ClassificationDao {

}
