package Lab2;

import java.util.Scanner;

class Dog {
    String name;
    int age;
    Scanner in = new Scanner(System.in);

    Dog() {
        System.out.print("Age: ");
        age = in.nextInt();
        System.out.print("Name: ");
        name = in.next();
    }

    void Set_name() {
        System.out.print("Name: ");
        name = in.next();
    }

    void Set_age() {
        System.out.print("Age: ");
        age = in.nextInt();
    }

    void Get_name() {
        System.out.print("Name: " + name);
    }

    void Get_age() {
        System.out.print("Age: " + age);
    }

    void translate_to_human_age() {
        System.out.print("Human age: " + 7 * age);
    }

    String ToString() {
        return "Name: " + name + "; Age: " + age;
    }
}
