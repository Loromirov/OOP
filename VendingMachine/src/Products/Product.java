package Products;
/**Базовый класс продукта */
public class Product {
    /** Наименование продукта */
    private String name;
    /** Цена продукта */
    private Double price;
    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }
    /**
     * 
     * @param name  Наименование продукта
     * @param price Цена продукта
     */

    /** Получение наименования продукта*/
    public String getName(){
        return name;
    }    
    /** Получение цены продукта*/
    public Double getPrice(){
        return price;
    }
    /**Проверка правильности(не отрицательной) ввода цены */
    public void setPrice(Double price) {
        if (price <= 0) {
            throw new IllegalStateException(String.format("Цена указана некорректно"));
        }
        this.price = price;
    }
    /** Переопределение метода ToString */
    @Override
    public String toString(){
        return "Product{" + "Name = '" + name + '\'' + ", const = " + price + '}';
    }
    
}
