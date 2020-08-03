package one_dimensional;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task7 {

    public static void main(String[] args) {

        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        int size;
        int counter = 0;


        System.out.print("Enter size of array: ");
        size = scanner.nextInt();

        int[] array = new int[size];
        int[] new_array = new int[size];

        for (int i = 0; i < array.length; i++) {
            array[i] =  random.nextInt(20);
        }

        System.out.println(Arrays.toString(array));


        int j = 0;
        for (int i = 0; i < array.length; i++) {
            if(array[i] == 0){
                counter++;
                continue;
            }
            new_array[j++] = array[i];
        }

        for(int i = 0; i < counter; i++){
            new_array[j++] = 0;
        }

        System.out.println(Arrays.toString(new_array));


    }
}
