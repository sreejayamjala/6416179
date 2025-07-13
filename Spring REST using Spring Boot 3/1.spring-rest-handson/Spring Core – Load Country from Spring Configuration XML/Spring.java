package com.cognizant.spring_learn;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import java.text.SimpleDateFormat;
import java.text.ParseException;
import java.util.Date;


@SpringBootApplication
public class Spring {

	public static void main(String[] args) {
		System.out.println("Application Started...");
		SpringApplication.run(SpringLearnApplication.class, args);
		 displayDate();
	}
	public static void displayDate() {
	    ApplicationContext context = new ClassPathXmlApplicationContext("date-format.xml");

	    SimpleDateFormat format = context.getBean("dateFormat", SimpleDateFormat.class);

	    try {
	        Date date = format.parse("31/12/2018");
	        System.out.println("Parsed Date: " + date);
	    } catch (ParseException e) {
	        e.printStackTrace();
	    }
	}


}
