package com.example.demo;

import com.example.demo.model.Library;
import com.example.demo.config.LibraryConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class DemoApplication {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(LibraryConfig.class);

        Library library = context.getBean(Library.class);

        System.out.println(library);
    }
}
