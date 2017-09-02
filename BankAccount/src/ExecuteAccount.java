import java.util.Scanner;
import java.util.Random;
public class ExecuteAccount {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		BankAccount BA = new BankAccount();
		
		System.out.println("ENTER THE NAME OF DEPOSITER:");
		String NameOfDepoister = s.nextLine();
		if(NameOfDepoister.equals(null))
		{
			System.out.println("ENTER YOUR NAME PORPERLY.\n");	
		}
		else{
			System.out.println("ENTER YOUR ACCOUNT NUMBER.");
			int AccountNumber = s.nextInt();
			if(AccountNumber==00000000000)
			{
				System.out.println("ENTER YOUR ACCOUNT NUMBER  properly\n.");
			}
			else{
					System.out.println("SELECT YOUR ACCOUNT TYPE\n");
					System.out.println("1.SAVINGS\n");
					System.out.println("2.CURRENT\n");
					int type = s.nextInt();
					switch(type)
					{
					case 1:			System.out.println("1.TO DEPOSIT \n");
									System.out.println("2.WITHDRAWAL\n");
									System.out.println("3.DISPLAY DETAILS\n");
									int save= s.nextInt();
									switch(save)
									{	
									case 1:
											System.out.println("ENTER THE AMOUNT TO DEPOSIT\n");
											double Deposit=s.nextDouble();
											double Minimum=10000;
											Random r = new Random();
											double ActualAmount=Minimum+r.nextInt(100000);
											System.out.println("Your Total Amount is "+" "+ActualAmount);
											double Successful1=BA.toDeposit(Deposit,ActualAmount);
											System.out.println("THE AMOUNT YOU HAVE SUCCESFULLY DEPOSITED IS" +"  "+Successful1);
											break;
									case 2:	System.out.println("ENTER THE AMOUNT TO  WITHDRAWAL\n");
											double Withdrawal=s.nextLong();
											double Minimum1=10000;
											Random r1 = new Random();
											double ActualAmount1=Minimum1 +r1.nextInt(100000);
											System.out.println("Your Total Amount is "+" "+ActualAmount1);
											double Successful2=BA.toWithdrawal(Withdrawal,ActualAmount1);
											System.out.println("THE AMOUNT YOU HAVE SUCCESFULLY WITHDRAWAL IS" +"  "+Successful2);
											break;
									case 3:	double Minimum2=10000;
											Random r2 = new Random();
											double ActualAmount2=Minimum2 +r2.nextInt(100000);
											BA.details(NameOfDepoister,AccountNumber,ActualAmount2);
										
											break;		
									}
											break;
					case 2: 		System.out.println("1.TO DEPOSIT \n");
									System.out.println("2.WITHDRAWAL\n");
									System.out.println("3.DISPLAY DETAILS\n");
									int current= s.nextInt();
									switch(current)
									{	
									case 1:
											System.out.println("ENTER THE AMOUNT TO DEPOSIT\n");
											double Deposit=s.nextDouble();
											double Minimum=10000;
											Random r = new Random();
											double ActualAmount=Minimum +r.nextInt(100000);
											System.out.println("Your Total Amount is "+" "+ActualAmount);
											double Successful1=BA.toDeposit(Deposit,ActualAmount);
											System.out.println("THE AMOUNT YOU HAVE SUCCESFULLY DEPOSITED IS" +"  "+Successful1);
											break;
									case 2:	System.out.println("ENTER THE AMOUNT TO  WITHDRAWAL\n");
											double Withdrawal=s.nextLong();
											double Minimum1=10000;
											Random r1 = new Random();
											double ActualAmount1=Minimum1 +r1.nextInt(100000);
											System.out.println("Your Total Amount is "+" "+ActualAmount1);
											double Successful2=BA.toWithdrawal(Withdrawal,ActualAmount1);
											System.out.println("THE AMOUNT YOU HAVE SUCCESFULLY WITHDRAWAL IS" +"  "+Successful2);
											break;
									case 3:	double Minimum2=10000;
											Random r2 = new Random();
											double ActualAmount2=Minimum2+r2.nextInt(100000);
											BA.details(NameOfDepoister,AccountNumber,ActualAmount2);
											break;		
									}
									break;
					default:
									System.out.println("ENTER PROPER OPTION\n");
					}
					

			}
			
			
			
		}
	}

}
