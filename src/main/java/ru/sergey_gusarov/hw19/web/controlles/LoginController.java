package ru.sergey_gusarov.hw19.web.controlles;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LoginController {
    @RequestMapping("/mylogin")
    public String login(){
        return "mylogin";
    }
}
