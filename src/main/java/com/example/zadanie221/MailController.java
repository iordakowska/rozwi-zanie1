package com.example.zadanie221;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MailController {

    private MailService mailService;

    public MailController(MailService mailService) {
        this.mailService = mailService;
    }

    @GetMapping("/")
    public String home() {
        return "home";
    }

    @GetMapping("/regulamin")
    public String regulamin() {
        return "regulamin";
    }

    @GetMapping("/info")
    public String info() {
        return "info";
    }
}
