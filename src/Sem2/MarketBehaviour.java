package Sem2;

import java.util.List;
/**
 Интерфейс MarketBehaviour, который описывает логику магазина – приход/уход покупателей,
 обновление состояния магазина
 */
public interface MarketBehaviour {
    void acceptToMarket(Actor actor);

    void  releaseFromMarket(List<Actor> actorList);

    void update();
}
