package com.hrk.HrkFinanceLimited.app.main.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.hrk.HrkFinanceLimited.app.main.Service.FinanceService;
import com.hrk.HrkFinanceLimited.app.main.model.EnquiryDetails;

@RestController
public class FinanceController {
	
	@Autowired
	FinanceService fs;

	@PostMapping("/saveEnquiry")
	public ResponseEntity<EnquiryDetails> SaveEnquiry(@RequestBody EnquiryDetails ed){
		
	EnquiryDetails  enquiryDetails	=fs.SaveEnquiry(ed);
	return new ResponseEntity<EnquiryDetails>(enquiryDetails,HttpStatus.CREATED);
		
		
	}
	
	@GetMapping("/getEnquiry/{cId}")
	public ResponseEntity<EnquiryDetails> getEnquiry(@PathVariable Integer cId){
		
		EnquiryDetails enquiryDetails=fs.getEnquiry(cId);
		
		return new ResponseEntity<EnquiryDetails>(enquiryDetails,HttpStatus.OK);
		
		
	}
	
	@GetMapping("/getAllEnquiry")
	public ResponseEntity<List<EnquiryDetails>> getAllEnquiry(){
		
		List<EnquiryDetails> enquirylist= fs.getAllEnquiry();
		
		if(enquirylist.isEmpty()) {
		
		return new ResponseEntity<List<EnquiryDetails>>(HttpStatus.NO_CONTENT);
		
		}else {
			
			return new ResponseEntity<List<EnquiryDetails>>(enquirylist,HttpStatus.OK);
			
		}
		}
	
	
	@DeleteMapping("/delete/{cId}")
	public ResponseEntity<EnquiryDetails> deleteEnquiry(@PathVariable Integer cId){
		
		fs.deleteEnquiry(cId);
		return new ResponseEntity<EnquiryDetails>(HttpStatus.NO_CONTENT);
		
		
	}

	
}
