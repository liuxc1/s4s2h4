package com.lxc.ssh.web.action;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.lxc.ssh.domain.Product;
import com.lxc.ssh.service.IProductDirService;
import com.lxc.ssh.service.IProductService;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

@Controller
@Scope("prototype")
public class ProductAction extends ActionSupport {
	@Autowired
	private IProductService productService;
	@Autowired
	private IProductDirService productDirService;
	private Product product;

	@Override
	public String execute() throws Exception {
		ActionContext.getContext().put("data", productService.getAll());
		
		return SUCCESS;
	}
	@Override
	public String input() throws Exception {
		ActionContext.getContext().put("dirs",productDirService.getAll());
		System.out.println(product.getId());
		product=productService.get(product.getId());
		
		
		return INPUT;
	}
	
	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

}
