package com.nt.sbeans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("vechile")
public class Vechile 
{
	@Autowired
	@Qualifier("dEngine")
	public IEngine engine;
	
	public void journey(String start,String stop) {
		System.out.println("Vechile.journey()");
		engine.Start();
		System.out.println("Journey Started at :"+start);
		System.out.println("Journey is going on");
		engine.stop();
		System.out.println("Journey Ended at "+stop);
	}
	
}
