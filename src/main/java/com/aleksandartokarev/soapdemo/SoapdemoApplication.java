package com.aleksandartokarev.soapdemo;

import com.aleksandartokarev.soapdemo.configuration.SoapConnector;
import com.aleksandartokarev.soapdemo.soapclient.generated.Login;
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

			Login login = new Login();
			login.setUser("username");
			login.setPassword("pas");
			soapConnector.callWebService("CardManagementEP_login", login);
		};
	}

}
