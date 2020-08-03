package one_dimensional;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task8 {

    public static void main(String[] args) {

        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        int size;
        boolean is_lider = false;


        System.out.print("Enter the size of array: ");
        size = scanner.nextInt();

        int[] array = new int[size];

        System.out.println("Enter elements of array: ");

        for (int i = 0; i < array.length; i++) {
            array[i] =  scanner.nextInt();
        }


        System.out.println(Arrays.toString(array));

        System.out.println("Here are lider numbers");

        int k = 0;

        for(int i = 0; i < array.length; i++){
            for (int j = i; j < array.length; j++){
                if(array[j] > array[i]){
                    is_lider = false;
                    break;
                }else{
                    is_lider = true;
                }
            }
            if(is_lider == true){
                System.out.print(array[i] + " ");
            }
        }


        System.out.println();


    }
}

