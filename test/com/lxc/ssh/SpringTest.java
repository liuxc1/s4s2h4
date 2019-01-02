package com.lxc.ssh;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.lxc.ssh.domain.Product;
import com.lxc.ssh.domain.ProductDir;
import com.lxc.ssh.service.IProductDirService;
import com.lxc.ssh.service.IProductService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class SpringTest {

	@Autowired
	private IProductService prodctService;
	
	@Autowired
	private IProductDirService productDirService;
	
	@Test
	public void test() throws Exception {
		ProductDir dir1=new ProductDir("产品类型1");
		ProductDir dir2=new ProductDir("产品类型2");
		productDirService.save(dir1);
		productDirService.save(dir2);
		for (int i = 1; i < 11; i++) {
			Product product;
			if(i%2==0){
				product=new Product("产品"+i,dir1);
			}else{
				product=new Product("产品"+i,dir2);
			}
			prodctService.save(product);
		}
		
	}
}
