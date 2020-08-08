package two_dimensional;
import java.util.Random;
import java.util.Scanner;

public class Task1 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n;
        int m;

        System.out.print("Enter the number of raws: ");
        n = scanner.nextInt();

        System.out.print("Enter the number of columns: ");
        m = scanner.nextInt();

        int[][] array = new int[n][m];

        fill_random(array);

        print_even_elements(array);


    }

    public static void print_even_elements(int[][] array){
        for (int[] ints : array) {
            for (int anInt : ints) {
                if ((anInt % 2) == 0) {
                    System.out.print(anInt + "\t");
                }
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
}
