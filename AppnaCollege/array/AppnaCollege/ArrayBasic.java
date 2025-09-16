package array;

import java.util.Scanner;

public class ArrayBasic {

    public static void main(String[] args) {
        int marks[] = new int[100];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Phy Mark");
        marks[0] = sc.nextInt();
        System.out.println("Enter Your chem Mark");
        marks[1] = sc.nextInt();
        System.out.println("Enter Your math Mark");
        marks[2] = sc.nextInt();

        System.out.println("phy : " + marks[0]);
        System.out.println("chem : " + marks[1]);
        System.out.println("math : " + marks[2]);
    }
}
