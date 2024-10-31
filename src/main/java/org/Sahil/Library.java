package org.Sahil;

import java.util.Scanner;

public class Library {
    public static void main(String[] args) {
        String[] books = {"Book A", "Book B", "Book C", "Book D", "Book E", "Book F"};
        searchBook(books);
        updateBookTitle(books);
    }

    public static void searchBook(String[] books) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter book title to search: ");
        String title = scanner.nextLine();

        boolean found = false;
        for (String book : books) {
            if (book.equalsIgnoreCase(title)) {
                System.out.println("Book found: " + title);
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Book not found.");
        }
    }

    public static void updateBookTitle(String[] books) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter book title to update: ");
        String oldTitle = scanner.nextLine();
        System.out.print("Enter new title: ");
        String newTitle = scanner.nextLine();

        boolean updated = false;
        for (int i = 0; i < books.length; i++) {
            if (books[i].equalsIgnoreCase(oldTitle)) {
                books[i] = newTitle;
                updated = true;
                System.out.println("Book title updated.");
                break;
            }
        }
        if (!updated) {
            System.out.println("Book title not found.");
        }
    }
}

