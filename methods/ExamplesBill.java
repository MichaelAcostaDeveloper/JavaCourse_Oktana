package methods;

import java.util.Scanner;

public class ExamplesBill {
    /*
    Calculate the final total
    Allow the operator to input: the plan fee and number of overage minutes.
    Charge the user 0.25 for every minute they were over.
    15% tax on the subtotal
    * */
    //import scanner class and variables
    static double fee;
    static double minutes;
    //main method
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Input the plan fee $: ");
        fee=scanner.nextDouble();
        System.out.println("The minutes were over $: ");
        minutes=scanner.nextDouble();
        showOutputs();

    }
    //Create a method to calculate the value for each minute they were over
    public static double getValueOverMinutes(){
        double value=minutes*0.25;
        return value;
    }
    //Create a method to calculate the tax
    public static double getTax(){
        double tax=(fee+getValueOverMinutes())*0.15;
        return tax;
    }
    //Create a method to calculate the final total
    public static double total(){
        return fee+getTax();
    }

    //Create a method to show the outputs;
    public static void showOutputs(){
        System.out.println("Your plan is: $"+fee);
        System.out.println("The cost of over minutes is: $"+getValueOverMinutes());
        System.out.println("The tax is: $"+getTax());
        System.out.println("The total to pay is: $"+total());
    }

}
