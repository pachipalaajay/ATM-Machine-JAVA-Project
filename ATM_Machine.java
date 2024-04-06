package project_1;
import java.time.LocalDate;
import java.util.Scanner;
public class ATM_Machine 
{	
	public static void main(String[] args) 
	{
		int n,amount,choice;
		int total,n1,n2,n3;
		final int acc=123;
		int balance=4000,bal=0;
		String name1="PACHIPALA AJAY KUMAR";
		Scanner sc=new Scanner(System.in);
	
			System.out.println("Please Select the transaction by pressing the key ");
			System.out.println("Press 1 for DEPOSTE\n\n");
			System.out.println("Press 2 for Withdraw\n\n");
			System.out.println("Press 3  for Balance Enquiry\n");
			
			choice = sc.nextInt();
			switch (choice)
				{
					case 1:{	
								System.out.println("Quick cash Deposit\n\n Please enter the Account number in which you want to Deposite cash\n Account number:");
								try
								{
								int acc1=sc.nextInt();
								
								if(acc==acc1)
								{
									System.out.println("correct press------>1\t   Incorrect press------2\t");
									n=sc.nextInt();
									if(n==1)
									{
										System.out.println("Please wait.....\n While your Transaction is being Processed\n");
										try
										{
											Thread.sleep(5000);  
										}
										catch (InterruptedException e)
										{
											
										}
										do
										{
											System.out.println("Account number:\t\t 123");
											
											System.out.println("Account name:\t\t Pachipala Ajay Kumar");
											System.out.println(" ok press------>1\t\t cancle press------->2\n");
											n=sc.nextInt();
											if(n==1)
											{
											do
											{
												System.out.println("\t\tINSERT CASH\n Please place cash Here for Counting\n\n only denominations of 100,500,2000\t CAN BE SUBMITTED FOR COUNTING\n");
												System.out.println("Enter the number of 100 Rs \n");
												n1=sc.nextInt();
												System.out.println("Enter the number of  500 Rs\n");
												n2=sc.nextInt();
												System.out.println("Enter the number of 2000 Rs\n");
												n3=sc.nextInt();
												System.out.println(" 100------->"+n1+"\n 500------->"+n2+"\n 2000------->"+n3+"\n");
												System.out.println("countine press----->1\t\tcancle press----->2");
												n=sc.nextInt();
												if(n==1)
												{
													System.out.println("Your money is Beging IDENTIFIED\n\n");
													total=(100 *n1)+(500 *n2)+(2000 * n3);
													System.out.println("Total amount you Deposit is=========>"+total+"\n\n");
													System.out.println(" confirm press ------->1\n cancle press ------->2\n ");
													n=sc.nextInt();
													if(n==1)
													{
														System.out.println("Please wait  a sec\n");
														try
														{
															Thread.sleep(5000);  
														}
														catch (InterruptedException e)
														{
															//System.out.println("Please wait123.....\n");
														}
														System.out.println("Your Transaction is completed\n\nThank you\n");
														bal=balance+total;
														System.out.println("Balance:\t"+bal);
													}
													else
														{
															System.out.println("you cancled the amount\n");
														}
												}
												else
												{
													System.out.println("you Money insered is cancled\n");
													System.out.println("Do you want to contine press------>1\t Stop press------>2\n");
													n=sc.nextInt();
												}
											}while(n==2);
											System.out.println("please take your card");
											break;
											}
											else
											{
												System.out.println("Account details is not matched\n");
												System.out.println("Do you want Enter Account details again press------>1\t Stop press------>2\n");
												n=sc.nextInt();
											}
										}while(n==1);
									}
									else
									System.out.println("invalid Acc no");
								}
								
								else
								{
									System.out.println("Invalid account number");
								}
								}
								catch(Exception e)
								{
									System.out.println("please enter valid  number");
								}
								
								
							}
	
							break;
							case 2: {
								
										    System.out.println("\t WITHDRAWAL\t\n FROM SAVINGS \n ");
										
											System.out.println("Please Enter Amount in Rupees\n");
											amount=sc.nextInt();
											System.out.println("Amount is in Rupess:"+amount);
											System.out.println("Correct press------>1\n Incorrect press------>2\n");
											n=sc.nextInt();
											if(amount<=balance)
											{
												if(n==1)
											{
													System.out.println("Please enter your pin number:");
													int password=1234;
													int pass=sc.nextInt();
													if(pass==password)
													{
														System.out.println("please wait\n your Transaction is Being processed\n");
														try
														{
															Thread.sleep(4000);
														}
														catch (InterruptedException e)
														{
													
														}
														System.out.println("Take your money\n");
														 bal=balance-amount;
														java.util.Date date =new java.util.Date();
//														System.out.println("\t\tRECEPT\t\t"+ DATE:05-06-2023\name:"+name1+ "\nWithdrawal Amount:"+amount+ "\nBalance:"+bal); 
														System.out.println("\t\tRECEPT\t\t\n\nDate:\t"+date+"\nName:\t\t"+name1+" \nWithdrawal Amount:\t"+amount+ "\nBalance:\t\t"+bal); 
													
														
													}
											}
											else
												System.out.println("You Cancle it\t please take your card\n");
											}
											else
											{
												System.out.println("Insuffient balance\n");
											} 
									
	
							}
							break;
							case 3: {
											System.out.println("please enter account Number");
											int acc1=sc.nextInt();
											if(acc==acc1)
											{
												System.out.println();
												System.out.println("please wait a sec....\n");
												try
												{
													Thread.sleep(400);
												}
												catch (InterruptedException e)
												{
													
												}
												
												System.out.println(" Account Balance:\t"+ balance);
												System.out.println("Thank You ");
											}
											else
												System.out.println("you entered wrong accound number");
								    }
							break;
				}
			}

}

