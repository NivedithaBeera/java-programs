import java.util.Scanner;

interface AccountOperationA {
    void deposit(double amount);  
    double getBalance();         
}

class Account implements AccountOperationA {
    private double balance;  

    
    public Account(double initialBalance) {
        if (initialBalance < 0) {
            throw new IllegalArgumentException("Initial balance cannot be negative.");
        }
        this.balance = initialBalance;
    }

    
    @Override
    public void deposit(double amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException("Deposit amount must be positive.");
        }
        balance += amount;
        System.out.println("Successfully deposited: $" + amount);
    }

    
    @Override
    public double getBalance() {
        return balance;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        try {
            
            System.out.print("Enter initial balance: ");
            double initialBalance = input.nextDouble();
            Account myAccount = new Account(initialBalance);

            
            System.out.println("Initial balance: $" + myAccount.getBalance());

        
            System.out.print("Enter amount to deposit: ");
            double depositAmount = input.nextDouble();
            myAccount.deposit(depositAmount);

            
            System.out.println("Updated balance: $" + myAccount.getBalance());
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("An unexpected error occurred: " + e.getMessage());
        } finally {
            input.close(); 
        }
    }
}
