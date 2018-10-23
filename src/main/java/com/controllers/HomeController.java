/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;


/**
 *
 * @author Alex
 * @version 1.0
 * @author-mail programadorjavablog@gmail.com
 * @creation-date 21-dic-2015
 */
@Controller
public class HomeController {

    @RequestMapping("/")
    public ModelAndView Home() {
        return new ModelAndView("/Home/index");
    }
    @RequestMapping("Home/test.htm")
    public ModelAndView Test() {
        return new ModelAndView("test");
    }
}
