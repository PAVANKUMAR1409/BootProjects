package com.nt.sbeans;

import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

import lombok.Data;

@ConfigurationProperties(prefix="org.nit")
@Data
@Component
@PropertySource("App.properties")
public class Company 
{
	private String name;
	private String addrs;
	private long pincode;
	private long contact;
	
	@Value("${nit.size}")
	private int size;
	
	private String[] branches;
	private List<String> owners;
	private Set<Long> phones;
	
	private Map<String, Object> idDetails;  // MAP injection 
	private License lDetails; //HAS-A-PROPERTY injection
	
 }
