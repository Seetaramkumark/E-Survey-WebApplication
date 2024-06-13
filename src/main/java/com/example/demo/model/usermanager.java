package com.example.demo.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.UserLogin;
import com.example.demo.repository.UserRepository;

@Service
public class usermanager {
	
	@Autowired
	UserRepository ur;
	
	public String register(UserLogin ul) {
		
		try {
			ur.save(ul);
			return null;
		}
		catch (Exception e) {
			return e.getMessage();
			// TODO: handle exception
		}
	}
//	public String Login(Long ph,String p) {
//		String p1 = ur.Login(ph, p);
//		if(p1!=null)
//			return "Login";
//		else
//			return null;
//		
//	}

}
