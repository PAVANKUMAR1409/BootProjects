package com.nt.runners;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class ATestRunnerApp implements ApplicationRunner 
{

	@Override
	public void run(ApplicationArguments args) throws Exception {
		System.out.println("Non-Option Arg Values==>"+args.getNonOptionArgs()); //101
		
		System.out.println("Option arg name and values==>");
		for(String name:args.getOptionNames()) {
			System.out.println(name+"===>"+args.getOptionValues(name));
		}
		
	}

}
