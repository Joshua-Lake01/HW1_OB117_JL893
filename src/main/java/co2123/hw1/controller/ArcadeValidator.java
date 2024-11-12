package co2123.hw1.controller;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;
import org.springframework.validation.ValidationUtils;
import co2123.hw1.domain.Arcade;

public class ArcadeValidator implements Validator {
    @Override
    public boolean supports(Class<?> clazz) {return Arcade.class.equals(clazz);}

    @Override
    public void validate(Object target, Errors errors) {

        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "id", "", "Arcade Needs An ID");
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "name", "", "Arcade Needs A Name");
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "email", "", "Arcade Needs A Email");
        Arcade arcade = (Arcade) target;
        String emailRegex = "^[\\w.-]+@[\\w.-]+\\.[a-zA-Z]{2,}$";
        if(!arcade.getEmail().matches(emailRegex)) {
            errors.rejectValue("email", "", "Please enter a valid email address");
        }

    }
}
