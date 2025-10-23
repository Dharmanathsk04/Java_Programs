package kjcoding25.TasksorProblems.challenges;

import java.util.Scanner;

public class mul {
    
    public static void main(String[] args) {
   
        Scanner sc = new Scanner(System.in);

        System.out.println("Welcome to Multiplication Table\n ");

        System.out.println("Enter the number : ");

        int num = sc.nextInt();

        printMultiplicationTable(num);
    }

    public static void printMultiplicationTable(int num){

        int i = 1;

        while(i <=10){

            System.out.println(num+" X "+i+" = "+(num*i));
            i++;
        }

    }
}
