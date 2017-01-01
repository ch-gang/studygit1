package com.netease.course;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;

@Aspect
public class LoggingAspect {
	@AfterReturning("execution(* com.netease.course.*.*(..))")
	private void DoLog1(JoinPoint jp) {
		System.out.println(jp.getSignature().getName()+", "+jp.getArgs()+", 正常返回");
	}

	@AfterThrowing("execution(* com.netease.course.*.*(..))&&args(e)")
	public void afterThrowing(JoinPoint jp, Exception e) {
		System.out.println(jp.getSignature().getName()+", "+jp.getArgs()+", 返回异常, "+e);
	}
}
