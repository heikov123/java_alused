import java.util.Scanner;

public class Exercise32 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.print("Until what? ");
        int number = Integer.parseInt(reader.nextLine());
        int sum = 0;
        int helper = 0;

        while (number >= helper) {
            sum = sum + helper;
            helper++;
        }

        System.out.print(sum);
    }
}
