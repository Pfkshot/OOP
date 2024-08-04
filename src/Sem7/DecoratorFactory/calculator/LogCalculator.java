package Sem7.DecoratorFactory.calculator;

public class LogCalculator implements Calculable{
    private Calculable decorated;

    private Loggable logger;

    public LogCalculator(Calculable decorated, Loggable logger){
        this.decorated = decorated;
        this.logger = logger;
    }

    @Override
    public Calculable sum(int arg) {
        int firstArg = decorated.getResult();
        logger.log("Первое значение калькулятора: " + firstArg + "Начало вызова метода sum с параметром " + arg);
        Calculable result = decorated.sum(arg);
        logger.log("Вызов метода sum произошел успешно");
        return result;
    }

    @Override
    public Calculable multi(int arg) {
        int firstArg = decorated.getResult();
        logger.log("Первое значение калькулятора: " + firstArg + "Начало вызова метода multi с параметром " + arg);
        Calculable result = decorated.multi(arg);
        logger.log("Вызов метода multi произошел успешно");
        return result;
    }

    @Override
    public int getResult() {
        int result = decorated.getResult();
        logger.log("Получение результата: " + result);
        return result;
    }
}
