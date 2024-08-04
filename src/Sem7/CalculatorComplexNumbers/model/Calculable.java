package Sem7.CalculatorComplexNumbers.model;

public interface Calculable {
    Calculable sum(ComplexNumber arg);
    Calculable multi(ComplexNumber arg);
    Calculable div(ComplexNumber arg);
    ComplexNumber getResult();
}