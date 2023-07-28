package com.example.spring4shell;

public class user{
	private long id;
	private String phone;
	private String name;
	private String addr;
	
	
	public long getID(){
		return id;
	}
	public void setid(long id) {
		this.id=id;
	}
	public String getphone(){
		return phone;
	}
	public void setphone(String phone) {
		this.phone=phone;
	}
	public String getname(){
		return name;
	}
	public void setname(String name) {
		this.name=name;
	}
	public void setaddr(String addr) {
		this.addr=addr;
	}
	public String getaddr(){
		return addr;
	}
}

