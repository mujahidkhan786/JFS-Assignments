package com.springassignment.Q5;
	import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

	public class Test {
	    public static void main(String[] args) {
	        ApplicationContext context = new ClassPathXmlApplicationContext("springQ5.xml");
	        Student studentResource = (Student)context.getBean("studentResource");
	        studentResource.getStudentDetailsUsingResource();
	        // add  <bean class="org.springframework.beans.factory.annotation.RequiredAnnotationBeanPostProcessor"/>
	       


	        // add <bean class="org.springframework.context.annotation.CommonAnnotationBeanPostProcessor"/>
	        // in xml file
	        Student studentRequired = (Student)context.getBean("studentRequired");
	        studentRequired.getStudentDetails();

	    }
	}
