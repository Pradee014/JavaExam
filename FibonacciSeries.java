package Exam;

import java.util.Scanner;

public class FibonacciSeries {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number fibonocci series to be printed");
        int count = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < count; i++) {
            System.out.println(fibonacci(i) + " ");
        }
    }

    private static int fibonacci(int i) {
        if( i <=1)
            return i;
        else
            return fibonacci(i-1) + fibonacci(i-2);
    }
}
