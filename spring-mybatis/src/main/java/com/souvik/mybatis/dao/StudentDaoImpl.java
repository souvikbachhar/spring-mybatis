/*
 * package com.souvik.mybatis.dao;
 * 
 * import java.util.List; import java.util.Map;
 * 
 * import org.springframework.beans.factory.annotation.Autowired; import
 * org.springframework.jdbc.core.JdbcTemplate; import
 * org.springframework.stereotype.Component;
 * 
 * @Component public class StudentDaoImpl implements StudentDao{
 * 
 * @Autowired JdbcTemplate jdbcTemplate;
 * 
 * @Override public List<Map<String, Object>> getAllStudents() {
 * 
 * return jdbcTemplate.queryForList("select * from student"); }
 * 
 * }
 */