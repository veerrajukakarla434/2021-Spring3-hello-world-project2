package com.vkakarla.spring3.project2;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class App {
	public static void main(String[] args) {
		
		//Create a Resource to read the configuration file
        Resource resource = new ClassPathResource("SpringBeans.xml");
        //Read the beanfactory of the configuration file
        BeanFactory bf = new XmlBeanFactory(resource);
        //Get the HelloWorldBean object
        HelloWorld helloWorldBean = (HelloWorld)bf.getBean("helloWorldBean");
        
        //Set value to the message property in the helloWorldBean class
        helloWorldBean.setMessage("Hello World");
        
        //Lets now call the show() method
        helloWorldBean.show();
	}
}
