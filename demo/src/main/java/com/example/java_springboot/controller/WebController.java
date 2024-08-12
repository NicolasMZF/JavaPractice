package com.example.java_springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WebController {

    @GetMapping("/")
    public String home() {
        return "index"; // El nombre del archivo HTML en la carpeta 'templates'
    }

    @GetMapping("/earth")
    public String earth() {
        return "earth";
    }
}