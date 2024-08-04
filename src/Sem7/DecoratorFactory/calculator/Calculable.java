package Sem7.DecoratorFactory.calculator;

    public interface Calculable {
        Calculable sum(int arg);
        Calculable multi(int arg);
        int getResult();
    }

