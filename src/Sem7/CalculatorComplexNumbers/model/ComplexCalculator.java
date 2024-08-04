package Sem7.CalculatorComplexNumbers.model;

public final class ComplexCalculator implements Calculable {
    private ComplexNumber primaryArg;

    public ComplexCalculator(ComplexNumber primaryArg) {
        this.primaryArg = primaryArg;
    }

    @Override
    public Calculable sum(ComplexNumber arg) {
        primaryArg = new ComplexNumber(primaryArg.getReal() + arg.getReal(), primaryArg.getImaginary()
                + arg.getImaginary());
        return this;
    }

    @Override
    public Calculable multi(ComplexNumber arg) {
        double real = primaryArg.getReal() * arg.getReal() - primaryArg.getImaginary() * arg.getImaginary();
        double imaginary = primaryArg.getReal() * arg.getImaginary() + primaryArg.getImaginary() * arg.getReal();
        primaryArg = new ComplexNumber(real, imaginary);
        return this;
    }

    @Override
    public Calculable div(ComplexNumber arg) {
        double real = (primaryArg.getReal() * arg.getReal() + primaryArg.getImaginary() * arg.getImaginary())
                / (Math.pow(arg.getReal(), 2) + Math.pow(arg.getImaginary(), 2));
        double imaginary = (primaryArg.getImaginary() * arg.getReal() - primaryArg.getReal() * arg.getImaginary())
                / (Math.pow(arg.getReal(), 2) + Math.pow(arg.getImaginary(), 2));
        primaryArg = new ComplexNumber(real, imaginary);
        return this;
    }

    @Override
    public ComplexNumber getResult() {
        return primaryArg;
    }
}
