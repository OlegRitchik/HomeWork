package home_work_3.calcs.additional;

import home_work_3.calcs.simple.CalculatorWithMathExtends;

public class CalculatorWithCounterClassic extends CalculatorWithMathExtends {
    private long count;

    void incrementCountOperation() {
        count++;
    }

    public long getCountOperation() {
        return count;
    }

    @Override
    public double add(double a, double b) {
        incrementCountOperation();
        return super.add(a, b);
    }

    @Override
    public double sub(double a, double b) {
        incrementCountOperation();
        return super.sub(a, b);
    }

    @Override
    public double div(double a, double b) {
        incrementCountOperation();
        return super.div(a, b);
    }

    @Override
    public double multi(double a, double b) {
        incrementCountOperation();
        return super.multi(a, b);
    }

    @Override
    public double exp(double a, double b) {
        incrementCountOperation();
        return super.exp(a, b);
    }

    @Override
    public double abs(double a) {
        incrementCountOperation();
        return super.abs(a);
    }

    @Override
    public double sqrt(double a) {
        incrementCountOperation();
        return super.sqrt(a);
    }
}


