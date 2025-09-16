package conditional_statements;

import java.util.Scanner;

public class Adult0rNotAdult {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Age");
        int age = sc.nextInt();

        if (age >= 18) {
            System.out.println("Adult");
        } else if (age > 13 && age < 18) {
            System.out.println("teenager");
        } else {
            System.out.println("Not Adult");
        }

    }
}
