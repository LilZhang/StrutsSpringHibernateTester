<%@ page language="java" contentType="text/html; charset=GBK"
    pageEncoding="GBK"%>
<%@ taglib uri="/struts-tags" prefix="s" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Login Page</title>
</head>
<body>
<s:form action="loginPro">
	<s:textfield  name="username" label="Username" value="lilzhang" />
	<s:textfield  name="password" label="Password" value="123456"/>
	<s:submit value="Go!"/>
</s:form>
<hr/>
<s:form action="regAction">
	<s:textfield name="person.name" label="Name"/>
	<s:textfield name="person.age" label="Age"/>
	<s:submit value="Register"/>
</s:form>
</body>
</html>