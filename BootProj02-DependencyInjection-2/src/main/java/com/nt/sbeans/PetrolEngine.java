package com.nt.sbeans;

import org.springframework.stereotype.Component;

@Component("pEngine")
public final class PetrolEngine implements IEngine
{

	public PetrolEngine(){
		System.out.println("PetrolEngine.PetrolEngine()");
	}
	@Override
	public void Start() {
		System.out.println("PetrolEngine.Start()");
		
	}

	@Override
	public void stop() {
		System.out.println("PetrolEngine.stop()");
		
	}

}
