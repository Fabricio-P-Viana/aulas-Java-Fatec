package com.aula06.OlaMundo.Controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
public class helloController {
    @GetMapping("/")
    public String getOlaMundo(){
        return "Ola Mundo";
    }
    @GetMapping("/ola")
    public String getFabricio(){
        return "Ola";
    }
}
