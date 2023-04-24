<%-- 
    Document   : divideAnswer
    Created on : 24 Apr, 2023, 3:03:09 PM
    Author     : Neel Chalke
--%>
<%@page errorPage="divideException2.jsp" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <style>
        body {
            width: 100vw;
            height: 100vh;
            display: flex;
            justify-content: center;
            align-items: center;
        }
        
        div {
            width: 50%;
            height: 50%;
            display: flex;
            justify-content: center;
            align-items: center;
            background: black;
        }
        
        h1 {
            font-size: 3em;
            color: white;
        }
        
    </style>
    <body>
        <%
        double answer;
        String no1;
        String no2;
        no1 = request.getParameter("no1");
        no2 = request.getParameter("no2");
        double no11 = Double.parseDouble(no1);
        double no21 = Double.parseDouble(no2);
        
        try {
            
        answer = no11 / no21;
        out.print("<div>");
        out.print("<h1>The answer is" + answer + " </h1>");
        }
        catch (Exception e) {response.sendRedirect("divideException2.jsp");}
        out.print("</div>");
        %>
    </body>
</html>
