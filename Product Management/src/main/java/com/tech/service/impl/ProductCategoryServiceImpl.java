package com.tech.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.tech.dao.interfaces.GenericDAO;
import com.tech.dao.interfaces.ProductCategoryDao;
import com.tech.dao.model.ProductCategory;
import com.tech.service.interfaces.ProductCategoryService;


@Service("productCategoryService")
@Transactional
public class ProductCategoryServiceImpl extends AbstractService<ProductCategory, Long> implements ProductCategoryService {

	@Autowired
	ProductCategoryDao productCategoryDao;
	
	@Override
	protected GenericDAO<ProductCategory, Long> getDao() {
		return productCategoryDao;
	}
	
}