import java.util.Scanner;

public class Exercise36 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.print("type numbers: ");
        int number;
        int sum = 1;
        int counter = -1;
        double avarage;
        int even = 0;
        int odd = -1;

        while (true) {
            number = Integer.parseInt(reader.nextLine());
            sum = number + sum;
            counter++;

            if (number % 2 == 0) {
                even++;
            } else {
                odd++;
            }

            if (number == -1) {
                System.out.println("Thank you and see you later!");
                System.out.println("The sum is " + sum);
                System.out.println("How many numbers: " + counter);
                break;
            }
        }

        avarage = sum / counter;
        System.out.println("Avarage: " + avarage);
        System.out.println("Even numbers: " + even);
        System.out.println("Odd numbers: " + odd);

    }
}
