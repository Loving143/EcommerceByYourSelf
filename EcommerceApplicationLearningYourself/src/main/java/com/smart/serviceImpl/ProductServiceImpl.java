package com.smart.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.smart.dao.ProductDao;
import com.smart.entity.Product;
import com.smart.services.ProductService;

@Service
public class ProductServiceImpl implements ProductService{


	@Autowired
	ProductDao productDao;
	@Override
	public Product addNewProduct(Product product) {
	
		return productDao.save(product);
		
	}

}
