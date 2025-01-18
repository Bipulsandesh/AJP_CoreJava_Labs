public class Bank {
    private double amount;

    // Parameterized constructor to initialize amount with 10000
    public Bank(double amount) {
        this.amount = amount;
    }

    // Method to withdraw amount
    public void withdraw(double withdrawalAmount) {
        String message = (withdrawalAmount <= amount) ? "Withdrawal successful" : "Insufficient balance";
        if (withdrawalAmount <= amount) //ternary operatr
         {
            amount -= withdrawalAmount;
        }
        System.out.println(message);
    }

    // Method to deposit amount
    public void deposit(double depositAmount) {
        amount += depositAmount;
        System.out.println("Deposit successful");
    }

    // Method to display total balance
    public void displayBalance() {
        System.out.println("Total balance: " + amount);
    }

    public static void main(String[] args) {
        Bank bank = new Bank(10000);
        bank.withdraw(5000);
        bank.deposit(5000);
        bank.displayBalance();
    }
}

/*OUTPUT
 Withdrawal successful
Deposit successful
Total balance: 10000.0
 */