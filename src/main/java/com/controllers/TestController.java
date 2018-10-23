/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.controllers;


import com.dao.TestDao;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import com.interfaz.TestInterfaz;
import com.model.TestModel;
import java.util.List;

/**
 *
 * @author Alex
 * @version 1.0
 * @author-mail programadorjavablog@gmail.com
 * @creation-date 21-dic-2015
 */
@Controller
public class TestController {

    @RequestMapping("test")
    public ModelAndView Test() {
        TestDao dao = new TestDao();
        ModelAndView mav = new ModelAndView();
        List<TestModel> lista = dao.GetAll();
        mav.setViewName("/Test/index");
         mav.addObject("lista", lista);        
        return mav;
    }   
}
