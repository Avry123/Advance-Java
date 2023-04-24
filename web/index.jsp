<%-- 
    Document   : index
    Created on : 17 Apr, 2023, 3:48:06 PM
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
            flex-direction: column;
            justify-content: center;
            align-items: center;
        }
        .form {
           width: 50%;
           height: 50%;
           display: flex;
           justify-content: center;
           gap: 1em;
           align-items: center;
        }
        
        form {
            width: 100%;
            height: 100%;
            display: flex;
            flex-direction: column;
            justify-content: center;
            align-items: center;
            gap: 1em;
        }
        
        
        .center {
            width: 30%;
            /*background: red;*/
            display: flex;
            align-items: center;
            justify-content: space-between;
            text-align: center;
            gap: 1em;
            
        }
        
        .inputField {
            width: 6.5em;
          
        }
        
        
    </style>
    <body>
        <%--<%@include file = "header.jsp" %>--%>
        <div class='form'>
            <form action="operation.jsp" method='post'>
                <div class="center">
                    <label for="principal">Principal</label>
                    <input class="inputField" type="text" name="principal" id="principal" />
                </div>
                <div class="center">
                    <label for="rate">Rate</label>
                    <input class="inputField" type="rate" name="rate" id="rate" />
                </div>
                <div class="center">
                    <label for="time">Years</label>
                    <input class="inputField" type="text" name="time" id="time" />
                </div>
                <div class="center">
                    <label for="no">No of Times</label>
                    <input class="inputField" type="text" name="no" id="no" />
                </div>
                <div class="center">
                    <label for="operation">Operation</label>
                    <select  name="operation" id="operation">
                        <option value="si">Simple Interest</option>
                        <option value="ci">Compound Interest</option>
                    </select>
                </div>
                <button type="submit">Submit</button>
                <button type="reset">Reset</button>
            </form> 
        </div>
        <%--<%@include file="footer.jsp" %>--%>
    </body>
</html>
