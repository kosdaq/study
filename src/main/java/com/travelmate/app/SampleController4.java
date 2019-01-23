package com.travelmate.app;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.travelmate.domain.ProductVO;

@Controller
public class SampleController4 {

	@RequestMapping(value = "/doJSON", method = RequestMethod.GET)
	public @ResponseBody ProductVO doJSON() {
		
		ProductVO vo = new ProductVO("»ùÇÃ»óÇ°", 30000);
		
		return vo;
		
	}
	
}
