package Sem7.CalculatorComplexNumbers.view;

import Sem7.CalculatorComplexNumbers.factory.ICalculableFactory;
import Sem7.CalculatorComplexNumbers.model.Calculable;
import Sem7.CalculatorComplexNumbers.model.ComplexNumber;


import java.util.Scanner;

public class ViewCalculator {

    private ICalculableFactory calculableFactory;

    public ViewCalculator(ICalculableFactory calculableFactory) {
        this.calculableFactory = calculableFactory;
    }

    public void run() {
        while (true) {
            ComplexNumber primaryArg = promptComplexNumber("Введите первый аргумент (в формате a + bi): ");
            Calculable calculator = calculableFactory.create(primaryArg);
            while (true) {
                String cmd = prompt("Введите команду (*, +, /, =) : ");
                if (cmd.equals("*")) {
                    ComplexNumber arg = promptComplexNumber("Введите второй аргумент (в формате a + bi): ");
                    calculator.multi(arg);
                    continue;
                }
                if (cmd.equals("+")) {
                    ComplexNumber arg = promptComplexNumber("Введите второй аргумент (в формате a + bi): ");
                    calculator.sum(arg);
                    continue;
                }
                if (cmd.equals("/")) {
                    ComplexNumber arg = promptComplexNumber("Введите второй аргумент (в формате a + bi): ");
                    calculator.div(arg);
                    continue;
                }
                if (cmd.equals("=")) {
                    ComplexNumber result = calculator.getResult();
                    System.out.printf("%.2f+%.2fi\n", result.getReal(), result.getImaginary());
                    break;
                }
            }
            String cmd = prompt("Еще посчитать (Y/N)?");
            if (cmd.equals("Y")) {
                continue;
            }
            break;
        }
    }

    private String prompt(String message) {
        Scanner in = new Scanner(System.in);
        System.out.print(message);
        return in.nextLine();
    }

    private ComplexNumber promptComplexNumber(String message) {
        Scanner in = new Scanner(System.in);
        System.out.print(message);
        String input = in.nextLine();
        String[] parts = input.split("\\+");
        double real = Double.parseDouble(parts[0]);
        double imaginary = Double.parseDouble(parts[1].substring(0, parts[1].length() - 1));
        return new ComplexNumber(real, imaginary);
    }
}
