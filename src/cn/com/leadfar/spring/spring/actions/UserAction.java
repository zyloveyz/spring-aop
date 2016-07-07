package cn.com.leadfar.spring.actions;

import javax.annotation.Resource;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import cn.com.leadfar.spring.service.UserService;

@Controller
@Scope("prototype")
public class UserAction {
	
	@Resource
	private UserService userService;
	
	public UserAction() {
		System.out.println(this+"被创建了！");
	}

	public String add(){
		System.out.println(this+".add()");
		
		userService.add();
		
		return "add_success";
	}

}
