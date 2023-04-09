package com.smart.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.smart.entity.Product;
import com.smart.services.ProductService;

@RestController
@RequestMapping("")
public class ProductController {
	
	
	@Autowired
	ProductService productService;

	@PostMapping("/addNewProduct")
	public Product addNewProduct(@RequestBody Product product)
	{
	
	return 	productService.addNewProduct(product);
	}
}
