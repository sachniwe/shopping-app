package se.shoppa.suw.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
	
	@GetMapping("/SomePage")
	public String home() {
		return "home";
	}

}
