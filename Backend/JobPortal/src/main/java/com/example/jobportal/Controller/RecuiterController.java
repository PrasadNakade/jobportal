package com.example.jobportal.Controller;

import java.security.SecureRandom;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.jobportal.Model.LoginResponse;
import com.example.jobportal.Model.Recuiter;
import com.example.jobportal.Model.User;
import com.example.jobportal.Repo.RecuiterRepo;
import com.example.jobportal.Repo.UserRepo;

@RestController
@CrossOrigin
public class RecuiterController {
	
	  @Autowired
	  RecuiterRepo recuiterRepo;
	
	  @Autowired
	    private JavaMailSender mailSender;
	  
	    private Random random = new SecureRandom();
	    
	    
	    @RequestMapping("getAllRecuiterData{id}")
	    public Recuiter getAllRecuiterData(@PathVariable int id)
	    {
	    	return recuiterRepo.findById(id).get();
	    }
	    
	    
	    @RequestMapping("updateRecuiterataToServer{id}")
	    public Recuiter updateRecuiterataToServer(@PathVariable int id, @RequestBody Recuiter obj)
	    {
	    	Recuiter recuiter=recuiterRepo.findById(id).get();
	    	recuiter.setCompanyName(obj.getCompanyName());
	    	recuiter.setAddress(obj.getAddress());
	    	recuiter.setNumberOfEmployees(obj.getNumberOfEmployees());
	    	recuiter.setCompanyContactDetails(obj.getCompanyContactDetails());
	    	
	    	return recuiterRepo.save(recuiter);
	    	
	    }
	    

	    @RequestMapping("recuiterLogin")
	    public LoginResponse login(@RequestBody String[] arr) 
	    {
	        String username = arr[0];   // email or mobile number
	        String password = arr[1];

	        if (isValidMobile(username)) 
	        {
	            long mobile = Long.parseLong(username);
	            Recuiter student = recuiterRepo.findByMobile(mobile);  //1
	            if (student != null) 
	            {    //mobile asn th jhail
	                if (student.getPassword().equals(password)) 
	                {	
	                    return new LoginResponse(1,student.getId(),student.getName()); // login successful
	                } else {
	                    return new LoginResponse (-3,null,null); // Invalid password
	                }
	            } 
	            else {
	                return new LoginResponse(-2,null,null); // Mobile number does not exist
	            }
	         }else if (isValidEmail(username)) {
	            Recuiter student = recuiterRepo.findByEmail(username);
	            if (student != null) 
	            {
	                if (student.getPassword().equals(password)) {
	                    return new LoginResponse(1,student.getId(),student.getName()); // login successful
	                } else {
	                    return new LoginResponse (-3,null,null); // Invalid password
	                }
	            } else {
	                return new LoginResponse(-2,null,null); // Email does not exist
	            }
	        } 
	        else {
	            return new LoginResponse(-1,null,null); // Invalid username format
	        }
	    }

	    private boolean isValidMobile(String username) {
	        if (username.length() == 10) 
	        {
	            for (char c : username.toCharArray()) 
	            {
	                if (c < '0' || c > '9') 
	                {
	                    return false; // mobile number is not valid
	                }
	            }
	            return true; // correct mobile number
	        }
	        return false; // invalid mobile number length
	    }

	     private boolean isValidEmail(String username) {
	        // Basic email validation (without using regex)
	        if (username.contains("@") && username.contains(".")) {
	            int atIndex = username.indexOf('@');
	            int dotIndex = username.lastIndexOf('.');
	            return atIndex > 0 && dotIndex > atIndex;
	        }
	        return false; // invalid email format
	     }

	
    
	  
	@RequestMapping("recReg")
	public int student(@RequestBody Recuiter obj)
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
	        recuiterRepo.save(obj);
	        
		
		 SimpleMailMessage message = new SimpleMailMessage();
	        message.setTo(obj.getEmail());
	        message.setSubject("Registration Successful");
	        message.setText("Hello " + obj.getName() + ",\n\nYou have successfully registered! " + " Your password is "+password);

	        mailSender.send(message);
		
		return 10;
	}
	

}
