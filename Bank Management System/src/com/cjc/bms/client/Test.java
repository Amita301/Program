package com.cjc.bms.client;
import java.util.Scanner;
import com.cjc.bms.service.Rbi;
import com.cjc.bms.serviceImplements.Sbi;

public class Test 
{

	public static void main(String[] args) 
	{
		    Scanner sc=new Scanner(System.in); 
	         Rbi bank=new Sbi();
		     
            System.out.println("1. Create Account");
            System.out.println("2. Display All Details");
            System.out.println("3. Deposit Money");
            System.out.println("4. Withdrawal");
            System.out.println("5. Balance Check");
            System.out.println("6. Exit");
            System.out.println("Enter Your Choice");
            int choice =sc.nextInt();
            
        if(choice==1) {
        	bank.createAccount();
        }else if(choice==2) {
        	bank.displayAllDetails();
        }else if(choice==3) {
        	bank.depositeMoney();
        }else if(choice==4) {
        	bank.withdrawal();
        }else if(choice==5) {
        	bank.balanceCheck();
        }else if(choice==6) {
                 System.out.println("Please enter a valid choice.");
         }
	}
}
 
