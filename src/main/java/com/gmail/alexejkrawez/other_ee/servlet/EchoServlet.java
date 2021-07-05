package com.gmail.alexejkrawez.other_ee.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet(name = "EchoServlet", urlPatterns = {"/EchoServlet"})
public class EchoServlet extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");

        String queryString = request.getQueryString();
        System.out.println("queryString = " + queryString);


        try ( PrintWriter out = response.getWriter()) {
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet EchoServlet</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet EchoServlet at " + request.getContextPath() + "</h1>");
            //* Выводим полученные методом GET значения
            out.println("<div>" + queryString + "</div>");
            out.println("<div>" + createTable(request) + "</div>");


            out.println("</body>");
            out.println("</html>");
        }
    }

    //* Формируем HTML-таблицу
    private String createTable(HttpServletRequest request) {
        StringBuilder sb = new StringBuilder().append("<table border=1>");
        Enumeration<String> enumeration = request.getParameterNames();
        while ( enumeration.hasMoreElements()) {
            String name = enumeration.nextElement();
            String value = request.getParameter(name);
            sb.append("<tr><td>").append(name).append("</td><td>").append(value).append("</td></tr>");
            // то же самое:
            /* sb.append("<tr>"
                + "<td" + name + "</td>"
                + "<td" + value + "</td>"
                + " </tr>"); */
        }
        sb.append("</table>");

        return sb.toString();
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
