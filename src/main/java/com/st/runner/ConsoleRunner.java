package com.st.runner;

import org.springframework.boot.CommandLineRunner;
import org.springframework.core.Ordered;
import org.springframework.stereotype.Component;

@Component
public class ConsoleRunner implements CommandLineRunner,Ordered {

	@Override
	public void run(String... args) throws Exception {
		
		System.out.println("CONSOLE RUNNER");
	}

	@Override
	public int getOrder() {
		
		return 1;
	}

}
