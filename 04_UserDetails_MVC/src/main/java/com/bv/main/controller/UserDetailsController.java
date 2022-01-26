package com.bv.main.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.bv.main.model.UserDetails;

@Controller
public class UserDetailsController {

	@RequestMapping("/")
	public String showUserDetailsForm(Model model) {
		UserDetails userDetails = new UserDetails();
		model.addAttribute("userDetails", userDetails);
		return "userdetailsform";
	}

	@RequestMapping("/confirmdetails")
	public String confirmUserDetails(@ModelAttribute UserDetails userDetails) {
		return "showuserdetails";
	}
}
