package Bank;

import java.io.Serializable;



public abstract class user implements FreeDepositAndIquiry , LimitedDeposit, Serializable {

    protected String name;
    protected double balance;
    protected int num;
    protected String pin;
    
    protected abstract void Withdraw(double Wamount);
    
    protected user(String name,double balance,int num,String pin){
        this.name = name;
        this.balance = balance;
        this.num = num;
        this.pin = pin;
    }
    
   
   
   public String getname(){return name;}
   public void setname(String name){this.name = name;}
  
    @Override
   public double getbalance(){return balance;}
   public void setbalance(double balance){this.balance = balance;}
   
   public int getnum(){return num;}
   public void setnum(int num){this.num = num;}
   
   public String getpin(){return pin;}
   public void setpin(String pin){this.pin = pin;}
   
   }