package com.general.verified.web.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import org.springframework.ui.Model;

@Controller
public class HelloWorldController {
	@RequestMapping("/hello")
	public String helloWorld(Model model) {
		String viewArgValue = "Hello World, SpringMVC";
		model.addAttribute("message", viewArgValue);
		return "/hello";
	}

	@RequestMapping("/test1")
	public String testOne(Model model) {
		ArrayList<String> al = new ArrayList<String>();
		Map<String, String> map = new HashMap<String, String>();
		for (int i = 0; i < 10; i++) {
			al.add(String.valueOf(i));
			map.put(String.valueOf(i), String.valueOf(i));
		}
		model.addAttribute("test1", al);
		return "/test1";
	}

	public ModelAndView testTwo() {
		ModelAndView m = new ModelAndView();
		ArrayList<String> al = new ArrayList<String>();
		for (int i = 0; i < 8; i++) {
			al.add(String.valueOf(i));
		}
		m.addObject("test2", al);
		m.setViewName("/test2");
		return m;
	}
}
