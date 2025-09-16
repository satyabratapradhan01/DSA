package array;

public class LinearSearch {
    public static int linearSearch(int marks[], int key){
        for(int i=1; i<marks.length; i++){
            if(marks[i] == key){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int marks[] = {2, 4, 6, 8, 10, 12, 14, 16};
        int key = 14;
        int index = linearSearch(marks, key);
        if(index == -1){
            System.out.println("Not Found");
        }else{
            System.out.println("Key is at index : " + index);
        }

    }
}
