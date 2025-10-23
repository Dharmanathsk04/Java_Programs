package kjcoding25.TasksorProblems.challenges;

import java.util.Scanner;

public class oddSum {
    

    public static void main(String[] args) {
        

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int num = input.nextInt();
        int sum = oddSume(num);
        System.out.println("oddSum till "+num+"is : "+sum);


    }

    public static int oddSume(int num) {


        int sum = 0;
        int i = 1;

        while(i <=num){

            sum = sum + i;
            i+=2;
        }

        return sum;

     
    }
}
