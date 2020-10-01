package com.erp.action;

import java.io.IOException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;

import com.erp.bean.User;
import com.erp.service.UserService;
import com.opensymphony.xwork2.ActionSupport;

public class UserAction extends ActionSupport{

      private int id;
	
	

	private UserService userService;
	private User user;
	
	public String login(){
	    System.out.println("登录方法");
		try {
			PrintWriter out= ServletActionContext.getResponse().getWriter();;
			 //登录成功返回true 否则false
			User u = userService.login(user);
			if(u!=null){
				ServletActionContext.getRequest().getSession().setAttribute("user", u);
				//登陆成功
				return "se";
				 
			}else{
				
				out.println("�����404");
			}
			 out.flush();
		     out.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return "login";
	}

	public String updatePwd(){
		System.out.println(user.getPwd());
		
		HttpSession session = ServletActionContext.getRequest().getSession();
		User u=(User) session.getAttribute("user");
		u.setPwd(user.getPwd());
		userService.updateuser(u);
	
	return "relogin";
}

	
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	
	
	

	public UserService getUserService() {
		return userService;
	}

	public void setUserService(UserService userService) {
		this.userService = userService;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}


	


}
