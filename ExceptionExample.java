package Exam;

import java.util.Scanner;

public class ExceptionExample {
    public static void main(String[] args) {
        int[] array = new int[]{1,2,3,4,5};
        try{
            System.out.println("random value of array is "+array[8]);
        }catch (Exception e){
            System.out.println("Exception: "+e.getMessage());
        }
        try{
            String name = null;
            int len= name.length();
            System.out.println("length of string name is : "+len);
        }catch (Exception e){
            System.out.println("Exception: "+e.getMessage());
        }
    }
}
