package com.example.zadanie221;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class MailController {

    private MailService mailService;

    public MailController(MailService mailService) {
        this.mailService = mailService;
    }

    @GetMapping("kontakt")
    public String form(Model model) {
        model.addAttribute("dto", new FormDto());
        return "contact";
    }
    @PostMapping("send")
    public String sendMail(FormDto dto) {
        if(dto.getReceiver() != null && dto.getReceiver() != "") {
            mailService.sendMail(dto);
            return "send";
        }else {
            return "error";
        }
    }
}
