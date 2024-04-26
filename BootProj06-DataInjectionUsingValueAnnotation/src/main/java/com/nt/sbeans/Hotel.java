package com.nt.sbeans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import lombok.Data;

@Component("hotel")
@Data
public class Hotel {
	@Value("12345")// direct vale injection
	private Integer hotelId;
	//Injecting from property file
	@Value("${hotel.name}") 
	private String hotelName;
	@Value("${hotel.addrs}")
	private String hotelAddrs;
	@Value("${hotel.phno}")
	private String mobileNo;
	
	@Value("${customer.name}")
	private String customerName;
	@Value("#{menup.idlyRate+menup.puriRate}")// SPEL for arithmetic operation 
	private float billAmt;
	
	@Value("${os.name}") //os.name is fixed system property key
	private String osName;
	@Value("${user.name}")//user.name is fixed system property key
	private String windowsUser;
	
	@Value("${Path}")// Path is fixed as ENvironment Variable name
	private String pathData;
}
