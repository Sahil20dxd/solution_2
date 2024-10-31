package org.Sahil;

import java.util.Scanner;

public class FlightBooking {
    public static void main(String[] args) {
        String[] destinations = {"New York", "Los Angeles", "Paris", "Tokyo", "Sydney"};
        searchDestination(destinations);
        updateDestination(destinations);
    }

    public static void searchDestination(String[] destinations) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter destination to search: ");
        String destination = scanner.nextLine();

        boolean found = false;
        for (String dest : destinations) {
            if (dest.equalsIgnoreCase(destination)) {
                System.out.println("Destination available: " + destination);
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Destination not available.");
        }
    }

    public static void updateDestination(String[] destinations) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter current destination name to update: ");
        String oldDestination = scanner.nextLine();
        System.out.print("Enter new destination name: ");
        String newDestination = scanner.nextLine();

        boolean updated = false;
        for (int i = 0; i < destinations.length; i++) {
            if (destinations[i].equalsIgnoreCase(oldDestination)) {
                destinations[i] = newDestination;
                System.out.println("Destination updated.");
                updated = true;
                break;
            }
        }
        if (!updated) {
            System.out.println("Destination not found.");
        }
    }
}

