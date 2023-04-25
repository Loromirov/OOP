package Interfaces;
/** Интерфейс действия в очереди */
public interface iQueueBehaviour 
{   
    /* Занимание очереди */
    void takeInQueue(iActorBehaviour actor);

    /* Выход из очереди */
    void releaseFromQueue();

    /* Сделать заказ */
    void takeOrder();
    
    /* Забрать заказ */
    void giveOrder();

}
