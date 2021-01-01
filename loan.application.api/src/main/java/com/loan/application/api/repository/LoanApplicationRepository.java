package com.loan.application.api.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.loan.application.api.bean.LoanApplication;

@Repository
public interface LoanApplicationRepository extends CrudRepository<LoanApplication , Long> {
	
	LoanApplication findByAdharCardNo(String adharCardNo);

}
