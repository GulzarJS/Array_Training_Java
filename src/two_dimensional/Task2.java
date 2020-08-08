package two_dimensional;

import java.util.Random;
import java.util.Scanner;

public class Task2 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n;
        int m;
        byte direction;

        System.out.print("Enter the number of raws: ");
        n = scanner.nextInt();

        System.out.print("Enter the number of columns: ");
        m = scanner.nextInt();

        int[][] array = new int[n][m];
        fill_random(array);

        System.out.println("Where do you want to turn?");
        System.out.print("Enter 0 for right or 1 for left: ");
        direction = scanner.nextByte();

        System.out.println("==========================");
        System.out.println("Original");
        print(array);


        switch (direction){
            case 0:
                System.out.println("==========================");
                System.out.println("Turn RIGHT");
                print(turn_right(array));
                break;
            case 1:
                System.out.println("==========================");
                System.out.println("Turn LEFT");
                print(turn_left(array));
                break;

        }

        System.out.println("==========================");

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

    public static int[][] turn_right(int[][] array){
        int [][] new_array = new int[array[1].length][array.length];

        for (int i = 0; i < array[1].length ; i++) {
            int k=0;
            for (int j = array.length - 1; j >= 0 ; j--) {
                new_array[i][k++] = array[j][i];
            }

        }

        return new_array;
    }

    public static int[][] turn_left(int[][] array){
        int [][] new_array = new int[array[1].length][array.length];

        int k=array[1].length - 1;
        for (int i = 0; i < array[1].length ; i++) {

            for (int j = 0 ; j < array.length; j++) {
                new_array[i][j] = array[j][k];
            }
            k--;
        }

        return new_array;
    }


}
