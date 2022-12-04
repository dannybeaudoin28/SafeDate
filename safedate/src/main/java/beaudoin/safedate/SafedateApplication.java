package beaudoin.safedate;

import java.util.ArrayList;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

import beaudoin.safedate.Models.Role;
import beaudoin.safedate.Models.User;
import beaudoin.safedate.Services.UserService;




@SpringBootApplication
public class SafedateApplication {

	public static void main(String[] args) {
		SpringApplication.run(SafedateApplication.class, args);
	}

	@Bean
	CommandLineRunner run(UserService userService) {
		return args -> {
	 		ArrayList<Role> roles = new ArrayList<>();
	 		
			ArrayList<String> rolesForSuper = new ArrayList<>();
			roles.add(userService.saveRole(new Role(null, "ADMIN")));
			userService.saveUser(new User(null, "Danny Beaudoin", "Beaudoin123", "Hello12345", roles));
	 	};
	 }

	@Bean
	PasswordEncoder passwordEncoder() {
		return new BCryptPasswordEncoder();
	}
}
