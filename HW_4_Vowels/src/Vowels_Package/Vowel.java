package Vowels_Package;

import java.util.Scanner;

public class Vowel {

	public static void main(String[] args) {
		
		 System.out.println("Enter any Letter");
		 Scanner sc = new Scanner (System.in);
		 char y = sc.next().charAt(0);
		 
			 if (y=='a'||  y=='e'|| y=='i' || y=='o' || y=='u' 
					 || y=='A'|| y=='E' || y=='I' || y=='O' || y=='U')
			 {
				 System.out.println("It is a Vowel.");
			 }else{
				 System.out.println("It is a Consonant.");
			 	 }
         Vowel.main(null);
	}

}
