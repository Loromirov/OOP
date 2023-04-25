package Classes;


/**
 Класс VIP - клиента, дочерний от Actor
 */
public class VipClients extends Actor 
{
    /* Инкапсулированный номер клиента */
    private int vipId;
    /**
     * 
     * @param name - Имя клиента
     * @param vipId - идентификационный номер клиента
     */

    public VipClients(String name, int vipId) 
    {
        super(name);
        this.vipId = vipId;
    }

    /* Переопределение получения имени клиента */
    @Override
    public String getName() 
    {
        return super.name;
    }

    /* Получение идентификационного номера клиента */
    public int getVipId()
    {
        return vipId;
    }

    /* Переопределение метода проверки, сделан ли заказ */
    @Override
    public boolean isMakeOrder()
    {
        return super.isMakeOrder;
    }

    /* Переопределение метода проверки, забрал ли клиент заказ */
    @Override
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
