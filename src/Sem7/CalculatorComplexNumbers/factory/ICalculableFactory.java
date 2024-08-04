package Sem7.CalculatorComplexNumbers.factory;

import Sem7.CalculatorComplexNumbers.model.Calculable;
import Sem7.CalculatorComplexNumbers.model.ComplexNumber;

public interface ICalculableFactory {
    Calculable create(ComplexNumber primaryArg);
}

