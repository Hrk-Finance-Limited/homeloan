package com.hrk.HrkFinanceLimited.app.main.model;

import javax.annotation.Generated;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class EnquiryDetails {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer cId;
	private String firstName;
	private String lastName;
	private String age;
	private String email;
	private String mobileNo;
	private String pancardNo;
	private String cibilScore;

}
