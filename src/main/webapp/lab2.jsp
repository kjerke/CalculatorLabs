<%-- 
    Document   : lab2
    Created on : Sep 12, 2017, 8:32:24 PM
    Author     : kevinjerke
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Lab 2: Calculate Area of Rectangle with results displayed on the same page</h1>
        
        <img src="http://www.onlineconversion.com/images/shape_area_rectangle.png" style="width:150px; height:75px;">
        
        
          <form name="rectangleForm" id="rectangleForm" method="POST" action="lab2">
                Length: <input type="text" value="" name="rectangleLength">
                <br>
                Width: <input type="text" value="" name="rectangleWidth">
                <br>
                <input type="submit" name="submit" value="submit">    
            </form>
        
        <h2>Area of Rectangle: ${rectArea} </h2>
             
    </body>
</html>
