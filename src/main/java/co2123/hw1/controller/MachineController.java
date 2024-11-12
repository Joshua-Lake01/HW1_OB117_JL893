package co2123.hw1.controller;

import co2123.hw1.Hw1Application;
import co2123.hw1.domain.Arcade;
import co2123.hw1.domain.Machine;
import jakarta.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.*;

import org.springframework.stereotype.Controller;

@Controller
public class MachineController {
    @GetMapping("/machines")
    public String machine(Model model, @RequestParam int arcade) {
        for(Arcade arcade1: Hw1Application.arcades){
            if(arcade1.getId() == arcade){
                model.addAttribute("arcade_name", arcade1.getName());
                model.addAttribute("arcade_id", arcade1.getId());
                model.addAttribute("machines", arcade1.getMachines());
            }
        }
        return "machines/list";
    }
    @GetMapping("/newMachine")
    public String newMachine(Model model,@RequestParam int arcade) {
        for(Arcade arcade1: Hw1Application.arcades){
            if(arcade1.getId() == arcade){
                model.addAttribute("arcade_id", arcade1.getId());
            }
        }
        model.addAttribute("machine", new Machine());
        //to add arcade id to machine url

        return "machines/form";
    }

    @PostMapping("/addMachine")
    public String addMachine(@Valid @ModelAttribute Machine machine, BindingResult result, @RequestParam int arcade) {
        if(result.hasErrors()) {
            return "machines/form";
        }
        for(Arcade arcade1: Hw1Application.arcades) {


            if (arcade1.getId() == arcade) {
                arcade1.addMachine(machine);
            }
        }
        return "redirect:/arcades";
    }

    @InitBinder
    protected void initBinder(WebDataBinder binder) { binder.addValidators(new ArcadeValidator());}
}
