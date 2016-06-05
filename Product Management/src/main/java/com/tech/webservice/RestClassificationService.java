package com.tech.webservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tech.constant.ServiceUrl;
import com.tech.dao.model.Classification;
import com.tech.service.interfaces.ClassificationService;


@RestController
@RequestMapping(ServiceUrl.V1_CLASSIFICATIONS)
public class RestClassificationService extends AbstractRestService<Classification>{
		
	@Autowired
	public RestClassificationService(final ClassificationService classificationService) {
		super(classificationService);
	}
	
	
}