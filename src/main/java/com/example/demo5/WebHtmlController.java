package com.example.demo5;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class WebHtmlController {
	@GetMapping("simple")
	public ModelAndView simple() {
		return new ModelAndView("simple.html");
	}
}
