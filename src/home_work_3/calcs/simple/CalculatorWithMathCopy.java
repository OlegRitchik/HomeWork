package home_work_3.calcs.simple;

import home_work_3.calcs.api.ICalculator;

public class CalculatorWithMathCopy implements ICalculator {

    @Override
    public double add(double a, double b) {
        return a + b;
    }

    @Override
    public double sub(double a, double b) {
        return a - b;
    }

    @Override
    public double div(double a, double b) {
        return a / b;
    }

    @Override
    public double multi(double a, double b) {
        return a * b;
    }

    @Override
    public double exp(double a, double b) {
        double c = 1;
        for(int i = 1; i <= a; i++) {
            c *= b;
        }
        return c;
    }


    @Override
    public double abs(double a) {
        if (a < 0){
            return a * -1;
        } else {
            return a;
        }
    }

    @Override
    public double sqrt(double a) {
        return Math.sqrt(a);
    }
}
