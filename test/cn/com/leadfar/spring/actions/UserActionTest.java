package cn.com.leadfar.spring.actions;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cn.com.leadfar.spring.actions.UserAction;
import junit.framework.TestCase;

public class UserActionTest extends TestCase {
	
	
	public void testDI01(){
		
		BeanFactory factory = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		UserAction userAction01 = (UserAction)factory.getBean("userAction");
		userAction01.add();
		
	}
	
	public void test02(){
		System.out.println("hahaha");
		
	}
}
