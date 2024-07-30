package Sem2;
/**
 Абстрактный класс Actor, который хранит в себе параметры актора, включая состояние готовности сделать
заказ и факт получения заказа.
* */
abstract class Actor implements ActorBehavior {
    protected  boolean isTakeOrder;

    @Override
    public boolean isTakeOrder() {
        return isTakeOrder;
    }

    @Override
    public void setTakeOrder(boolean takeOrder) {
        isTakeOrder = takeOrder;
    }

    @Override
    public boolean isMakeOrder() {
        return isMakeOrder;
    }

    @Override
    public void setMakeOrder(boolean makeOrder) {
        isMakeOrder = makeOrder;
    }

    protected boolean isMakeOrder;

    protected  final String name;

    public Actor(String name) {
        this.name = name;
    }

    public abstract String getName();
}
