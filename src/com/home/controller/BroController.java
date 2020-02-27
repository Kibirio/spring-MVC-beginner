package com.home.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class BroController {

	@RequestMapping("/ride")
	@ResponseBody
	public String rideBike()
	{
		return "my bike is avon type";
	}
	
	@RequestMapping("/train")
	@ResponseBody
	public String getTraining()
	{
		return "Training starts tomorrow";
	}
}
