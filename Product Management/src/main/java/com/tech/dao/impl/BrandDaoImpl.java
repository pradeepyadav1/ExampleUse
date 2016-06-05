package com.tech.dao.impl;

import org.springframework.stereotype.Repository;

import com.tech.dao.interfaces.BrandDao;
import com.tech.dao.model.Brand;

@Repository("brandDao")
public class BrandDaoImpl extends AbstractDAO<Brand, Long> implements BrandDao {
	
}