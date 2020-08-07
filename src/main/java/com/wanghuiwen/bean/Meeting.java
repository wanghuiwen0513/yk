package com.wanghuiwen.bean;


public class Meeting {

	private Integer mid;
	private Integer code;
	private Integer tid;
	private String mname;
	private String start_time;
	private String end_time;
	private String create_time;
	private String tname;
	private String sname;
	public Meeting(Integer mid, Integer code, Integer tid, String mname, String start_time, String end_time,
			String create_time, String tname, String sname) {
		super();
		this.mid = mid;
		this.code = code;
		this.tid = tid;
		this.mname = mname;
		this.start_time = start_time;
		this.end_time = end_time;
		this.create_time = create_time;
		this.tname = tname;
		this.sname = sname;
	}
	@Override
	public String toString() {
		return "Meeting [mid=" + mid + ", code=" + code + ", tid=" + tid + ", mname=" + mname + ", start_time="
				+ start_time + ", end_time=" + end_time + ", create_time=" + create_time + ", tname=" + tname
				+ ", sname=" + sname + "]";
	}
	public String getTname() {
		return tname;
	}
	public void setTname(String tname) {
		this.tname = tname;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public Integer getMid() {
		return mid;
	}
	public void setMid(Integer mid) {
		this.mid = mid;
	}
	public Integer getCode() {
		return code;
	}
	public void setCode(Integer code) {
		this.code = code;
	}
	public Integer getTid() {
		return tid;
	}
	public void setTid(Integer tid) {
		this.tid = tid;
	}
	public String getMname() {
		return mname;
	}
	public void setMname(String mname) {
		this.mname = mname;
	}
	public String getStart_time() {
		return start_time;
	}
	public void setStart_time(String start_time) {
		this.start_time = start_time;
	}
	public String getEnd_time() {
		return end_time;
	}
	public void setEnd_time(String end_time) {
		this.end_time = end_time;
	}
	public String getCreate_time() {
		return create_time;
	}
	public void setCreate_time(String create_time) {
		this.create_time = create_time;
	}
	
	public Meeting() {
		super();
	}
	
}
