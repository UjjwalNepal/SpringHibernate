/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ujjwal.springhibernate.config;

import com.ujjwal.springhibernate.entity.Category;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 *
 * @author Ujjwal
 */
@Configuration
public class SystemConfiguration {
    
    @Bean
    public Category category(){
        return new Category();
    }
}
