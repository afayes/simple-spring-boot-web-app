package com.abul.fayes.simplespringbootwebapp;

import java.util.Date;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/")
public class Controller {

    private final Date date = new Date();

    @RequestMapping(method = RequestMethod.GET)
    public String index() {
        return "Hello World! Application started at " + date;
    }
}
