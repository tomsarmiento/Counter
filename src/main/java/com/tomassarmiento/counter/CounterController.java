package com.tomassarmiento.counter;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CounterController {
	@RequestMapping("/")
	public String home(HttpSession session) {
		if(session.getAttribute("counter")==null) {
			int counter = 0;
			counter++;
			session.setAttribute("counter", counter);
		}
		else {
			int counter = (Integer) session.getAttribute("counter");
			counter++;
			session.setAttribute("counter", counter);
		}
		return "home.jsp";
	}
	
	@RequestMapping("/counter")
	public String counter(HttpSession session) {
		return "counter.jsp";
	}
	
	@RequestMapping("/reset")
	public String reset(HttpSession session) {
		session.setAttribute("counter", 0);
		return "home.jsp";
	}
}
