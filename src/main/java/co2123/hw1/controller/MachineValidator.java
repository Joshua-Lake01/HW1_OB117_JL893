package co2123.hw1.controller;
import co2123.hw1.domain.Arcade;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;
import org.springframework.validation.ValidationUtils;
import co2123.hw1.domain.Machine;
import co2123.hw1.Hw1Application;
import org.springframework.web.bind.annotation.RequestParam;

public class MachineValidator implements Validator {
    @Override
    public boolean supports(Class<?> clazz) {return Arcade.class.equals(clazz);}


    @Override
    public void validate(Object target, Errors errors, @RequestParam int arcade) {

        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "manufacturer", "", "Machine Needs A Manufacturer");
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "type", "", "Machine Needs A Type");
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "genre", "", "Machine Needs A Genre");
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "score", "", "Machine Needs A Score");

        Machine machine = (Machine) target;
        //get arcades

        for(Machine arcade1 : Hw1Application.arcades){
            if(arcade1.getId() == arcade.getId()){
                errors.rejectValue("id", "", "Arcade ID Already Exists");
            }
        }
        String emailRegex = "^[\\w.-]+@[\\w.-]+\\.[a-zA-Z]{2,}$";
        if(!arcade.getEmail().matches(emailRegex)) {
            errors.rejectValue("email", "", "Please enter a valid email address");
        }

    }
}
