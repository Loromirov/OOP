package Products;

public class HotDrink extends Product{
    private int temp;
    private double volume;

    public HotDrink(String name, double price, double volume, int temp)
    {
        super(name, price);
        this.volume = volume;
        this.temp = temp;
    }
    public double getVolume()
    {
        return volume;
    }
    public void setVolume(double volume)
    {
        this.volume = volume;
    }
    public int getTemp()
    {
        return temp;
    }
    public void setTemp(int temp)
    {
        this.temp = temp;
    }
    public String toString(){
        return "Product{" + "Name = '" + super.getName() + '\'' + ", Price = " + super.getPrice() + ", Volume = " + volume + ", Temperature = " + temp + '}';
    }
}
