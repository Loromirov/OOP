package Classes;

import java.util.ArrayList;
import java.util.List;

import Interfaces.iActorBehaviour;
import Interfaces.iMarketBehaviour;
import Interfaces.iQueueBehaviour;

/** 
 Класс Магазин, имплементированный интерфейсами поведения очереди и магазина
 */
public class Market implements iMarketBehaviour, iQueueBehaviour 
{
    /* Инкапсулированный список клиентов внутри магазина */
    private List<iActorBehaviour> queue;

    /* Перегрузка конструктора */
    public Market() 
    {
        this.queue = new ArrayList<iActorBehaviour>();
    }

    /* Переопределение метода клиент пришел в магазин */
    @Override
    public void acceptToMarket(iActorBehaviour actor) 
    {
        System.out.println(actor.getActor().getName() + " Клиент пришел в магазин ");
        takeInQueue(actor);
    }

    /* Переопределение метода занимание очереди */
    @Override   
    public void takeInQueue(iActorBehaviour actor) 
    {
        this.queue.add(actor);
        System.out.println(actor.getActor().getName() + " Клиент добавлен в очередь ");        
    }

    /* Переопределение метода клиент ушел из магазина */
    @Override
    public void releaseFromMarket(List<Actor> actors) 
    {
        for(Actor actor: actors)
        {
            System.out.println(actor.getActor().getName()+ " Клиент ушел из магазина ");
            queue.remove(actor);
        }
    }

    /* Переопределение метода обновления состояния клиента */
    @Override
    public void update() 
    {
        takeOrder();
        giveOrder();
        releaseFromQueue();
        
    }

    /* Переопределение метода забрать заказ */
    @Override
    public void giveOrder() 
    {
        for (iActorBehaviour actor : queue) 
        {
            if (actor.isMakeOrder()) 
            {
                actor.setTakeOrder(true);
                System.out.println(actor.getActor().getName()+" клиент получил свой заказ");
            }    
        }
        
    }

    /* Переопределение метода выхода из очереди*/
    @Override
    public void releaseFromQueue() 
    {
        List<Actor> releaseActors = new ArrayList<>();
        for(iActorBehaviour actor: queue)
        {
            if (actor.isTakeOrder()) 
            {
                releaseActors.add(actor.getActor());
                System.out.println(actor.getActor().getName()+" клиент ушел из очереди");
            }
        }
        
    }

    /* Переопределение метода сделать заказ */
    @Override
    public void takeOrder() 
    {
        for (iActorBehaviour actor : queue) 
        {
            if (!actor.isMakeOrder()) 
            {
                actor.setMakeOrder(true);
                System.out.println(actor.getActor().getName()+" клиент сделал заказ");
            }

        }
        
    }
}