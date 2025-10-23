package kjcoding25.TasksorProblems.challenges;

import java.util.Scanner;
public class oddeven {
    

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        System.out.print("ente ayour number : ");

        int num = input.nextInt();

        if(num%2==0){

            System.out.println("Te number is even");
        }

        else{

            System.out.println("The number is odd");
        }
        input.close();
    }

    
}
