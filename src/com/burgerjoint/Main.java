package com.burgerjoint;

import com.burgerjoint.decoratorClasses.BurgerComponent;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int firstChoice = MenuScripts.burgerChoice(scanner);
        BurgerComponent burger = MenuScripts.chooseBurger(firstChoice);


        if (firstChoice == 1) {
            for (int i = 4; i > 0; i--) {
                int topping = MenuScripts.toppingsChoice(scanner, burger, i);
                burger = MenuScripts.chooseTopping(topping, burger);
            }
        } else if (firstChoice == 2) {
            for (int i = 6; i > 0; i--) {
                int topping = MenuScripts.toppingsChoice(scanner, burger, i);
                burger = MenuScripts.chooseTopping(topping, burger);
            }
        } else if (firstChoice == 3) {
            System.out.println("\nGood choice! This comes with fries and a drink of choice\n");
        }

        int drinks = MenuScripts.drinkChoice(burger, scanner);
        burger = MenuScripts.addition(drinks, burger);

        MenuScripts.roundUp(burger);
    }
}