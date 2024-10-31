package org.Sahil;

import java.util.Scanner;

public class GroceryStore {
    public static void main(String[] args) {
        String[] fruits = {"Apple", "Banana", "Grapes", "Orange", "Mango"};
        double[] pricesPerKg = {2.5, 1.2, 3.0, 2.0, 4.5};
        calculateTotal(fruits, pricesPerKg);
    }

    public static void calculateTotal(String[] fruits, double[] pricesPerKg) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter fruit name: ");
        String fruitName = scanner.nextLine();
        System.out.print("Enter quantity in kg: ");
        double quantity = scanner.nextDouble();

        boolean found = false;
        for (int i = 0; i < fruits.length; i++) {
            if (fruits[i].equalsIgnoreCase(fruitName)) {
                double totalPrice = quantity * pricesPerKg[i];
                System.out.println("Total price for " + quantity + " kg of " + fruits[i] + " is: $" + totalPrice);
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Fruit not available.");
        }
        scanner.close();
    }
}

