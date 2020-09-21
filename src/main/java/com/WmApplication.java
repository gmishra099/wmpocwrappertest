package com;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"com.careconcierge"})
public class WmApplication {

	public static void main(String[] args) {
		SpringApplication.run(WmApplication.class, args);
	}

}
