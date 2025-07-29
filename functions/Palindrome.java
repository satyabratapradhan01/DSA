package functions;

public class Palindrome {

    public static void checkNum(int n) {
        int myNum = n;
        int revers = 0;
        while (n > 0) {
            int rem = n % 10;
            revers = rem + (revers * 10);
            n = n / 10;
        }
        if (myNum == revers) {
            System.out.println("num is Palindrome "+ myNum);
        }else{
            System.out.println("num is not a Palindrome "+ myNum);
        }
    }

    public static void main(String[] args) {
        checkNum(12321);
    }
}
