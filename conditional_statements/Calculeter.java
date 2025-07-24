
import java.util.Scanner;

public class Calculeter {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a first number");
        int a = sc.nextInt();
        System.out.println("Enter a second number");
        int b = sc.nextInt();
        System.out.println("Enter a operators");
        String operators = sc.next();

        switch (operators) {
            case "+":
                System.out.println(a + b);
                break;
                case "-":
                System.out.println(a - b);
                break;
                case "*":
                System.out.println(a * b);
                break;
                case "/":
                System.out.println((a / b));
                break;
            default:
                System.out.println("not exist");
        }
    }
}
