package com.conson.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "customer")
public class CustomerEntity {
	
	@Id
	private int customerId;
	private String customerName;
	private String sex;
	private String customerAddress;
	private Integer age;
	private int active;
}
