package Home.arrayList;

import java.util.ArrayList;
import java.util.List;

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

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}

public class ProductDao {
    private List<Product> products;

    public ProductDao() {
        products = new ArrayList<>();
        products.add(new Product("Laptop", 999.99));
        products.add(new Product("Phone", 699.99));
        products.add(new Product("Tablet", 299.99));
        products.add(new Product("Desktop", 1499.99));
    }

    public List<Product> getDiscountedProducts(double discountPercentage) {
        List<Product> discountedProducts = new ArrayList<>();

        for (Product product : products) {
            // Calculate the discounted price
            double discountedPrice = product.getPrice() * (1.0 - discountPercentage);

            // Create a new Product instance with the discounted price
            Product discountedProduct = new Product(product.getName(), discountedPrice);

            // Add the discounted product to the list
            discountedProducts.add(discountedProduct);
        }

        return discountedProducts;
    }

    public static void main(String[] args) {
        ProductDao dao = new ProductDao();
        List<Product> discountedProducts = dao.getDiscountedProducts(0.3); // 30% discount

        // Print the discounted products
        for (Product product : discountedProducts) {
            System.out.println(product);
        }
    }
}
