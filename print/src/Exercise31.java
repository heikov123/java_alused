import java.util.Scanner;

public class Exercise31 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.print("First: ");
        int numberOne = Integer.parseInt(reader.nextLine());

        System.out.print("Second: ");
        int numberTwo = Integer.parseInt(reader.nextLine());

        while (numberOne >= numberTwo) {
            System.out.println(numberTwo);
            numberTwo++;
        }
    }
}
