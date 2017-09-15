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
public class RectangleAreaCalculatorService {
    
    public String calculateArea(String width, String height) {
        double rectangleHeight = Double.parseDouble(height);
        double rectangleWidth = Double.parseDouble(width);
        double area = rectangleWidth * rectangleHeight;
        
        return ""+area;
    }
}
