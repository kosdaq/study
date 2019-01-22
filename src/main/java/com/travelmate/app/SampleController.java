package com.travelmate.app;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SampleController {

	private static final Logger logger = LoggerFactory.getLogger(SampleController.class);
	
	@RequestMapping(value = "doA")
	public void doA() {
		logger.info("doA called....................");
	}

	@RequestMapping(value = "doB")
	public void doB() {
		logger.info("doB called....................");
	}
	
	@RequestMapping(value = "doC")
	public String doC(@ModelAttribute("msg") String msg) {
		logger.info("doC called....................");
		
		return "result";
	}
	
}
