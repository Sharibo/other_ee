package com.gmail.alexejkrawez.other_ee.servlet.forward_and_redirect;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet(name = "FormProcessor", urlPatterns = {"/FormProcessor"})
public class FormProcessor extends HttpServlet {

    //* переопределяем метод init()
    @Override
    public void init(ServletConfig config) throws ServletException {
        super.init(config);

        System.out.println("FormProcessor.init()");
    };


    protected void processRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
                
        //* получаем:
        //* firstname
        //* lastname
        //* country
        //* subject
        request.setCharacterEncoding("UTF8");
        
        String firstname = request.getParameter("firstname");
        String lastname = request.getParameter("lastname");
        String country = request.getParameter("country");
        String subject = request.getParameter("subject");
        
        System.out.println("processForm.request firstname: " + firstname);
        System.out.println("processForm.request lastname: " + lastname);
        System.out.println("processForm.request country: " + country);
        System.out.println("processForm.request subject: " + subject);
        
        //* устанавливается атрибут методом setAttribute()
        request.setAttribute("firstAtribute", firstname);

        //* forward запроса на другую страницу
        RequestDispatcher reqDisp = request.getRequestDispatcher("/jsp_form.jsp");
        reqDisp.forward(request, response);
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
