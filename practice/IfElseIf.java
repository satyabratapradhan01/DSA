

import java.util.Scanner;

class Solution{
    public  void studentGread(int mark){
        if(mark>=90){
            System.out.println("Gread A");
        }else if(mark>=80){
            System.out.println("Gread B");
        }else if(mark>=70){
            System.out.println("Gread C");
        }else if(mark>=60){
            System.out.println("Gread D");
        }else if(mark>=50){
            System.out.println("Gread E");
        }else{
            System.out.println("Fail");
        }
    }
}

 class IfElseIf {
    public static void main(String[] args) {
        Solution sol = new Solution();
        int mark;

        Scanner Sc = new Scanner(System.in);
        System.out.println("Enter A Mark:-");
        mark = Sc.nextInt();

        sol.studentGread(mark);
    }
}
