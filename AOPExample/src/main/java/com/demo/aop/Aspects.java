package com.demo.aop;
import com.demo.model.*;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class Aspects {
	@Before("execution(* com.demo.model.Person.*(..))")
	public void checkAge(int age) {
		if(age < 20)
			System.out.println("Nikal Lawde ... Peheli Fursat me nikal.");
		else{
			System.out.println("Under aaa na Gandu.");
		}
	}
}
