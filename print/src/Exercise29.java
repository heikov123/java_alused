import java.util.Scanner;

public class Exercise29 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        int number = 0;

        while (number <= 100) {
            number++;
            if (number % 2 == 0) {
                System.out.println(number);
            }
        }
    }
}
