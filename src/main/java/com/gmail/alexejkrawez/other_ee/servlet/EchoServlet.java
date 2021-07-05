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

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");

        String queryString = request.getQueryString();
        System.out.println("queryString = " + queryString);




        try ( PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
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
            /* sb.append("<tr>"
                + "<td" + name + "</td>"
                + "<td" + value + "</td>"
                + " </tr>"); */
        }
        sb.append("</table>");

        return sb.toString();
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
