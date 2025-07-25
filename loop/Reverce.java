
import java.util.Scanner;

public class Reverce {
    public static void main(String[] args) {
        Scanner sc = new  Scanner(System.in);
        System.out.println("enter a number: ");
        int number = sc.nextInt();
        int i = 0;
        while (number > 0) { 
            int lastDigit = number % 10;
            System.out.print(lastDigit);
            number = number/10;
        }
        System.out.println();
    }
}
