package POO;

import java.util.Scanner;

public class BillMain {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        Bill b_1 = new Bill();
        System.out.println("Enter your fee: ");
        b_1.setFee(scanner.nextDouble());
        System.out.println("Enter the minutes exceeded: ");
        b_1.setMinutes(scanner.nextDouble());
        scanner.close();
        b_1.showBill();
    }
}
