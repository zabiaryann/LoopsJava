package defaultPackage;

import java.util.Scanner;

//import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		/*try (// TODO Auto-generated method stub
		 * 
		 */
		//Scanner scan = new Scanner(System.in);
				//**************************
				//Write a program to print numbers from 1 to 10.
				/*for(int i = 0; i<=10; i++) {
					//System.out.println(i);
					System.out.print(", "+i);
				}*///******************************
				//only even numbers
				/*for(int i=0; i<=15; i+=2) {
					System.out.print(" "+i);
				}*/
				/*********************************/
				//Write a program to calculate the sum of first 10 natural number.
				/*int sum = 0;
				for(int i=0; i<=5; i++) {
					sum+=i;
				}
				System.out.println("Sum is "+sum);*/
				//***********************************************
				//Write a program that prompts the user to input a positive integer. 
				//It should then print
				//the multiplication table of that number.
				/*Scanner scan = new Scanner(System.in);
				
				System.out.println("Input a positive integer:");
				int input = scan.nextInt();
				for(int i=0; i<=input; i++) {
					System.out.println(i+" mult "+i+" is "+ i*i);
				}*/
				//*********************************************************
				//Write a program to find the factorial value of any number entered through the keyboard. 
				/*int factorial = 1;
				Scanner scan = new Scanner(System.in);
				
				System.out.println("Enter a positive integer:");
				int userInput = scan.nextInt();
				
				for(int i=1; i<= userInput; i++) {
					factorial *= i;
				}
				System.out.println(factorial);*/
				//*******************************************************
				//Two numbers are entered through the keyboard. Write a program to find
				//the value of one number raised to the power of another. 
				//(Do not use Java built-in method)
			/*Scanner scan = new Scanner(System.in)) {
			int base;
	        int power;
	        int result = 1;
	        
	        System.out.print("Enter the base number ");
	        base = scan.nextInt();
	        
	        System.out.print("Enter the power ");
	        power = scan.nextInt();

	        for(int i = 1; i <= power; i++)
	        {
		    result *= base;
	        }

	        System.out.println("Result: "+ result);
		}*/
		//Write a program that prompts the user to input an integer and then outputs
		//the number with the digits reversed. For example, if the input is 12345,
		//the output should be 54321.
		/*Scanner scan = new Scanner(System.in);
		
		int remainder = 0;
		int reverse = 0;
		System.out.println("Enter an integer:");
		int number = scan.nextInt();
		
		int temp = number;
		while(temp > 0) {
			remainder = temp %10;
			reverse = reverse * 10 +remainder;
			temp = temp / 10;
		}
		System.out.print("You entered "+number+" and the reverse is "+reverse);*/
		//*****************************************************************************
		//Write a program that prompts the user to input a positive integer. 
		//It should then output a message indicating whether the number is a prime number. 
		
		/* Scanner scan = new Scanner(System.in);
		 boolean flag = true;
		 System.out.println("Enter an intiger:");
		 int userInput = scan.nextInt();
		 for(int i=2; i<userInput; i++) {
			 if(userInput % i == 0) {
				 flag = false;
				 break;
			 }
		 }
		if(flag && userInput >1) {
			System.out.println("Prime number");
		}else {
			System.out.println("Not prime number");
		}*/
		//*************************************************************
		/*  Scanner console = new Scanner(System.in);
		     
	        int dividend, divisor;
	        int remainder, hcf = 0;
	        
	        System.out.print("Enter the first number ");
	        dividend = console.nextInt();
	        
	        System.out.print("Enter the second number ");
	        divisor = console.nextInt();        
	        
	        do{
	            remainder = dividend % divisor;
	            
	            if(remainder == 0)
	            {
	                hcf = divisor;
	            }
		    else
	            {
	                dividend = divisor;
	                divisor = remainder;
		    }
	            
	        }while(remainder != 0);

	        System.out.println("HCF: " + hcf);*/
		//*************************************************************
		//Write a do-while loop that asks the user to enter two numbers. The numbers should be
		//added and the sum displayed. The loop should ask the user whether he or she wishes 
		//to perform the operation again. If so, the loop should repeat; otherwise it should terminate. 

		/*Scanner console = new Scanner(System.in);
	     
        int number1, number2;
        char choice;
        
        do
        {
            System.out.print("Enter the first number ");
            number1 = console.nextInt();
          
            System.out.print("Enter the second number ");
            number2 = console.nextInt();
            
            int sum = number1 + number2;
            System.out.println("Sum of numbers: " + sum);
        
            System.out.print("Do you want to continue y/n? ");
            choice = console.next().charAt(0);
            
            System.out.println();
            
        }while(choice=='y' || choice == 'Y');*/
		 Scanner console = new Scanner(System.in);
	        
	        int number,          
	            countPositive = 0, 
	            countNegative = 0,
	            countZero = 0;

	        char choice;
		
	        do
	        {
	            System.out.print("Enter the number ");
	            number = console.nextInt();
	        
	            if(number > 0)
	            {
	                countPositive++;
	            }
	            else if(number < 0)
	            {
	                countNegative++;
	            }
	            else
	            {
	                countZero++;
	            }
	        
	            System.out.print("Do you want to continue y/n? ");
	            choice = console.next().charAt(0);
	            
	        }while(choice=='y' || choice == 'Y');
	        
	        System.out.println("Positive numbers: " + countPositive);
	        System.out.println("Negative numbers: " + countNegative);
	        System.out.println("Zero numbers: " + countZero);
	}

}
