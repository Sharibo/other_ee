package com.gmail.alexejkrawez.other_ee.servlet.get_resources;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "ResourcesGetter", urlPatterns = { "/ResourcesGetter" })
public class ResourcesGetter extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //* получаем объект типа ServletContext
        ServletContext sContext = getServletContext();

        //* получаем картинку и выводим пользователю
        try (InputStream is = sContext.getResourceAsStream("/img/my-hero-academia.png")) {
            OutputStream os = response.getOutputStream();
            if (is != null) {
                byte[] buf = new byte[2048];
                int bRead;

                while ((bRead = is.read(buf)) != -1) {
                    os.write(buf, 0, bRead);
                }
            }

        } catch (Exception e) {
            e.printStackTrace();
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
