public class Customer 
{
    // Members declaration
    private int budget;
    private String customerId, name, email, phone;
    

    // Constructor
    public Customer(String customerId, String name, String email, String phone, int budget)
    {
        this.customerId = customerId;
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.budget = budget;
    }

    // Method to simulate a purchase
    public void buy(Menu menu, Dish dishSelected, int quantity) {
        if ((dishSelected.getPrice() * quantity) > this.budget){
            System.out.println ("Not enough budget");
            return;
        }


        for (Dish dish : menu.getDishes()) {
            if (dish.getDishId() == dishSelected.getDishId()) 
            {
                boolean success = dish.decreaseStock(quantity);
                if (!success) return;

                this.budget -= dish.getPrice() * quantity;
                System.out.println ("------------------------------");
                System.out.println ("Thanks for your purchase " + this.name);
                System.out.println ("Your new budget is: " + "$ " + this.budget);
                System.out.println (dish.getName() + " changes its stock to " + Integer.toString(dish.getStock()));
                return;
            }
        }
    }
}
