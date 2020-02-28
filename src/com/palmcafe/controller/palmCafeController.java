package com.palmcafe.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class palmCafeController {
	
	@RequestMapping("/cafe")
	public String getOrder(Model model)
	{
		return "welcome-page";
	}
	
	@RequestMapping("/processOrder")
	public String orderProcess(HttpServletRequest request,Model model)
	{
		// handle the data received from the user
		String userData = request.getParameter("foodType");
		
		// adding captured data to the model
		model.addAttribute("userInput", userData);
		
		// set the user data with the model and send it to the view
		return "process-order";
	}
}
