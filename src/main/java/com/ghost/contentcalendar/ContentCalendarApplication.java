package com.ghost.contentcalendar;

import com.ghost.contentcalendar.model.Content;
import com.ghost.contentcalendar.model.Status;
import com.ghost.contentcalendar.model.Type;
import com.ghost.contentcalendar.repository.ContentRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.time.LocalDateTime;

@SpringBootApplication
public class ContentCalendarApplication {

	public static void main(String[] args) {
		SpringApplication.run(ContentCalendarApplication.class, args);
	}

	@Bean
	CommandLineRunner commandLineRunner(ContentRepository repository) {
		return args -> {
			Content c = new Content(null, "My Bog", "it is bad", Status.IDEA, Type.ARTICLE, LocalDateTime.now(), null, "");
			repository.save(c);
		};
	}

}
