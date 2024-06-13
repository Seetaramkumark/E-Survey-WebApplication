package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.UserLogin;

@Repository
public interface UserRepository extends JpaRepository<UserLogin,Long >{
	
	
//	@Query("select name from UserLogin u where u.phno =:p and u.password =:p")
//	public String Login(@Param("pn") Long pn,@Param("p") String p);
	

}
