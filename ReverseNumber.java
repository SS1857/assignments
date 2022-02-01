package session2;

public class ReverseNumber {

    public static void main(String[] args) {

        int c = 23;

        int num1= c % 10;
        int answer = num1 * 10;

        num1 = c / 10;

        answer = answer + num1;

        System.out.println(answer);


    }
}
