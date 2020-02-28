package com.palmcafe.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class palmCafeController {
	
	@RequestMapping("/cafe")
	public String getOrder()
	{
		return "welcome-page";
	}
}
