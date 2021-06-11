package com.example.springbootdockerApp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

// @RestController
@Controller
@RequestMapping("/list")
public class ListController {

    @RequestMapping(method=RequestMethod.GET)
    public String list() {
        return "list";
    }
}