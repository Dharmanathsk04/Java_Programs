 package kjcoding25.TasksorProblems.challenges;


 import java.util.Scanner;
class b {


    public static void main(String[] args) {
        

        Scanner input = new Scanner(System.in);

        System.out.println("Enter num 1 : ");

        float n1 = input.nextFloat();


        System.out.println("Enter num 2 : ");

        float n2 = input.nextFloat();

        float pro = n1 * n2;

        System.out.println(pro);

        input.close();
    }
    

}