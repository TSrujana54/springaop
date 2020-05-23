package com.utility.app;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.utility.config.AppConfig;

public class AspectDemo {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		StringUtility utility = context.getBean("stringUtility",StringUtility.class);
		//MathUtility math = context.getBean("mathUtility",MathUtility.class);
		String s = utility.targetMethods();
	//	String s1 = math.targetMethods();
	//	utility.test();
		
	}

}
