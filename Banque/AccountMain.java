package Banque;




public class AccountMain extends Account{
	
		
		int input;
		int Account;
			

		
		public int getInput() {
			return input;
		}

		public void setInput(int input) {
			this.input = input;
		}

		public int getAccount() {
			return Account;
		}

		public void setAccount(int account) {
			Account = account;
		}

		Account pel = new Account();
		
		public static int virement (int Account, int input){
			int result;
			result = Account - input;
			return result;
		}
		

	
		
		
		
	

	
		 
	
		 
		 
		

	}

}
