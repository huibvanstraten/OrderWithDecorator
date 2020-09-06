package com.burgerjoint.additions;

import com.burgerjoint.decoratorClasses.BurgerComponent;

public class Coke extends Drinks {
    public static double price = 3.50;
    public static String product = "coke";
    BurgerComponent burger;

    public Coke(BurgerComponent b) {
        this.burger = b;
    }

    @Override
    public String description() {
        return this.burger.description() + "\nand a " + product + "\n";
    }

    @Override
    public double cost() {
        return this.burger.cost() + price;
    }
}