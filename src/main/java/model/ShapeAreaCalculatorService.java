/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author kevinjerke
 */
public class ShapeAreaCalculatorService {
    
    public String calculateAreaOfRectangle(String width, String height) {
        double rectangleHeight = Double.parseDouble(height);
        double rectangleWidth = Double.parseDouble(width);
        double area = rectangleWidth * rectangleHeight;
        
        return ""+area;
    }
    
    public String calculateAreaOfCircle(String radius) {
        double pi = Math.PI;
        double rad = Double.parseDouble(radius);
        double area = pi * Math.pow(rad, 2);
     
        return ""+area;
    }
    
    public String getHypotenuseOfTriangle(String width, String height) {
        double w = Double.parseDouble(width);
        double h = Double.parseDouble(height);
        double hyp = Math.pow(w,2) + Math.pow(h, 2);
        hyp = Math.sqrt(hyp);
        
        return ""+hyp;
    }
}
