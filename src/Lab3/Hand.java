package Lab3;

import java.util.Scanner;

class Hand {
    private int amount;
    private String health;

    void set_info() {
        Scanner in = new Scanner(System.in);
        System.out.print("Amount of hands: ");
        amount = in.nextInt();
        System.out.print("Health of the hands: ");
        health = in.next();
    }

    void get_info() {
        System.out.println("Amount of hands: " + amount);
        System.out.println("Health of the hands: " + health);
    }
}
