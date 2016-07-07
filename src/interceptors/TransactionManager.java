package cn.com.leadfar.interceptors;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;
import org.springframework.stereotype.Component;

@Component
public class TransactionManager implements MethodInterceptor {

	@Override
	public Object invoke(MethodInvocation invocation) throws Throwable {
		
		//之前干点什么
		System.out.println("open session,begin transaction");
		
		try {
			//继续往下
			Object returnValue = invocation.proceed();
			
			System.out.println("commit transaction");
			return returnValue;
		} catch (RuntimeException e) {
			System.out.println("rollback transaction!");
			e.printStackTrace();
		} finally{
			System.out.println("close session");
		}
		
		return null;
	}

}
