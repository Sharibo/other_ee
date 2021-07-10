package com.gmail.alexejkrawez.other_ee.servlet.listener;

import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

@WebListener
public class Listener implements ServletContextListener {
    

    public Listener() {}


    @Override
    public void contextInitialized(javax.servlet.ServletContextEvent sce) {
        //* действия по инициализации веб-приложения
        System.out.println("Listener.contextInitialized()");
    };

    @Override
    public void contextDestroyed(javax.servlet.ServletContextEvent sce) {
        //* действия по освобождению ресурсов, закрытию соединений, завершения работы
        System.out.println("Listener.contextDestroyed()");
    };
}
