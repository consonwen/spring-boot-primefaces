package com.conson.view;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.inject.Inject;
import javax.inject.Named;

import com.conson.converter.CustomerConverter;
import com.conson.dao.CustomerDao;
import com.conson.dto.CustomerDto;
import com.conson.entity.CustomerEntity;

import lombok.Getter;
import lombok.Setter;
import lombok.extern.log4j.Log4j;

@Named
public class CustomerViewBean {
	
	@Inject
	private CustomerDao customerDao;
	
	@Setter
	@Getter
	private List<CustomerDto> customerList;
	
	@PostConstruct
	public void init() {
		customerList = this.searchAll();
	}
	
	public List<CustomerDto> searchAll() {
		List<CustomerEntity> entityList = (List<CustomerEntity>) customerDao.findAll();
		List<CustomerDto> dtoList =  CustomerConverter.toDtoList(entityList);
		return dtoList;
	}

	
	
}
