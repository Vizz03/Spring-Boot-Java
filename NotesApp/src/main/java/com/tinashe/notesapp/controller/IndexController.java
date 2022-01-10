package com.tinashe.notesapp.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/*
Author: Tinashe Matembo
Desc: Note Taking Crud Application
Date : 10 January 2022
*/


@RestController
@RequestMapping("/")
public class IndexController {

    @GetMapping
    public String welcomeMessage() {
        return "Welcome to the Notes application. You can create a new Note by making a POST request to /api/notes endpoint.";
    }
}
