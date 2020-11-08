package Lab3;

import java.util.Scanner;

public class Book {
    private String author, name_of_book;
    int year;
    Scanner in = new Scanner(System.in);
    Book(){
        System.out.print("Name of the book: ");
        name_of_book = in.next();
        System.out.print("Author: ");
        author = in.next();
        System.out.print("year: ");
        year = in.nextInt();
    }
    String get_name(){
        return name_of_book;
    }
    String get_author(){
        return author;
    }
    int get_year(){
        return year;
    }
}
