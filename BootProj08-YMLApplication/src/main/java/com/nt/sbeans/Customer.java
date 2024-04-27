package com.nt.sbeans;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

import lombok.Data;

@Component("cust")
@Data
@ConfigurationProperties(prefix="cust.info")
//@PropertySource("App.yml")
public class Customer 
{
	private Integer custNo;
	private String custName;
	private String custAddrs;
	private Double billAmt;
	private Long phoneNo;
}
