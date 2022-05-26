package methods;

import java.util.Scanner;

public class Example1 {
/*
*  Calculate the final total
   Allow the operator to input: the plan fee and number of overage minutes.
   Charge the user 0.25 for every minute they were over.
   15% tax on the subtotal
* */
    static double fee;
    static double minutes;
public static void main(String[] args) {
    showData();


}
public static double getFee(){
    Scanner scaner=new Scanner(System.in);
    System.out.println("Enter the fee of your plan: ");
    fee=scaner.nextDouble();
    return fee;
}
public static double getMinutes(){
    Scanner scaner=new Scanner(System.in);
    System.out.println("Enter your minutes: ");
    minutes=scaner.nextDouble();
    return minutes;
}
public static double getTax(){
    return 0.15*(getFee()+(0.25*getMinutes()));
}

public static void showData(){
    System.out.println("The fee is: "+getFee());
    System.out.println("The minutes: "+getMinutes());
    System.out.println("The tax is: "+getTax());
}

}
