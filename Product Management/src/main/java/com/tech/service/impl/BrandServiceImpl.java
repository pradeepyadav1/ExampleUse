package com.tech.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.tech.dao.interfaces.BrandDao;
import com.tech.dao.interfaces.GenericDAO;
import com.tech.dao.model.Brand;
import com.tech.service.interfaces.BrandService;


@Service("brandService")
@Transactional
public class BrandServiceImpl extends AbstractService<Brand, Long> implements BrandService {

	@Autowired
	BrandDao brandDao;
	
	@Override
	protected GenericDAO<Brand, Long> getDao() {
		return brandDao;
	}
	
}