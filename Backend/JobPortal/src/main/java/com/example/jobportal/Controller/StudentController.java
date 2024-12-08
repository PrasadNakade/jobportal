package com.example.jobportal.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.jobportal.Model.LoginResponse;
import com.example.jobportal.Model.StudentPersonalInfo;
import com.example.jobportal.Model.User;
import com.example.jobportal.Repo.UserRepo;

@RestController
@CrossOrigin
public class StudentController {

    @Autowired
    UserRepo userRepo;
    
    
    @RequestMapping("getPersonalExistingData{id}")
    public User getPersonalExistingData(@PathVariable int id)
    {
    	return userRepo.findById(id).orElse(null);
    }
    
    
    
    @RequestMapping("updateStudentDataToServer{id}")
    public User updateStudentDataToServer(@PathVariable int id,@RequestBody User obj)
    {
    	User user=userRepo.findById(id).get();  //tho user jhaychay madhe data add karaycha ahe (konta user)
    	user.setPer10(obj.getPer10());
    	user.setPer12(obj.getPer12());
    	user.setPerGrad(obj.getPerGrad());
    	 user.setYear10(obj.getYear10());
    	    user.setYear12(obj.getYear12());
    	    user.setYearGrad(obj.getYearGrad());
    	    user.setBirthDate(obj.getBirthDate());
    	    
    	    
    	    userRepo.save(user);
    	
    	
    	return user;
    	
    }
   
    
    
    
    
    @RequestMapping("login")
    public LoginResponse login(@RequestBody String[] arr) 
    {
        String username = arr[0];   // email or mobile number
        String password = arr[1];

        if (isValidMobile(username)) 
        {
            long mobile = Long.parseLong(username);
            User student = userRepo.findByMobile(mobile);  //1
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
            User student = userRepo.findByEmail(username);
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

}
