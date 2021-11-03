import java.util.*;

public class Account
{
  
  
  private double balance;
  private String name;
  private long acctNum;

  //----------------------------------------------
  //Constructor -- initializes balance, owner, and account number
  //----------------------------------------------
  public Account(double initBal, String owner, long number)
  {
    balance = initBal;
    name = owner;
    acctNum = number;
  }

  //----------------------------------------------
  // Checks to see if balance is sufficient for withdrawal.
  // If so, decrements balance by amount; if not, prints message.
  //----------------------------------------------
  public void withdraw(double amount)
  {
    if (balance >= amount)
       balance -= amount;
    else
       System.out.println("Insufficient funds");
  }

  //----------------------------------------------
  // Adds deposit amount to balance.
  //----------------------------------------------
  public void deposit(double amount)
  {
    balance += amount;
  }

  //----------------------------------------------
  // Returns balance.
  //----------------------------------------------
  public double getBalance()
  {
    return balance;
  }


  //----------------------------------------------
  // Returns a string containing the name, account number, and balance.
  //----------------------------------------------
  public String toString()
  {
    String all="";
    all=all+name+" "+acctNum+" "+balance;
    return all;
  }

  //----------------------------------------------
  // Deducts $10 service fee
  //----------------------------------------------
  public void chargeFee()
  {
    if(balance<10) System.out.println("Insufficient funds");
    else balance-=10;
  }

  //----------------------------------------------
  // Changes the name on the account 
  //----------------------------------------------
  Random rand=new Random();
  public int randomInRange(int a, int b){
      
      
      int d=a-b;
      return rand.nextInt(d)+b;
  }
  public void changeName(String newName)
  {
    name=newName;
  }
}