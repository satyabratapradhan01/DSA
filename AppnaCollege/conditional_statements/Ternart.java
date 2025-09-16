package conditional_statements;
import java.util.Scanner;

public class Ternart {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter A Number");
        int number = sc.nextInt();

        String Type = ((number%2) == 0) ? "Even" : "Odd";
        System.out.println(Type);
    }
}
