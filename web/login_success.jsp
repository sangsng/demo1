<%--
  User: Sangsng
  Date: 2017/7/20
  Time: 13:26
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8}">
    <title>登录成功</title>
</head>
<body>
<%
    String loginUser = "";
    if (session.getAttribute("loginUser") != null)
        loginUser = session.getAttribute("loginUser").toString();
%>
<div id="box">欢迎您!<SPAN style="color: red"><%=loginUser%></SPAN> 登录成功！</div>

</body>
</html>
