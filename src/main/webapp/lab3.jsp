<%-- 
    Document   : lab3
    Created on : Sep 12, 2017, 8:32:28 PM
    Author     : kevinjerke
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Lab 3 </title>
    </head>
    <body>
        <h3>Lab 3</h3>
    <br>
    <h3>Find the Area of a Rectangle</h3>
    <img src= "http://www.onlineconversion.com/images/shape_area_rectangle.png" style="width:150px; height: 75px;">
    
     <form name="rectangleForm" id="rectangleForm" method="POST" action="lab3?calcMode=rectangle">
            Length: <input type="text" value="" name="rectangleLength">
            <br>
            Width: <input type="text" value="" name="rectangleWidth">
            <br>
            <input type="submit" name="submit" value="submit">
        </form>
        <p>Answer: ${rectArea}</p>
        <br>
        <h3>Find the area of a circle</h3>
        <img src="https://d2gne97vdumgn3.cloudfront.net/api/file/673UGzTEQEy6tsjX6qhv" style="width:150px;height: 75 px">
         <form name="circleForm" id="circleForm" method="POST" action="lab3?calcMode=circle">
            Radius: <input type="text" value="" name="radius">
            <br>
            <input type="submit" name="submit" value="submit">
        </form>
        <p>Answer: ${circArea}</p>
        <br>
        <h3>Find the hypotenuse of a triangle</h3>
        <img src="https://www.mathplanet.com/Oldsite/media/43183/triangle01.png" style="width:150px;height:75px">
         <form name="triangleForm" id="triangleForm" method="POST" action="lab3?calcMode=triangle">
            Side A: <input type="text" value="" name="triangleHeight">
            <br>
            Side B: <input type="text" value="" name="triangleWidth">
            <br>
            <input type="submit" name="submit" value="submit">
        </form>
        <p>Answer: ${hypotenuse}</p>
        <p>Click <a href="index.jsp">Here</a> to go back home.</p>

        
    </body>
</html>
