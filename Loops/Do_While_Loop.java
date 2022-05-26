package Loops;

import java.util.Scanner;

public class Do_While_Loop {
    public static void main(String[] args) {
        String answer;
        do {
            System.out.println("Enter a number: ");
            Scanner scanner=new Scanner(System.in);
            double num1=scanner.nextDouble();
            System.out.println("Enter another number: ");
            double  num2=scanner.nextDouble();
            double sum=num1+num2;
            System.out.println("The answer is: "+sum);
            System.out.println("Would you like to start over: (y/n)");
            answer=scanner.next();

        }while(answer.equals("y"));

    }
}
