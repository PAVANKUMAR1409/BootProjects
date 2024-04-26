package com.nt.sbeans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import lombok.Data;

@Component("menup")
@Data
public class MenuItemsRate
{	
	// INJECTING VALUES FORM PROPERTY FILES
	@Value("${menu.dosarate}")
	private float dosaRate;
	@Value("${menu.idlyrate}")
	private float idlyRate;
	@Value("${menu.wadarate}")
	private float wadaRate;
	@Value("${menu.purirate}")
	private float puriRate;
}
