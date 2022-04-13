<%@ page import="com.example.ExamJavaServlet.entity.tbUser" %>
<%@ page import="com.example.fstore_practical.entity.tbUser" %>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%
    tbUser user = (tbUser)session.getAttribute("currentUser");
    boolean isLoggedIn = false;
    if (user != null){
        isLoggedIn = true;
    }
    String currentUsername = user == null ? "Guest" : user.getUsername();
%>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>
</head>
<body>
<h1><%= "Hello World!" %>
</h1>
<br/>
<a href="hello-servlet">Hello Servlet</a>
<%
    if (isLoggedIn){
%>
<strong>
    This is me : <%=currentUsername%> <a href="/user/logout">(logout)</a>
</strong>
<%}else {%>
<a href="/user/login"> Click here to login </a>
<%
    }
%>
</body>
</html>