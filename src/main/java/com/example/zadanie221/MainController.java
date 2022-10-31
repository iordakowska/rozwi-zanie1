package com.example.zadanie221;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

    @GetMapping("/")
    public String home() {
        return "home";
    }

    @GetMapping("regulamin")
    public String regulamin() {
        return "regulamin";
    }
}
