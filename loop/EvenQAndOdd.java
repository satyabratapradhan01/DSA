
import java.util.Scanner;



public class EvenQAndOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int num = sc.nextInt();
        for(int i=1; i<=num; i++){
            if (i%2 == 0) {
                System.out.println("Even Number: " + i);
            }else{
                System.out.println("Odd: " + i);
            }
        }
    }
}
