public class Exercise44 {
    public static int least(int number1, int number2) {
        int answer;

        if (number1 < number2) {
            answer = number1;
            return answer;
        } else {
            answer = number2;
            return answer;
        }


    }

    public static void main(String[] args){
        int answer = least(15, 10);
        System.out.print("Least: " + answer);
    }

}
