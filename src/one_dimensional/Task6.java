package one_dimensional;

import java.util.Arrays;
import java.util.Scanner;

public class Task6 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int N;
        int K;

        System.out.println("N for size of array and K for sum of couple");
        System.out.print("Enter N: ");
        N = scanner.nextInt();
        int[] array = new int[N];

        System.out.print("Enter K: ");
        K = scanner.nextInt();

        // Filling the array

        System.out.println("Enter elements of array: ");

        for (int i = 0; i < array.length; i++) {
            array[i] =  scanner.nextInt();
        }

        System.out.println(Arrays.toString(array));

        System.out.println("Couples: ");

        for (int i = 0; i < array.length; i++) {
            for (int j = i+1; j < array.length; j++){
                if( (array[i]+array[j]) == K){
                    System.out.println("(" + array[i] + "," + array[j] + ")");
                }
            }
        }
    }
}

