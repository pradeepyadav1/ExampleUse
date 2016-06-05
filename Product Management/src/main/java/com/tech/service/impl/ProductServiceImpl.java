package com.tech.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.tech.dao.interfaces.GenericDAO;
import com.tech.dao.interfaces.ProductDao;
import com.tech.dao.model.Product;
import com.tech.service.interfaces.ProductService;


@Service("productService")
@Transactional
public class ProductServiceImpl extends AbstractService<Product, Long> implements ProductService {

	@Autowired
	ProductDao productDao;
	
	@Override
	protected GenericDAO<Product, Long> getDao() {
		return productDao;
	}
	
}