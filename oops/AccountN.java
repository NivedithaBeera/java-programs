
class InsufficientBalanceException extends Exception {
    private double balance;
    private double withdrawalAmount;


    public InsufficientBalanceException(double balance, double withdrawalAmount) {
        super("Insufficient Balance " + balance + " for withdrawal of " + withdrawalAmount);
        this.balance = balance;
        this.withdrawalAmount = withdrawalAmount;
    }


    public double getBalance() {
        return balance;
    }

    public double getWithdrawalAmount() {
        return withdrawalAmount;
    }
}

class Account {
    private double balance;

    
    public Account(double initialBalance) {
        if (initialBalance < 0) {
            throw new IllegalArgumentException("Initial balance cannot be negative.");
        }
        this.balance = initialBalance;
    }

    public void withdraw(double amount) throws InsufficientBalanceException {
        if (amount > balance) {
            throw new InsufficientBalanceException(balance, amount);
        }
        balance -= amount;
        System.out.println("Successfully withdrawn: $" + amount);
    }

    
    public double getBalance() {
        return balance;
    }

    public static void main(String[] args) {
        Account myAccount = new Account(100.0);

        try {
            System.out.println("Current balance: $" + myAccount.getBalance());
            myAccount.withdraw(150.0); 
        } catch (InsufficientBalanceException e) {
            System.out.println(e.getMessage()); 
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage()); 
        }
    }
}

