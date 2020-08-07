package com.wanghuiwen.bean;

public class MeetingServer {

	private Integer mid;
	private Integer sid;
	public Integer getMid() {
		return mid;
	}
	public void setMid(Integer mid) {
		this.mid = mid;
	}
	public Integer getSid() {
		return sid;
	}
	public void setSid(Integer sid) {
		this.sid = sid;
	}
	@Override
	public String toString() {
		return "MeetingServer [mid=" + mid + ", sid=" + sid + "]";
	}
	public MeetingServer(Integer mid, Integer sid) {
		super();
		this.mid = mid;
		this.sid = sid;
	}
	public MeetingServer() {
		super();
	}
	
}
