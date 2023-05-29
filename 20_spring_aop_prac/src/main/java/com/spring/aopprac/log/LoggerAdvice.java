package com.spring.aopprac.log;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import com.spring.aopprac.log.LoggerAdvice;

@Component
@Aspect
public class LoggerAdvice {
	
	
	private static final Logger logger = LoggerFactory.getLogger(LoggerAdvice.class);
	
	
	@Around("execution(void com.spring.aopprac.*.*(..))")
	public void around(ProceedingJoinPoint pjp) throws Throwable {
		
		long startTime = System.currentTimeMillis();
		
		pjp.proceed();
		
		long endTime = System.currentTimeMillis();
		
		logger.info(pjp.getSignature().getName() + "메서드 동작시간 : " + (endTime - startTime) +"초");
	}
	
}
