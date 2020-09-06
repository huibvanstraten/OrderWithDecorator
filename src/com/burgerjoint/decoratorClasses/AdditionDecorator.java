package com.burgerjoint.decoratorClasses;

public abstract class AdditionDecorator extends BurgerComponent  {
    int price;
    String product;

    public abstract String description ();

    public abstract double cost ();
}
