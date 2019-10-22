public class Exercise45 {
    public static int greatest(int number1, int number2) {
        int answer;

        if (number1 > number2) {
            answer = number1;
            return answer;
        } else {
            answer = number2;
            return answer;
        }
    }

    public static void main(String[] args) {
        int answer = greatest(25, 10);
        System.out.print("Greatest: " + answer);
    }

}
