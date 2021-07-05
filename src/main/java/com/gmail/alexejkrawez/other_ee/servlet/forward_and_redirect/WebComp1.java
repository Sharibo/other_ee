package com.gmail.alexejkrawez.other_ee.servlet.forward_and_redirect;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet(name = "WebComp1", urlPatterns = {"/WebComp1"})
public class WebComp1 extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //* получаем параметры запроса
        String paramValue = request.getParameter("param1");
        System.out.println("WebComp1.paramValue = " + paramValue);

        //* forward запроса на сервлет WebComp2
        RequestDispatcher reqDisp = request.getRequestDispatcher("/WebComp2");
        reqDisp.forward(request, response);
        
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
