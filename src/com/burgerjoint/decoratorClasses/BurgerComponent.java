package com.burgerjoint.decoratorClasses;

public abstract class BurgerComponent {
    int price;
    String product;

    public abstract String description();

    public abstract double cost();
}
