package conditional_statements;
import java.util.Scanner;

public class PassOrFail {
    public static void main(String[] args) {
        Scanner sc = new  Scanner(System.in);
        System.out.println("Enter A number");
        int mark = sc.nextInt();
        if(mark<=600){
            System.out.print("");
        }else{
            System.out.println("Your Total mark is 600. Again enter a correct mark");
            mark = sc.nextInt();
        }
        int percent = (int) ((mark / 600.0) * 100);
        System.out.println("Your percent is: " + percent);
        String result  = (percent >= 33) ? "pass" : "fail";
        System.out.println(result);
    }
}
