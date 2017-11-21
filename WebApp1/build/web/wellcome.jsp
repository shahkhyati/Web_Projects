<%-- 
    Document   : wellcome.jsp
    Created on : Sep 28, 2017, 7:17:54 PM
    Author     : Sith7
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Calculation of a=10 , b= 20</h1>
        <%
        int a=10 , b=20 ;
        %>
        <h2>Addition =   <%=  a+b  %>   </h2>
         <h2>Subtraction = <%=  a-b  %> </h2>
          <h2>Multiplication =  <%=  a*b  %></h2>
           <h2>Division = <%=  a/b  %> </h2>
    </body>
</html>
