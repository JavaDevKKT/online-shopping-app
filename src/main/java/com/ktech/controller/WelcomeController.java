package com.ktech.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.ktech.dto.UserSignInDTO;
import com.ktech.entity.User;

import jakarta.validation.Valid;

@Controller
public class WelcomeController {
	private Logger logger = LoggerFactory.getLogger(WelcomeController.class);

	@GetMapping("/")
	public String welcomePage() {
		return "index";
	}

	@GetMapping("/register")
	public String registerPage() {
		return "register";
	}

	@PostMapping("/saveUser")
	public String registerBtnHandle(@Valid @ModelAttribute User user, Model model, BindingResult bResult) {
		if (bResult.hasErrors()) {
			return "register";
		}
		return "redirect:/register";
	}

	@GetMapping("/login")
	public String loginPage() {
		return "login";
	}

	@PostMapping("/doLogin")
	public String loginBtnHandle(@Valid @ModelAttribute UserSignInDTO userSignInDTO, Model model,
			BindingResult bResult) {

		if (bResult.hasErrors()) {
			logger.info("Has_Error ");
			return "login";
		}
		logger.info("Success...! ");
		return "redirect:/dashboard";
	}

	@GetMapping("/dashboard")
	public String dashboardPage() {
		return "dashboard";
	}
}
