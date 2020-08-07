package com.wanghuiwen.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.wanghuiwen.bean.Meeting;
import com.wanghuiwen.bean.Server;
import com.wanghuiwen.bean.Type;
import com.wanghuiwen.service.MeetingService;

@Controller
public class MeetingController {
	@Resource
	private MeetingService ser;
	@RequestMapping("queryMeeting")
	public String queryMeeting(Model model,String mname,String tname,String starttime,String endtime,@RequestParam(name="pageNum",defaultValue = "1")Integer pageNum) {
		PageHelper.startPage(pageNum,2);
		Map<String, Object> map=new HashMap<String, Object>();
		map.put("mname", mname);
		map.put("tname", tname);
		map.put("starttime", starttime);
		map.put("endtime", endtime);
		List<Meeting> list = ser.queryMeeting(map);
		PageInfo<Meeting> page=new PageInfo<Meeting>(list);
		model.addAttribute("page",page);
		return "list";
	}
	@RequestMapping("queryType")
	@ResponseBody
	public List<Type> queryType(Type type) {
		List<Type>  list= ser.queryType();
		return list;
	}
	@RequestMapping("queryServer")
	@ResponseBody
	public List<Server> queryServer(Server server) {
		List<Server>  list= ser.queryServer();
		return list;
	}
	@RequestMapping("addMeeting")
	@ResponseBody
	public boolean addMeeting(Meeting meeting,String sid) {
		try {
			ser.addMeeting(meeting);
			Map<String, Object> map =new HashMap<String, Object>();
			String[] split = sid.split(",");
			for (String string : split) {
				map.put("mid", meeting.getMid());
				map.put("sid", string);
				ser.addMs(map);
			}
			return true;
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return false;
		}
	}
	@RequestMapping("toupdate")
	public String toupdate(Model model,Integer mid) {
		Meeting meeting=ser.queryMeetingById(mid);
		model.addAttribute("meeting",meeting);
		List<Server> list = ser.queryServer();
		List<Server>  queryServerByMid=ser.queryServerByMid(meeting.getMid());
		for (Server server : list) {
			for (Server server2 : queryServerByMid) {
				if(server.getSid()==server2.getSid()) {
					server.setFlag(true);
				}
			}
		}
		model.addAttribute("server",list);
		return "update";
	}
		@RequestMapping("updateMeeting")
		@ResponseBody
		public boolean updateMeeting(Meeting meeting,String sid) {
			try {
				ser.updateMeeting(meeting);
				Map<String, Object> map =new HashMap<String, Object>();
				ser.delMs(meeting.getMid());
				String[] split = sid.split(",");
				for (String string : split) {
					map.put("mid", meeting.getMid());
					map.put("sid", string);
					ser.addMs(map);
				}
				return true;
			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
				return false;
			}
		}
		@RequestMapping("delMeeting")
		public String delMeeting(Integer mid) {
			try {
				ser.delMeeting(mid);
				ser.delMs(mid);
				return "redirect:queryMeeting";
			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
				return "redirect:queryMeeting";
			}
		}

}
