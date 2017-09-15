<%-- 
    Document   : index
    Created on : Sep 12, 2017, 8:13:30 PM
    Author     : kevinjerke
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Lab 1</title>
    </head>
    <body>
        <h1>Calculator Lab 1: Find Area of the Rectangle</h1>
        
            <img src="http://www.onlineconversion.com/images/shape_area_rectangle.png" style="width:150px; height:75px;">
            
            <form name="rectangleForm" id="rectangleForm" method="POST" action="lab1">
                Length: <input type="text" value="" name="rectangleLength">
                <br>
                Width: <input type="text" value="" name="rectangleWidth">
                <br>
                <input type="submit" name="submit" value="submit">    
            </form>
               
    </body>  
</html>
