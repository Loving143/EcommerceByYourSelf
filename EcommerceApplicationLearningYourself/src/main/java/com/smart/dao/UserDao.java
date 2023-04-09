package com.smart.dao;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.smart.entity.User;

@Repository
public interface UserDao extends CrudRepository<User, String> {
}