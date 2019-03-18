package com.optimus_prime.learningjhipster;

import com.optimus_prime.learningjhipster.domain.Task;
import com.optimus_prime.learningjhipster.service.TaskService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

@SpringBootApplication
public class LearningjhipsterApplication {

	public static void main(String[] args) {
		SpringApplication.run(LearningjhipsterApplication.class, args);
	}

	@Bean
	CommandLineRunner commandLineRunner(TaskService taskService){
		return args ->{
//		   taskService.save(new Task(1L, "Creating Spring Boot application", LocalDate.now(), true));
//			taskService.save(new Task(2L, "Creating Spring Boot packages", LocalDate.now().plus(1, ChronoUnit.DAYS), true));
//			taskService.save(new Task(3L, "Creating Task domain class", LocalDate.now().plus(2, ChronoUnit.DAYS), false));
//			taskService.save(new Task(4L, "Creating Spring Boot Repository", LocalDate.now().plus(3, ChronoUnit.DAYS), false));
//			taskService.save(new Task(5L, "Creating Spring Boot Services", LocalDate.now().plus(4, ChronoUnit.DAYS), false));
//			taskService.save(new Task(6L, "Creating Spring Boot configuring properties", LocalDate.now().plus(1, ChronoUnit.DAYS), false));


			taskService.save(new Task(1L, "Creating Spring Boot application", "2017/07/01", true));
			taskService.save(new Task(2L, "Creating Spring Boot packages", "2017/07/02", true));
			taskService.save(new Task(3L, "Creating Task domain class", "2017/07/03", false));
			taskService.save(new Task(4L, "Creating Spring Boot Repository","2017/07/04", false));
			taskService.save(new Task(5L, "Creating Spring Boot Services", "2017/07/05", false));
			taskService.save(new Task(6L, "Creating Spring Boot configuring properties", "2017/07/06", false));
		};
	}

}
