package kjcoding25.TasksorProblems.challenges;


import java.util.Scanner;
public class perimeter {
    

  public static void main(String[] args) {
    

      Scanner input = new Scanner(System.in);

      System.out.println("Enter a : ");

      float a = input.nextFloat();

      System.out.println("Enter b : ");

      float b = input.nextFloat();

      System.out.println("Enter c : ");

      float c = input.nextFloat();

      System.out.println("Enter D : ");

      float d = input.nextFloat();

      float perimeter = a+b+c+d;

      System.out.println(perimeter);

      input.close();
  }

    


}
