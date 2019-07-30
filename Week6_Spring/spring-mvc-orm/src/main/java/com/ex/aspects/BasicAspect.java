package com.ex.aspects;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;

import org.springframework.stereotype.Component;

@Component
@Aspect
public class BasicAspect {
	
	//ADVICE-to be applied before every method indicated in the pointcut
	
	
	//must specify point cut in parenthessess below which is set of methods you want it to apply too
	//first star is class second star is method
	//(...) decides parameters
	@Before("execution(* com.ex.controller.*.* (..))")
	public void helloControllers() {
		System.out.println("Welcome to Spring AOP");
	}
	
	@After("execution(* com.ex.controller.*.* (..)) && execution(* com.ex.service.*.* (..))")
	public void afterAdvice(JoinPoint jp) {
		
		System.out.println("Method Executing after "+jp.getSignature());
		
	}
	
	
	//most powerful
	@Around("everywhere()")
	public Object doAround(ProceedingJoinPoint pjp) {
		
		long start=System.currentTimeMillis();
		
		/*
		 * Stopwatch time=new StopWatch();
		 * 
		 * time.start;
		 * proceed function
		 * time.stop
		 * 
		 */
		//System.out.println("In around advice before "+pjp.getSignature());
		Object o=null;
		try {
			
			 o=pjp.proceed();
			 
			 
		} catch (Throwable e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		long time=(System.currentTimeMillis()-start);
		System.out.println( pjp.getSignature()+"took :" +time+ " milliseconds to Execute.");
		
		
		
		//return pjp.get
		return o;
	}
	//everything i want it to be applied to so i can use the shorthand everywhere to reference it
	@Pointcut("execution(* com.ex..* (..))")
	public void everywhere() {}

}
