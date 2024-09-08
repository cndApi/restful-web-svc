package com.ssc.taa.webservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RestfulWebServicesApplication {

	public static void main(String[] args)
	{
		SpringApplication.run(RestfulWebServicesApplication.class, args);
		System.out.println("Hello new API from cndApi");
	}

}
