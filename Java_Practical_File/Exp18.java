class Account {
    private String customerName;
    private String accountNumber;
    private String accountType;
    protected double balance;

    public Account(String customerName, String accountNumber, String accountType) {
        this.customerName = customerName;
        this.accountNumber = accountNumber;
        this.accountType = accountType;
        this.balance = 1000.0;
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println("Amount deposited successfully.");
    }

    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println("Amount withdrawn successfully.");
        } else {
            System.out.println("Insufficient balance.");
        }
    }

    public void updateBalance(double amount) {
        balance = amount;
    }

    public void displayBalance() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Customer Name: " + customerName);
        System.out.println("Account Type: " + accountType);
        System.out.println("Current Balance: " + balance);
    }
}

class CurrentAccount extends Account {
    public CurrentAccount(String customerName, String accountNumber) {
        super(customerName, accountNumber, "Current Account");
    }

    public void chequeFacility() {
        System.out.println("Cheque facility is available.");
    }

    public void imposeServiceCharge() {
        if (balance < 500) {
            double serviceCharge = 50.0;
            balance -= serviceCharge;
            System.out.println("Service charge imposed: " + serviceCharge);
            System.out.println("Updated balance: " + balance);
        }
    }
}

class SavingsAccount extends Account {
    public SavingsAccount(String customerName, String accountNumber) {
        super(customerName, accountNumber, "Savings Account");
    }

    public void computeInterest(double rate) {
        double interest = (balance * rate) / 100;
        balance += interest;
        System.out.println("Interest computed and deposited successfully.");
    }

    public void imposePenalty(double penalty) {
        if (balance < 1000) {
            balance -= penalty;
            System.out.println("Penalty imposed: " + penalty);
            System.out.println("Updated balance: " + balance);
        }
    }
}

class Exp18 {
    public static void main(String[] args) {
        // Creating a CurrentAccount object
        CurrentAccount currentAcc = new CurrentAccount("Divyajeet Singh", "529");
        currentAcc.deposit(4500);
        currentAcc.chequeFacility();
        currentAcc.displayBalance();
        currentAcc.withdraw(1500);
        currentAcc.imposeServiceCharge();

        // Creating a SavingsAccount object
        SavingsAccount savingsAcc = new SavingsAccount("Sahib Preet Singh", "007");
        savingsAcc.deposit(8000);
        savingsAcc.displayBalance();
        savingsAcc.computeInterest(8);
        savingsAcc.imposePenalty(500);
        System.out.println("Sahib Preet Singh 00713211621 AI_ML");
    }
}