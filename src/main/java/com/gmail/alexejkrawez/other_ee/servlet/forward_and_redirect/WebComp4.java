package com.gmail.alexejkrawez.other_ee.servlet.forward_and_redirect;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet(name = "WebComp4", urlPatterns = {"/WebComp4"})
public class WebComp4 extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //* получаем параметры запроса
        String paramValue = request.getParameter("param1");
        System.out.println("WebComp4.paramValue = " + paramValue);

        //* redirect запроса на другой сайт
        response.sendRedirect("https://yandex.by/images/?utm_source=main_stripe_big");
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
