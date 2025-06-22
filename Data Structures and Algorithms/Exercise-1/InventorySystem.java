import java.util.HashMap;
import java.util.Scanner;

class Product {
    int productId;
    String productName;
    int quantity;
    double price;

    public Product(int productId, String productName, int quantity, double price) {
        this.productId = productId;
        this.productName = productName;
        this.quantity = quantity;
        this.price = price;
    }

    public void display() {
        System.out.println("ID: " + productId + ", Name: " + productName +
                           ", Qty: " + quantity + ", Price: Rs" + price);
    }
}

public class InventorySystem {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<Integer, Product> inventory = new HashMap<>();

        while (true) {
            System.out.println("\n--- Inventory Menu ---");
            System.out.println("1. Add Product");
            System.out.println("2. Update Product");
            System.out.println("3. Delete Product");
            System.out.println("4. View All");
            System.out.println("5. Exit");
            System.out.print("Choose: ");
            int choice = sc.nextInt();

            if (choice == 1) {
                System.out.print("Enter ID: ");
                int id = sc.nextInt();
                sc.nextLine(); // clear input
                System.out.print("Enter Name: ");
                String name = sc.nextLine();
                System.out.print("Enter Quantity: ");
                int qty = sc.nextInt();
                System.out.print("Enter Price: ");
                double price = sc.nextDouble();

                inventory.put(id, new Product(id, name, qty, price));
                System.out.println("Product added.");

            } else if (choice == 2) {
                System.out.print("Enter ID to update: ");
                int id = sc.nextInt();
                if (inventory.containsKey(id)) {
                    sc.nextLine(); // clear input
                    System.out.print("New Name: ");
                    String name = sc.nextLine();
                    System.out.print("New Qty: ");
                    int qty = sc.nextInt();
                    System.out.print("New Price: ");
                    double price = sc.nextDouble();

                    inventory.put(id, new Product(id, name, qty, price));
                    System.out.println("Product updated.");
                } else {
                    System.out.println("Product not found.");
                }

            } else if (choice == 3) {
                System.out.print("Enter ID to delete: ");
                int id = sc.nextInt();
                if (inventory.remove(id) != null) {
                    System.out.println("Product deleted.");
                } else {
                    System.out.println("Product not found.");
                }

            } else if (choice == 4) {
                if (inventory.isEmpty()) {
                    System.out.println("No products.");
                } else {
                    for (Product p : inventory.values()) {
                        p.display();
                    }
                }

            } else if (choice == 5) {
                System.out.println("Goodbye!");
                break;

            } else {
                System.out.println("Invalid choice.");
            }
        }

        sc.close();
    }
}
