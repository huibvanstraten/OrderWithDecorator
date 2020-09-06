package com.burgerjoint.burgers;

import com.burgerjoint.decoratorClasses.BurgerComponent;

public class HealthyBurger extends BurgerComponent {
    public static double price = 5.50;
    public static String product = "Healthy Burger";

    @Override
    public String description() {
        return product;
    }

    @Override
    public double cost() {
        return price;
    }
}
