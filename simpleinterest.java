package kjcoding25.TasksorProblems.challenges;


import java.util.Scanner;
public class simpleinterest {
    
    public static void main(String[] args) {
        
            Scanner input = new Scanner(System.in);

            System.out.println("Enter price : ");

            float price = input.nextFloat();

            System.out.println("Enter time : ");

            int time = input.nextInt();


            System.out.println("Enter rate : ");

            float rate = input.nextFloat();


            float simpleinterest = (price*time*rate)/100;

            System.out.println("the simple interest is : "+simpleinterest);

            input.close();
    }


}
