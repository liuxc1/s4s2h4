<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<div align="center">
		<s:form action="/product_save" method="post">
			<s:textfield name="product.id"   />
			产品名称：<s:textfield name="product.name"  /><br/>
			<s:select list="#dirs" listKey="id" listValue="name"  name="product.dir.id" />
			<s:submit value="提交" />
		</s:form>
	</div>
</body>
</html>