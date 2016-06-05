package com.tech.webservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tech.constant.ServiceUrl;
import com.tech.dao.model.Sku;
import com.tech.service.interfaces.SkuService;


@RestController
@RequestMapping(ServiceUrl.V1_SKUS)
public class RestSkuService extends AbstractRestService<Sku>{
	

	@Autowired
	public RestSkuService(final SkuService skuService) {
		super(skuService);
	}
	
	
}