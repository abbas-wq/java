<%-- 
    Document   : Welcome
    Created on : 08.08.2019, 15:27:50
    Author     : Abbas
--%>

<%@page import="java.awt.TextArea"%>
<%@page import="Entities.User"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
            <%
            User user=(User)request.getAttribute("Person");
            %>
            <h1 align="center"><%= user.getName()+" Xow Gelmisen"%></h1>
            
            
            
            <% 
            if(user.getGender().equals("man")){
                %>
                
                
                <textarea id="myTextarea"></textarea>

                <button type="button" onclick="myFunction()">Try it</button>

                <textarea id="demo"></textarea>

                <script>
                  
                   
             //   function myFunction() {
             //   var x = document.getElementById("myTextarea").toLowerCase;
             //   document.getElementById("demo").innerHTML = x;
             //   }
                </script>

                <% } 
            else{
                %>

                <textarea id="myTextarea" data-register="Lower"><% "342 Alvin Road Ducksburg".toLowerCase(); %></textarea>

<%
}%>
             
 





    </body>
    
</html>
