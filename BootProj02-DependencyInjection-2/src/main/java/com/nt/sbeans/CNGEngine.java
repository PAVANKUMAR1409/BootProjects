package com.nt.sbeans;

import org.springframework.stereotype.Component;

@Component("cEngine")
public final class CNGEngine implements IEngine
{

	public CNGEngine(){
		System.out.println("CNGEngine.CNGEngine()");
	}
	@Override
	public void Start() {
		System.out.println("CNGEngine.Start()");
		
	}

	@Override
	public void stop() {
		System.out.println("CNGEngine.stop()");
		
	}

}
