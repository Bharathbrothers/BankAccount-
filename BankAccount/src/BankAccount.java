
class BankAccount {

	
		String NameOfDepositer;
		long  AccountNumber;
		char TypeOfAccount;
		double BalanceAmount;
		double Deposit,Withdrawal;
			BankAccount(){
		
			NameOfDepositer="";
			AccountNumber=0000000000;
			TypeOfAccount= ' ';
			BalanceAmount=0;
		}
		public double toDeposit(double Deposit,double ActualAmount)
		{
			this.Deposit=Deposit;
			if(this.Deposit!=0)
			{	
				System.out.println("DEPOSIT IS DONE SUCCESFULLY\n ");
				System.out.println("THE UPDATED AMOUNT IS "+(this.Deposit+ActualAmount));
				return this.Deposit;
			
			}
			else
			{
				System.out.println("PLEASE ENTER PROPER AMOUNT\n ");
				return 0;
			}
		}
		
		public double toWithdrawal(double Withdrawal,double ActualAmount)
		{
			this.Withdrawal=Withdrawal;
			if(Withdrawal>ActualAmount)
			{
				System.out.println("ENTER AMOUNT LESS THAN YOUR BANKAMOUNT ");
				return 0;
			}
			else if(this.Withdrawal!=0)
			{	
				System.out.println("WITHDRAWAL IS DONE SUCCESFULLY\n ");
				BalanceAmount=ActualAmount-Withdrawal;
				System.out.println("THE UPDATED AMOUNT IS "+BalanceAmount);
				return this.Withdrawal;
			}
			else
			{
				System.out.println("PLEASE ENTER PROPER AMOUNT\n ");
				return 0;
			}
		}
		public void details(String NameofDepositer,long AccountNumber,double ActualAmount)
		{
			this.NameOfDepositer=NameofDepositer;
			this.AccountNumber=AccountNumber;
			System.out.println("YOUR DETAILS ARE \n");
			System.out.println("NAME IS : "+" "+this.NameOfDepositer);
			System.out.println("ACCOUNT NUMBER IS "+" "+this.AccountNumber );
			System.out.println("AMOUNT IN YOUR ACCOUNT IS "+" "+ActualAmount);
		}
}


