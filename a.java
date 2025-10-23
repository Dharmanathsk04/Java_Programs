package kjcoding25.TasksorProblems.challenges;


import java.util.Scanner;
public class a {
    



    public static void main(String[] args) {
        

            Scanner input = new Scanner(System.in);
            System.out.print("enter no 1 : ");

            int num1 = input.nextInt();


            System.out.print("Enter num 2 : ");
            int num2 = input.nextInt();


            int add = num1 + num2;
            System.out.println("addition is : "+add);

            int sub = num1-num2;

            System.out.println("substraction is : "+sub);

            int mul = num1*num2;
            System.out.println("multiplication is : "+mul);

            int div = num1/num2;
            System.out.println("division is : "+div);

            int dol = num1%num2;
            System.out.println("modulus is : "+dol);

            input.close();
    }


}
