package prosky.galkacalculator;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/calculator")


public class HelloController {
    @GetMapping
    public String welcom () {
        return "Добро пожаловать в калькулятор";
    }

    private final CalculatorServicimpl calculatorServic;
    public HelloController(CalculatorServicimpl calculatorServic) {
        this.calculatorServic = calculatorServic;
    }



   @GetMapping(path = "/plus")
    public String ansewrPlus(@RequestParam(required = true) int num1,
                            @RequestParam (required = true) int num2) {

            return calculatorServic.answerPlus(num1,num2);
        }


}







