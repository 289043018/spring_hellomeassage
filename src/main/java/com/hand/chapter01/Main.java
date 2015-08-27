package com.hand.chapter01;

import org.springframework.beans.factory.*;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.Resource;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Resource r = new FileSystemResource("helloMessage.xml");
		BeanFactory f = new XmlBeanFactory(r);
		
		Person person = (Person) f.getBean("person");
		String s = person.sayHello();
		System.out.println("The person is saying"+s);
	}

}
