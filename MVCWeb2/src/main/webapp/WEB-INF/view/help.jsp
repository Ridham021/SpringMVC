<%--
  Created by IntelliJ IDEA.
  User: riken
  Date: 28-02-2023
  Time: 22:21
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page isELIgnored="false" %>
<html>
<head>
    <title>Model And View</title>
</head>
<body>
<%
    String name =(String) request.getAttribute("name");
    Integer id = (Integer) request.getAttribute("id");

%>

<%= name%>
<br>
<%= id%>

<br><br>
${name}
${id}


</body>
</html>
