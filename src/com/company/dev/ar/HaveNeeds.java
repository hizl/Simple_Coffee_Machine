package com.company.dev.ar;

import java.util.Scanner;

public class HaveNeeds {

    public static class CoffeeMachine {
        public static void main(String[] args) {
            System.out.println("Starting to make a coffee\n" +
                    "Grinding coffee beans\n" +
                    "Boiling water\n" +
                    "Mixing boiled water with crushed coffee beans\n" +
                    "Pouring coffee into the cup\n" +
                    "Pouring some milk into the cup\n" +
                    "Coffee is ready!");


            System.out.println("Write how many cups of coffee you will need: ");
            int input = new Scanner(System.in).nextInt();
            System.out.println("For " + input + " cups of coffee you will need: ");

            int water = 200 * input;
            System.out.println(water + " ml of water");

            int milk = 50 * input;
            System.out.println(milk + " ml of milk");

            int coffee = 15 * input;
            System.out.println(coffee + " g of coffee beans");

        }
    }
}