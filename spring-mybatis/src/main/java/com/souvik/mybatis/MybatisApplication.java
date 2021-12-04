package com.souvik.mybatis;

import java.io.IOException;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource("classpath:/app-context.xml")
public class MybatisApplication {

	public static void main(String[] args) throws IOException {
		/* Reader reader = Resources.getResourceAsReader("SqlMapConfig.xml");
	      SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(reader);		
	      SqlSession session = sqlSessionFactory.openSession();
	      	
	      List<Student> student = session.selectList("getAll");
	          
	      for(Student st : student ){    	  
	         System.out.println(st.getId());
	         System.out.println(st.getName());
	         System.out.println(st.getBranch());
	         System.out.println(st.getPercentage());         
	         System.out.println(st.getEmail());        
	         System.out.println(st.getPhone());   
	      }  
			
	      System.out.println("Records Read Successfully ");          
	      session.commit();   
	      session.close();	*/
		
		SpringApplication.run(MybatisApplication.class,args);
		
	}

}
