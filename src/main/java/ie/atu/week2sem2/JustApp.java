package ie.atu.week2sem2;

import java.util.ArrayList;

public class JustApp {

    public static void main(String[] args) {
        ArrayList<MenuItem> items = new ArrayList<>();
        System.out.println("Welcome to Just App!");
        System.out.println("This is your order...");
        // Create an order
        Burger cheeseBurger = new Burger("Cheeseburger", 1.99, "Tasty");
        Burger veggie = new Burger("Veggie Burger", 2.99, "Delicious!");
        Pizza tuna = new Pizza("Tuna Pizza", 8.99, "Surprisingly nice");
        Fries curry = new Fries("Curry Fries", 2.99, "Lovely");
        Dessert applePie = new Dessert("Apple Pie", 4.99, "So sweet!");


        // List all of the food items like burgers, pizzas, fries, etc
        items.add(cheeseBurger);
        items.add(veggie);
        items.add(tuna);
        items.add(curry);
        items.add(applePie);

        // Display details to the user
        double totalCost = 0;
        for(MenuItem item : items)
        {
            System.out.println(item.getName());
            System.out.println(item.getDescription());
            System.out.println(item.getPrice());
            // Calculate and display the total cost of the order
            totalCost += item.getPrice();
        }
        System.out.println("Total Cost: €" + totalCost);
    }
}