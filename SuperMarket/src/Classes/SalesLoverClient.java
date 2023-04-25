package Classes;
/**
 Класс клиента, любителя халявы, дочерний от Actor
 */
public class SalesLoverClient extends Actor{

    /* Название акции */
    public String nameOfStock;

    /* Порядковый номер участника в акции */
    private static Integer count;

    static
    {
        count = 0;
    }

    /**
     * 
     * @param name - Имя клиента
     * @param nameOfStock - Название акции
     */

    public SalesLoverClient(String name, String nameOfStock) 
    {
        super(name);
        this.nameOfStock = nameOfStock;
        count++;
    }

      /* Получение порядкового номера клиента в акции */
    public int getCount()
    {
        return count;
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

    /* Переопределение метода получить клиента */
    @Override
    public Actor getActor() 
    {
        return this;
    }

    /* Переопределение получения имени клиента */
    @Override
    public String getName() 
    {
        return super.name;
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
