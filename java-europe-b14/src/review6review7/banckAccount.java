package review6review7;

public class banckAccount {

	public static void main(String[] args) {
		//Create an acoount
				CheckingAccount clientOne = new CheckingAccount();
				//set data
				clientOne.accountNumber= 34128734915L;
				clientOne.accountHolder = "Amazon";
				clientOne.balance = 1000;
				
				clientOne.getAccountInfo();
				
				//Create another account and set data using method 
				CheckingAccount clientTwo = new CheckingAccount();
				clientTwo.setInfo(300.0, 34128734915L, "Mike Smith");
				clientTwo.getAccountInfo();
				
				//test deposit method
				clientOne.deposit(300);
				clientTwo.deposit(1000);
				
				//test withdraw method
				clientOne.withdraw(200);
				clientOne.getAccountInfo();
				
				//call purchase method
				CheckingAccount myAccount = new CheckingAccount();
				myAccount.setInfo(200, 22222214444L, "Ozzy");
				myAccount.purchase("Book", 95);
				System.out.println("Current balance:" + myAccount.balance);
				
				myAccount.purchase("Shoes", 120);
				myAccount.purchase("Computer", 500);
				
				myAccount.getAccountInfo();
	}

}
