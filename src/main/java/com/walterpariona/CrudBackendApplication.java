package com.walterpariona;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.walterpariona.model.User;
import com.walterpariona.repositories.UserRepository;

@SpringBootApplication
public class CrudBackendApplication implements CommandLineRunner{
	
	@Autowired
	private UserRepository userRepository;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SpringApplication.run(CrudBackendApplication.class, args);
	}
	
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		userRepository.save(new User("one", "one"));
		userRepository.save(new User("two", "one"));
		userRepository.save(new User("three", "one"));
	}

}
