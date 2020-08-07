package com.wanghuiwen.service;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.wanghuiwen.bean.Meeting;
import com.wanghuiwen.bean.Server;
import com.wanghuiwen.bean.Type;
import com.wanghuiwen.mapper.MeetingMapper;

@Service
public class MeetingServiceImpl implements MeetingService{

	@Resource
	 MeetingMapper m;
	@Override
	public List<Meeting> queryMeeting(Map<String, Object> map) {
		// TODO Auto-generated method stub
		return m.queryMeeting(map);
	}
	@Override
	public List<Type> queryType() {
		// TODO Auto-generated method stub
		return m.queryType();
	}

	@Override
	public List<Server> queryServer() {
		// TODO Auto-generated method stub
		return m.queryServer();
	}

	@Override
	public void addMeeting(Meeting meeting) {
		// TODO Auto-generated method stub
		m.addMeeting(meeting);
	}

	@Override
	public void addMs(Map<String, Object> map) {
		// TODO Auto-generated method stub
		m.addMs(map);
	}
	@Override
	public Meeting queryMeetingById(Integer mid) {
		// TODO Auto-generated method stub
		return m.queryMeetingById(mid);
	}

	@Override
	public List<Server> queryServerByMid(Integer mid) {
		// TODO Auto-generated method stub
		return m.queryServerByMid(mid);
	}

	@Override
	public void updateMeeting(Meeting meeting) {
		// TODO Auto-generated method stub
		m.updateMeeting(meeting);
	}

	@Override
	public void delMs(Integer mid) {
		// TODO Auto-generated method stub
		m.delMs(mid);
	}

	@Override
	public void delMeeting(Integer mid) {
		// TODO Auto-generated method stub
		m.delMeeting(mid);
	}

	
}
