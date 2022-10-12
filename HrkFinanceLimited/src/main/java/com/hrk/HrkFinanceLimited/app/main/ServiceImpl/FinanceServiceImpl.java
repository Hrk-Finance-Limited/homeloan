package com.hrk.HrkFinanceLimited.app.main.ServiceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hrk.HrkFinanceLimited.app.main.Service.FinanceService;
import com.hrk.HrkFinanceLimited.app.main.financeRepository.EnquiryDetailsRepository;
import com.hrk.HrkFinanceLimited.app.main.model.EnquiryDetails;

@Service
public class FinanceServiceImpl implements FinanceService {
	
	@Autowired
	EnquiryDetailsRepository edr;

	@Override
	public EnquiryDetails SaveEnquiry(EnquiryDetails ed) {
		return edr.save(ed);
		
	}

	@Override
	public EnquiryDetails getEnquiry(Integer cId) {
	Optional<EnquiryDetails> ed=	edr.findById(cId);
	if(ed.isPresent())
	{
		EnquiryDetails ae=ed.get();
		return ae;
	}
	
		return null;
	

	
	
	}

	@Override
	public List<EnquiryDetails> getAllEnquiry() {
	
		return edr.findAll();
		
		
	
	}

	@Override
	public void deleteEnquiry(Integer cId) {
		edr.deleteById(cId);
		
	}

}
