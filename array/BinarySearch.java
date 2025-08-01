package array;

public class BinarySearch {
    public static int binary(int number[],int key){
        int starting = 0;
        int end = number.length;

        while (starting<=end) { 
            int mid = (starting+end)/2;
            if(number[mid] == key){
                return mid;
            }
            if(number[mid]<=key){
                starting = mid + 1;
            }else{
                end = mid - 1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int number[] = {2, 4, 6, 8, 10, 12, 14, 16, 18, 20, 22};
        int key = 16;
        int index = binary(number, key);
        System.out.println("the index is : " + index);
    }
}
