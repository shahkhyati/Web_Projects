<%-- 
    Document   : Forward2.jsp
    Created on : Sep 29, 2017, 7:51:59 PM
    Author     : Sith7
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Forward Action Test: Login Successful</title>
    </head>
    <body>
        <h1>Forward Action Test: Login Successful</h1>
        <p>Welcome, <%= request.getParameter("UserName") %></p>
    </body>
</html>
