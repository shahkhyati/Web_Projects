<%-- 
    Document   : Forward.jsp
    Created on : Sep 29, 2017, 7:51:39 PM
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
        <%
            if ((request.getParameter("UserName").equals("Admin"))
            &&(request.getParameter("Password").equals("Admin"))){

            %>
            
            <jsp:forward page="Forward2.jsp"/>
            <%
                }

else{
%>
<%@include file="index.html" %>
<%}
%>
    </body>
</html>
