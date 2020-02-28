package com.home.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("daughter")
public class DaughterController {

	@RequestMapping("/food")
//	@ResponseBody
	public String cookFood()
	{
		return "bro";
	}
}
