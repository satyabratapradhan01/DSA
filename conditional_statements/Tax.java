package conditional_statements;
import java.util.Scanner;


public class Tax{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your income");
        int income = sc.nextInt();
        int tax;

        if (income < 500) {
            tax = 0;
        }else if (income < 500 && income < 1000) {
            tax = (int) (income * 0.2);
        }else{
            tax = (int) (income * 0.3);
        }

        System.out.println("Your tax is : " + tax );
    }
}