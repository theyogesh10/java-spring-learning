package com.yogeshjava.Day63_SpringBootData;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface UserRepository extends JpaRepository<User, String>{
	
	List<User> findByPass(String value);
	
	//select * from users where pass=?v1 and user=?v2
	List<Object[]> findByPassAndUser(String v1, String v2);
	//List<User> findByPassLike(String pattern);
	//List<User> findByPassBetween();
	
	//@Query(value="select pass from User where pass=?1") // class and variable based query
	@Query(value="select password from users where password=?1", nativeQuery = true) //native sql query
	List<Object[]> searchPassword(String pass);

}
