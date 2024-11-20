package com.todo.rails.elite.solution.controller.auth;

import com.todo.rails.elite.solution.model.User;
import com.todo.rails.elite.solution.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/register")
public class AuthController {

	private final UserService userService;

	@Autowired
	public AuthController(UserService userService) {
		this.userService = userService;
	}

	@GetMapping
	public String register(Model model) {
		model.addAttribute("user", new User(
				"",
				"",
				"",
				"USER"
		));
		return "register";
	}

	@PostMapping
	public ModelAndView addUser(@ModelAttribute("user") User user, Model model) {
		try {
			userService.addUser(user);
			return new ModelAndView("redirect:/login");
		} catch (Exception exception) {
			return new ModelAndView("redirect:/register");
		}
	}
}
