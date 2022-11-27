/* This program was done by 21/04321- Job Gabriel
Question 1: Task four
*/ 
package array;

import java.util.Arrays;
import java.util.Scanner;


public class Array {

    
    public static void main(String[] args) {
        int[] num = {1, 2, 3, 4, 5, 10, 20,30,40,50,60,70,80,90,100};
        
        
        System.out.println(" "+ Arrays.toString(num)); 

Scanner input= new Scanner (System.in);
        System.out.println("Enter a number");
        int a = input.nextInt();
        boolean found = false;

    for (int n : num) {
        if(n==a){
            found = true;
            break;
        }
    }
      if(found)
          System.out.println(a + " is found at index");
      else
          System.out.println(a + " is not found at index");
    }
    
}
