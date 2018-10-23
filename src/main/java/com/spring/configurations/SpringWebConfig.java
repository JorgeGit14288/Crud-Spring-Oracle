/*
 * SpringWebConfig.java
 * 
 * Creada el 22-dic-2015, 14:52:30
 * 
 * Clase Java desarrollada por Alex para el blog Java Tutoriales (javatutoriales.com) el día 22-dic-2015
 * 
 * Para informacion sobre el uso de esta clase, asi como bugs, actualizaciones, o mejoras enviar un mail a
 * programadorjavablog@gmail.com
 */
package com.spring.configurations;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;


/**
 *
 * @author Alex
 * @version 1.0
 * @author-mail programadorjavablog@gmail.com
 * @creation-date 22-dic-2015
 */
@Configuration
@EnableWebMvc
@ComponentScan(basePackages = "com.controllers")
public class SpringWebConfig {

    @Bean
    public ViewResolver viewResolver() {
        InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();
        viewResolver.setPrefix("/WEB-INF/pages/");
        viewResolver.setSuffix(".jsp");
        return viewResolver;
    }
}