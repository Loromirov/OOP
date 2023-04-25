package Interfaces;

import java.util.List;

import Classes.Actor;
/**
 Интерфейс журнал посещения магазина
 */
public interface iMarketBehaviour 
{
    /* Клиент пришел в магазин*/
    void acceptToMarket(iActorBehaviour actor);

    /* Клиент ушел из магазина */
    void releaseFromMarket(List<Actor> actors);

    /* Обновление состояния */
    void update();
}
