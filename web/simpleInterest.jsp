<%-- 
    Document   : simpleInterest
    Created on : 19 Apr, 2023, 10:58:39 AM
    Author     : Neel Chalke
--%>

<%@page import="javax.jms.Session"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <% 
        HttpSession session1 = request.getSession();
        String answer = (String) session1.getAttribute("simple interest");

        out.print(answer);
        
        
        %>
    </body>
</html>
