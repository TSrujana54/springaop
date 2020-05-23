package com.utility.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class UtilityAspect {
//	@After("expressions()")
//	public void afterAadvice() {
//		System.out.println("Advice Method Called : After");
//	}
	//@Before("expressions()")
//	@Before("within(com.utility.app.StringUtility)")
//	public void beforeAdvice(JoinPoint joinpoint) {
//		System.out.println("Advice Method Called : Before ::"+joinpoint.getSignature().getName());
//	}
	@Around("expressions()")
	public void aroundAdvice(ProceedingJoinPoint proeedingJoinPoint) throws Throwable {
		System.out.println("Around Advice :: Before");
		proeedingJoinPoint.proceed();
		System.out.println("Around Advice :: After");
	}
	
	
//	@AfterThrowing("expressions()")
//	public void afterThrow() {
//		System.out.println("Advice Method Called : AfterThrowing");
//	}
//	@AfterReturning("expressions()")
//	public void afterReturn() {
//		System.out.println("Advice Method Called : AfterReturn");
//	}
//	
	
	//Pointcut===>Cross Cutting concerns
	@Pointcut("execution(public * com.utility.app.*.*())")
	public void expressions() {}
}
