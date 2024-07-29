package com.demo.app1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringHelloMain {
	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("classpath:com/demo/app1/spring.xml");
//		HelloWorld hello = ctx.getBean(HelloWorld.class);
		HelloWorld hello = (HelloWorld)ctx.getBean("h1"); 
		//h1 is called as 'bean'. A bean is an object in a spring specific project
		System.out.println(hello.sayHello("Vamsi"));
	}
}
