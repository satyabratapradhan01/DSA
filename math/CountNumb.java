class solution{
    public int totalNum(int nums){
        if(nums == 0){
            return 1;
        }
        int count = 0;
        while (nums>0) { 
            nums = nums/10;
            count = count + 1;
        }

        return count;
    }
}

public class CountNumb {
    public static void main(String[] args) {
        int num = 20001;
        solution s = new solution();
        int totalNum = s.totalNum(num);
        System.out.println("total num: " + totalNum);
    }
}
