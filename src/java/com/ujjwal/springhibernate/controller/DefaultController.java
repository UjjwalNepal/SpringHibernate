/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ujjwal.springhibernate.controller;

import com.ujjwal.springhibernate.entity.Category;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 *
 * @author Ujjwal
 */
@Controller
@RequestMapping(value="/")
public class DefaultController { 
    
    @Autowired
    Category category;
    @RequestMapping(method=RequestMethod.GET)
    public String index(Model model){
        
        category.setName("Books");
        model.addAttribute("category", category);
        return"default";
    }
}
