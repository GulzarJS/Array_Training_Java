package one_dimensional;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task9 {

    public static void main(String[] args) {

        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        int size;
        int nb_even = 0;
        int nb_odd = 0;



        System.out.print("Enter size of array: ");
        size = scanner.nextInt();

        int[] array = new int[size];
        int[] new_array = new int[size];


        for (int i = 0; i < array.length; i++) {
            array[i] =  random.nextInt(20);
        }

        System.out.println(Arrays.toString(array));


        for (int i = 0; i < array.length; i++) {
            if((array[i] % 2) == 0){
                nb_even++;
            }
        }

        int j = 0;
        for (int i = 0; i < array.length; i++) {
            if((array[i] % 2) == 0){
                new_array[j++] = array[i];
            }else{
                new_array[nb_even++] = array[i];
            }
        }


        System.out.println(Arrays.toString(new_array));


    }
}
