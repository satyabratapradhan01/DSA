class Solution{
    public int countDigit(int n){
        int count = (int)(Math.log10(n) + 1);
        return count;
    }

    public boolean isArmstrong(int n){
        int count = countDigit(n);
        int sum = 0;
        int num = n;
        boolean value = false;
        while (n>0) {
            int lastDigit = n%10;
            sum += Math.pow(lastDigit, count);
            n = n/10;
        }

        if(sum == num){
            return !value;
        }

        return value;
        
    }
}



public class ArmstrongNum {
    public static void main(String[] args) {
        int num = 153;
        Solution solution = new Solution();
        boolean ans = solution.isArmstrong(num);
        System.out.println(ans);
    }
}
