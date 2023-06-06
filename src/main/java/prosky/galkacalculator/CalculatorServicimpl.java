package prosky.galkacalculator;

import org.springframework.stereotype.Service;

@Service
class CalculatorServicimpl implements CalculatorService {


    public String answerPlus(int num1, int num2) {
        int sum = num1 + num2;

        return num1 + "+" + num2 + "=" + sum;

    }

    public String answerMinus(int num1, int num2) {
        int diff = num1 - num2;

        return num1 + "-" + num2 + "=" + diff;
    }

    public String answerMultiply(int num1, int num2) {
        int multipli = num1 * num2;

        return num1 + "*" + num2 + "=" + multipli;
    }

    public String answerDivide(int num1, int num2) {
        int divide = num1 / num2;
        if (num2 != 0) {

            return num1 + "/" + num2 + "=" + divide;
        } else {
            return null;
        }
    }
}
