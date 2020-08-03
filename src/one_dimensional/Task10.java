package one_dimensional;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task10 {

    public static void main(String[] args) {

        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        int size;
        int k; // nb_step
        byte direction;



        System.out.print("Enter size of array: ");
        size = scanner.nextInt();



        int[] array = new int[size];
        int[] new_array = new int[size];


        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(20);
        }


        System.out.println("Which direction do you want to turn?");
        System.out.print("Enter 0 for left 1 for right: ");
        direction = scanner.nextByte();

        System.out.print("How many step do you want to turn? ");
        k = scanner.nextInt();

        if(k > size){
            k = k - size;
        }

        System.out.println(Arrays.toString(array));

        switch (direction){
            case 0 :
                new_array = turn_left(array, k);
                break;
            case 1 :
                new_array = turn_right(array, k);
                break;
        }


        System.out.println(Arrays.toString(new_array));


    }

    public static int[] turn_right( int[] arr, int k){

        int[] new_arr = new int[arr.length];
        int c_k = k;
        int j = 0;

        for (int i = 0; i < arr.length ; i++) {
            while( c_k > 0){
                new_arr[j++] = arr[arr.length - c_k];
                c_k--;
            }
            if(i < (arr.length - k)) {
                new_arr[j++] = arr[i];
            }
        }

        return new_arr;
    }

    public static int[] turn_left( int[] arr, int k){

        int[] new_arr = new int[arr.length];
        int c_k = k;
        int j = 0;

        for (int i = 0; i < arr.length ; i++) {
            if( c_k > 0){
                new_arr[arr.length - c_k] = arr[i];
                c_k--;
            }else  {
                new_arr[j++] = arr[i];
            }
        }

        return new_arr;
    }
}
