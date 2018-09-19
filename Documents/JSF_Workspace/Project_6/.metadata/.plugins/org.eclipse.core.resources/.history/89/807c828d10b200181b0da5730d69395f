package com.JSFWorld;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean(name = "Hello World")
// Managedbean annotation indicates that a class HelloWorld is a managed Bean 
@SessionScoped
// Session scoped bean indicates that the bean is alive until the HttpSeeion is valid. 
public class HelloWorld implements Serializable {
	
	 private static final long serialVersionUID = -6913972022251814607L;
		
	    private String s1 = "Hello World!!";

	    public String getS1() {
	        System.out.println(s1);
	        return s1;
	    }

	    public void setS1(String s1) {
	        this.s1 = s1;
	    }
	
}
