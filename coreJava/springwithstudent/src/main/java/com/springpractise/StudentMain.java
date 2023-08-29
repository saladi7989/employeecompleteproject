package com.springpractise;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class StudentMain {

	public static void main(String[] args) {
		
		Resource res =new ClassPathResource("springconfig.xml");
		BeanFactory factory =new XmlBeanFactory(res);
		
		Object o = factory.getBean("id1");
		
		Student st =(Student)o;
		
		System.out.println(st.getSname());
		System.out.println(st.getSid());

	}

}
