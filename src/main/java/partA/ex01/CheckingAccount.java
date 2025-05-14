package partA.ex01;

public class CheckingAccount {
    public double totalbalance;;
    public String name;

    public void deposit(int x)
    {
        totalbalance += x;
    }
    public void  displayCustomer()
    {
        System.out.println("Customer: " + name);
        System.out.println("Balance: " + totalbalance);
    }
}
