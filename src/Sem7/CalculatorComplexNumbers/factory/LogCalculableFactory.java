package Sem7.CalculatorComplexNumbers.factory;

import Sem7.CalculatorComplexNumbers.logger.ConsoleLogger;
import Sem7.CalculatorComplexNumbers.logger.Logable;
import Sem7.CalculatorComplexNumbers.model.Calculable;
import Sem7.CalculatorComplexNumbers.model.ComplexCalculator;
import Sem7.CalculatorComplexNumbers.model.ComplexNumber;
import Sem7.CalculatorComplexNumbers.model.LogCalculator;

public class LogCalculableFactory implements ICalculableFactory {
    private Logable logable;

    @Override
    public Calculable create(ComplexNumber primaryArg) {
        return new LogCalculator(new ComplexCalculator(primaryArg), logable);
    }

    public LogCalculableFactory(ConsoleLogger logable) {
        this.logable = logable;
    }
}
