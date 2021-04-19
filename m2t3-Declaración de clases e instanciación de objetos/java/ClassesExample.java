import java.util.ArrayList;

public class ClassesExample 
{
    public static void main (String[] args) {

        // Instance the Dish class to create three objects
        Dish lasagna = new Dish("D1", "Lasagna", 20000, 20);
        Dish burger = new Dish("D2", "Burger", 15000, 20);
        Dish salad = new Dish("D3", "Salad", 10000, 20);

        // Add dishes in a list called dishes
        Dish[] dishes = {
            lasagna, burger, salad
        };

        // Instance the Menu called menu
        Menu menu = new Menu("M1", dishes);

        // Instance the Customer to create two objects
        Customer alan = new Customer("C1", "Alan", "aturing@unal.edu.co", "5555555", 50000);
        Customer ada = new Customer("C2", "Ada", "alovelace@unal.edu.co", "3333333", 50000);

        // Call method Buy to simulate a purchase for each of our customers
        alan.buy(menu, salad, 3);
        ada.buy(menu, lasagna, 1);
    }
}

