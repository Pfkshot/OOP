package Sem2;

/**
Интерфейс ActorBehavoir, который будет содержать описание возможных действий актора в очереди/магазине
 */
public interface ActorBehavior {
    void setMakeOrder(boolean makeOrder);

    void setTakeOrder(boolean takeOrder);

    boolean isMakeOrder();

    boolean isTakeOrder();
}
