package com.tech.webservice.product.exception;

public class ProductNotFoundException extends Exception {

	private static final long serialVersionUID = -6356885086339683701L;
	
	public ProductNotFoundException(final String msg){
		super(msg);
	}
	
}
