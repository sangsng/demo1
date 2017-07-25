<%--
  User: Sangsng
  Date: 2017/7/20
  Time: 13:17
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8}">
    <title>登录</title>
</head>
<body>
<h1>登录</h1>
<hr>
<div id="box">
    <form name="loginForm" action="dologin.jsp?mypass=99999" method="post">
        <table>
            <tr>
                <td>用户名：</td>
                <td><input type="text" value="" name="username"/></td>
            </tr>
            <tr>
                <td>密码：</td>
                <td><input type="password" value="" name="password"/></td>
            </tr>
            <tr>
                <td colspan="2" align="center"><input type="submit" value="登录" /></td>
            </tr>
        </table>
    </form>
</div>
</body>
</html>
