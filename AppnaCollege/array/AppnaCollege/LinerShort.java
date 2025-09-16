
class solution{
    public int linerShort(int[] nums, int target){
        for(int i=0; i<nums.length; i++){
            if(nums[i] == target){
                return i;
            }
        }
        return -1;
    }
}

public class LinerShort {
    public static void main(String[] args) {
        int nums[] = {2, 3, 4, 1, 9, 7, 6};
        int target = 1;
        solution ls = new solution();
        System.out.println(ls.linerShort(nums, target));
    }
}
