package two_dimensional;

import java.util.Scanner;

public class Task8 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of raw and column of matrix: ");

        int n = scanner.nextInt();


        int[][] array = new int[n][n];
        fill_magic_square(array);

        System.out.println("Here is your matrix");
        print(array);
    }

    public static void fill_magic_square(int[][] array) {
        int number = 1;
        int i = array.length / 2;
        int j = array.length - 1;

        while (number <= array.length * array.length) {

            if (i == -1 && j == array.length) {
                j = array.length - 2;
                i = 0;
            } else {
                if (j == array.length) j = 0;

                if (i < 0) i = array.length - 1;
            }

            if (array[i][j] != 0) {
                j -= 2;
                i++;
            } else {
                array[i][j] = number++;
                j++;
                i--;
            }
        }
    }

    public static void print ( int[][] array){
        for (int[] ints : array) {
            for (int anInt : ints) {
                System.out.print(anInt + "\t");

            }
            System.out.println(" ");
        }
    }

}
