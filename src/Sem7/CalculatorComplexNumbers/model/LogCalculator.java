package Sem7.CalculatorComplexNumbers.model;

import Sem7.CalculatorComplexNumbers.logger.Logable;

public class LogCalculator implements Calculable {
    private Calculable calculable;

    private Logable logable;

    public LogCalculator(Calculable calculable, Logable logable) {
        this.calculable = calculable;
        this.logable = logable;
    }

    @Override
    public Calculable sum(ComplexNumber arg) {
        logable.log("выполненно действие суммы с аргументом: " + arg.getReal() + " + " + arg.getImaginary() + "i");
        return calculable.sum(arg);
    }

    @Override
    public Calculable multi(ComplexNumber arg) {
        logable.log("выполненно действие умножения с аргументом: " + arg.getReal() + " + " + arg.getImaginary() + "i");
        return calculable.multi(arg);
    }

    @Override
    public Calculable div(ComplexNumber arg) {
        logable.log("выполненно действие деления с аргументом: " + arg.getReal() + " + " + arg.getImaginary() + "i");
        return calculable.div(arg);
    }

    @Override
    public ComplexNumber getResult() {
        logable.log("Результат: ");
        return calculable.getResult();
    }
}