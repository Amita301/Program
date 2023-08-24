package even_positive;

import java.util.Scanner;



public class Number {

	public static void main(String[] args) {

		System.out.println("Enter amy number "
				+ " ");
		Scanner sc1 = new Scanner(System.in);
		int x =  sc1.nextInt();
		
	if (x >= 0) {
			System.out.println("Number is Positive");
		} if(x%2==0) {
	      System.out.println("Number is Even ");
		} else if (x%2!=0){
			System.out.println("Number is Odd ");
		}
	else
	{
		System.out.println("Number is Negative");
	}
		Number.main(null);
		
	}


	}

