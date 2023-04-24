<%-- 
    Document   : divideException1
    Created on : 24 Apr, 2023, 2:20:53 PM
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
        }
        
        form {
            width: 100%;
            height: 100%;
            display: flex;
            flex-direction: column;
            justify-content: center;
            align-items: center;
            
            background: whitesmoke;
        }
        
        
        
        .label_1, .label_2 {
           width: 50%;
           height: 25%;
           display: flex;
           flex-direction: column;
           justify-content: center;
           align-items: center;
           background: red;
        }
        
        .submit {
            border:0px;
            background: black;
            font-size: 1.2em;
            font-weight: bold;
            margin-top: 1em;
            border-radius: 10px;
            color: white;
        }
        
        input[type="text"] {
            border:0px;
        }
        
     </style>
    <body>
        <div>
            <form action="divideAnswer.jsp">
                <div class="label_1">
                    <label>No: 1</label>
                    <input type="text" name="no1" />
                </div>
                <div class="label_2">
                    <label>No: 2</label>
                    <input type="text" name="no2" />
                </div>
                <button class="submit">Submit</button>
            </form>
        </div>
    </body>
</html>
