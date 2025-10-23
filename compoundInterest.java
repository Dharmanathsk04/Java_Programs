package kjcoding25.TasksorProblems.challenges;


import java.util.Scanner;
public class compoundInterest {
    

public static void main(String[] args) {
    

    Scanner input = new Scanner(System.in);

    System.out.println("Enter price : ");
    float price = input.nextFloat();


    System.out.println("enter time : ");

    float rate = input.nextFloat();

    System.out.println("Enter time : ");

    float time = input.nextFloat();

    float compoundInterest = price*(1+rate/100)*time;

    System.out.println(compoundInterest);

    input.close();
}

}
