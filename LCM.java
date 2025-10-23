package kjcoding25.TasksorProblems.challenges;

import java.util.Scanner;

class LCM {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number : ");
        int frist = input.nextInt();
        System.out.println("Enter number : ");
        int second =input.nextInt();

        int lcm = lcm(frist, second);
        System.out.println("The LCM is: "+lcm);


    }

    public static int lcm(int frist, int second){


        int i = 1;

        while(true){

          int  factor = frist * i;

          if(factor % second == 0){

            return factor;
          }

          i++;
        }

        

    }

}
