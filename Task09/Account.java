package Task09;
public class Account {
     public static double interestRate=5.0;
    String name="default account";
    double balance=0.0;
    public Account()
            {
                
            }
    public Account(String n, double b)
    {
        name=n;
        balance=b;
    }
    public String nameKi()
    {
       return name;
    }
    public double balanceKi()
    {
        
        return balance;
    }

    public void nameBoshao(String n)
    {
        name=n;
    }
    public void balanceBoshao(double b)
    {
        balance=b;
    }
    public void withdraw(double w)
    {
       if ((balance-w)<=100)
       {
        System.out.println("The account balance after deducting withdraw amount is equal to or less than minimum. Cannot withdraw");
       }
       else
       {
           balance=balance-w;
           System.out.println("Withdraw successful! New balance is: " + balance);

       }
        
    }
}
   
    
 
