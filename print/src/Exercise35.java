import java.util.Scanner;

public class Exercise35 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.print("Type a number: ");
        int numberOne = Integer.parseInt(reader.nextLine());

        int helper = 0;

        int result = (int) Math.pow(2, helper);

        while (numberOne >= helper) {
            result+=result;
            helper++;
        }
        System.out.print(result - 1);
    }
}
