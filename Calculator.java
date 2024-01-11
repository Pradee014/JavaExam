package Exam;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean calculation = true;
        while(calculation) {
            System.out.println("Enter first number: ");
            double num1 = validInput(sc);
            System.out.println("Enter second number: ");
            double num2 = validInput(sc);
            System.out.println("Select an option \n1.Addition \n2.Subtraction\n3.Multiplication\n4.Division\n5.Percentage\n6.Exit");

            int input = sc.nextInt();
            switch (input) {
                case(1):
                    System.out.println("Addition: "+(num1+num2));
                    break;
                case(2):
                    System.out.println("Subtraction: "+(num1-num2));
                    break;
                case(3):
                    System.out.println("Multiplication: "+(num1*num2));
                    break;
                case(4):
                    try {
                        System.out.println("Division: "+(num1/num2));
                    }catch (ArithmeticException e){
                        System.out.println("Divide by zero");
                    }
                    break;
                case (5):
                    try {
                        System.out.println("Percentage: "+((num1/num2)*100));
                    }catch (ArithmeticException e){
                        System.out.println("Divide by zero");
                    }
                    break;
                case (6):
                    calculation=false;
                    break;
            }
        }
        sc.close();

    }

    public static double validInput(Scanner sc) {
        while (true){
            try {
                return Double.parseDouble(sc.next());
            } catch (Exception e){
                System.out.println("Invalid input. please enter valid number");
            }
        }
    }
}
