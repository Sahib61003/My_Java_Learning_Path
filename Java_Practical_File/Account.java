class Account{
	static String name;
	static int accno;
	String type;
	float balance;
	final float minbalance=1000;

	Account(String a,int b, String c,float d){
		name=a;
		accno=b;
		type=c;
		balance=d;
	}
	void deposit(float k){
		balance+=k;
		System.out.println("balance after deposit is"+balance);
	}
	void withdraw(float g){
		if(balance-g>minbalance){
			balance-=g;
			System.out.println("withdraw amount is "+g);
			System.out.println("balance is"+balance);
		}
		else{
			System.out.println("balance is low");
		}
	}
	void update(float l){
		balance+=l;
	}
	
	void display(){
		System.out.println("balance is"+balance);
	}
	
	void interest(float rate){
		float inte=balance*rate/100;
		update(inte);
		System.out.println("balance after interest is"+balance);
	}
	void penalty(float pun){
		if(balance<minbalance){
			float p=balance*pun/100;
			System.out.println("penalty is"+p);
			update(-p);
		}
	}
}


class CurrentAccount extends Account {

    CurrentAccount(String customerName, int accountNumber, float balance) {
        super(name, accno, "Current Account", balance);
    }
    

    void displayAccountType() {
        System.out.println("Account Type: " + type);
    }
}

class SavingsAccount extends Account {
    
    SavingsAccount(String customerName, int accountNumber, float balance) {
        super(name, accno, "Savings Account", balance);
    }
    
    void displayAccountType() {
        System.out.println("Account Type: " + type);
    }
}

class RunAccount{
	public static void main(String args[]){
	
        CurrentAccount currentAccount = new CurrentAccount("Sahib",007, 12000);
        SavingsAccount savingsAccount = new SavingsAccount("Divyajeet", 529, 13000);
        
        currentAccount.deposit(2000);
        
        savingsAccount.withdraw(3000);
        
        currentAccount.update(1000);
        
        savingsAccount.display();
        
        currentAccount.interest((float) 2.55);
        
        savingsAccount.penalty((float)1.0);
        
        currentAccount.displayAccountType();
        
        savingsAccount.displayAccountType();
	System.out.println("Sahib Preet Singh 00713211621 AI_ML");
	}
}