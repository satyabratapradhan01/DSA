class Solution{
    public int revNum(int nums){
        int revNum = 0;
        while (nums>0) { 
            int lastNum = nums%10;
            revNum = (revNum * 10) + lastNum;
            nums = nums/10;
        }
        return revNum;
    }
}



public class ReverseNum {
    public static void main(String[] args) {
        int num = 123456;
        Solution solution = new Solution();
        int ReverseNum = solution.revNum(num);
        System.out.println("Reverse Number is: " + ReverseNum);
    }
}
