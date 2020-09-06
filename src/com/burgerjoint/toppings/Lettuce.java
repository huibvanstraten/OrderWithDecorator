package com.burgerjoint.toppings;

import com.burgerjoint.decoratorClasses.BurgerComponent;
import com.burgerjoint.decoratorClasses.ToppingsDecorator;

public class Lettuce extends ToppingsDecorator {
    public static double price = 0.50;
    public static String product = "lettuce";

    BurgerComponent burger;

    public Lettuce(BurgerComponent b) {
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
