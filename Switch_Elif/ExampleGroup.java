package Switch_Elif;

import javafx.scene.transform.Scale;

import java.util.Scanner;

public class ExampleGroup {
    public static void main(String[] args) {
        /*
         * If there are 100 students or more, the cost per student is 65 euros.
         * From 50 to 99 students, the cost is 70 euros.
         * From 30 to 49 students, the cost is 95 euros.
         * Less than 30 students, the cost of renting the bus is 4,000 euros, regardless of the number of students.
         * */
        Scanner scanner=new Scanner(System.in);
        double cost_1=65;
        double cost_2=70;
        double cost_3=95;
        double valueBus=4000;
        
        //get data
        System.out.println("Enter the number of students: ");
        int number=scanner.nextInt();

        //process
        if (number>=100){
            System.out.println("The cost per student is: $"+ cost_1);
        } else if (number>=50 && number<=99) {
            System.out.println("The cost per student is: $"+ cost_2);
        } else if (number>=49 && number<=95) {
            System.out.println("The cost per student is: $"+ cost_3);
        }else if(number<=30){
            System.out.println("The cost per students has changed to: $"+valueBus/number);
        }
    }
}
