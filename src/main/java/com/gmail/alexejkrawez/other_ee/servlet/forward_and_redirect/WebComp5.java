package com.gmail.alexejkrawez.other_ee.servlet.forward_and_redirect;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet(name = "WebComp5", urlPatterns = {"/WebComp5"})
public class WebComp5 extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //* получаем параметры запроса
        String paramValue = request.getParameter("param1");
        System.out.println("WebComp4.paramValue = " + paramValue);

        //* redirect запроса jsp-страницу (относительно корня сайта)
        response.sendRedirect("/other_ee/jsp_form.jsp");
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
