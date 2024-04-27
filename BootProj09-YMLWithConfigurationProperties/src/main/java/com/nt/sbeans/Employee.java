package com.nt.sbeans;

import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import lombok.Data;

@Data
@Component("emp")
@ConfigurationProperties(prefix="org.nit")
public class Employee {
	//Simple properties
	private Integer eno;
	private String ename;
	
	//array type properties
	private String[] favColor;
	
	//collection type
	private List<String> nickNmae;
	private Set<Long> phoneNo;
	private Map<String,Object> idDetails;
	
	//HAS-A-PROPERTY
	private Company company;
	
}
