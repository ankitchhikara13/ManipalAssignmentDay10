package com.manipal.assign01.assignment01;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ShapeApplication {

	public static void main(String[] args) {
			ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml"); 
			Line ln = (Line) context.getBean("line");
			System.out.println(ln);
			Triangle tr = (Triangle) context.getBean("triangle");
			System.out.println(tr);

		}

	}
