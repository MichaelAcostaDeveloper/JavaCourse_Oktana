package Loops;

import java.util.Scanner;

public class While_Loop {
    public static void main(String[] args) {
        int hours=40;
        int value=20;

        //get Data
        System.out.println("How many hours did you work:");
        Scanner scanner=new Scanner(System.in);
        double workedHours=scanner.nextDouble();

        //validate
        while(workedHours>hours){
            System.out.println("Invalid entry. Your hours must be between 1 and 40 hours. "+
                    "How many hours did you work: ");
            workedHours= scanner.nextDouble();
        }
        scanner.close();
        double pay=value*workedHours;
        System.out.println("Gross pay: $" +pay);
    }
}
