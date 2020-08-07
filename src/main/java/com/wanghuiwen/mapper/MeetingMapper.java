package com.wanghuiwen.mapper;

import java.util.List;
import java.util.Map;

import com.wanghuiwen.bean.Meeting;
import com.wanghuiwen.bean.Server;
import com.wanghuiwen.bean.Type;

public interface MeetingMapper {

	public List<Meeting> queryMeeting(Map<String, Object> map);
	
	public List<Type> queryType();

	public List<Server> queryServer();
	
	public void addMeeting(Meeting meeting);
	
	public void addMs(Map<String, Object> map);
	
	public Meeting queryMeetingById(Integer mid);
	
	public List<Server> queryServerByMid(Integer mid);
	
	public void updateMeeting(Meeting meeting);

	public void delMs(Integer mid);
	
	public void delMeeting(Integer mid);
}
