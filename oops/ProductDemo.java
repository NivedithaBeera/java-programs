class ProductN {
    private String prodId;
    private String prodName;
    private double price;
    private int quantityOnHand;

    public ProductN(String proId, String prodName, double price, int quantityOnHands) {
        this.prodId = proId;
        this.prodName = prodName;
        this.price = price;
        this.quantityOnHand = quantityOnHands;
    }

    public ProductN(String prodId, String prodName, double price) {
        this(prodId, prodName, price, 0);
    }

    public double getNetPrice() {
        return price + (price * 0.12);
    }

    public void purchase(int quantity) {
        if (quantity > 0) {
            quantityOnHand += quantity;
            System.out.println("Purchased " + quantity + " units of " + prodName + ".");
        } else {
            System.out.println("Invalid quantity for purchase. ");
        }
    }

    public void sell(int quantity) {
        if (quantity > 0 && quantity <= quantityOnHand) {
            quantityOnHand -= quantity;
            System.out.println("Sold " + quantity + " units of " + prodName + ".");
        } else if (quantity > quantityOnHand) {
            System.out.println("Insufficient quantity to sell.");
        } else {
            System.out.println("Invalid quantity for sale.");
        }
    }

    public void displayProductDetails() {
        System.out.println("produt ID: " + prodId);
        System.out.println("product Name: " + prodName);
        System.out.println("price: " + price);
        System.out.println("Quantity on Hand: " + quantityOnHand);
        System.out.println("Net price (after tax): " + getNetPrice());
        System.out.println();
    }
}

public class ProductDemo {
    public static void main(String[] args) {
        ProductN product1 = new ProductN("p001", "Laptop", 1000.00, 10);
        product1.displayProductDetails();

        ProductN product2 = new ProductN("p002", "Smartphone", 500.00);
        product2.displayProductDetails();

        product2.purchase(5);
        product2.displayProductDetails();

        product2.sell(2);
        product2.displayProductDetails();

        product2.sell(10);
        product2.displayProductDetails();

    }
}