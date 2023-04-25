package Classes;

/**
 Класс обычного клиента, дочерний от Actor
 */
public class OrdinareClient extends Actor 
{
    /**
     * 
     * @param name - Имя клиента
     */

    public OrdinareClient(String name)
    {
        super(name);
    }

    /* Переопределение получения имени клиента */
    @Override
    public String getName() 
    {
        return super.name;
    }

    /* Переопределение метода проверки, сделан ли заказ */
    public boolean isMakeOrder()
    {
        return super.isMakeOrder;
    }

    /* Переопределение метода проверки, забрал ли клиент заказ */
    public boolean isTakeOrder()
    {
        return super.isTakeOrder;
    }

    /* Переопределение метода сделать заказ клиентом */
    @Override
    public void setMakeOrder(boolean makeOrder) 
    {
        super.isMakeOrder = makeOrder;
    }

    /* Переопределение метода забрать заказ клиентом */
    @Override
    public void setTakeOrder(boolean pickUpOrder) 
    {
        super.isTakeOrder = pickUpOrder;
    }

    /* Переопределение метода получить клиента */
    @Override
    public Actor getActor() 
    {
        return this;
    }
    
    /* Переопределение метода проверки создания заявки на возврат */
    public boolean isMakeReturnOrder()
    {
        return super.isMakeReturnOrder;
    }

    /* Переопределение метода проверки, забрал ли клиент деньги */
    public boolean isTakeCash()
    {
        return super.isTakeCash;
    }

    /* Переопределние метода создания заявки на возврат  */
    @Override
    public void setMakeReturnOrder(boolean makeReturnOrder)
    {
        super.isMakeReturnOrder = makeReturnOrder;
    }

    /* Переопределение метода возврата средств */
    public void setTakeCash(boolean takeCash)
    {
        super.isTakeCash = takeCash;
    }

    
}
