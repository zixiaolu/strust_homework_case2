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
    <title>��¼����</title>
</head>
<body>
<%
    out.print("��¼ʧ�ܣ�������");
    String M =session.getAttribute("times").toString();
    out.print(M);
    out.print("�λ��᳢�Ե�¼");
%>
</body>
</html>
