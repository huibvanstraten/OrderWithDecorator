package com.burgerjoint.toppings;

import com.burgerjoint.decoratorClasses.BurgerComponent;
import com.burgerjoint.decoratorClasses.ToppingsDecorator;

public class Jalapenos extends ToppingsDecorator {
    public static double price = 1.50;
    public static String product = "jalapenos";
    BurgerComponent burger;

    public Jalapenos(BurgerComponent b) {
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