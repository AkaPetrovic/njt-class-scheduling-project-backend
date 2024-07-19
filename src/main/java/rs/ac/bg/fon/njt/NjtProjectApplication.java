package rs.ac.bg.fon.njt;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import rs.ac.bg.fon.njt.role.Role;
import rs.ac.bg.fon.njt.role.RoleRepository;

import java.util.ArrayList;

@SpringBootApplication
public class NjtProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(NjtProjectApplication.class, args);
	}

	@Bean
	CommandLineRunner runner(RoleRepository roleRepository){
		return args -> {
//			Role role = new Role("administrator", new ArrayList<>());
//			roleRepository.save(role);

//			Role role = new Role("user", new ArrayList<>());
//			roleRepository.save(role);


		};
	}

}
