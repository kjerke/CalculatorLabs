/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.calculatorlabs.controller;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.RectangleAreaCalculatorService;
import model.ShapeAreaCalculatorService;

/**
 *
 * @author kevinjerke
 */
@WebServlet(name = "Lab3Controller", urlPatterns = {"/Lab3"})
public class Lab3Controller extends HttpServlet {

    
        private static final String CALC_MODE = "calcMode";
    private static final String TARGET_PAGE = "/lab3.jsp";
    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
      
      String calcMode  = request.getParameter(CALC_MODE);
        String answer = "";
        
        try {
            ShapeAreaCalculatorService scs = new ShapeAreaCalculatorService();
            if (calcMode.equals("rectangle")) {
                String length = request.getParameter("rectangleLength");
                String width = request.getParameter("rectangleWidth");
                answer = scs.calculateAreaOfRectangle(width, length);
                request.setAttribute("rectangleArea", answer);

            } else if (calcMode.equals("circle")) {
                String radius = request.getParameter("radius");
                answer = scs.calculateAreaOfCircle(radius);
                request.setAttribute("circleArea", answer);

            } else if (calcMode.equals("triangle")) {
                String height = request.getParameter("triangleHeight");
                String width = request.getParameter("triangleWidth");
                answer = scs.getHypotenuseOfTriangle(width, height);
                request.setAttribute("hypotenuse", answer);
            }

        } catch (Exception e) {
            request.setAttribute("errmsg", e.getMessage());
        }

        
       
        
        RequestDispatcher view = request.getRequestDispatcher(TARGET_PAGE);
        view.forward(request, response);
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
