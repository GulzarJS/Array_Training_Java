package one_dimensional;

import java.util.Random;
import java.util.Scanner;

public class Task2 {

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
            array[i] = random.nextInt(100);
        }

        System.out.println("Which number do you want to search in array?\nEnter number between 1 and 100: ");
        number = scanner.nextInt();

        // Searching number in array

        for (int i = 0; i < array.length; i++) {
            if(array[i] == number){
                counter++;
            }
        }

        if(counter>0){
            if(counter == 1){
                System.out.println("There is " + counter + " " + "'" + number + "'" + " in the array");

            }else {
                System.out.println("There are " + counter + " " + "'" + number + "'" + " in the array");
            }
        }else{
            System.out.println("There is no " + "'" + number + "'" + " in the array");
        }

    }

}