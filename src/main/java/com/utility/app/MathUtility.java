package com.utility.app;

import org.springframework.stereotype.Component;

@Component
public class MathUtility {
	public String targetMethods() {
		System.out.println("Test");
		return "Utiltiy Class Invoked";
	}

}
