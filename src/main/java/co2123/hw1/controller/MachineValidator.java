package co2123.hw1.controller;
import co2123.hw1.domain.Arcade;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;
import org.springframework.validation.ValidationUtils;
import co2123.hw1.domain.Machine;
import co2123.hw1.Hw1Application;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MachineValidator implements Validator {
    @Override
    public boolean supports(Class<?> clazz) {return Arcade.class.equals(clazz);}


    @Override
    public void validate(Object target, Errors errors) {

        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "manufacturer", "", "Machine Needs A Manufacturer");
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "type", "", "Machine Needs A Type");
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "genre", "", "Machine Needs A Genre");
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "score", "", "Machine Needs A Score");

        Machine machine = (Machine) target;
        //get arcades
        List<String> Genres = new ArrayList<>(Arrays.asList("Racing", "Sports", "Adventure"));

        if(!Genres.contains(machine.getGenre())){
           errors.rejectValue("genre", "", "Enter A Valid Genre");
        }

        if(!(machine.getScore() > 5000 && machine.getScore() < 1)){
           errors.rejectValue("score", "", "Score Needs To Be Between 1 and 5000");
        }

    }
}
