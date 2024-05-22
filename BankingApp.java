import java.util.Scanner;

public class BankingApp{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner se = new Scanner(System.in);
		
		BankAccount b = new BankAccount("mohan", "01");
		b.showMenu();

	} 

}

class BankAccount {
	int balance;
	int prevTra;
	String custrname;
	String custrid;
	
	BankAccount(String cname, String cid){
		custrname = cname;
		custrid = cid;
	}
	
	void deposit(int amount){
		if(amount !=0) {
			balance=balance+amount;
			prevTra=amount;
		}
		
	}
	
	void withdraw(int amount){
		if(amount !=0) {
			balance=balance-amount;
			prevTra= -amount;
		}
		
	}
	
	void getprevTra() {
		if (prevTra>0) {
			System.out.println("deposited: "+prevTra);
		} else if(prevTra<0) {
			System.out.println("withdraw: "+prevTra);
		}
		else {
			System.out.println("no trans");
		}
	}
	
	
	
	void showMenu(){
		char option='\0';
		Scanner se= new Scanner(System.in);
		
		
		System.out.println("welcome: "+custrname);
		System.out.println("Your id id: "+ custrid);
		
		System.out.println();
		
		System.out.println("A. Check Balance");
		System.out.println("B. Deposit");
		System.out.println("C. Withdraw");
		System.out.println("D. Previous Trans");
		System.out.println("E. Exit");
		
		
		do {
			System.out.println("enter the option");
			option = se.next().charAt(0);
			
			Character.toUpperCase(option);
			
			switch (option) {
			case 'A':
				System.out.println("=============");
				System.out.println("Balance is: " +balance);
				System.out.println();
				break;
				
			case 'B':
				System.out.println("=============");
				System.out.println("enter the amount to deposit");
				System.out.println("your balance: "+balance);
				int amount = se.nextInt();
				deposit(amount);
				System.out.println();
				break;
				
			case 'C':
				System.out.println("=============");
				System.out.println("enter the amount to withdraw");
				System.out.println("your balance: "+balance);
				int amount1 = se.nextInt();
				withdraw(amount1);
				System.out.println();
				break;
				
			case 'D':
				System.out.println("=============");
				getprevTra();
				System.out.println();
				break;
			
			case 'E':
				System.out.println("======");
				break;
			
			default:
				System.out.println("invalid option");
				break;
		}
		}while (option != 'E');
		
	}
}



