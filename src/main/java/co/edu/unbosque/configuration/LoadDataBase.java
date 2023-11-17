package co.edu.unbosque.configuration;

import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import co.edu.unbosque.util.AESutil;


@Configuration
public class LoadDataBase {

	private static final Logger LOG = LoggerFactory.getLogger(LoadDataBase.class);

	@Bean
	CommandLineRunner initDataBase(UserRepository userRepo) {
		return args -> {
			Optional<User> found = userRepo.findByUsername(AESutil.encrypt("admin"));
			if (found.isPresent()) {
				LOG.info("Admin already exist, skiping admin creation");
			} else {
				userRepo.save(new User(AESutil.encrypt("admin"), AESutil.encrypt("1234")));
				LOG.info("Preloading admin information");
			}
		};
	}

}