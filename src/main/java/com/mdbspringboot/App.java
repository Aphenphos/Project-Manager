package com.mdbspringboot;

import com.mdbspringboot.models.ProjectItem;
import com.mdbspringboot.repository.ProjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

import java.util.ArrayList;


@SpringBootApplication
@EnableMongoRepositories
@ComponentScan("com.mdbspringboot")
public class App {

	@Autowired
	ProjectRepository projectRepository;
	public static void main(String[] args) {
		SpringApplication.run(App.class, args);
	}

}
