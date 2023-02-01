package com.aleksandartokarev.soapdemo;

import com.aleksandartokarev.soapdemo.configuration.SoapConnector;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SoapdemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SoapdemoApplication.class, args);
	}

	@Bean
	CommandLineRunner lookup(SoapConnector soapConnector) {
		return args -> {
			//TODO code for calling

			soapConnector.callWebService("",new Object());
		};
	}

}
