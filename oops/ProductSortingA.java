import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Products {
    private String name;
    private double price;


    public Products(String name, double price) {
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
        return "Products{name='" + name + "', price=" + price + "}";
    }
}

class ProductNameComparator implements Comparator<Products> {
    @Override
    public int compare(Products p1, Products p2) {
        return p1.getName().compareToIgnoreCase(p2.getName());
    }
}


class ProductPriceComparator implements Comparator<Products> {
    @Override
    public int compare(Products p1, Products p2) {
        return Double.compare(p1.getPrice(), p2.getPrice());
    }
}

public class ProductSortingA {
    public static void main(String[] args) {
        
        List<Products> products = new ArrayList<>();
        products.add(new Products("Laptop", 800.00));
        products.add(new Products("Smartphone", 500.00));
        products.add(new Products("Tablet", 300.00));
        products.add(new Products("Monitor", 250.00));
        products.add(new Products("Printer", 150.00));

        System.out.println("Products before sorting:");
        for (Products product : products) {
            System.out.println(products);
        }

        Collections.sort(products, new ProductNameComparator());
        System.out.println("\nProducts sorted by name:");
        for (Products product : products) {
            System.out.println(products);
        }

        Collections.sort(products, new ProductPriceComparator());
        System.out.println("\nProducts sorted by price:");
        for (Products product : products) {
            System.out.println(products);
        }
    }
}
