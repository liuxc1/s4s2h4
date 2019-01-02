package com.lxc.ssh.web.action;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.lxc.ssh.domain.ProductDir;
import com.lxc.ssh.service.IProductDirService;

@Controller
@Scope("prototype")
public class ProductDirAction extends CRUDAction<ProductDir> {
	@Autowired
	private IProductDirService service;
	private ProductDir productDir;


	@Override
	protected void list() throws Exception {
		put("data", service.getAll());

	}

	@Override
	public String input() throws Exception {
		System.out.println("id="+id);
		return INPUT;
	}

	@Override
	public String save() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String delete() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void prepareInput() throws Exception {
		System.out.println("prepareInput:"+id);

	}

	@Override
	public void prepareSave() throws Exception {
		System.out.println("prepareSave:"+id);

	}

	@Override
	public Object getModel() {
		// TODO Auto-generated method stub
		return productDir;
	}

}
