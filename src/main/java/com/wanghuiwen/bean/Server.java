package com.wanghuiwen.bean;


public class Server {

	private Integer sid;
	private String sname;
	private Boolean flag;
	public Integer getSid() {
		return sid;
	}
	public void setSid(Integer sid) {
		this.sid = sid;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}

	public Server(Integer sid, String sname, Boolean flag) {
		super();
		this.sid = sid;
		this.sname = sname;
		this.flag = flag;
	}
	@Override
	public String toString() {
		return "Server [sid=" + sid + ", sname=" + sname + ", flag=" + flag + "]";
	}
	public Boolean getFlag() {
		return flag;
	}
	public void setFlag(Boolean flag) {
		this.flag = flag;
	}
	public Server() {
		super();
	}
	
}
