package Lab9;

import java.lang.reflect.Array;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        ArrayList<String> BeautifulAutoNumber = new ArrayList<>();

        char[] letter = {'A', 'B', 'E', 'K', 'M', 'H', 'O', 'P', 'C', 'T', 'Y', 'X'};

        long count = 0;
        for (char X: letter){
            for (int i = 0; i < 10; i++){
                for (char Y: letter){
                    for (char Z: letter){
                        String N = String.valueOf(i);
                        for (int R = 1; R < 10; R++) {
                            BeautifulAutoNumber.add(X + N + N + N + Y + Z + "0" + String.valueOf(R));
                            count++;
                        }
                        for (int R = 10; R < 200; R++){
                            BeautifulAutoNumber.add(X + N + N + N + Y + Z + String.valueOf(R));
                            count++;
                        }
                    }
                }
            }
        }
        System.out.println("Кол-во красивых номерных знаков: " + count);

        System.out.print("Введите номер:");
        String number = in.next();

        System.out.print("Поиск перебором: ");
        long start = System.nanoTime();
        boolean isn = BeautifulAutoNumber.contains(number);
        long end = System.nanoTime() - start;
        if (isn)
            System.out.println("Номер найден, поиск занял " + end + "нс");
        else
            System.out.println("Номер не найден, поиск занял " + end + "нс");

        System.out.print("Бинарный поиск: ");
        Collections.sort(BeautifulAutoNumber);
        start = System.nanoTime();
        int index = Collections.binarySearch(BeautifulAutoNumber, number);
        end = System.nanoTime() - start;
        if (index >= 0)
            System.out.println("Номер найден, поиск занял " + end + "нс");
        else
            System.out.println("Номер не найден, поиск занял " + end + "нс");

        System.out.print("Поиск в HashSet: ");
        HashSet<String>  list = new HashSet<>(BeautifulAutoNumber);
        start = System.nanoTime();
        isn = list.contains(number);
        end = System.nanoTime() - start;
        if (isn)
            System.out.println("Номер найден, поиск занял " + end + "нс");
        else
            System.out.println("Номер не найден, поиск занял " + end + "нс");

        System.out.print("Поиск в TreeSet: ");
        TreeSet<String> treeList = new TreeSet<>(BeautifulAutoNumber);
        start = System.nanoTime();
        isn = treeList.contains(number);
        end = System.nanoTime() - start;
        if (isn)
            System.out.println("Номер найден, поиск занял " + end + "нс");
        else
            System.out.println("Номер не найден, поиск занял " + end + "нс");

    }
}
