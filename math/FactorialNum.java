class Solution{
    public int factIs(int num){
        int fact = 1;
        for(int i=1; i<=num; i++){
            fact *=  i;
        }
        return fact;
    }
}

public class FactorialNum {
    public static void main(String[] args) {
        int n = 5;
        Solution solution = new Solution();
        int factorial = solution.factIs(n);
        System.out.println("Factorial is: " + factorial);
    }
}
