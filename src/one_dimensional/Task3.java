package one_dimensional;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task3 {

    public static void main(String[] args) {


        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        int size ;
        int number;
        int counter = 0;

        System.out.print("Enter the size of array: ");
        size = scanner.nextInt();


        int[] array = new int[size];

        for (int i = 0; i < array.length; i++) {
            array[i] =  random.nextInt(50);
        }

        System.out.println("Which number do you want to delete from the array?\nEnter number between 1 and 50: ");
        number = scanner.nextInt();

        // Deleting number from array

        System.out.println("Array before deletion");
        System.out.println(Arrays.toString(array));

        for (int i = 0; i < array.length; i++) {
            if(array[i] == number){
                array = delete(array, i);
                i--;
                counter++;
            }
        }

        System.out.println("Array after deletion");
        System.out.println(Arrays.toString(array));
        System.out.println();

        if(counter>0){
            if(counter == 1){
                System.out.println(" " + counter + " " + "'" + number + "'" + " was deleted from the array");

            }else {
                System.out.println(" " + counter + " " + "'" + number + "'" + " were deleted from the array");
            }
        }else{
            System.out.println("There is no " + "'" + number + "'" + " in the array");
        }

    }

    public static int[] delete( int[] array, int index){

        int[] newArray = new int[array.length];
        int j = 0;

        for (int i = 0; i < array.length; i++) {
            if(i == index){
                continue;
            }else{
                newArray[j++] = array[i];
            }
        }

        return  newArray;

    }

}