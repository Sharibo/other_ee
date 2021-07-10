package com.gmail.alexejkrawez.other_ee.servlet.get_resources;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

import javax.annotation.Resource;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "ResourcesGetter2", urlPatterns = { "/ResourcesGetter2" })
public class ResourcesGetter2 extends HttpServlet {

    //* Использование ресурсов с помощью аннотации @Resource
    //* Сервер присваивает аннотированной переменной значение
    @Resource(lookup = "shopURL")
    private String myShopURL;

    protected void processRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("ResourcesGetter2.myShopURL" + myShopURL);
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
