<%-- 
    Document   : indexJspPage
    Created on : 21 Apr, 2023, 1:37:49 AM
    Author     : Neel Chalke
--%>

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
            flex-direction: column;
            justify-content: center;
            align-items: center;
        }
        
        .center {
            min-width: 60vw;
            min-height: 70vh;
            display: flex;
            flex-direction: column;
            justify-content: space-between;
            align-items: center;
            background: yellow;
            gap: 1em;
            border-radius: 10px;
            padding: 2em;
        }
        
        h1 {
            font-size: 3em;
        }
        
        a {
            text-color: black;
            font-size: 1em;
            text-decoration: none;
        }
        
        .forIndex {
            display: flex;
            justify-content: center;
            align-items: center;
            width: 100%;
            height:10%;
        }
        
        a:hover {
            background: white;
            font-weight: bold;
            padding: 0.5em;
            border-radius: 10px;s
        }
    </style>
    <body>
        <div class='forIndex'><h1>This is the JSP Index page.</h1></div>
         <div class="center">
            <a href="index.jsp">Simple Interest and Compound Interest</a>
        </div>
    </body>
</html>
