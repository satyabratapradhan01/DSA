class solution{
    public int totalNum(int nums){
        int count = 0;
        while(nums>0){
            int lastDigit = nums%10;
            if(lastDigit%2 != 0){
                count = count + 1;
            }
            nums = nums/10;
        }
        return count;
    } 
}

public class CountOddNum {
    public static void main(String[] args) {
        int num = 12345;
        solution sc = new solution();
        int totalOddNum = sc.totalNum(num);
        System.out.println("Total Odd Number: " + totalOddNum);
    }
}
