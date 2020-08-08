package two_dimensional;

import java.util.Random;
import java.util.Scanner;

public class Task4 {

    public static void main(String[] args) {

        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        int n;
        int k;
        int m = random.nextInt(6);
        System.out.println("Choose properties of result matrix:");
        System.out.print("Enter the number of raws: ");
        n = scanner.nextInt();

        System.out.print("Enter the number of columns: ");
        k = scanner.nextInt();


        int[][] A = new int[n][m];
        int[][] B = new int[m][k];
        int[][] C = new int[n][k];

        fill_random(A);
        fill_random(B);

        mult_of_matrices(A, B, C);


        System.out.println("Matrix A: ");
        print(A);

        System.out.println("Matrix B: ");
        print(B);
        System.out.println("Multiplication of 2 matrices:");
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
                array[i][j] = random.nextInt(10);
            }

        }

    }

    public static void mult_of_matrices(int[][] A, int[][] B, int[][] C){

        for (int i = 0; i < A.length ; i++) {
            for (int j = 0; j < B[1].length ; j++) {
                for (int k = 0; k <A[i].length ; k++) {
                    C[i][j] += A[i][k] * B[k][j];

                }
            }

        }
    }
}

