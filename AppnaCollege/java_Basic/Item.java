public class Item {
    public static void main(String[] args) {
        float pencil = 10.5f;
        float pen = 14.5f;
        float eraser = 5f;

        float total =  pencil + pen + eraser;
        float Gst = (total/100) * 18;

        int withGst = (int) (total + Gst);

        System.out.println(withGst);
    }
}
