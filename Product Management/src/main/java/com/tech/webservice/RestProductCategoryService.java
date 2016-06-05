package com.tech.webservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tech.constant.ServiceUrl;
import com.tech.dao.model.ProductCategory;
import com.tech.service.interfaces.ProductCategoryService;


@RestController
@RequestMapping(ServiceUrl.V1_PRODUCT_CATEGORIES)
public class RestProductCategoryService extends AbstractRestService<ProductCategory>{
	
	@Autowired
	public RestProductCategoryService(final ProductCategoryService productCategoryService) {
		super(productCategoryService);
	}
	
}