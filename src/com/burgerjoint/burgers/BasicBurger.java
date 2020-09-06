package com.burgerjoint.burgers;

import com.burgerjoint.decoratorClasses.BurgerComponent;

public class BasicBurger extends BurgerComponent {
    public static double price = 6.50;
    public static String product = "Classic Burger";

    @Override
    public String description() {
        return product;
    }

    @Override
    public double cost() {
        return price;
    }
}

