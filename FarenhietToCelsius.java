package kjcoding25.TasksorProblems.challenges;


import java.util.Scanner;

public class FarenhietToCelsius {
    


 


    public static void main(String[] args) {
        

           Scanner input = new Scanner(System.in);

           System.out.println("Enter celsius value : ");

        //    float celsius = input.nextFloat();


           System.out.println("Enter ferentieght value : ");
           float Farenhiet = input.nextFloat();

           float FarenhietToCelsius = (Farenhiet -32) * 5/9;

           System.out.println("The conversion is : "+FarenhietToCelsius);

           input.close();
    }

        

    }

