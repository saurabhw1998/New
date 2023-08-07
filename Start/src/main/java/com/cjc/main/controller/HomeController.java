package com.cjc.main.controller;

import org.springframework.web.bind.annotation.RequestMapping;

public class HomeController 
{
	@RequestMapping("*")
	public String preLogin()
	{
		return "Hello";
	}
}
