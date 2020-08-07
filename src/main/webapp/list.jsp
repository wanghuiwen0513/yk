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
<body>
<a href="add.jsp">
	<input type="button" value="添加">
</a>
<form action="queryMeeting" method="post">
	会议名称:<input type="text" name="mname">
	创建时间:<input type="date" name="starttime">~<input type="date" name="endtime">
	<input type="submit" value="查询">
</form>
	<table>
		<tr>
			<td>序号</td>
			<td>会议编号</td>
			<td>会议类型</td>
			<td>会议名称</td>
			<td>会议开始时间</td>
			<td>会议结束时间</td>
			<td>会议服务</td>
			<td>创建时间</td>
			<td>操作</td>
		</tr>
		<c:forEach items="${page.list }" var="m">
			<tr>
				<td>${m.mid }</td>
				<td>${m.code }</td>
				<td>${m.tname }</td>
				<td>${m.mname }</td>
				<td>${m.start_time }</td>
				<td>${m.end_time }</td>
				<td>${m.sname }</td>
				<td>${m.create_time }</td>
				<td>
					<a href="toupdate?mid=${m.mid }">
						<input type="button" value="修改">
					</a>
					<a href="delMeeting?mid=${m.mid }">
						<input type="button" value="删除">
					</a>
				</td>
			</tr>
		</c:forEach>
		<tr>
			<td colspan="12">
				<input type="button" value="首页" onclick="fenye(1)">
				<input type="button" value="上一页" onclick="fenye(${page.pageNum-1<1?1:page.pageNum-1 })">
				<input type="button" value="下一页" onclick="fenye(${page.pageNum+1>page.pages?page.pages:page.pageNum+1 })">
				<input type="button" value="尾页" onclick="fenye(${page.pages })">
			</td>
		</tr>
	</table>
</body>
<script type="text/javascript">
	function fenye(pageNum){
		location="queryMeeting?pageNum="+pageNum;
	}
</script>
</html>