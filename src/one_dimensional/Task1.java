package one_dimensional;

import java.util.Random;
import java.util.Scanner;

public class Task1 {


    public static void main(String[] args) {

        // Initializing array for holding students' weight
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        int nb_students;
        int milk_bottle_volume = 900; // ml
        int milk_for_1student = 200; // ml
        int nb_milk_bottle;
        int nb_skinny_students = 0;

        System.out.print("How many students are there in class? " );
        nb_students = scanner.nextInt();

        int[] weight_students = new int[nb_students];

        for(int i=0;i<weight_students.length;i++){
            weight_students[i]= 25 + random.nextInt(25);
        }



        for(int i=0;i<weight_students.length;i++){
            if(weight_students[i] < 30){
                nb_skinny_students++;
            }
        }



        nb_milk_bottle = (nb_skinny_students * milk_for_1student) / milk_bottle_volume ;

        if ((nb_skinny_students * milk_for_1student) % milk_bottle_volume != 0) {
            nb_milk_bottle++;
        }

        System.out.println("Every day " + nb_milk_bottle + " bottle of milk and " + nb_skinny_students +" bun will be given to students");






    }


}

