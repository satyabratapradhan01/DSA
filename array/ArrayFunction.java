package array;

public class ArrayFunction {
    public static void mark(int marks[]){
        for(int i=0; i<marks.length; i++){
            marks[i] = marks[i] + 1;
        }
    }
    public static void main(String[] args) {
        int marks[] = {19, 17, 15};
        mark(marks);
        for(int i=0; i<marks.length; i++){
            System.out.print(marks[i] + " ");
        }
    }
}
