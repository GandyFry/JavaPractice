package Lab3;

import java.util.Scanner;

class Leg {
    private int amount;
    private String health;

    void set_info() {
        Scanner in = new Scanner(System.in);
        System.out.print("Amount of legs: ");
        amount = in.nextInt();
        System.out.print("Health of the feet: ");
        health = in.next();
    }

    void get_info() {
        System.out.println("Amount of legs: " + amount);
        System.out.println("Health of the feet: " + health);
    }
}
