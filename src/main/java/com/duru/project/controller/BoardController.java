package com.duru.project.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class BoardController {
	@GetMapping("/freeboard")
	public String freeboard() {
		return "board/free/freeboard";
	}
	
	@GetMapping("/usedboard")
	public String useddboard() {
		return "board/used/usedboard";
	}
	
	@GetMapping("/sns")
	public String sns() {
		return "board/sns/sns";
	}
	
	@GetMapping("/walking")
	public String walking() {
		return "board/walking/walking";
	}

}
