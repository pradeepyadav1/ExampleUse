package com.tech.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.tech.dao.interfaces.GenericDAO;
import com.tech.dao.interfaces.SkuDao;
import com.tech.dao.model.Sku;
import com.tech.service.interfaces.SkuService;


@Service("skuService")
@Transactional
public class SkuServiceImpl extends AbstractService<Sku, Long> implements SkuService {

	@Autowired
	SkuDao skuDao;
	
	@Override
	protected GenericDAO<Sku, Long> getDao() {
		return skuDao;
	}
	
}