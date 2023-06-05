package prosky.galkacalculator;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @GetMapping

    public String welcome() {
        return "Добро пожаловать в калькулятор";
    }


}
