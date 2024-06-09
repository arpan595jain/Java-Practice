// Write a program to simulate a bar code reader in a grocery store.  You will use two files: 
// • The first file "Food.txt", contains several lines, each of which contains the name of a food item 
// (String), its bar code (int), its price (double), and a string (either "T" or "F") indicating whether or not 
// the item is taxable (boolean).  The tax rate should be set to 8% at this time (use a constant).   Notice that 
// this file is sorted alphabetically by the name of each product. 
// • A second file contains integers, "Order.txt".  Each of these integers represents a bar code for some item 
// sold in the store.  The bar codes are separated by a code of zero which is the end of one customer.  Read 
// each int of this file using the nextInt method the Scanner class (or use EasyReader). 
package Casestudy;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

class Food {
    private String name;
    private int barcode;
    private double price;
    private boolean taxable;

    public Food(String name, int barcode, double price, boolean taxable) {
        this.name = name;
        this.barcode = barcode;
        this.price = price;
        this.taxable = taxable;
    }

    public String getName() {
        return name;
    }

    public int getBarcode() {
        return barcode;
    }

    public double getPrice() {
        return price;
    }

    public boolean isTaxable() {
        return taxable;
    }
}

public class BarCodeReader {
    private static final double TAX_RATE = 0.08;
    private ArrayList<Food> foods;

    public BarCodeReader() {
        foods = new ArrayList<>();
    }

    public void loadFoods(String filename) {
        try {
            Scanner scanner = new Scanner(new File(filename));
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] parts = line.split("\\*");
                String name = parts[0];
                int barcode = Integer.parseInt(parts[1]);
                double price = Double.parseDouble(parts[2]);
                boolean taxable = parts[3].equals("T");
                foods.add(new Food(name, barcode, price, taxable));
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("Food file not found.");
        }
    }

    public void processOrders(String filename) {
        try {
            Scanner scanner = new Scanner(new File(filename));
            while (scanner.hasNextInt()) {
                int barcode = scanner.nextInt();
                if (barcode == 0) {
                    System.out.println("End of customer order.");
                    continue;
                }
                boolean found = false;
                for (Food food : foods) {
                    if (food.getBarcode() == barcode) {
                        found = true;
                        System.out.println("Item: " + food.getName());
                        System.out.println("Price: $" + food.getPrice());
                        if (food.isTaxable()) {
                            double tax = food.getPrice() * TAX_RATE;
                            System.out.println("Tax: $" + tax);
                        }
                        break;
                    }
                }
                if (!found) {
                    System.out.println("No such product.");
                }
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("Order file not found.");
        }
    }

    public static void main(String[] args) {
    	Scanner scanner = new Scanner(System.in);

        // Ask the user for the filenames
        System.out.print("Enter the filename for food items (e.g., Food.txt): ");
        String foodFilename = scanner.nextLine();

        System.out.print("Enter the filename for orders (e.g., Order.txt): ");
        String orderFilename = scanner.nextLine();

        // Close scanner
        scanner.close();

        // Create BarCodeReader object and process files
        BarCodeReader reader = new BarCodeReader();
        reader.loadFoods(foodFilename);
        reader.processOrders(orderFilename);
    }
}

