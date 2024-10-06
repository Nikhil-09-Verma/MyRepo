package com.nv.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.nv.service.IFindSeasonService;

@Controller
public class SeasonController 
{
	@Autowired
	private IFindSeasonService ifss;
	

	@RequestMapping("/")
	public String showHome() 
	{
		return "welcome";
		
	}
	
	@RequestMapping("/season")
	public String showSeason(Map<String,Object> map) 
	{
		String msg= ifss.findSeasonName();
		map.put("resultMsg", msg);
		return "display";
	}
}
