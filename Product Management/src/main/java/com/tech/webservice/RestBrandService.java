package com.tech.webservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tech.constant.ServiceUrl;
import com.tech.dao.model.Brand;
import com.tech.service.interfaces.BrandService;


@RestController
@RequestMapping(ServiceUrl.V1_BRANDS)
public class RestBrandService extends AbstractRestService<Brand>{

	
	@Autowired
	public RestBrandService(BrandService brandService) {
		super(brandService);
	}

}