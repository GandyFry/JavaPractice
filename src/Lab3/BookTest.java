package Lab3;

class BookTest {
    public static void main(String[] args) {
        Book obj = new Book();
        System.out.println("Name of the book: " + obj.get_name());
        System.out.println("Auther of the book: " + obj.get_author());
        System.out.println("Year of the book: " + obj.get_year());
    }
}
