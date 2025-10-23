package kjcoding25.TasksorProblems.challenges;

import java.util.Scanner;

public class areaTringl {
    



    public static void main(String[] args) {
        
            Scanner input = new Scanner(System.in);

            System.out.println("enter bredth : ");

            float b = input.nextFloat();

            System.out.println("Enter hieght : ");

            float h = input.nextFloat();

            float a1 = b*h;

            //0.5 * b * h;

            System.out.println(a1);

            float b1 = a1/2;

            System.out.println(" ringle area is : "+b1);

            input.close();
    }
}
