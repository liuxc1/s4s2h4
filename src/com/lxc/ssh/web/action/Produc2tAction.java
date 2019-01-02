package com.lxc.ssh.web.action;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.lxc.ssh.domain.Product;
import com.lxc.ssh.service.IProductDirService;
import com.lxc.ssh.service.IProductService;

@Controller
@Scope("prototype")
public class Produc2tAction extends CRUDAction<Product> {
	private static final long serialVersionUID = 1L;
	private Product product;
	@Autowired
	private IProductService productSerimpl;
	@Autowired
	private IProductDirService productDirService;

	@Override
	protected void list() throws Exception {
		put("data", productSerimpl.getAll());

	}

	@Override
	public String input() throws Exception {
		put("dirs",productDirService.getAll());
		System.out.println("id:"+id);
		return INPUT;
	}

	@Override
	public String save() throws Exception {
			if(id==null){
				productSerimpl.save(product);
			}else{
				productSerimpl.update(product);
			}
		return RELOAD;
	}

	@Override
	public String delete() throws Exception {
		if (id != null) {
			productSerimpl.delete(id);
		}
		return RELOAD;
	}

	@Override
	public void prepareInput() throws Exception {
		if(id!=null) {
			 product = productSerimpl.get(id);
		} else{
			product=new Product();
		}
	}

	@Override
	public void prepareSave() throws Exception {
		if(id==null){
			product=new Product();
		}else{
			 product = productSerimpl.get(id);
			 product.setDir(null);
		}
	}

	@Override
	public Product getModel() {
		
		return product;
	}
}
