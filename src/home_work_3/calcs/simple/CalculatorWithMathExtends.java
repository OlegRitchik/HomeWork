package home_work_3.calcs.simple;


import home_work_3.calcs.api.ICalculator;

public class CalculatorWithMathExtends extends CalculatorWithOperator implements ICalculator {
    @Override
    public double add(double a, double b) {
        return super.add(a, b);
    }

    @Override
    public double sub(double a, double b) {
        return super.sub(a, b);
    }

    @Override
    public double div(double a, double b) {
        return super.div(a, b);
    }

    @Override
    public double multi(double a, double b) {
        return super.multi(a, b);
    }

    @Override
    public double exp(double a, double b) {
        return super.exp(a, b);
    }

    @Override
    public double abs(double a) {
        return super.abs(a);
    }

    @Override
    public double sqrt(double a) {
        return super.sqrt(a);
    }
}
