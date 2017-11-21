<%-- 
    Document   : welcome
    Created on : Nov 3, 2017, 7:40:44 PM
    Author     : Sith7
--%>
<%   
out.print("Welcome "+request.getParameter("uname"));  
  
String driver=config.getInitParameter("dname");  
out.print("driver name is="+driver);  
%>  