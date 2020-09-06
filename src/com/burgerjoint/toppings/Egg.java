package com.burgerjoint.toppings;

import com.burgerjoint.decoratorClasses.BurgerComponent;
import com.burgerjoint.decoratorClasses.ToppingsDecorator;

public class Egg extends ToppingsDecorator {
    public static double price = 2.50;
    public static String product = "fried egg";
    BurgerComponent burger;

    public Egg(BurgerComponent b) {
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