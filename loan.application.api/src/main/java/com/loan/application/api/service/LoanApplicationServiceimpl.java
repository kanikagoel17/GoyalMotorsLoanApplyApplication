package com.loan.application.api.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.loan.application.api.model.LoanApplication;
import com.loan.application.api.repository.LoanApplicationRepository;

@Service
public class LoanApplicationServiceimpl implements LoanApplicationService {

	@Autowired
	LoanApplicationRepository loanRepository;

	@Override
	public String applyLoan(LoanApplication loanApplication) {

		// Lookup user in database by adharcard
		LoanApplication loanApplicationExist = loanRepository.findByAdharCardNo(loanApplication.getAdharCardNo());

		if (loanApplicationExist != null) {
			return "There is already a customer registered with the adharcard provided.";
			/*
			 * modelAndView.addObject("alreadyRegisteredMessage",
			 * "Oops!  There is already a user registered with the email provided.");
			 * modelAndView.setViewName("register"); bindingResult.reject("email");
			 */
		}

		/*
		 * if (bindingResult.hasErrors()) { modelAndView.setViewName("register"); }
		 */ else { // new user so we create user and send confirmation e-mail

			// Disable user until they click on confirmation link in email
			// user.setEnabled(false);

			// Generate random 36-character string token for confirmation link
			// user.setConfirmationToken(UUID.randomUUID().toString());

			loanRepository.save(loanApplication);

			/*
			 * String appUrl = request.getScheme() + "://" + request.getServerName();
			 * 
			 * SimpleMailMessage registrationEmail = new SimpleMailMessage();
			 * registrationEmail.setTo(user.getEmail());
			 * registrationEmail.setSubject("Registration Confirmation"); registrationEmail.
			 * setText("To confirm your e-mail address, please click the link below:\n" +
			 * appUrl + "/confirm?token=" + user.getConfirmationToken());
			 * registrationEmail.setFrom("noreply@domain.com");
			 * 
			 * emailService.sendEmail(registrationEmail);
			 * 
			 * modelAndView.addObject("confirmationMessage",
			 * "A confirmation e-mail has been sent to " + user.getEmail());
			 * modelAndView.setViewName("register");
			 */
		}

		return "Loan Applied for Customer " + loanApplication.getFirstName() + "with loanId"
				+ loanApplication.getLoan_id() + "successfully.";
	}

}
