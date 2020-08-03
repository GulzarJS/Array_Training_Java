package one_dimensional;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task4 {

    public static void main(String[] args) {


        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        int size ;
        int index;
        boolean is_successful = false;

        System.out.print("Enter the size of array: ");
        size = scanner.nextInt();


        int[] array = new int[size];

        for (int i = 0; i < array.length; i++) {
            array[i] =  random.nextInt(50);
        }

        System.out.println("From which index do you want to delete from the array?\nEnter number between 1 and " + size + ": ");
        index = scanner.nextInt();

        // Deleting number from array

        System.out.println("Array before deletion");
        System.out.println(Arrays.toString(array));

        for (int i = 0; i < array.length; i++) {
            if(i == index){
                array = delete(array, i);
                is_successful = true;

            }
        }

        System.out.println("Array after deletion");
        System.out.println(Arrays.toString(array));
        System.out.println();

        if (is_successful == true){
            System.out.println("Deletion was successful;");
        }else{
            System.out.println("Deletion was not successful;");

        }


    }

    public static int[] delete( int[] array, int index){

        int[] newArray = new int[array.length];
        int j = 0;

        for (int i = 0; i < array.length; i++) {
            if(i == index){
                continue;
            }else{
                newArray[j++] = array[i];
            }
        }

        return  newArray;

    }

}