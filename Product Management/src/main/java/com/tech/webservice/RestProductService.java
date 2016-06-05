package com.tech.webservice;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.tech.constant.ServiceUrl;
import com.tech.dao.model.Product;
import com.tech.service.interfaces.ProductService;
import com.tech.webservice.product.exception.BaseErrorResponse;
import com.tech.webservice.product.exception.ProductNotFoundException;


@RestController
@RequestMapping(ServiceUrl.V1_PRODUCTS)
public class RestProductService extends AbstractRestService<Product>{
	

	@Autowired
	public RestProductService(final ProductService productService) {
		super(productService);
	}
	
	
	
	@RequestMapping(value="/testExceptionResponse", method = RequestMethod.GET,headers="Accept=application/json")
	public List<Product> getAllData() throws Exception{
		throw new ProductNotFoundException("this is test for error response message");
		//return getService().findAll();
	}
	
	
	
	
	@ExceptionHandler(ProductNotFoundException.class)
	public @ResponseBody BaseErrorResponse handleEmployeeNotFoundException(HttpServletRequest request, Exception ex){
		
		BaseErrorResponse response = new BaseErrorResponse("weqweqwe ",11);
		
		return response;
	}
	
	
	@RequestMapping(value = "/test/validation", method = RequestMethod.POST, headers="Accept=application/json")
    @ResponseBody
    public Product add(@Valid @RequestBody Product product) {
		System.out.println("******* validation JSOn request data ");
		System.out.println("*******  JSOn request data  is \n "+product);
        return product;
    }
	
	
	
	@RequestMapping(value="/testResultByExample", method = RequestMethod.POST,headers="Accept=application/json")
	public List<Product> findByQuery(@RequestBody Product criteriaObject){
		System.out.println("request example object : "+criteriaObject);
		//return super.findByExample(criteriaObject,"isActive");
		return null;
	}
	
	
	
}