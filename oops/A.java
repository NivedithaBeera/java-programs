class Product {
    private String prodId;
    private String prodName;
    private double price;
    private int quantityOnHand;

    public void init(String prodId, String prodName, double price) {
        this.prodId = prodId;
        this.prodName = prodName;
        this.price = price;
        this.quantityOnHand = 0; 
    }

    public double getNetPrice() {
        return price + (price * 0.12); 
    }

    public void purchase(int quantity) {
        if (quantity > 0) {
            quantityOnHand += quantity;
            System.out.println("Purchased " + quantity + " units of " + prodName + ".");
        } else {
            System.out.println("Invalid quantity for purchase.");
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
        System.out.println("Product ID: " + prodId);
        System.out.println("Product Name: " + prodName);
        System.out.println("Price: " + price);
        System.out.println("Quantity on Hand: " + quantityOnHand);
        System.out.println("Net Price (after tax): " + getNetPrice());
        System.out.println();
    }
}

public class A{
    public static void main(String[] args) {
        Product product1 = new Product();
        
        product1.init("P001", "Laptop", 1000.00);

        product1.displayProductDetails();

        product1.purchase(10);
    
        product1.displayProductDetails();

        product1.sell(3);
        
        product1.displayProductDetails();
        
        product1.sell(8);
    
        product1.displayProductDetails();
    }
}
