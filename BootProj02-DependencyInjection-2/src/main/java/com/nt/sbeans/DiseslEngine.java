package com.nt.sbeans;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component("dEngine")
//@Lazy(true)
public final class DiseslEngine implements IEngine
{

	public DiseslEngine(){
		System.out.println("DiseslEngine.DiseslEngine()");
	}
	@Override
	public void Start() {
		System.out.println("DiseslEngine.Start()");
		
	}

	@Override
	public void stop() {
		System.out.println("DiseslEngine.stop()");
		
	}

}
