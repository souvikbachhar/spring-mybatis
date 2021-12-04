package com.souvik.mybatis.service;

import java.io.IOException;
import java.io.Reader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.springframework.stereotype.Component;

import com.souvik.mybatis.model.Student;

@Component
public class StudentServiceImpl implements StudentService {

	//private SqlSession sqlSession;

	@Override
	public Object getAllStudents() {

		Reader reader;
		List<Student> students = new ArrayList<>();
		 Student student = new Student();
		try {
			reader = Resources.getResourceAsReader("SqlMapConfig.xml");
			SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(reader);
			SqlSession session = sqlSessionFactory.openSession();

			 //students = session.selectList("getById",2);
			Map<String,Object> res= new HashMap<>();
			res.put("studentId", 2);
			res.put("name", "Souvik");
			res.put("branch", "CSE");
			
			student.setBranch("CSE");
			student.setName("Souvik");
			res.put("studentData", student);
			
			session.selectList("callByType", res);
			System.out.println(res);
			students=(List<Student>) res.get("returnValue");
			session.commit();   
		    session.close();

		} catch (IOException e) {
			e.printStackTrace();
		}

		return students;
	}

}
