package co2123.hw1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller

public class MainController {
    @GetMapping("/")
    public String show_start() {
        return "start";
    }
    @PostMapping("/")
    public String post_request(){
        return "start";
    }

}
