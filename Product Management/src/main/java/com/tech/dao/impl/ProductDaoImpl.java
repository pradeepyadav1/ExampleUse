package com.tech.dao.impl;

import org.springframework.stereotype.Repository;

import com.tech.dao.interfaces.ProductDao;
import com.tech.dao.model.Product;


@Repository("productDao")
public class ProductDaoImpl extends AbstractDAO<Product, Long> implements ProductDao {

}
