package cn.com.leadfar.interceptors;

import java.lang.reflect.Method;

import org.springframework.aop.AfterReturningAdvice;
import org.springframework.stereotype.Component;

@Component
public class MyAfterAdvice implements AfterReturningAdvice {

	@Override
	public void afterReturning(Object returnValue, Method m, Object[] params,
			Object target) throws Throwable {
		System.out.println(this);
	}

}
