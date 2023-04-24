<%-- 
    Document   : operation.jsp
    Created on : 19 Apr, 2023, 11:21:04 AM
    Author     : Neel Chalke
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page errorPage="exception.jsp" %>

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
        
        .center {
            width: 50%;
            height: 350px;
            background: whitesmoke;
            display: flex;
            justify-content: center;
            align-items: center;
            text-align: center;
        }
        
        
    </style>
    <body>
        <%--<%@include file="index.jsp" %>--%>
        <% 
        String principal = request.getParameter("principal");
        String rate = request.getParameter("rate");
        String time = request.getParameter("time");
        String operation = request.getParameter("operation");
        String noOfYears = request.getParameter("no");
        
        double si, ci;
        
        double principalInt = Double.parseDouble(principal);
        double rateInt = Double.parseDouble(rate)/100;
        double timeInt = Double.parseDouble(time);
        double noOfYearsInt = Double.parseDouble(noOfYears);
        double rateAndYears = rateInt/noOfYearsInt;
        
        String simpleInterestAnswer = "";
        String compoundInterestAnswer = "";
        
        
        
        if (operation.equals("si")) {
            si = principalInt * rateInt * timeInt;
            simpleInterestAnswer = ("<div class='center'><h1>The Simple interest on the amount is " + si + "</h1></div>");
//            session1.setAttribute("simpleInterest", simpleInterestAnswer);
            out.print(simpleInterestAnswer);
        } else {
         ci = principalInt * Math.pow((1 + rateAndYears),noOfYearsInt * timeInt);
            compoundInterestAnswer = ("<div class='center'><h1>The Compound interest on the amount is " + ci + "</h1></div>");
            out.print(compoundInterestAnswer);
        }
       
        
        
        
        
        %>
    </body>
</html>
