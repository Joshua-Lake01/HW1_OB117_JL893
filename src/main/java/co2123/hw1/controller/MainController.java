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

    @GetMapping("/arcades")
    public String show_arcades(Model model) {
        model.addAttribute("arcades", Hw1Application.arcades);
        System.out.printf(Hw1Application.arcades.get(0).getName());
        return "arcades/list";
    }

    @GetMapping("/newArcade")
    public String showNewArcade(Model model) {
        model.addAttribute("estimated_id", Hw1Application.estimated_id);
        model.addAttribute("arcade", new Arcade()); // Pass an empty Arcade object to the form
        return "arcades/form";
    }

    @PostMapping("/addArcade")
    public String addArcade(@ModelAttribute Arcade arcade) {
        Arcade new_arcade = arcade;
        Hw1Application.set_unique_id(new_arcade);
        Hw1Application.arcades.add(new_arcade);

        return "redirect:/arcades";
    }
}
