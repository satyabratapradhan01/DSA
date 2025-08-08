
class BankAccount{
    private double balance;
    String accountType;

    public BankAccount(double _balance){
        balance = _balance;
        accountType = "Savings";
    }

    public BankAccount(double _balance, String _acccountType){
        balance = _balance;
        accountType = _acccountType;
    }

    public void printBalance(){
        System.out.println(balance);
    }

     public void printAccountType(){
        System.out.println(accountType);
    }
}


public class Constructor {
    public static void main(String[] args) {
        BankAccount AC1 = new BankAccount(200);
        AC1.printBalance();
        AC1.printAccountType();

         BankAccount AC2 = new BankAccount(200, "Current");
        AC2.printBalance();
        AC2.printAccountType();
    }
}
