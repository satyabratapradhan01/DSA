class Solution{
    public boolean checkNum(int nums){
        int n = nums;
        int revNum = 0;
        boolean value = false;
        while (nums>0) { 
            int lastDigit = nums%10;
            revNum = (revNum * 10) + lastDigit;
            nums = nums/10;
        }
        if(revNum == n){
            return !value;
        }
        return value;
    }
}



public class PalindromeNum{
    public static void main(String[] args) {
        int num = 110011;
        Solution sc = new Solution();
        boolean isPalindrome = sc.checkNum(num);
        System.out.println(isPalindrome);
    }
}
