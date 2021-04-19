public class Dish 
{

    // Members declaration
    private int price, stock;
    private String dishId, name;

    // Constructor
    public Dish(String dishId, String name, int price, int stock) {
        this.dishId = dishId;
        this.name = name;
        this.price = price;
        this.stock = stock;
    }

    public String getDishId()
    {
        return dishId;
    }

    public int getPrice()
    {
        return price;
    }

    public int getStock()
    {
        return stock;
    }

    public String getName()
    {
        return name;
    }

    // Method to decrease the stock quantity
    public boolean decreaseStock(int quantity) {
        if (quantity > this.stock) {
            System.out.println ("Not enough stock");
            return false;
        }

        this.stock -= quantity;
        return true;
    }
}
