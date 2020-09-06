package com.burgerjoint.toppings;

import com.burgerjoint.decoratorClasses.BurgerComponent;
import com.burgerjoint.decoratorClasses.ToppingsDecorator;

public class Kimchi extends ToppingsDecorator {
    public static double price = 1.75;
    public static String product = "kimchi";

    BurgerComponent burger;

    public Kimchi(BurgerComponent b) {
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