package Interfaces;

import Classes.Actor;
/**
 Интерфейс возврата заказа
 */
public interface iReturnOrder 
{
    /* Создание заявки на возврат  */
    void setMakeReturnOrder(boolean makeReturnOrder);

    /* Возврат средств */
    void setTakeCash(boolean takeCash);

    /* Проверка заявки на возврат */
    boolean isMakeReturnOrder();

    /* Проверка на возврат средств */
    boolean isTakeCash();

    /* Возврат самого клиента */
    Actor getActor();
}
