package ie.atu.week2sem2;

import java.util.ArrayList;

public class JustApp {

    public static void main(String[] args) {
        ArrayList<MenuItem> items = new ArrayList<>();
        System.out.println("Welcome to Just App!");
        System.out.println("This is your order...");
        //Create an order
        Burger cheeseBurger = new Burger("Cheeseburger", 1.99, "Tasty");
        Burger veggie = new Burger("Veggie Burger", 2.99, "Very Tasty!");
        Pizza tuna = new Pizza("Tuna Pizza", 8.99, "Surprisingly nice");
        Fries curry = new Fries("Curry Fries", 2.99, "Again very nice");


        //List all of the food items like burgers, pizzas, fries, etc
        items.add(cheeseBurger);
        items.add(veggie);
        items.add(tuna);
        items.add(curry);

        //Display details to the user
        for(MenuItem item : items)
        {
            System.out.println(item.getName());
            System.out.println(item.getDescription());
            System.out.println(item.getPrice());
        }
    }
}