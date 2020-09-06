package com.burgerjoint;

import com.burgerjoint.additions.Coke;
import com.burgerjoint.additions.Milkshake;
import com.burgerjoint.additions.SparklingWater;
import com.burgerjoint.burgers.BasicBurger;
import com.burgerjoint.burgers.DeluxeBurger;
import com.burgerjoint.burgers.HealthyBurger;
import com.burgerjoint.decoratorClasses.BurgerComponent;
import com.burgerjoint.toppings.*;

import java.util.Scanner;

public class MenuScripts {

    public static int burgerChoice(Scanner scanner) {
        System.out.println("\nWelcome to BurgerJoint\n");
        System.out.println("Which delicious burger would you like to have today?");
        System.out.println("1 - " + BasicBurger.product + ". The taste of America! With up to four toppings of your choice. For € " + BasicBurger.price);
        System.out.println("2 - " + HealthyBurger.product + ". Get fit! With up to 6 toppings. For € " + HealthyBurger.price);
        System.out.println("3 - " + DeluxeBurger.product + ". It's got everything you want. With fries and drink of choice. For € " + DeluxeBurger.price);
        int j;
        do {
            System.out.print("Type in the number of your choice and hit \"enter\" : ");
            j = scanner.nextInt();
        } while (j < 1 || j > 3);

        return j;
    }

    public static int toppingsChoice(Scanner scanner, BurgerComponent burger, int i) {
        System.out.println("\nYou chose a " + burger.description() + "\nTotal cost: € " + burger.cost());
        System.out.println("\nYou can choose " + i + " topping(s)");
        System.out.println("1 - " + Avocado.product + " € " + Avocado.price);
        System.out.println("2 - " + Bacon.product + " € " + Bacon.price);
        System.out.println("3 - " + Cheese.product + " € " + Cheese.price);
        System.out.println("4 - " + Egg.product + " € " + Egg.price);
        System.out.println("5 - " + Jalapenos.product + " € " + Jalapenos.price);
        System.out.println("6 - " + Kimchi.product + " € " + Kimchi.price);
        System.out.println("7 - " + Lettuce.product + " € " + Lettuce.price);
        System.out.println("8 - " + Pickles.product + " € " + Pickles.price);
        System.out.println("9 - " + Tomatoes.product + " € " + Tomatoes.price);
        int j;
        do {
            System.out.print("Type in the number of your choice and hit \"enter\" : ");
            j = scanner.nextInt();
        } while (j < 1 || j > 9);

        return j;
    }

    public static int drinkChoice(BurgerComponent burger, Scanner scanner) {
        System.out.println("\nYou chose a " + burger.description() + "\nTotal cost: € " + burger.cost());
        System.out.println("\nWould you like a drink with that?");
        System.out.println("1 - " + Coke.product + " € " + Coke.price);
            System.out.println("2 - " + Milkshake.product + " € " + Milkshake.price);
        System.out.println("3 - " + SparklingWater.product + " € " + SparklingWater.price);
        int j;
        do {
            System.out.print("Type in the number of your choice and hit \"enter\" : ");
            j = scanner.nextInt();
        } while (j < 1 || j > 3);

        return j;
    }

    public static void roundUp(BurgerComponent burger) {
        System.out.println("\nYou chose a " + burger.description());
        System.out.println("That will be € " + burger.cost());
        System.out.println("Thank you and until next time!");
    }

    public static BurgerComponent chooseBurger(int burgerChoice) {
        return switch (burgerChoice) {
            case 1 -> new BasicBurger();
            case 2 -> new HealthyBurger();
            case 3 -> new DeluxeBurger();
            default -> null;
        };
    }

    public static BurgerComponent chooseTopping(int topping, BurgerComponent burger) {
        return switch (topping) {
            case 1 -> new Avocado(burger);
            case 2 -> new Bacon(burger);
            case 3 -> new Cheese(burger);
            case 4 -> new Egg(burger);
            case 5 -> new Jalapenos(burger);
            case 6 -> new Kimchi(burger);
            case 7 -> new Lettuce(burger);
            case 8-> new Pickles(burger);
            case 9 -> new Tomatoes(burger);
            default -> null;
        };
    }

    public static BurgerComponent addition(int drinks, BurgerComponent burger) {
        return switch (drinks) {
            case 1 -> new Coke(burger);
            case 2 -> new Milkshake(burger);
            case 3 -> new SparklingWater(burger);
            default -> null;
        };
    }
}

