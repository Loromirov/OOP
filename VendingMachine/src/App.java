import Products.Product;
import VendingMachines.VendingMachine;
import Products.BottleOfWater;
import Products.HotDrink;
public class App {
    /**
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) throws Exception {
    
        Product item1 = new Product("Cola", 88.0);

        item1.setPrice(98.0);
        VendingMachine itemMachine = new VendingMachine(300);

        itemMachine.addProduct(new Product("Чипсы", 60.0));
        itemMachine.addProduct(item1);
        itemMachine.addProduct(new Product("Чипсы", 60.0));
        itemMachine.addProduct(new Product("Масло", 50.0));
        itemMachine.addProduct(new Product("Хлеб", 40.0));
        itemMachine.addProduct(new Product("Снек", 20.0));
        itemMachine.addProduct(new BottleOfWater("Cola", 88.0, 500 ));
        itemMachine.addProduct(new BottleOfWater("Water", 188.0, 1500 ));
        itemMachine.addProduct(new HotDrink("Cappuccino", 100.0, 0.3, 65 ));
        itemMachine.addProduct(new HotDrink("Cappuccino", 150.0, 0.5, 65 ));
        itemMachine.addProduct(new HotDrink("Americano", 150.0, 0.5, 85 ));
        itemMachine.addProduct(new HotDrink("Americano", 100.0, 0.3, 85 ));
        itemMachine.addProduct(new HotDrink("Macchiato", 100.0, 0.3, 65 ));
        itemMachine.addProduct(new HotDrink("Macchiato", 150.0, 0.5, 65 ));

        for (Product prod : itemMachine.getProductAll()) {
            System.out.println(prod);
        }

    }
}
