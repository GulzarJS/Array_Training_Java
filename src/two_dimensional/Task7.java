package two_dimensional;

import java.util.Random;
import java.util.Scanner;

public class Task7 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n;
        int m;

        System.out.print("Enter the number of raws: ");
        n = scanner.nextInt();

        System.out.print("Enter the number of columns: ");
        m = scanner.nextInt();

        int[][] random_array = new int[n][m];
        int[][] toeplitz_array = new int[n][m];

        fill_random(random_array);
        fill_toeplitz((toeplitz_array));

        System.out.println("===========================");
        print(random_array);
        if(check_toeplitz(random_array)){
            System.out.println("This matrix is toeplitz");
        }else{
            System.out.println("This matrix is not toeplitz");
        }
        System.out.println("===========================");



        print(toeplitz_array);

        if(check_toeplitz(toeplitz_array)){
            System.out.println("This matrix is toeplitz");
        }else{
            System.out.println("This matrix is not toeplitz");
        }
        System.out.println("===========================");

    }


    public static void print ( int[][] array){
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

    public static void fill_toeplitz(int[][] array){
        Random random = new Random();


        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if( !(i == 0 || j == 0)){
                    array[i][j] = array[i-1][j-1];
                }else{
                    array[i][j] = 1 + random.nextInt(9);
                }
            }

        }

    }

    public static boolean check_toeplitz(int[][] array){

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if( !(i == 0 || j == 0)){
                    if(array[i][j] != array[i-1][j-1]){
                        return false;
                    }
                }
            }

        }
        return true;
    }
}
