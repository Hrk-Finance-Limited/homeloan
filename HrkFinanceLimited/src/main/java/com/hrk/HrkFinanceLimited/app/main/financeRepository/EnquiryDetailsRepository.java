package com.hrk.HrkFinanceLimited.app.main.financeRepository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hrk.HrkFinanceLimited.app.main.model.EnquiryDetails;

@Repository
public interface EnquiryDetailsRepository extends JpaRepository<EnquiryDetails, Integer> {

}
