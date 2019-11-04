import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Exercise64 {
    public static double average(ArrayList<Integer> list) {
        int helper = 0;
        int sum = 0;
        double avg = 0;

        for (Integer x : list) {
            sum+=x;
            helper++;
        }
        avg = sum / helper;
        return avg;
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(3);
        list.add(10);
        list.add(15);
        list.add(7);

        System.out.println("Avarage of the numbers: " + average(list));
    }

}
