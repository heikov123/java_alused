import java.util.Scanner;

public class Exercise41 {
    public static void drawNumber() {
        Scanner reader = new Scanner(System.in);

        int guesses = 0;
        int min = 0;
        int max = 100;
        int random = (int)(Math.random() * max);


        System.out.print("Guess a number: ");
        int guessNumber = Integer.parseInt(reader.nextLine());

        while (guessNumber < random) {
            guesses++;
            System.out.println("The number is greater, " + "guesses made: " + guesses);
            System.out.print("Guess a number: ");
            guessNumber = Integer.parseInt(reader.nextLine());
        }

        while (guessNumber > random) {
            guesses++;
            System.out.println("The number is lesser, " + "guesses made: " + guesses);
            System.out.print("Guess a number: ");
            guessNumber = Integer.parseInt(reader.nextLine());
        }

        while (guessNumber == random) {
            System.out.println("Congratulations, your guess is correct!");
            break;
        }
    }




    public static void main(String[] args){
        Scanner reader = new Scanner(System.in);
        drawNumber();

    }
}
