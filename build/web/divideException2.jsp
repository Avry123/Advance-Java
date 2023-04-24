<%-- 
    Document   : divideException2
    Created on : 24 Apr, 2023, 2:21:40 PM
    Author     : Neel Chalke
--%>
<%@page isErrorPage="true" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>The exception is <%= exception.getMessage() %></h1>
    </body>
</html>
