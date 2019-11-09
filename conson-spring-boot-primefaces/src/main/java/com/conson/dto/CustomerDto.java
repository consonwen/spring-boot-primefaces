package com.conson.dto;

import lombok.Data;

@Data
public class CustomerDto {
	
	private int customerId;
	private String customerName;
	private String sex;
	private String customerAddress;
	private Integer age;
	private int active;
}
