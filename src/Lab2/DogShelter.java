package Lab2;

import java.util.ArrayList;
import java.util.Scanner;

public class DogShelter {
    private ArrayList<Dog> shelter = new ArrayList<>();
    void addDog(){
        Dog pet = new Dog();
        shelter.add(pet);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        DogShelter test = new DogShelter();

        System.out.print("Колличество собак: ");
        int num = in.nextInt();
        int i = 0;
        while(i < num){
            test.addDog();
            i++;
        }

        for (i = 0; i < num; i++){
            System.out.println(i+1 + ": " + test.shelter.get(i).ToString());
        }
    }
}

