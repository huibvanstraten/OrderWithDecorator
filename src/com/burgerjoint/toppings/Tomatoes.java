package com.burgerjoint.toppings;

import com.burgerjoint.decoratorClasses.BurgerComponent;
import com.burgerjoint.decoratorClasses.ToppingsDecorator;

public class Tomatoes extends ToppingsDecorator {
    public static double price = 1.25;
    public static String product = "tomatoes";

    BurgerComponent burger;

    public Tomatoes(BurgerComponent b) {
        this.burger = b;
    }

    @Override
    public String description() {
        return this.burger.description() + "\n-" + product;
    }

    @Override
    public double cost() {
        return this.burger.cost() + price;
    }
}
