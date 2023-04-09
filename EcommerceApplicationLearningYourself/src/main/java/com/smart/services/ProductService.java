package com.smart.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.smart.dao.ProductDao;
import com.smart.entity.Product;


public interface ProductService {
	
	
	public Product addNewProduct(Product product);

}
