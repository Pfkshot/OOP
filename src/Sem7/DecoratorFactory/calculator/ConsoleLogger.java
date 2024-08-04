package Sem7.DecoratorFactory.calculator;

public class ConsoleLogger implements Loggable {

    @Override
    public void log(String message) {
        System.out.println("LOG: " + message);

    }
}
