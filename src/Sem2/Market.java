package Sem2;

import java.util.ArrayList;
import java.util.List;

/**
 * Класс Market, который реализовывает два вышеуказанных интерфейса и хранит в списке список
 * людей в очереди в различных статусах
 */
public class Market implements MarketBehaviour, QueueBehaviour {

    private List<Actor> queue = new ArrayList<>();

    @Override
    public void acceptToMarket(Actor actor) {
        takeInQueue(actor);
        System.out.println(actor.getName() + " Пришел в магазин");
    }

    @Override
    public void releaseFromMarket(List<Actor> actorList) {
        for (Actor a : actorList) {
                queue.remove(a);
            System.out.println(a.getName() + " Покинул магазин");
            }
    }

    @Override
    public void update() {
        takeOrders();
        giveOrders();
        releaseFromQueue();
    }

    @Override
    public void takeInQueue(Actor actor) {
        queue.add(actor);
        System.out.println(actor.getName() + " Добавлен в очередь");
    }

    @Override
    public void takeOrders() {
        for (Actor a : queue) {
            if (!a.isMakeOrder) {           // (a.isMakeOrder == false)
                a.setMakeOrder(true);
                System.out.println(a.getName() + " Сделал заказ");
            }
        }
    }

    @Override
    public void giveOrders() {
        for (Actor a : queue) {
            if (a.isMakeOrder) {
                a.setTakeOrder(true);
                System.out.println(a.getName() + " Получил заказ");
            }
        }
    }

    @Override
    public void releaseFromQueue() {
        List<Actor> exitQueue = new ArrayList();
        for (Actor a : queue) {
            if (a.isTakeOrder) { // a.isTakeOrder == true
                exitQueue.add(a);
            }
        }
        releaseFromMarket(exitQueue);
    }
}
