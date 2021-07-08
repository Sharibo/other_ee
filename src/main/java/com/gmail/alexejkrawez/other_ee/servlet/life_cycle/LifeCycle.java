package com.gmail.alexejkrawez.other_ee.servlet.life_cycle;

import java.io.IOException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet(name = "LifeCycle", urlPatterns = {"/LifeCycle"})
public class LifeCycle extends HttpServlet {

    //* init()      - метод инициализации сервлета (при регистрации в контейнере сервлетов)
    //* service()   - метод для обработки запросов клиента и формирования ответа
    //* destroy()   - метод вызывается при выгрузке сервлета (к примеру shutdown сервера)

    @Override
    public void init(ServletConfig config) throws ServletException {
        super.init(config);

        System.out.println("LifeCycle.init()");
    };

    @Override
    public void destroy() {
        System.out.println("LifeCycle.destroy()");
    }



    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {    
        
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
