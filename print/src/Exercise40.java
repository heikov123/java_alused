import java.util.Scanner;


public class Exercise40 {
    public static void printStars(int amount) {
        int i = 0;

        while (i  < amount) {
            i++;
            System.out.print("*");
        } if (i >= amount) {
            System.out.println("");
        }
    }

    public static void printWhitespaces(int size) {
        int i = 0;

        while (i < size) {
            i++;
            System.out.print(" ");
        }
    }

    public static void printTriangle(int size) {
        int i = 0;
        int x = size;

        while (i < size) {
            i++;
            x--;
            printWhitespaces(x);
            printStars(i);
        }
    }

    public static void xmasTree(int height) {
        int i = -1;
        int x = 0;
        int y = height;

        while (x < height) {
            i = i +2;
            x++;
            y--;

            printWhitespaces(y);
            printStars(i);
        } if (x >= height) {
            printWhitespaces(x - 2);
            System.out.println("***");
            printWhitespaces(x - 2);
            System.out.println("***");
        }
    }

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        printTriangle(4);
        System.out.println("");
        xmasTree(10);
    }
}
