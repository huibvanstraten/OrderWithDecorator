package com.burgerjoint.additions;

import com.burgerjoint.decoratorClasses.BurgerComponent;

public class SparklingWater extends Drinks {
    public static double price = 3.00;
    public static String product = "sparkling water";
    BurgerComponent burger;

    public SparklingWater(BurgerComponent b) {
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