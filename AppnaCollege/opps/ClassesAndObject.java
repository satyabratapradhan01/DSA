
class Employee{
    private int Salary;
    public String UserName;

    public void setSalary(int Salary){
        this.Salary = Salary;
    }

    public void setName(String UserName){
        this.UserName = UserName;
    }

    public int getSalary(){
        return Salary;
    }
}
public class ClassesAndObject {
    public static void main(String[] args) {
        Employee obj1 = new Employee();
        obj1.setSalary(2000);
        obj1.setName("Satya");

        Employee obj2 = new Employee();
        obj2.setSalary(3000);
        obj2.setName("sonu");

        System.out.println("hi " + obj1.UserName + " your salary is " + obj1.getSalary());
        System.out.println("hi " + obj2.UserName + " your salary is " + obj2.getSalary());
    }
}
