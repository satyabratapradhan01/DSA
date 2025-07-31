package array;

public class LargestInArray {

    public static int largestElement(int marks[]) {
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        for (int i = 1; i < marks.length; i++) {
            if (largest < marks[i]) {
                largest = marks[i];
            }
            if (smallest > marks[i]) {
                smallest = marks[i];
            }
        }
        System.out.println("smallest value is : "+ smallest);
        return largest;
    }

    public static void main(String[] args) {
        int marks[] = {2, 4, 6, 8, 10, 12, 20, 14, 16};
        int largest = largestElement(marks);
        System.out.println("largest value is : " + largest);
    }
}
