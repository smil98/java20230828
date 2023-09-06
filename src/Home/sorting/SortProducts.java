package Home.sorting;

import java.util.*;

class Product {
    private String name;
    private double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}

public class SortProducts {
    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();
        products.add(new Product("Laptop", 999.99));
        products.add(new Product("Phone", 699.99));
        products.add(new Product("Tablet", 299.99));
        products.add(new Product("Desktop", 1499.99));

        // Write code here to sort the 'products' list based on their prices in descending order using a custom comparator.
        Collections.sort(products, (x,y) -> Double.compare(y.getPrice(), x.getPrice()));
        // Print the sorted list of products.
        System.out.println(products);
    }
}
