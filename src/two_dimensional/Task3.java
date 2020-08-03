package two_dimensional;

import java.util.Random;
import java.util.Scanner;

public class Task3 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n;
        int k;

        System.out.print("Enter the number of raws: ");
        n = scanner.nextInt();

        System.out.print("Enter the number of columns: ");
        k = scanner.nextInt();

        int[][] A = new int[n][k];
        int[][] B = new int[n][k];
        int[][] C = new int[n][k];

        fill_random(A);
        fill_random(B);

        sum_of_matrices( A,  B, C);

        System.out.println("Matrix A: ");
        print(A);

        System.out.println("Matrix B: ");
        print(B);
        System.out.println("Summation of 2 matrices:");
        System.out.println("Matrix C: ");
        print(C);


    }



    public static void print(int[][] array){
        for (int[] ints : array) {
            for (int anInt : ints) {
                System.out.print(anInt + "\t");

            }
            System.out.println(" ");
        }
    }

    public static void fill_random(int[][] array){
        Random random = new Random();


        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = random.nextInt(50);
            }

        }

    }

    public static void sum_of_matrices(int[][] A, int[][] B, int[][] C){

        for (int i = 0; i < C.length ; i++) {
            for (int j = 0; j < C[i].length; j++) {
                C[i][j] = A[i][j] + B[i][j];
            }

        }
    }
}
