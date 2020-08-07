<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
 <link rel="stylesheet" type="text/css"  href="css/index_work.css"/> 
<script type="text/javascript" src="<%=request.getContextPath()%>/js/jquery-1.8.2.min.js"></script>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<script type="text/javascript">
	$(function(){
		$.post("queryType",function(data){
			for(var i in data){
				$("#tid").append("<option value='"+data[i].tid+"'>"+data[i].tname+"</option>")
			}
		})
		$.post("queryServer",function(data){
			for(var i in data){
				$("#sid").append("<input type='checkbox' name='sid' value='"+data[i].sid+"'>"+data[i].sname)
			}
			
		})
		
	})
</script>

<body>
	<form action="#">
		会议编号:<input type="text" name="code"><br><br>
		会议名称:<input type="text" name="mname"><br><br>
		会议类型:<select id="tid" name="tid">
			<option value="">请选择</option>
		</select><br><br>
		会议日期:<input type="date" name="start_time">~<input type="date" name="end_time"><br><br>
		<div id="sid">
			会议服务
		</div><br><br>
		<input type="button" value="保存" onclick="addMeeting()">
	</form>
</body>
<script type="text/javascript">
	function addMeeting(){
		$.post("addMeeting",$("form").serialize(),function(data){
			if(data){
				alert("添加成功~！");
				location.href="queryMeeting";
			}else{
				alert("添加失败~！");
			}
			
		})
	}
</script>
</html>