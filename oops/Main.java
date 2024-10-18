 class Product{
    protected String name;
    protected double basePrice;

    public Product(String name, double basePrice){
        this.name = name;
        this.basePrice = basePrice;
    }

    public void setPrice(double basePrice){
        this.basePrice = basePrice;
    }

    public double getBasePrice(){
        return basePrice;
    }

    public void print(){
        System.out.println("Product Name: " + name);
        System.out.println("Base price: " + basePrice);
    }
}

class ImportedProducts extends Product {
    private double importDuty;

    public ImportedProducts(String name, double basePrice, double importDuty) {
        super(name, basePrice);
        this.importDuty = importDuty;
    }

    public void setImportDuty(double importDuty){
        this.importDuty = importDuty;
    }

    
    public double getNetPrice(){
        return basePrice + (basePrice * importDuty / 100);
    }

    @Override
    public void print() {
        super.print();
        System.out.println("Import Dty: " + importDuty + "%");
        System.out.println("Net Price: " + getNetPrice());

    }
}

class DiscountedProducts extends Product{
    private double discountRate;

    public DiscountedProducts(String name, double basePrice, double discountRate){
        super(name, basePrice);
        this.discountRate = discountRate;
    }

    public void setDiscountRate(double discountRate) {
        this.discountRate = discountRate;
    }

    public double getNetPrice() {
        return basePrice - (basePrice * discountRate / 100);
    }

    @Override
    public void print(){
        super.print();
        System.out.println("Discount Rate: " + discountRate + "%");
        System.out.println("Net Price: " + getNetPrice());
    }

}

public class Main{
    public static void main(String[] args) {
        
        ImportedProducts importedProducts = new ImportedProducts("Laptop", 1000, 15);
        importedProducts.print();

        DiscountedProducts discountedProducts =  new DiscountedProducts("Phone", 800, 10);
        discountedProducts.print();

        Product product1 = importedProducts;
        Product product2 = discountedProducts;

        System.out.println("\nUpcasting Example:");
        product1.print();
        product2.print();

        System.out.println("\nDowncasting Example:");
        if (product1 instanceof ImportedProducts) {
            ImportedProducts impProduct = (ImportedProducts) product1;
            impProduct.setImportDuty(20);
            impProduct.print();
        }


        if (product2 instanceof DiscountedProducts) {
            DiscountedProducts discProduct = (DiscountedProducts) product2;
            discProduct.setDiscountRate(15);
            discProduct.print();
        }
    }
}
