package conditional_statements;

import java.util.Scanner;

public class LargestNumOfTwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First Number");
        int firstNum = sc.nextInt();
        System.out.println("Enter Second Number");
        int secondNum = sc.nextInt();

        if(firstNum > secondNum){
            System.out.println(firstNum + " is grete");
        }else{
            System.out.println(secondNum + " is greter");
        }
    }
}
