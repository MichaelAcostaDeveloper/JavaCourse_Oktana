package Arrays;

import java.util.Random;
import java.util.Scanner;

public class Register {
    public static int number_employee;
    public static String name;
    public static int number_role;
    public static String role;
    public static int project;
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        //input data
        System.out.println("Enter the number of employees: ");
        number_employee = scanner.nextInt();
        Employee[]emp=generateEmployees();
        printEmployees(emp);
    }
    //methods
    //generate the input the personal and technical data
    public static void informationInput(int number) {
            System.out.println("Enter the name of the employee:");
            name = scanner.next();
            do {
            System.out.println("Enter the number of role of the person: \n" +
                    "1. BA\n" +
                    "2. QA\n" +
                    "3. Developer");
            number_role = scanner.nextInt();

                switch (number_role) {
                    case 1:
                        //call method to put the number of projects
                        setProjects();
                        role = "BA";
                        break;
                    case 2:
                        //call method to put the number of projects\
                        setProjects();
                        role = "QA";
                        break;
                    case 3:
                        //call method to put the number of projects
                        setProjects();
                        role = "Developer";
                        break;
                    default:
                        System.out.println("Your enter does not exist!");
                }
            } while((number_role >= 4) || number_role < 1);
    }

    public static void setProjects() {
        System.out.println("Enter the number of projects do you have: ");
        project = scanner.nextInt();
    }

    public static Employee[] generateEmployees(){
        Employee[]e=new Employee[number_employee];
        for (int i = 0; i < number_employee; i++) {
            informationInput(number_employee);
            e[i]=new Employee(name,role,project);
        }
        return e;
    }

    public static void printEmployees(Employee e[]){
        for (int i = 0; i <e.length; i++) {
            System.out.println(e[i] + " | ");
        }
    }
}
