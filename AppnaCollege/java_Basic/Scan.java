
import java.util.Scanner;

public class Scan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your first name");
        String firstName = sc.next();
        System.out.println("Enter your last name");
        String lastName = sc.next();
        System.out.println(firstName + " " +lastName);
    }
}
