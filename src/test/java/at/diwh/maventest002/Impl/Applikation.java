package at.diwh.maventest002.Impl;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import at.diwh.maventest002.raw.Vehicle;

public class Applikation {

	private static ApplicationContext context;

	public static void main(String[] args) {
		context = new ClassPathXmlApplicationContext("beanConfig.xml");
		Vehicle v = (Vehicle) context.getBean("vehicle");
		v.makeNoise();
	}
}
