package Exam;

import java.util.Arrays;

public class TwoArrays {
    public static void main(String[] args) {
        int[] array1 = {1,2,3,4,5};
        int[] array2 = {3,2,1,6,4};

        Arrays.sort(array1);
        Arrays.sort(array2);

        if(Arrays.equals(array1,array2)) {
            System.out.println("Both arrays contain same elements");
        }else {
            System.out.println("Arrays are not equal");
        }

    }
}
