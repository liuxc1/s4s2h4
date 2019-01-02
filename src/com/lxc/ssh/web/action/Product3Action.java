package com.lxc.ssh.web.action;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.lxc.ssh.domain.Product;
import com.lxc.ssh.service.IProductDirService;
import com.lxc.ssh.service.IProductService;
@Controller
@Scope("prototype")
public class Product3Action extends CRUDAction<Product> {
	@Autowired
	private IProductService productService;
	@Autowired
	private IProductDirService productDirService;
	private Product product;

	@Override
	public Product getModel() {
		return product;
	}

	@Override
	protected void list() throws Exception {
		put("data", productService.getAll());

	}

	@Override
	public String save() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	public String input2() throws Exception {
		put("dirs", productDirService.getAll());
		System.out.println("id="+id);
		return INPUT;
	}

	@Override
	public String delete() throws Exception {
		System.out.println(id);
		return null;
	}

	
	public void prepareInput2() throws Exception {
		System.out.println(id);

	}

	@Override
	public void prepareSave() throws Exception {
		// TODO Auto-generated method stub

	}

	@Override
	public void prepareInput() throws Exception {
		// TODO Auto-generated method stub
		
	}

}
