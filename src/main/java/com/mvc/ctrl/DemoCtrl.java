package com.mvc.ctrl;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller

public class DemoCtrl {
	
	@GetMapping("/hello")
	public String homePage() {
		return "index.jsp";
		
	}

}
