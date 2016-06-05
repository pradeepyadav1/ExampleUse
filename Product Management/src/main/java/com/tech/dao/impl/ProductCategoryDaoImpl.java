package com.tech.dao.impl;

import org.springframework.stereotype.Repository;

import com.tech.dao.interfaces.ProductCategoryDao;
import com.tech.dao.model.ProductCategory;


@Repository("productCategoryDao")
public class ProductCategoryDaoImpl extends AbstractDAO<ProductCategory, Long> implements ProductCategoryDao {

}
