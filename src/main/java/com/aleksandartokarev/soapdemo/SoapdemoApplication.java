package com.aleksandartokarev.soapdemo;

import com.aleksandartokarev.soapdemo.configuration.SoapConnector;
import com.aleksandartokarev.soapdemo.soapclient.generated.*;
import org.apache.juli.logging.Log;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.io.ObjectOutput;

@SpringBootApplication
public class SoapdemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SoapdemoApplication.class, args);
	}

	@Bean
	CommandLineRunner lookup(SoapConnector soapConnector) {
		return args -> {
			//TODO code for calling

			try {
				Login login = new Login();
				login.setUser("user");
				login.setPassword("password");
				LoginResponse response = (LoginResponse) soapConnector.callWebService("", login);
				System.out.println(response);
				GetTransactionsExt getTransactionsExt = new GetTransactionsExt();
				getTransactionsExt.setClientId(response.getResult());
				getTransactionsExt.setBegDate("2022-07-23T23:30:59-04:00");
				getTransactionsExt.setEndDate("2023-01-23T23:30:59-04:00");

				GetTransactionsExtResponse getTransactionsExtResponse = (GetTransactionsExtResponse)
						soapConnector.callWebService("", getTransactionsExt);
				System.out.println(getTransactionsExtResponse);

				GetMoneyCodesV2 getMoneyCodesV2 = new GetMoneyCodesV2();
				getMoneyCodesV2.setClientId(response.getResult());
				getMoneyCodesV2.setBegDate("2022-07-23T23:30:59-04:00");
				getMoneyCodesV2.setEndDate("2023-01-23T23:30:59-04:00");
				GetMoneyCodesV2Response getMoneyCodesV2Response = (GetMoneyCodesV2Response)
						soapConnector.callWebService("", getMoneyCodesV2);
				System.out.println(getMoneyCodesV2Response.getResult());

				Logout logout = new Logout();
				logout.setClientId(response.getResult());
				LogoutResponse logoutResponse = (LogoutResponse) soapConnector.callWebService("", logout);
				System.out.println("DONE");
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		};
	}

}
