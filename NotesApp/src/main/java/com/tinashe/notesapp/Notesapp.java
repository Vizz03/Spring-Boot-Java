package com.tinashe.notesapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;


/*
Author: Tinashe Matembo
Desc: Note Taking Crud Application
Date : 10 January 2022
*/

@SpringBootApplication
@EnableJpaAuditing
public class Notesapp {

	public static void main(String[] args) {
		SpringApplication.run(Notesapp.class, args);
	}
}
