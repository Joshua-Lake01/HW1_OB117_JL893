package co2123.hw1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import co2123.hw1.Hw1Application;
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
    @GetMapping("/arcades")
    public String show_arcades(Model model) {
        model.addAttribute("arcades", Hw1Application.arcades);
        return "arcades/list";
    }

}
