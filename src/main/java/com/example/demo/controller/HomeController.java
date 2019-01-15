package com.example.demo.controller;

import java.util.logging.Logger;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * HomeController
 */
@RestController
public class HomeController {

    private Logger logger;
    
    public HomeController() {
        super();
        logger = Logger.getLogger(HomeController.class.getName());
    }
    @RequestMapping("/")
    public String Index() {
        logger.info("进入index方法");
        return "Hello World.";
    }
}