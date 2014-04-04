package com.simple.web.controller;

import java.util.HashMap;
import java.util.Map;
import java.util.logging.Logger;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.multiaction.MultiActionController;

/**
 * UserMultiActionController
 */
public class UserMultiActionController extends MultiActionController {

	private static final Logger sLogger = Logger.getLogger("SampleMultiActionController");
	
	private String viewName;

	public String getViewName() {
		return viewName;
	}

	public void setViewName(String viewName) {
		this.viewName = viewName;
	}

	public ModelAndView register(HttpServletRequest request, HttpServletResponse response) {
		sLogger.info("register method start.");
		Map<String,String> model = new HashMap<String,String>();
		model.put("message", "this is request with query string:["+request.getQueryString()+"]");
		sLogger.info("register method end.");
		return new ModelAndView(getViewName(), model);
	}

}