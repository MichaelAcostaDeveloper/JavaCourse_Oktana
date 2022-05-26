package Loops;

import java.util.Scanner;

public class PracticeLoops {
    public static void main(String[] args) {
        /*
        * A person purchased a product to pay in 20 months.
        * The first month he paid $10, the second $20, the third $40, and so on.
           Make a program to determine how much you must pay each month and the total amount you will pay after 20 months.
        */
        //variables and scanner class
        Scanner scanner=new Scanner(System.in);
        int months=10;
        double total=0;
        int initial_fee=5;
        //get data
        for (int i = 1; i <= months; i++) {
            initial_fee=initial_fee*2;
            total=total+initial_fee;
            System.out.println("The fee number "+i+ " is: "+initial_fee);
        }
        System.out.println("The total is: $"+total);
        //process
        //out
    }
}
