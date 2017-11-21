<%-- 
    Document   : Program.jsp
    Created on : Sep 28, 2017, 7:40:17 PM
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
        
         <h1>Result</h1>
         
        <%
            int big , small;
           int a= Integer.parseInt(request.getParameter("Number 1"));
        int b= Integer.parseInt(request.getParameter("Number 2"));
        int c= Integer.parseInt(request.getParameter("Number 3"));
            if ((a>b) && (a>c))
            {    big=a;
                if(b<c){small=b;}
                else{small=c;}
            }
           else if (b>c)
           {
               big=b;
               if(a<c){small=a;}
                else{small=c;}
           }
           else
           {
               big=c;
               if(b<a){small=b;}
                else{small=a;}
           }
        
        %>
        
        <h2>Greatest Number =   <%= big  %>   </h2>
        <h2>Smallest Number =   <%= small %>   </h2>
       
    </body>
</html>
