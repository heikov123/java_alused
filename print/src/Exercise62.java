import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Exercise62 {


    public static void removeLast(ArrayList<String> list) {
        int i = 0;
        for (String word : list) {
            i++;
        }
        list.remove(i - 1);
    }

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        list.add("Java");
        list.add("Python");
        list.add("JavaScript");
        int i = 0;

        removeLast(list);

        System.out.print(list);
    }

}
