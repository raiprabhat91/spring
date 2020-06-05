package test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import beans.Car;

public class Client {

	public static void main(String[] args) {
		/*
		 * if there is multiple spring.xml file then
		 * =========================================
		 * String files[] = new String[] {"spring1.xml","spring2.xml"}
		 * 
		 * ApplicationContext context = new ClassPathXmlApplicationContext(files);
		 * 
		 * 
		 * */
		ApplicationContext context = new ClassPathXmlApplicationContext("resources/spring.xml");
		Car car=(Car)context.getBean("c");
		car.printCarData();
	}

}
