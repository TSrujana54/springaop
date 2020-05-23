package com.utility.app;

import org.springframework.stereotype.Component;

@Component
public class StringUtility {
	
	public String targetMethods() {
		System.out.println("method :: targetMethods()");
		return "Utiltiy Class Invoked";
		
	}
	public void test() {
		System.out.println("method: test()");
		throw new NullPointerException();
		
	}

}
