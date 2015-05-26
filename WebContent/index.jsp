<%@ page language="java" contentType="text/html; charset=gb2312"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=gb2312">
<title>Index</title>
</head>
<body>
<s:form action="processWriteAction">
	<s:textfield name="text" label="WriteIn"/>
	<s:submit value="写入"/>
</s:form>
<s:form action="processSearchAction">
	<s:textfield name="searchText" label="Search"/>
	<s:submit value="查找"/>
</s:form>
</body>
</html>