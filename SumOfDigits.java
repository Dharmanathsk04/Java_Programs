package kjcoding25.TasksorProblems.challenges;

import java.util.Scanner;

public class SumOfDigits {
    
 public static void main(String[] args) {
    
       Scanner input = new Scanner(System.in);

       System.out.println("Welcome to the sum of digits \n");

       System.out.println("Enter your number : ");
       int num = input.nextInt();

       int sum = sumOfDigits(num);
       System.out.println("Sum of digits is : "+sum);
       
 }

 public static int sumOfDigits(int num){

    int sum = 0;

    while(num>0){

        sum = sum + (num % 10);
        num = num / 10;

    }
    return sum;
 }
    
}
