<%--
  User: Sangsng
  Date: 2017/7/20
  Time: 13:20
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8}">
    <title>登录</title>
</head>
<body>
<%
    String username = "";
    String password = "";
    username = request.getParameter("username");
    password = request.getParameter("password");
    if ("admin".equals(username) && "admin".equals(password)) {
        session.setAttribute("loginUser", username);
        session.setAttribute("loginPassword", password);

        request.getRequestDispatcher("login_success.jsp").forward(request, response);
    } else {
        response.sendRedirect("login_failure.jsp");
    }
%>
</body>
</html>
