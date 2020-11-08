package Lab3;

import java.util.Scanner;

class Head {
    private String color_of_hair, color_of_eye;

    void set_info() {
        Scanner in = new Scanner(System.in);
        System.out.print("Color of hair: ");
        color_of_hair = in.next();
        System.out.print("Color of eye: ");
        color_of_eye = in.next();
    }

    void get_info() {
        System.out.println("Color of hair: " + color_of_hair);
        System.out.println("Color of eye: " + color_of_eye);
    }
}
