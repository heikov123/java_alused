import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Exercise63 {
    public static int sum(ArrayList<Integer> list) {
        int sum = 0;

        for (Integer x : list) {
            sum+=x;
        }
        return sum;
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(3);
        list.add(5);
        list.add(4);
        list.add(7);

        System.out.println("The sum: " + sum(list));
    }
}
