package two_dimensional;

import java.util.Scanner;

public class Task20 {

    public static void main(String[] args) {

        Scanner scanner =  new Scanner(System.in);
        int n;


        System.out.print("Enter ODD number for number of raw and column of matrix: ");
        n = scanner.nextInt();

        if((n % 2) == 0){
            System.err.println("Please,enter ODD NUMBER");
            n = scanner.nextInt();
        }

        int[][] array = new int[n][n];

        int a = 0;
        int b = n;
        int k = (n/2) - 1;
        for (int j = 0; j < n; j++) {

            for (int i = a; i < b; i++) {
                array[i][j] = (n/2) + k;
                array[j][i] = (n/2) + k;
                array[(n - 1) - i][(n - 1) - j] = (n/2) + k;
                array[(n - 1) - j][(n - 1) - i] = (n/2) + k;
            }
            k--;
            a++;
            b--;
        }




        print(array);
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
