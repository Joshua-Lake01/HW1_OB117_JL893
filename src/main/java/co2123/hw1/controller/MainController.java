package co2123.hw1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import co2123.hw1.Hw1Application;
import co2123.hw1.domain.Arcade;


@Controller

public class MainController {
    private final Hw1Application hw1Application;

    public MainController(Hw1Application hw1Application) {
        this.hw1Application = hw1Application;
    }

    @GetMapping("/")
    public String show_start() {
        return "start";
    }
    @PostMapping("/")
    public String post_request(){
        return "start";
    }


}
