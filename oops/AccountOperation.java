
interface AccountOperation {
    void deposit(double amount);  
    double getBalance();         
}

class Account implements AccountOperation {
    private double balance;  

    public Account(double initialBalance) {
        this.balance = initialBalance;
    }


    @Override
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Successfully deposited: $" + amount);
        } else {
            System.out.println("Deposit amount must be positive.");
        }
    }

    
    @Override
    public double getBalance() {
        return balance;
    }

    public static void main(String[] args) {

        Account myAccount = new Account(1000.0);

    
        System.out.println("Initial balance: $" + myAccount.getBalance());


        myAccount.deposit(500.0);

        System.out.println("Updated balance: $" + myAccount.getBalance());
    }
}
