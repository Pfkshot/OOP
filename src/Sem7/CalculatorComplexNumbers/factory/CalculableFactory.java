package Sem7.CalculatorComplexNumbers.factory;

import Sem7.CalculatorComplexNumbers.model.Calculable;
import Sem7.CalculatorComplexNumbers.model.ComplexCalculator;
import Sem7.CalculatorComplexNumbers.model.ComplexNumber;

public class CalculableFactory implements ICalculableFactory {
    public Calculable create(ComplexNumber primaryArg) {
        return new ComplexCalculator(primaryArg);
    }
}