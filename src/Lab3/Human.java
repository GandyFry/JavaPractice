package Lab3;

import java.util.Scanner;

public class Human {
    private int height;
    private String color, name, gender;
    private int weight;
    Leg foot_of_person = new Leg();
    Head head_of_person = new Head();
    Hand hand_of_person = new Hand();

    Human(){
        Scanner in = new Scanner(System.in);
        System.out.print("Name of human: ");
        name = in.next();
        System.out.print("Gender of person: ");
        gender = in.next();
        System.out.print("Height of human: ");
        height = in.nextInt();
        System.out.print("Color of skin: ");
        color = in.next();
        System.out.print("Weight: ");
        weight = in.nextInt();

        foot_of_person.set_info();
        hand_of_person.set_info();
        head_of_person.set_info();
    }

    void get_all_info(){
        System.out.println("Name of human: " + name);
        System.out.println("Gender of person: " + gender);
        System.out.println("Height of human: " + height);
        System.out.println("Color of skin: " + color);
        System.out.println("Weight: " + weight);
        foot_of_person.get_info();
        head_of_person.get_info();
        hand_of_person.get_info();
    }

    public static void main(String[] args) {
        Human pers = new Human();
        pers.get_all_info();
    }
}

