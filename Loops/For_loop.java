package Loops;

import java.util.Scanner;

public class For_loop {
    public static void main(String[] args) {
        System.out.println("Enter some text: ");
        Scanner scanner=new Scanner(System.in);
        String word=scanner.next();
        scanner.close();
        int numberTimes=0;

        //Search text for the letter e
        for (int i = 0; i < word.length(); i++) {
            char currentLetter=word.charAt(i);
            if(currentLetter == 'E' || currentLetter == 'e'){
                numberTimes++;
            }
        }
        //print the results
        if(numberTimes!=0){
            System.out.println("This text contains " +word.length()+ " letters, and there are " +numberTimes+ " times the letter 'E'.");
        } else{
            System.out.println("This text contains " +word.length()+ " letters, but not contain the letter 'E'.");
        }
    }
}
