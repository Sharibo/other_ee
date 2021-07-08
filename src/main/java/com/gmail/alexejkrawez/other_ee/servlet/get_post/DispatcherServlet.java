package com.gmail.alexejkrawez.other_ee.servlet.get_post;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet(name = "DispatcherServlet", urlPatterns = {"/DispatcherServlet"})
public class DispatcherServlet extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        
        //* 1. получаем query string - request.getQueryString()
        //* ?param1=value1&param2=value2&param3=value3
        System.out.println("request.getQueryString() = " + request.getQueryString());
        
        //* 2. получаем все имена параметров - request.getParameterNames()
        //* Enumeration<String>
        Enumeration<String> enumeration = request.getParameterNames();
        while (enumeration.hasMoreElements()) {
            String parameterName = enumeration.nextElement();
            System.out.println("request.parameterName = " + parameterName);
        }

        //* 3. получаем значения параметров по их именам - request.getParameter("param1");
        String parameter = request.getParameter("param1");
        System.out.println("parameter value = " + parameter);

        response.setContentType("text/html;charset=UTF-8");
        try ( PrintWriter out = response.getWriter()) {

            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet DispatcherServlet</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet DispatcherServlet at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }

}
