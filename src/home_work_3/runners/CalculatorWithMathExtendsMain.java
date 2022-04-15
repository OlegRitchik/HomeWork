package home_work_3.runners;


import home_work_3.calcs.simple.CalculatorWithMathExtends;

public class CalculatorWithMathExtendsMain {
    public static void main(String[] args) {
        CalculatorWithMathExtends calculator = new CalculatorWithMathExtends();

        double a = 4.1;
        double b = 15.0;
        double c = 7.0;
        double d = 28.0;
        double e = 5.0;
        double result;
        result = calculator.add(a, calculator.add(calculator.multi(b, c), calculator.exp(calculator.div(d, e), 2)));
        System.out.println(result);
    }
}
