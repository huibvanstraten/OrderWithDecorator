package com.burgerjoint.additions;

import com.burgerjoint.decoratorClasses.BurgerComponent;

public class Milkshake extends Drinks {
    public static double price = 5.50;
    public static String product = "milkshake";

    BurgerComponent burger;

    public Milkshake(BurgerComponent b) {
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