package com.javatpoint.aspectj.annotation;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class TrackOperation {
	@Pointcut("execution(* Operation.*(..))")
	public void k() {
	}// pointcut name

	@Before("k()") // applying pointcut on before advice
	public void myadviceBefore(JoinPoint jp)// it is advice (before advice)
	{
		System.out.println("additional concern");
		// System.out.println("Method Signature: " + jp.getSignature());
	}

	@After("k()") // applying pointcut on after advice
	public void myadviceAfter(JoinPoint jp)// it is advice (after advice)
	{
		System.out.println("additional concern");
		// System.out.println("Method Signature: " + jp.getSignature());
	}

	@AfterReturning(pointcut = "execution(* Operation.*(..))", returning = "result")

	public void myadvice(JoinPoint jp, Object result)// it is advice (after
														// returning advice)
	{
		System.out.println("additional concern");
		System.out.println("Method Signature: " + jp.getSignature());
		System.out.println("Result in advice: " + result);
		System.out.println("end of after returning advice...");
	}

	@Pointcut("execution(* Operation.*(..))")
	public void aroundPointcut() {
	}

	@Around("aroundPointcut()")
	public Object myadvice(ProceedingJoinPoint pjp) throws Throwable {
		System.out.println("Additional Concern Before calling actual method");
		Object obj = pjp.proceed();
		System.out.println("Additional Concern After calling actual method");
		return obj;
	}

	@AfterThrowing(pointcut = "execution(* Operation.*(..))", throwing = "error")
	public void myadvice(JoinPoint jp, Throwable error)// it is advice
	{
		System.out.println("additional concern");
		System.out.println("Method Signature: " + jp.getSignature());
		System.out.println("Exception is: " + error);
		System.out.println("end of after throwing advice...");
	}
}