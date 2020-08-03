package one_dimensional;

import java.util.Arrays;
import java.util.Random;

public class Task5 {

    public static void main(String[] args) {


        Random random = new Random();
        int size = 20;
        int max = 0;
        int index_max = 0;
        int second_max = 0;
        int index_second_max = 0;

        int[] array = new int[size];

        for (int i = 0; i < array.length; i++) {
            array[i] =  random.nextInt(50);
        }




        System.out.print("Array: ");
        System.out.println(Arrays.toString(array));

        for (int i = 0; i < array.length; i++) {
            if(array[i] > second_max) {
                if(array[i] > max){
                    second_max = max;
                    index_second_max = index_max;
                    max = array[i];
                    index_max = i;

                }else {
                    second_max = array[i];
                    index_second_max = i;
                }





            }
        }


        System.out.println("Second max is " + second_max + " and it is placed in index " + index_second_max );


    }



}
