package com.burgerjoint.burgers;

import com.burgerjoint.decoratorClasses.BurgerComponent;

public class DeluxeBurger extends BurgerComponent {
    public static double price = 5.50;
    public static String product = "Deluxe Burger";

    @Override
    public String description() {
        return product;
    }

    @Override
    public double cost() {
        return price;
    }
}