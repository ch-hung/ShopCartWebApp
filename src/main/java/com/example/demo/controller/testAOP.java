package com.example.demo.controller;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class testAOP {

	@Pointcut("execution(public * controller..*(..))")
	public void pointcut() {
	}

	@Before(value = "pointcut()")
	public void before(JoinPoint point) {
		String className = point.getTarget().getClass().getSimpleName();
		String methodName = point.getSignature().getName();
		System.out.println("正在調用 " + className + " - " + methodName + " 方法");
	}

	@AfterReturning(value = "pointcut()", returning = "result")
	public void afterReturn(JoinPoint point, Object result) {
		if (result != null) {
			System.out.println("結果：" + result.toString());
		} else {
			System.out.println("結果：null");
		}
	}
}
