package com.souvik.mybatis.dao;

import java.util.List;
import java.util.Map;

import org.mapstruct.Mapper;
import org.springframework.stereotype.Component;

@Component
@Mapper
public interface StudentDao {
	
	public List<Map<String,Object>> getAllStudents();
	
	public Object getAll();

}
