package com.ueasy.system;

import com.opensymphony.xwork2.ActionSupport;

public class loginAction extends ActionSupport {
	private String user;
	
	public String getUser() {
		return user;
	}
	public void setUser(String user) {
		this.user = user;
	}
	
	//登陆路径为：http://localhost:8080/struts2/ueasy/login.action
	public String execute() throws Exception
    {
		return "";
    }
	 public  void  validate(){
         //效验内容
        if(user==null){
        	System.out.println("please login in !");
        }
	 }
}
