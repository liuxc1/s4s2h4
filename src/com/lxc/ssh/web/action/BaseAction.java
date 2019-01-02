package com.lxc.ssh.web.action;

import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
/**
 *不需要做crud的父类 
 */
public abstract class BaseAction extends ActionSupport {
	
	
	public static final String RELOAD="reload"; 
	public static final String RANDOMCODE_IN_SESSION="randomcodeInSession";
	public static final String USER_IN_SESSION="userInSession";
	
	protected void put(String key,Object value){
		ActionContext.getContext().put(key, value);
	}
	//公共的获取响应对象
	protected HttpServletResponse getResponse(){
		return ServletActionContext.getResponse();
	}
	//获取session的对象
	public HttpSession getSession(){
		HttpSession session = ServletActionContext.getRequest().getSession();
		return session;
	}
	
}
