package Exam;

import java.time.*;
import java.util.Scanner;

public class AgeCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Choose an option:");
        System.out.println("1. Calculate age from date of birth");
        System.out.println("2. Calculate age between two dates");
        int choice = sc.nextInt();

        switch (choice){
            case (1):
                try {
                    System.out.println("Enter your date of birth (YYYY-MM-DD): ");
                    String dobString = sc.next();
                    LocalDate dob = LocalDate.parse(dobString);
                    calculateAge(dob);
                }catch (Exception e){
                    System.out.println("Invalid format.");
                }
                break;
            case (2):
                try{
                    System.out.println("Enter the start date (YYYY-MM-DD): ");
                    String startDateString = sc.next();
                    LocalDate startDate = LocalDate.parse(startDateString);

                    System.out.println("Enter the end date (YYYY-MM-DD): ");
                    String endDateString = sc.next();
                    LocalDate endDate = LocalDate.parse(endDateString);

                    calculateAge(startDate, endDate);
                }catch (Exception e){
                    System.out.println("Invalid format.");
                }
                break;
            default:
                System.out.println("Invalid Choice");


        }

        sc.close();
    }

    private static void calculateAge(LocalDate dob) {
        LocalDate currentDate = LocalDate.now();
        Period period = Period.between(dob, currentDate);

        System.out.println("Your age is: " + period.getYears() + " years, " +
                period.getMonths() + " months, and " + period.getDays() + " days.");
    }

    private static void calculateAge(LocalDate startDate, LocalDate endDate) {
        Period period = Period.between(startDate, endDate);

        System.out.println("The age is: " + period.getYears() + " years, " +
                period.getMonths() + " months, and " + period.getDays() + " days.");
    }
}
