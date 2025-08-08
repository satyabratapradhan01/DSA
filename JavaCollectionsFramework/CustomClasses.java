

class Data{
    private Integer num;
    private String name;
    Data(int _num, String _name){
        this.num = _num;
        this.name = _name;
    }
    public void setNum(Integer _num){
        this.num = _num;
    }
    public void setNum(String _name){
        this.name = _name;
    }

    public Integer getNum() {
        return num;
    }
    public String getName() {
        return name;
    }
}

public class CustomClasses {
    public static void main(String[] args) {
        Data dataObj1 = new Data(9,"sonu");
        Data dataObj2 = new Data(10, "satya");
        System.out.println(dataObj1.getName());
         System.out.println(dataObj1.getNum());

    }
}
