package cn.com.leadfar.interceptors;

import java.lang.reflect.Method;

import org.springframework.aop.MethodBeforeAdvice;
import org.springframework.stereotype.Component;

@Component
public class LogManager implements MethodBeforeAdvice {

	@Override
	public void before(Method m, Object[] params, Object target)
			throws Throwable {
		
		System.out.println("现在正在执行："+target+"的"+m.getName()+",记录它的执行日志");
		
	}

}
