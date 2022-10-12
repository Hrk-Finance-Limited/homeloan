package com.hrk.HrkFinanceLimited.app.main.Service;

import java.util.List;

import com.hrk.HrkFinanceLimited.app.main.model.EnquiryDetails;

public interface FinanceService {

	EnquiryDetails SaveEnquiry(EnquiryDetails ed);

	EnquiryDetails getEnquiry(Integer cId);

	List<EnquiryDetails> getAllEnquiry();

	void deleteEnquiry(Integer cId);

}
