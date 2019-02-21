package com.llj.cloud;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;


@SpringBootApplication
public class Application extends SpringBootServletInitializer {
//    @Override
//    protected SpringApplicationBuilder configure(SpringApplicationBuilder application)
//    {
//        return application.sources(Application.class);
//    }

    public static void main(String[] args)
    {
        new SpringApplicationBuilder(Application.class).web(true).run(args);
    }

//    @Override
//    public void onStartup(ServletContext servletContext) throws ServletException {}
}


