package com.burgerjoint.additions;

import com.burgerjoint.decoratorClasses.AdditionDecorator;

public abstract class Drinks extends AdditionDecorator {
    @Override
    public String description() {
        return null;
    }

    @Override
    public double cost() {
        return 0;
    }
}
