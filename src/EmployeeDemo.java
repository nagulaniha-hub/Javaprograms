class Account
{
	int accountNo;
	String accountType;
	int accountBalance;
	
	void AccountDetails(int accountNo,String accountType,int accountBalance)
	{
		this.accountNo=accountNo;
		this.accountType=accountType;
		this.accountBalance=accountBalance;
	}
	void withdraw(int amount)
	{
		if(accountBalance>amount)
		this.accountBalance-=amount;
		else
			System.out.println("Insufficient Balance!!");
	}
	void deposit(int amount)
	{
		this.accountBalance+=amount;
	}
	void disAccountDetails()
	{
		System.out.println("Account No: "+accountNo+" Type: "+accountType+" Balance: "+accountBalance);
	}
	public void display() {
		// TODO Auto-generated method stub
		
	}
	
}
public class EmployeeDemo {

	public static void main(String[] args) 
	{
		Account a1=new Account();
		a1.AccountDetails(123456, "SB", 10000);
		a1.disAccountDetails();
		a1.deposit(10000);
		a1.disAccountDetails();
		a1.withdraw(1500);
		a1.disAccountDetails();
		
		

	}

}

}
