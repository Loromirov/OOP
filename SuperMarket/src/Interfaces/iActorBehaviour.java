package Interfaces;

import Classes.Actor;
/** Интерфейс поведения клиента*/
public interface iActorBehaviour {
    /* Клиент сделал заказ */
    void setMakeOrder(boolean makeOrder);

    /* Клиент забрал заказ*/
    void setTakeOrder(boolean pickUpOrder);

    /* Проверка, сделан ли заказ */
    boolean isMakeOrder();

    /* Проверка, забрали ли заказ*/
    boolean isTakeOrder();
    
    /* Возврат самого клиента */
    Actor getActor();
}
