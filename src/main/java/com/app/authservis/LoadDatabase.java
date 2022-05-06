package com.app.authservis;

import com.app.authservis.entity.AppUser;
import com.app.authservis.repository.AppUserRepository;
import com.github.javafaker.Faker;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Locale;
import java.util.Random;

@Configuration
public class LoadDatabase {
    private static final Logger log = LoggerFactory.getLogger(LoadDatabase.class);
    @Bean
    CommandLineRunner initDatabase(AppUserRepository appUserRepository) {
        Faker faker = new Faker(new Locale("vi"));
        Random random = new Random();
        return args -> {
            for (int i = 0; i < 50; i++) {
                int temp = random.nextInt();
                String tempName = faker.name().username();
                appUserRepository.save(new AppUser(1,"admin","admin"));
                log.info("Preloading " + appUserRepository.save(new AppUser( temp, tempName,tempName+temp)));

            }


        };
    }
}
