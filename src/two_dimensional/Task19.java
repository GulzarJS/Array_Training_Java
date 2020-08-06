package two_dimensional;

import java.util.Scanner;

public class Task19 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of raw and column of matrix: ");

        int n = scanner.nextInt();


        int[][] array = new int[n][n];
        fill_along_diagonal(array);

        System.out.println("Here is your matrix");
        print(array);
    }

    public static void fill_along_diagonal (int[][] array){
        int number = 1;
        for (int j = 0; j < array.length; j++) {
            int i;
            if(j == 0){
                i = 0;
            }else{
                i = array.length-1;
            }
            for (; i < array.length; i++) {
                int a = i;
                int b = j;
                for(int k = 0; k<i+1 ; k++){
                    if(b == array.length){
                        break;
                    }

                    array[a--][b++] = number++;

                }

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

