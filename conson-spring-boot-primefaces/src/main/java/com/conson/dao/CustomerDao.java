package com.conson.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.conson.entity.CustomerEntity;

@Repository
public interface CustomerDao extends CrudRepository<CustomerEntity, Integer> {

}
