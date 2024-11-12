package co2123.hw1.controller;

import co2123.hw1.Hw1Application;
import co2123.hw1.controller.ArcadeValidator;
import co2123.hw1.domain.Arcade;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import jakarta.validation.Valid;

@Controller
public class ArcadeController {

    @GetMapping("/arcades")
    public String show_arcades(Model model) {
        model.addAttribute("arcades", Hw1Application.arcades);
        System.out.printf(Hw1Application.arcades.get(0).getName());
        return "arcades/list";
    }

    @GetMapping("/newArcade")
    public String showNewArcade(Model model) {
        model.addAttribute("estimated_id", Hw1Application.estimated_id);
        model.addAttribute("arcade", new Arcade());
        return "arcades/form";
    }

    @PostMapping("/addArcade")
    public String addArcade(@Valid @ModelAttribute Arcade arcade, BindingResult bindingResult) {
        if(bindingResult.hasErrors()) {
            return "/arcades/form";
        }
        Arcade new_arcade = arcade;
        Hw1Application.set_unique_id(new_arcade);
        Hw1Application.arcades.add(new_arcade);
        return "redirect:/arcades";
    }

    @InitBinder
    protected void initBinder(WebDataBinder binder) { binder.addValidators(new ArcadeValidator());}
}
