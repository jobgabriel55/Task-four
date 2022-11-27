/* This program was done by 21/04321- Job Gabriel
Question 2: Task four
*/ 
package prime;

import java.util.Scanner;


public class Prime {

static boolean checkForPrime(int inputNumber)
{
boolean isItPrime = true;
 
if(inputNumber <= 1) 
{
isItPrime = false;
 
return isItPrime;
}
else
{
for (int i = 2; i<= inputNumber/2; i++) 
{
if ((inputNumber % i) == 0)
{
isItPrime = false;
 
break;
}
}
 
return isItPrime;
}
}
 
    
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
 
System.out.println("Enter a number :");
 
int inputNumber = sc.nextInt();
 
boolean isItPrime = checkForPrime(inputNumber);
 
if (isItPrime)
{
System.out.println(inputNumber+" is a prime number.");
}
else
{
System.out.println(inputNumber+" is not a prime number.");
}
 
sc.close();
int i =0;
       int num =0;
       //Empty String
       String  primeNumbers = "";

       for (i = 1; i <= 500; i++)         
       { 		  	  
          int counter=0; 	  
          for(num =i; num>=1; num--)
	  {
             if(i%num==0)
	     {
 		counter = counter + 1;
	     }
	  }
	  if (counter ==2)
	  {
	     //Appended the Prime number to the String
	     primeNumbers = primeNumbers + i + " ";
	  }	
       }	
       System.out.println("Prime numbers from 1 to 500 are :");
       System.out.println(primeNumbers);
    }
    
}
