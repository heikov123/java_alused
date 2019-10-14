import java.util.Scanner;

public class Exercise33 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.print("First: ");
        int numberOne = Integer.parseInt(reader.nextLine());

        System.out.print("Second: ");
        int numberTwo = Integer.parseInt(reader.nextLine());

        int i = numberOne;
        int sum = 0;

        while (i <= numberTwo) {
            sum+=i;
            i++;
        }
        System.out.println("The sum: " + sum);
    }
}
