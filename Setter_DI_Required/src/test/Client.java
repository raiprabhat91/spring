package test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import beans.Test;

public class Client {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		
		ApplicationContext context=new ClassPathXmlApplicationContext("resources/Spring.xml");
		Test t = (Test) context.getBean("t");
		t.printConn();
	}

}
