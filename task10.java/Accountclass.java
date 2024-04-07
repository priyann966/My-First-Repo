public class Accountclass {
    int balance;
    //using the parametrisied constrctor

    public Accountclass(int balance){
        this.balance=balance;
    }
    //default constrctor

    public Accountclass(){

    }
    public void Withdraw(int amount){
        balance=balance-amount;
    }
    public void deposit(int amount){
        balance=balance+amount;
    }
    public static void main(String[] args) {
        Accountclass bb=new Accountclass(200);
        bb.deposit(5);
        System.out.println(bb.balance);

        bb.Withdraw(2);
        System.out.println(bb.balance);
    }
    
}

