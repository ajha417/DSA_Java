class Bank extends Thread
{

//    This is the complete solution of static synchronization
    static int total_balance = 10000;
    static int withdraw_amount;
    public Bank(int withdraw_amount)
    {
        this.withdraw_amount = withdraw_amount;
    }
    public static synchronized void withdraw()
    {
        String name = Thread.currentThread().getName();
        if(withdraw_amount <= total_balance)
        {
            System.out.println(name +" withdrew amount");
            total_balance -= withdraw_amount;
        }
        else{
            System.out.println("Insufficient balance");
        }
    }
    public void run()
    {
        withdraw();
    }
}
public class Customer {
    public static void main(String[] args) {
        Bank obj = new Bank(8000); //obj has one lock
        Thread t1 = new Thread(obj);
        Thread t2 = new Thread(obj);
        t1.setName("Amit");
        t2.setName("Sneha");


        Bank obj2 = new Bank(10000); //obj2 also has one lock
        Thread t3 = new Thread(obj2);
        Thread t4 = new Thread(obj2);

        t3.setName("Donald");
        t4.setName("Julia");



        t1.start();
        t2.start();
        t3.start();
        t4.start();
    }
}
