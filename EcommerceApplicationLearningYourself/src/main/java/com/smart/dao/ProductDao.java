package com.smart.dao;

import org.springframework.data.repository.CrudRepository;

import com.smart.entity.Product;

public interface ProductDao extends CrudRepository<Product,Integer>{

}
