package Loops;

import java.util.Scanner;

public class nested_loop {
    public static void main(String[] args) {
        //get initial data
        System.out.println("Enter the number of the students: ");
        Scanner scanner=new Scanner(System.in);
        int numberStudent=scanner.nextInt();
        System.out.println("Enter the number of the worked tests: ");
        int numberTest=scanner.nextInt();

        //nested lopps
        for (int i = 0; i < numberStudent; i++) {
            double total=0;
            for (int j = 0; j < numberTest; j++) {
                System.out.println("Enter the score for the test # "+ (j+1) + " of the student # "+(i+1));
                double score=scanner.nextDouble();
                total=total+score;
            }
            double average=total/numberTest;
            System.out.println("The average for the student # "+ (i+1) + " is "+ (average));

        }
        scanner.close();
    }
}
