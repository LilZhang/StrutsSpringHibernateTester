<%@ page language="java" contentType="text/html; charset=gb2312"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=gb2312">
<title>Result</title>
</head>
<body>
<a href="back.action">back</a>
<br/>
<s:if test="wtip!=null">
	<s:property value="wtip"/>
</s:if>
<s:if test="stip!=null">
	<s:property value="stip"/>
</s:if>
<table width="300" border="1">
	<tr height="30">
		<td>id</td>
		<td>testString</td>
		<td>writeInTime</td>	
	</tr>
<s:iterator value="tbs" status="index">
	<tr height="30">
		<td><s:property value="id"/></td>
		<td><s:property value="testString"/></td>
		<td><s:property value="writeInTime"/></td>
	</tr>
</s:iterator>
</table>
</body>
</html>