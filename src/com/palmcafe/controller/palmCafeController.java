package com.palmcafe.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class palmCafeController {
	
	@RequestMapping("/cafe")
	public String getOrder(Model model)
	{
		String name = "Harrison";
		String title = "palmcafe";
		// sending data to view(jsp file)
		model.addAttribute("nameValue", name);
		model.addAttribute("webTitle", "harrison");
		return "welcome-page";
	}
}
