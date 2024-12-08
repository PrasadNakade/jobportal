package com.example.jobportal.Controller;

import java.security.SecureRandom;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.MailSender;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.jobportal.Model.User;
import com.example.jobportal.Repo.UserRepo;

@RestController
@CrossOrigin
public class StuRegDataController {
	
	@Autowired
	UserRepo incomingsegisterstu;
	
	  @Autowired
	    private JavaMailSender mailSender;
	  
	    private Random random = new SecureRandom();
	  
	@RequestMapping("StudReg")
	public int student(@RequestBody User obj)
	{
		if(obj.getName().isBlank())
			return 1;   //fill the name
		if(obj.getEmail().isEmpty())
			return 2;    //fill the email
		if(obj.getMobile()<1111111111 || obj.getMobile()> 9999999999l)
			return 3;   //enter valid number
		
	
	   //password generation
	        int password = 1000 + random.nextInt(9000);
	        obj.setPassword(String.valueOf(password));
	        incomingsegisterstu.save(obj);
	        
		
		 SimpleMailMessage message = new SimpleMailMessage();
	        message.setTo(obj.getEmail());
	        message.setSubject("Registration Successful");
	        message.setText("Hello " + obj.getName() + ",\n\nYou have successfully registered!" + "Your password is "+password);

	        mailSender.send(message);
		
		return 10;
	}
	
}
