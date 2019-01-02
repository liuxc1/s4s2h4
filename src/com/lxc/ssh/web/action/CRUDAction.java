package com.lxc.ssh.web.action;

import com.opensymphony.xwork2.ModelDriven;
import com.opensymphony.xwork2.Preparable;
import com.opensymphony.xwork2.interceptor.annotations.InputConfig;

/**
 *需要CRUD+高级查询+分页的类继承这个类 
 */
public abstract class CRUDAction<T> extends BaseAction implements ModelDriven,Preparable {
	
	//定义公共的id的getting和setting
	protected Long id;
	
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	//查询方法列表
	@Override
	@InputConfig(methodName="execute")
	public String execute() throws Exception {
		list();
		return SUCCESS;
	}
	//子类必须要覆写的方法
	protected abstract void list()throws Exception;
	
	//处理新增或修改后的保存方法
	public  abstract String save() throws Exception;
	//删除方法
	public  abstract String delete() throws Exception;
	//input的前置通知
	public abstract void prepareInput() throws Exception;
	//sava的前置通知
	public abstract void prepareSave() throws Exception;
	
	
	
	@Override
	public void prepare() throws Exception {
		// TODO Auto-generated method stub
		
	}

	

}
