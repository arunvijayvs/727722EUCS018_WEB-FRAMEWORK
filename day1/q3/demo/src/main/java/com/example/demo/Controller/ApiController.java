package com.example.demo.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApiController {
    @GetMapping("favouriteColor")
    public String color(@RequestParam(name="id") String name)
    {
        return("My favourite color is "+ name);

    }
}
