package com.spring.aopprac;


import java.util.Arrays;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class Advice {
	
	//메서드 호출 전
	/*
	@Before("execution(public void com.spring.aopprac.*.work())")
	public void beforeWork() {
		System.out.println("(before)출근한다.");
		
	}
	
	@After("execution(* work())")
	public void after() {
		
		System.out.println("(after)퇴근한다.");
	}
	
	
	//메서드 호출 전 후 
	@Around("execution(void com.spring.aopprac.*.getWorkingTime())")
	public void aroundGetWorkingTime(ProceedingJoinPoint pjp) throws Throwable {
		
		System.out.println("==================");
		long startTime = System.currentTimeMillis();
		
		pjp.proceed(); //해당 메서드 실행
		
		long endTime = System.currentTimeMillis();
		System.out.println("업무소요시간 : " + (endTime - startTime) + "초");
		System.out.println("=================");
		
		
	}
	
	//호출된 메서드가 성공적으로 실행된 후 
	@AfterReturning("execution(public * getInfo(..))")
	public void afterReturningGetInfo(JoinPoint jp) {
		System.out.println("1 : " + Arrays.toString(jp.getArgs()));		// 메서드의 파라미터를 확인
		System.out.println("2 : " + jp.getKind());						// 메서드의 종류 확인
		System.out.println("3 : " + jp.getSignature().getName());		// 어드바이즈메서드에 대한 설명(description) 반환
		System.out.println("4 : " + jp.getTarget());					// 대상 객체를 반환
		System.out.println();
	}
	
	//호출된 메서드에서 예외 발생 후 
	@AfterThrowing("excution(public void com.spring.aopprac.Employee.getError())")
	public void afterThrowingGetError() {
		System.out.println("(afterThrowing advice)");
	}
	
	*/
	
	
	
}
