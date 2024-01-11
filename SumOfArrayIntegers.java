package Exam;

public class SumOfArrayIntegers {
    public static void main(String[] args) {
        int array[] = {8,-19,33,5,-2,7};

        int sum =0;
        for (int i = 0; i < array.length; i++) {
            sum +=array[i];
        }
        System.out.println("Sum of array elements is "+sum);
    }

}
