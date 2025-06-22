import java.util.Scanner;
import java.util.Arrays;

class Product {
    int productId;
    String productName;
    String category;

    public Product(int productId, String productName, String category) {
        this.productId = productId;
        this.productName = productName;
        this.category = category;
    }

    public void showDetails() {
        System.out.println("ID: " + productId);
        System.out.println("Name: " + productName);
        System.out.println("Category: " + category);
    }
}

public class ECommerceSearch {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Product[] products = {
            new Product(1, "Laptop", "Electronics"),
            new Product(2, "Shirt", "Clothing"),
            new Product(3, "Smartphone", "Electronics"),
            new Product(4, "Book", "Books")
        };

        System.out.print("Enter product name to search: ");
        String name = sc.nextLine();

        // Linear Search
        int foundIndex = -1;
        for (int i = 0; i < products.length; i++) {
            if (products[i].productName.equalsIgnoreCase(name)) {
                foundIndex = i;
                break;
            }
        }

        if (foundIndex != -1) {
            System.out.println("\nProduct Found (Linear Search):");
            products[foundIndex].showDetails();
        } else {
            System.out.println("\nProduct not found.");
        }

        Arrays.sort(products, (a, b) -> a.productName.compareToIgnoreCase(b.productName));
        int low = 0, high = products.length - 1, binaryIndex = -1;
        while (low <= high) {
            int mid = (low + high) / 2;
            int cmp = products[mid].productName.compareToIgnoreCase(name);
            if (cmp == 0) {
                binaryIndex = mid;
                break;
            } else if (cmp < 0) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        if (binaryIndex != -1) {
            System.out.println("\nProduct Found (Binary Search):");
            products[binaryIndex].showDetails();
        } else {
            System.out.println("\nProduct not found in Binary Search.");
        }

        sc.close();
    }
}
