package Bank;

public class RestrictAccount extends user {

    public RestrictAccount(String name,double balance,int num,String pin){
    super(name,balance,num,pin);
}
    @Override
    public void Withdraw(double Wamount) {
        
        if(Wamount < 0.0 || Wamount > 500.0 || Wamount > balance)
                System.out.println("The requested amount is not availble in your account ");
            else
                balance = balance - Wamount;
         System.out.println("the balance :" + balance );
        
    }

    @Override
    public void Deposit(double Damount) {
        balance = balance + Damount;
         System.out.println("the balance :" + balance );
        
    }
    
}
