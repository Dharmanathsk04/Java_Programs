package kjcoding25.TasksorProblems.challenges;

import java.util.Scanner;

public class factorial {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Factoral \n");
        System.out.println("Enter your numbe : ");
        int num = input.nextInt();
        long fact = Factoral(num);
        System.out.println("Factorial is : "+fact);

    }

    public static long Factoral(int num){

        if(num < 2){

            return 1;
        }

        long fact = 1;
        int i = 2;

        while(i <= num){

            fact *= i;
            i++;
        }

        return fact;
        
        
       
    }
}
