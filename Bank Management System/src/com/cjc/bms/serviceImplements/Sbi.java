package com.cjc.bms.serviceImplements;

import com.cjc.bms.service.Rbi;
import com.cjc.bms.client.Test;
import com.cjc.bms.model.Account;

import java.util.Scanner;

public class Sbi implements Rbi {
    Scanner sc = new Scanner(System.in);
    Account account = new Account(); 
    public void createAccount() {
        System.out.println("Create Account");

       
        System.out.print("Enter Account Number: ");
        account.setAccNo(sc.nextInt());

        System.out.print("Enter Name: ");
        account.setName(sc.next());

        System.out.print("Enter Mobile Number: ");
        account.setMobNo(sc.nextLong());

        System.out.print("Enter Adhar Number: ");
        account.setAdharNo(sc.nextLong());

        System.out.print("Enter Gender: ");
        account.setGender(sc.next());

        System.out.print("Enter Age: ");
        account.setAge(sc.nextInt());

        System.out.print("Enter Initial Balance: ");
        account.setBalance(sc.nextDouble());
    }

    public void displayAllDetails() {
        System.out.println("Account Number: " + account.getAccNo());
        System.out.println("Name: " + account.getName());
        System.out.println("Mobile Number: " + account.getMobNo());
        System.out.println("Adhar Number: " + account.getAdharNo());
        System.out.println("Gender: " + account.getGender());
        System.out.println("Age: " + account.getAge());
        System.out.println("Balance: " + account.getBalance());
    }

    public void depositeMoney() {
        System.out.println("Deposite Money");

        System.out.print("Enter the amount to deposite: ");
        double amount = sc.nextDouble();

      
        account.setBalance(account.getBalance() + amount);
        System.out.println("Amount deposited successfully.");
        int a=sc.nextInt();
        Test.main(null);
    }

    public void withdrawal() {
        System.out.println("Withdrawal");

        System.out.print("Enter the amount to withdraw: ");
        double amount = sc.nextDouble();

       
            account.setBalance(account.getBalance() - amount);
            System.out.println("Amount withdrawn successfully.");
            int a=sc.nextInt();
            Test.main(null);
        }
    

    public void balanceCheck() {
        System.out.println("Account Balance: " + account.getBalance());
        int a=sc.nextInt();
        Test.main(null);
    }
    
}
