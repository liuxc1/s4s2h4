package com.lxc.ssh.domain;

public class Product {
	private Long id;
	private String name;
	private ProductDir dir;
	
	
	public Product() {}
	public Product(String name, ProductDir dir) {
		this.name = name;
		this.dir = dir;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public ProductDir getDir() {
		return dir;
	}
	public void setDir(ProductDir dir) {
		this.dir = dir;
	}
	
	
}
