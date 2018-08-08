package Banque;

import java.util.Scanner;

public class Application {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		 Account pel = new Account();
		 pel.setPrenom1("Pierre");
		 pel.setSolde1(200);
		
		 
		 Account pel2 = new Account();
		 pel2.setPrénom2("Aurelia");
		 pel2.setSolde2(100);
		 
		 AccountPEL pelT1 = new AccountPEL();
		 pelT1.setTaux1(3);
		 
		 AccountPEL pelT2 = new AccountPEL();
		 pelT2.setTaux2(3);
		 
		 AccountMain virement1 = new AccountMain();
		 virement1.setInput(25);
		 
		 
		 
		 Scanner sc = new Scanner(System.in);
		 int input=sc.nextInt();
		 int virement;
		 
		 int result =  (pel.getSolde1 , input);
			System.out.println(result);			 
		 

	}

}
