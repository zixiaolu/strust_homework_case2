<%--
  Created by IntelliJ IDEA.
  User: le
  Date: 2021/10/2
  Time: 21:13
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=GBK" language="java" %>
<html>
<head>
    <title>登录错误</title>
</head>
<body>
<%
    out.print("登录失败，您还有");
    String M =session.getAttribute("times").toString();
    out.print(M);
    out.print("次机会尝试登录");
%>
</body>
</html>
