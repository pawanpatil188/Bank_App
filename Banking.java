//package com.bhumika.bankSystem ;
package com.pawan;
import java.util.*;
public class Banking {

	public static void main(String[] args) 
	{
		int a;
		char b;
		Scanner sc =new Scanner(System.in);
		System.out.println("--WELCOME TO BANK OF MAHARSHTRA--");
		AmountWithdraw obj=new AmountWithdraw();
		obj.addUser();
		obj.viewUser();
		  do
		  {  
		  System.out.println("\nEnter:\n 1. to deposite\n 2. to withdraw\n 3. to check balance\n 4. to exit\n");
		  a=sc.nextInt();
		
			switch(a)
			{
			case 1: obj.deposit();
			break;
			
			
			case 2:obj.withDraw();
			break;
			
			case 3:obj.checkBalance();
			break;
			
			case 4:System.out.println("Exited successfully");
			System.exit(0);
			break;
			
			default:System.out.println("Invalid choice");
			}
			
			System.out.println("Do you want to continue Y/N?");
			b=sc.next().charAt(0);
			
		  }while(b=='Y'||b=='y');
		  
		System.out.println("Exited succesfully");
	}

}
