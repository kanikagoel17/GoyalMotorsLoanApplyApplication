package com.loan.application.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.loan.application.api.model.LoanApplication;

@Repository
public interface LoanApplicationRepository extends JpaRepository<LoanApplication , Long> {
	
	LoanApplication findByAdharCardNo(String adharCardNo);

}
