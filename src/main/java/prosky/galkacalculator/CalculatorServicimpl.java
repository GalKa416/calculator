package prosky.galkacalculator;

import org.springframework.stereotype.Service;

@Service
class CalculatorServicimpl implements CalculatorService {



    public String answerPlus (int num1, int num2) {
        int sum = num1 + num2;

        return num1+ "+" + num2+ "="+sum;

}

    public String answerminus (int num1, int num2) {
        int diff = num1 - num2;

        return num1+ "+" + num2+ "="+diff;
}