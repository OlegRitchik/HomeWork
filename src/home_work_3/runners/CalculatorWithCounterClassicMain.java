package home_work_3.runners;

import home_work_3.calcs.additional.CalculatorWithCounterClassic;

public class CalculatorWithCounterClassicMain {
    public static void main(String[] args) {
        CalculatorWithCounterClassic calculator = new CalculatorWithCounterClassic();

        double a = 4.1;
        double b = 15.0;
        double c = 7.0;
        double d = 28.0;
        double e = 5.0;
        double result;
        result = calculator.add(a, calculator.add(calculator.multi(b, c), calculator.exp(calculator.div(d, e), 2)));
        System.out.println(result);
        System.out.println("\n"+"Число использований калькулятора = " + calculator.getCountOperation());
    }
}
