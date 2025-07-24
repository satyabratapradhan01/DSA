
import java.util.Scanner;

public class LargestNumOfThree {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First Number");
        int firstNum = sc.nextInt();
        System.out.println("Enter Second Number");
        int secondNum = sc.nextInt();
        System.out.println("Enter Thired Number");
        int thiredNum = sc.nextInt();

        if ( firstNum > secondNum && firstNum > thiredNum) {
            System.out.println("Largest is " + firstNum);
        } else if(secondNum > thiredNum){
            System.out.println("Largest is " + secondNum);
        }else{
            System.out.println("Largest is " + thiredNum);
        }

        
    }
}
