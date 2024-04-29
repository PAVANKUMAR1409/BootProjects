package com.nt.runners;

import java.util.Arrays;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class BTestRunnerCmd implements CommandLineRunner{

	@Override
	public void run(String... args) throws Exception {
		System.out.println("CmdRunner to Test===>"+Arrays.toString(args));
		
	}

}
