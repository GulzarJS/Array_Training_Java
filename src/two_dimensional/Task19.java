package two_dimensional;

import java.util.Scanner;

public class Task19 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter dimension of matrix: ");

        int n = scanner.nextInt();
        int number = 1;

        int[][] array = new int[n][n];

        for (int j = 0; j < n; j++) {
            int i;
            if(j == 0){
                i = 0;
            }else{
                i = n-1;
            }
            for (; i < n; i++) {
                int a = i;
                int b = j;
                for(int k = 0; k<i+1 ; k++){
                    if(b == n){
                        break;
                    }

                    array[a--][b++] = number++;

                }

            }
        }
        System.out.println("Here is your matrix");
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

