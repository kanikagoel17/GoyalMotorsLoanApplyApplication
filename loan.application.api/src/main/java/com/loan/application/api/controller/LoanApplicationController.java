package com.loan.application.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.loan.application.api.model.Address1;
import com.loan.application.api.model.CustomerInfo1;
import com.loan.application.api.model.GuaranterInfo1;
import com.loan.application.api.model.LoanApplication;
import com.loan.application.api.service.LoanApplicationService;

@Controller

public class LoanApplicationController {
	/*
	 * @GetMapping("/") public ModelAndView showHome() { ModelAndView modelAndView =
	 * new ModelAndView(); modelAndView.setViewName("index"); //
	 * resources/template/main.html return modelAndView; }
	 */
	@Autowired
	LoanApplicationService loanService;

	@GetMapping("/")
	public String showHome(Model model) {
		return "index";
	}

	@RequestMapping(value = "/apply", method = RequestMethod.GET)
	public ModelAndView register() {
		ModelAndView modelAndView = new ModelAndView();
		LoanApplication loanApplication = new LoanApplication();
		modelAndView.addObject("loanApplication", loanApplication);
		//modelAndView.addObject("customerInfo", new CustomerInfo());
		/*
		 * modelAndView.addObject("address", new Address());
		 * modelAndView.addObject("customerInfo", new CustomerInfo());
		 * modelAndView.addObject("guaranterInfo", new GuaranterInfo());
		 */// resources/template/register.html
		modelAndView.setViewName("loan_application");		
		return modelAndView;
	}

	@RequestMapping(path = "/apply", method = RequestMethod.POST)
	public ModelAndView applyLoan(@ModelAttribute LoanApplication loanApplication, Model model) {
		ModelAndView modelAndView = new ModelAndView();
		// public String applyForLoan(@RequestBody LoanApplication loanApplication) {
		loanService.applyLoan(loanApplication); // return loanApplication;
		// return "display_form";
		modelAndView.addObject("successMessage", "User is registered successfully!");
		modelAndView.addObject("loanApplication", new LoanApplication());
		modelAndView.setViewName("register");
		return modelAndView;

	}
	/*
	 * @GetMapping("/registration_form") public String showRegistrationForm(Model
	 * model) { Employee employee = new Employee(); model.addAttribute("employee",
	 * employee); return "registration_form"; }
	 * 
	 * @PostMapping("/save") public String saveEmployee(@ModelAttribute Employee
	 * employee, Model model) { model.addAttribute("employee", employee); return
	 * "display_form"; }
	 */

}
