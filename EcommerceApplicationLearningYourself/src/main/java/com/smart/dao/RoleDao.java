package com.smart.dao;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.smart.entity.Role;

@Repository
public interface RoleDao extends CrudRepository<Role, String> {

}