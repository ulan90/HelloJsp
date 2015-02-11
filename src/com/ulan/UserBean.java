package com.ulan;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

@ManagedBean(name="bean1")
@RequestScoped
public class UserBean implements Serializable{
	
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public void namba(){}
	sdfsdffdgdfg
}
