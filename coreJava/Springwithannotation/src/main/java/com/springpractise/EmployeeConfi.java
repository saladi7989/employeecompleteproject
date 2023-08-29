package com.springpractise;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration

public class EmployeeConfi {
	@Primary
	@Bean
	public Employee employee1() {
		Employee emp =new Employee();
		emp.setEid(101);
		emp.setEname("sreenu");
		return emp;
		
	}
	@Bean
	public Employee employee2() {
		Employee emp =new Employee();
		emp.setEid(102);
		emp.setEname("bramha");
		return emp;
	}
	
	@Bean(name="salesEmployee")
	public Employee employee3() {
		Employee emp =new Employee();
		emp.setEid(103);
		emp.setEname("mahesh");
		return emp;
	}
}
