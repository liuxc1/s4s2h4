<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<table>
		<tr>
			<th>ID</th>
			<th>产品名称</th>
			<th>产品类型</th>
			<th>操作</th>
		</tr>
		<s:iterator value="#data">
			<tr>
				<td>${id }</td>
				<td>${name }</td>
				<td>${dir.name }</td>
				<td> <a href="/product3_delete?id=${id }">删除</a>
					 <a href="/product3_input2?id=${id }">编辑</a>
				</td>
			</tr>
		</s:iterator>
	</table>

</body>
</html>