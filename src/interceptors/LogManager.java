package cn.com.leadfar.interceptors;

import java.lang.reflect.Method;

import org.springframework.aop.MethodBeforeAdvice;
import org.springframework.stereotype.Component;

@Component
public class LogManager implements MethodBeforeAdvice {

	@Override
	public void before(Method m, Object[] params, Object target)
			throws Throwable {
		
		System.out.println("��������ִ�У�"+target+"��"+m.getName()+",��¼����ִ����־");
		
	}

}
