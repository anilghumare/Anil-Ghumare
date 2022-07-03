package com.zensar.controllers;

import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class MyController {

	@RequestMapping(value = "/about", method = RequestMethod.GET)
	public String about(Model model) {
		System.out.println("Inside about handler");
//putting data in model
		model.addAttribute("name", "Anil Ghumare");

		model.addAttribute("currentDate", new Date());
		return "about";
	}

}
