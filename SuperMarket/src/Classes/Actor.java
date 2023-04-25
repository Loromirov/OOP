package Classes;

import Interfaces.iActorBehaviour;
import Interfaces.iReturnOrder;
/** 
 Абстрактный класс Клиент, имплементирует интерфейс поведения клиента и возврата клиента
 */
public abstract class Actor implements iActorBehaviour, iReturnOrder
 {
    /* Имя клиента */
    protected String name;

    /* Проверка, сделал ли клиент заказ */
    protected boolean isTakeOrder;

    /* Проверка, забрал ли клиент заказ */
    protected boolean isMakeOrder;

    /* Проверка, сделал ли клиент возврат средств */
    protected boolean isTakeCash;

    /* Проверка, сделал ли клиент заявку на возврат */
    protected boolean isMakeReturnOrder;


    /* Перегрузка конструктора */
    public Actor(String name) 
    {
        this.name = name;
    }

    /* Обьявление метода получения имени клиента */
    public abstract String getName();


    
}
