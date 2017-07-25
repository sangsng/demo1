<%--
  Created by IntelliJ IDEA.
  User: HR
  Date: 2017/7/3
  Time: 9:32
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>
  </head>
  <body>
  <h1>bean</h1>
  <hr>
 <jsp:useBean id="myUser" class="demo.Users" scope="page"/>
  <%
      myUser.setUsername("admin");
      myUser.setPassword("123");
  %>
  name=<%=myUser.getUsername()%><br>
  password=<%=myUser.getPassword()%>
  </body>
</html>
