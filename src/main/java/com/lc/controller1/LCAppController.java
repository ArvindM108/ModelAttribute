package com.lc.controller1;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.lc.api.UserDTO;

@Controller
public class LCAppController {
	
	@RequestMapping(value = "/reg", method = RequestMethod.GET)
	public String showRegPage(@ModelAttribute("userInfo" ) UserDTO dto) {
		dto.setName("Mayank");
		dto.setUserName("Mayank Agarwal");
		dto.setPassword("MA7829@qwert");
		
		return "registration-page";
	}
	
	@RequestMapping(value = "/reg-success-page", method = RequestMethod.GET)
	public String showRegSuccessPage(@ModelAttribute("userFilledData") UserDTO dto) {
		return "reg-success-page";
	}
	
}