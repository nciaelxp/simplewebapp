package com.simple.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * SearchController
 */
@Controller
@RequestMapping("/search")
public class SearchController {
	
	@RequestMapping("/search")
	public ModelAndView getView() {
		ModelAndView model = new ModelAndView("simple1");
		model.addObject("message", "do search");
		return model;
	}
}