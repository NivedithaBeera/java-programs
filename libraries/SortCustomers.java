import java.io.*;
import java.util.*;
import java.util.regex.Pattern;

public class SortCustomers {
    public static void main(String[] args) {
        String filePath = "customers.txt"; 
        List<Customer> customers = new ArrayList<>();

        
        String regex = "^[A-Za-z ]+, \\d{10}$";

    
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                
                if (Pattern.matches(regex, line.trim())) {
                    String[] parts = line.split(", ");
                    String name = parts[0];
                    String mobileNo = parts[1];
                    customers.add(new Customer(name, mobileNo));
                } else {
                    System.out.println("Invalid entry: " + line);
                }
            }
        } catch (IOException e) {
            System.out.println("Error reading the file: " + e.getMessage());
        }

        
        Collections.sort(customers, Comparator.comparing(Customer::getName));

        
        System.out.println("Customers sorted by name:");
        for (Customer customer : customers) {
            System.out.println(customer);
        }
    }

    
    static class Customer {
        private final String name;
        private final String mobileNo;

        public Customer(String name, String mobileNo) {
            this.name = name;
            this.mobileNo = mobileNo;
        }

        public String getName() {
            return name;
        }

        public String getMobileNo() {
            return mobileNo;
        }

        @Override
        public String toString() {
            return name + ", " + mobileNo;
        }
    }
}

