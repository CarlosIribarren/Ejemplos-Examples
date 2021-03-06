package oiasso.system.examples.security.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LoginController {

	  // Login form
	  @GetMapping("/login")
	  public String login() {
	    return "login.html";
	  }

	  // Login form with error
	  @GetMapping("/login-error")
	  public String loginError(Model model) {
	    model.addAttribute("loginError", true);
	    return "login.html";
	  }
	
}
