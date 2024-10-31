package org.Sahil;

import java.util.Scanner;

public class ProductInventory {
    public static void main(String[] args) {
        String[] products = {"Laptop", "Phone", "Tablet", "Headphones", "Camera"};
        double[] prices = {999.99, 499.99, 299.99, 149.99, 799.99};

        displayProducts(products, prices);
        searchProduct(products, prices);
    }

    public static void displayProducts(String[] products, double[] prices) {
        System.out.println("Products and Prices:");
        for (int i = 0; i < products.length; i++) {
            System.out.println(products[i] + ": $" + prices[i]);
        }
    }

    public static void searchProduct(String[] products, double[] prices) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter product name to search: ");
        String productName = scanner.nextLine();

        boolean found = false;
        for (int i = 0; i < products.length; i++) {
            if (products[i].equalsIgnoreCase(productName)) {
                System.out.println("Price of " + products[i] + ": $" + prices[i]);
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Product not found.");
        }
        scanner.close();
    }
}

