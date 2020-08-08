package two_dimensional;

import java.util.Scanner;

public class Task6 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of raw and column of matrix: ");

        int n = scanner.nextInt();


        int[][] array = new int[n][n];
        fill_spiral(array);

        System.out.println("Here is your matrix");
        print(array);
    }

    public static void fill_spiral (int[][] array){
        int number = 1;
        int minCol = 0;
        int minRow = 0;
        int maxCol = array.length - 1;
        int maxRow = array.length - 1;

        while (number <= array.length * array.length)
        {
            for (int i = minCol; i <= maxCol; i++)
            {
                array[minRow][i] = number++;
            }

            for (int i = minRow+1; i <= maxRow; i++)
            {
                array[i][maxCol] = number++;
            }

            for (int i = maxCol-1; i >= minCol; i--)
            {
                array[maxRow][i] = number++;
            }

            for (int i = maxRow-1; i >= minRow+1; i--)
            {
                array[i][minCol] = number++;
            }

            minCol++;
            minRow++;
            maxCol--;
            maxRow--;
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
