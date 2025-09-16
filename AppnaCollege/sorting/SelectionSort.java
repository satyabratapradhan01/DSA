package sorting;

class Solution {
    public int[] SelectionSort(int[] arr){
        return arr;
    }
}
public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {7, 5, 9, 2, 8};

        System.out.println("Original Array: ");
        for(int num : arr){
            System.out.print(num + " ");
        }
        System.out.println();

        Solution solution = new Solution();

        int[] sortedArr = solution.SelectionSort(arr);

        System.out.print("Sorted array: ");
        for(int num : sortedArr){
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
