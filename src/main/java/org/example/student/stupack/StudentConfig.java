package org.example.student.stupack;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfig {
    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository){
        return args -> {
            StudentModel vaishnavi = new StudentModel(
						1L,
						"Vaishnavi",
						"vaishnavi@gmail.com",
						LocalDate.of(1998, Month.SEPTEMBER, 28)
            );
            repository.saveAll(
                    List.of(vaishnavi)
            );


        };
    }
}
