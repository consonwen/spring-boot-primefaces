package com.conson.converter;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.BeanUtils;

import com.conson.dto.CustomerDto;
import com.conson.entity.CustomerEntity;

public class CustomerConverter {
	public static CustomerDto toDto(CustomerEntity entity) {
		if (entity != null) {
			CustomerDto dto = new CustomerDto();
			BeanUtils.copyProperties(entity, dto);
			return dto;
		}
		return null;
	}

	public static CustomerEntity toEntity(CustomerDto dto) {
		if (dto != null) {
			CustomerEntity entity = new CustomerEntity();
			BeanUtils.copyProperties(dto, entity);
			return entity;
		}
		return null;
	}

	public static List<CustomerDto> toDtoList(List<CustomerEntity> entityList) {
		if (entityList != null) {
			List<CustomerDto> dtoList = entityList.stream().map(CustomerConverter::toDto).collect(Collectors.toList());
			return dtoList;
		}
		return null;
	}

	public static List<CustomerEntity> toEntityList(List<CustomerDto> dtoList) {
		if (dtoList != null) {
			List<CustomerEntity> entityList = dtoList.stream().map(CustomerConverter::toEntity).collect(Collectors.toList());
			return entityList;
		}
		return null;
	}
}
