package Sem7.CalculatorComplexNumbers.controller;

import Sem7.CalculatorComplexNumbers.factory.ICalculableFactory;
import Sem7.CalculatorComplexNumbers.factory.LogCalculableFactory;
import Sem7.CalculatorComplexNumbers.logger.ConsoleLogger;
import Sem7.CalculatorComplexNumbers.view.ViewCalculator;

public class Main {
    public static void main(String[] args) {
        ICalculableFactory calculableFactory = new LogCalculableFactory(new ConsoleLogger());
        ViewCalculator view = new ViewCalculator(calculableFactory);
        view.run();
    }
}