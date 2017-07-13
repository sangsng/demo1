<%--
  Created by IntelliJ IDEA.
  User: HR
  Date: 2017/7/9
  Time: 16:27
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=">
    <title>哈哈</title>
</head>
<body>
<p>
    Session ID:<%=session.getId()%><br>
    <hr>
<a href="session_page2.jsp" target="_blank">跳转到session_page2</a><br>
<%= page.toString()
%>
</p>

</body>
</html>
