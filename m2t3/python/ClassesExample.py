class Customer():

    def __init__(self, customerId, name, email, phone, budget): 
        self.customerId = customerId 
        self.name = name
        self.email = email
        self.phone = phone
        self.budget = budget

    def buy(self, menu, dishSelected, quantity):
        if (dishSelected.price * quantity) > self.budget:
            print("Not enough budget")
            return

        for dish in menu.dishes:
            if dish.dishId == dishSelected.dishId:
                success = dish.decreaseStock(quantity)
                if not success:
                    return

                self.budget -= dish.price * quantity
                print ("------------------------------")
                print ("Thanks for your purchase", self.name)
                print ("Your new budget is:", "$", self.budget)
                print (dish.name, "changes its stock to", dish.stock)
                return


class Dish():

    def __init__(self, dishId, name, price, stock): 
        self.dishId = dishId 
        self.name = name
        self.price = price
        self.stock = stock

    def decreaseStock(self, quantity):
        if quantity > self.stock:
            print("Not enough stock")
            return False

        self.stock -= quantity
        return True

class Menu():

    def __init__(self, menuId, dishes): 
        self.menuId = menuId 
        self.dishes = dishes

def main():
    dishes = []

    # Instance the Dish class to create three objects
    lasagna = Dish(1, "Lasagna", 20000, 20)
    burger = Dish(2, "Burger", 15000, 20)
    salad = Dish(3, "Salad", 10000, 20)

    # Add dishes in a list called dishes
    dishes.append(lasagna)
    dishes.append(burger)
    dishes.append(salad)

    # Instance the Menu called menu
    menu = Menu("M1", dishes)

    # Instance the Customer to create two objects
    alan = Customer(1, "Alan", "aturing@unal.edu.co", "5555555", 50000)
    ada = Customer(2, "Ada", "alovelace@unal.edu.co", "3333333", 50000)

    alan.buy(menu, burger, 2)
    ada.buy(menu, lasagna, 1)


if __name__ == "__main__":
    main()
