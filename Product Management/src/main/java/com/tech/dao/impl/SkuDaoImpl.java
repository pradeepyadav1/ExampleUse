package com.tech.dao.impl;

import org.springframework.stereotype.Repository;

import com.tech.dao.interfaces.SkuDao;
import com.tech.dao.model.Sku;


@Repository("skuDao")
public class SkuDaoImpl extends AbstractDAO<Sku, Long> implements SkuDao {

}
