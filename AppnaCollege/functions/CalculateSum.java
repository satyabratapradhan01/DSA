package functions;

import java.util.Scanner;

public class CalculateSum {
    public static int sumOfTwoNumber(int a, int b){
        int sum = a + b;
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a firstNumber");
        int a = sc.nextInt();
        System.out.println("Enter a secondNumber");
        int b = sc.nextInt();
        int sum = sumOfTwoNumber(a, b);
        System.out.println("sum of two number is: " + sum);

    }
}
