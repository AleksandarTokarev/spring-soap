package com.aleksandartokarev.soapdemo;

import com.aleksandartokarev.soapdemo.configuration.SoapConnector;
import com.aleksandartokarev.soapdemo.soapclient.generated.CelsiusToFahrenheit;
import com.aleksandartokarev.soapdemo.soapclient.generated.CelsiusToFahrenheitResponse;
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
			String value = "10";//Default Name
			if (args.length > 0) {
				value = args[0];
			}
			CelsiusToFahrenheit request = new CelsiusToFahrenheit();
			request.setCelsius(value);
			CelsiusToFahrenheitResponse response = (CelsiusToFahrenheitResponse) soapConnector.callWebService("https://www.w3schools.com/xml/CelsiusToFahrenheit",request);
			System.out.println("Got Response As below ========= : ");
			System.out.println("FahrenheitResult : " + response.getCelsiusToFahrenheitResult().toString());
		};
	}

}
