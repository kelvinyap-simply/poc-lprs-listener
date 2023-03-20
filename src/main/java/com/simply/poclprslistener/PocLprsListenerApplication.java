package com.simply.poclprslistener;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackageClasses = LprsController.class)
public class PocLprsListenerApplication {

	public static void main(String[] args) {
		SpringApplication.run(PocLprsListenerApplication.class, args);
	}

}
