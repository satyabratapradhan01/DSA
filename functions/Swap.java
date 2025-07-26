package functions;

import java.util.Scanner;

public class Swap {
    public static void swapTwoNumber(int a, int b){
        int temp = a;
        a = b;
        b = temp;
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a firstNumber");
        int a = sc.nextInt();
        System.out.println("Enter a secondNumber");
        int b = sc.nextInt();
        swapTwoNumber(a, b);
    }
}
