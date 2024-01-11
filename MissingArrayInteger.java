package Exam;

import java.util.Random;
import java.util.stream.IntStream;

public class MissingArrayInteger {
    public static void main(String[] args) {
        Random r = new Random();
        int[] array1 = IntStream.rangeClosed(1,100).toArray();
        array1[r.nextInt(0,101)] =0;
        int sum=0;
        for (int i = 1; i <= 100 ; i++) {
            sum +=i;
        }
        int arraySum=0;
        for (int value : array1) {
            arraySum += value;
        }
        System.out.println("Missing element in array is: "+(sum-arraySum));


    }
}
