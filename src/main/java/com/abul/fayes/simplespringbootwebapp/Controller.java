package com.abul.fayes.simplespringbootwebapp;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/")
public class Controller {

	@RequestMapping(method = RequestMethod.GET)
	public String index() {
		return "Hello World!";
	}
}
