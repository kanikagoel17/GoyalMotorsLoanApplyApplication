package com.loan.application.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.loan.application.api.bean.LoanApplication;
import com.loan.application.api.service.LoanApplicationService;

@RestController
@RequestMapping(path = "/loan")
public class LoanApplicationController {
	
	@Autowired
	LoanApplicationService loanService;
	
	@RequestMapping(path="/apply", method = RequestMethod.GET)
	public LoanApplication applyForLoan(@RequestBody LoanApplication loanApplication) {
		loanService.applyLoan(loanApplication);
		return loanApplication;
		
	}

}
