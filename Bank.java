package Bank;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;

public class Bank {

 public static void main (String[]args) throws FileNotFoundException , IOException , ClassNotFoundException{
        
     Scanner input = new Scanner(System.in);
     
      System.out.println("Welcome To Bank Website ");
     System.out.println("-------------------------------------------- ");
     
     int r;
     do{
             System.out.print("Enter name: ");
             String a1 = input.next();
             System.out.print("Enter num: ");
             int a3 = input.nextInt();
             System.out.print("Enter pin: ");
             String a4 = input.next();
             user a = new NormalAccount(a1,0.0,a3,a4);
             user b = new ControlledAccount(a1,0.0,a3,a4);
             user c = new RestrictAccount(a1,0.0,a3,a4);
             System.out.println("-------------------------------------------- ");
      try{   
     System.out.println("1: Creat account ") ;
     System.out.print("Enter your choise: ");
     int menu = input.nextInt();
      
     // start of switch menu
     switch(menu){
         
         case 1:
              System.out.println("-------------------------------------------- ");
             System.out.println("Enter Account Tybe: ");
                    System.out.println("1: Normal Account ") ;
                     System.out.println("2: Controlled Account ");
                       System.out.println("3: Restrict Account ");
                       System.out.print("Enter your choise: ");
                       int u1 = input.nextInt();
    switch(u1){
        
        case 1: 
             System.out.println("-------------------------------------------- ");
             System.out.println("Enter Operation type: ");
                    System.out.println("1: Deposit ") ;
                     System.out.println("2: Witdraw ");
                       System.out.println("3: Balance ");
                       
                       System.out.print("Enter your choise: ");
                       int u2 = input.nextInt();
    switch(u2){
                  case 1:

               System.out.println("-----------------------------------------------------------");
               System.out.print("Please Enter Deposite Amount: ");
               double Damount = input.nextInt();
               a.Deposit(Damount);
               System.out.println("-----------------------------------------------------------");
                File f = new File("BankAccounts");
               FileInputStream fi = new FileInputStream(f);
               ObjectInputStream is = new ObjectInputStream(fi); 
               System.out.println("name: "+a.getname()+" balance : "+a.getbalance()+" num : "+a.getnum()+" pin : "+a.pin);
               
               break;
          case 2:
              System.out.println("-----------------------------------------------------------");
               System.out.print("Please Enter Witdraw Amount: ");
               double Wamount = input.nextInt();
               a.Withdraw(Wamount);
               System.out.println("-----------------------------------------------------------");
                File f1 = new File("BankAccounts");
               FileInputStream fi1 = new FileInputStream(f1);
               ObjectInputStream is1 = new ObjectInputStream(fi1); 
               System.out.println("name: "+a.getname()+" balance : "+a.getbalance()+" num : "+a.getnum()+" pin : "+a.pin);
               
               break;
          case 3:
               System.out.println("-----------------------------------------------------------");
               System.out.print("your balance: ");
               System.out.println("The balance: "+a.getbalance());
                System.out.println("-----------------------------------------------------------");
                File f2 = new File("BankAccounts");
               FileInputStream fi2 = new FileInputStream(f2);
               ObjectInputStream is2 = new ObjectInputStream(fi2); 
               System.out.println("name: "+a.getname()+" balance : "+a.getbalance()+" num : "+a.getnum()+" pin : "+a.pin);
               
              break;
          
             
             } // u2
      break;
       
        case 2:
            System.out.println("-----------------------------------------------------------");
               System.out.println("Enter Operation type: ");
                    System.out.println("1: Deposit ") ;
                     System.out.println("2: Witdraw ");
                       System.out.print("Enter your choise: ");
                       int u3 = input.nextInt();
     switch(u3){
         case 1:
              System.out.println("-----------------------------------------------------------");
               System.out.print("Please Enter Deposite Amount: ");
               double Damount = input.nextInt();
                b.Deposit(Damount);
               System.out.println("-----------------------------------------------------------");
                File f = new File("BankAccounts");
               FileInputStream fi = new FileInputStream(f);
               ObjectInputStream is = new ObjectInputStream(fi); 
               System.out.println("name: "+b.getname()+" balance : "+b.getbalance()+" num : "+b.getnum()+" pin : "+b.pin);
               
               break;
          case 2:
              System.out.println("-----------------------------------------------------------");
               System.out.print("Please Enter Witdraw Amount: ");
               double Wamount = input.nextInt();
                b.Withdraw(Wamount);
                System.out.println("-----------------------------------------------------------");
                File f1 = new File("BankAccounts");
               FileInputStream fi1 = new FileInputStream(f1);
               ObjectInputStream is1 = new ObjectInputStream(fi1); 
               System.out.println("name: "+b.getname()+" balance : "+b.getbalance()+" num : "+b.getnum()+" pin : "+b.pin);
               
              
               break;
          
              } break; // u3
           
                                           
          case 3:
              System.out.println("-----------------------------------------------------------");
              System.out.println("Enter Operation type: ");
                    System.out.println("1: Deposit ") ;
                     System.out.println("2: Witdraw ");
                       System.out.print("Enter your choise: ");
                       int u4 = input.nextInt();
         
            
       switch(u4){
           
           case 1:
              System.out.println("-----------------------------------------------------------");
               System.out.print("Please Enter Deposite Amount: ");
               double Damount = input.nextInt();
                c.Deposit(Damount);
                 System.out.println("-----------------------------------------------------------");
                File f = new File("BankAccounts");
               FileInputStream fi = new FileInputStream(f);
               ObjectInputStream is = new ObjectInputStream(fi); 
               System.out.println("name: "+c.getname()+" balance : "+c.getbalance()+" num : "+c.getnum()+" pin : "+c.pin);
              break;
          case 2:
               System.out.println("-----------------------------------------------------------");
               System.out.print("Please Enter Deposite Amount: ");
               double Wamount = input.nextInt();
                c.Withdraw(Wamount);
                File f1 = new File("BankAccounts");
               FileInputStream fi1 = new FileInputStream(f1);
               ObjectInputStream is1 = new ObjectInputStream(fi1);
               System.out.println("name: "+c.getname()+" balance : "+c.getbalance()+" num : "+c.getnum()+" pin : "+c.pin);
                default:
             System.out.println("Error");
             break;
              
               
              } break;
             // u4
    } break;
         default:
             System.out.println("Error");
             break;
         }
      
      }catch(IOException e){
          
          System.out.println("Wrong Entey");
         
          break;
      } 
      
      try{
      System.out.println("-----------------------------------------------------------");
         File outFile = new File("BankAccounts");
         FileOutputStream outFileStream = new FileOutputStream(outFile);
         ObjectOutputStream outObjectStream = new ObjectOutputStream(outFileStream); 
            outObjectStream.writeObject(a);
            outObjectStream.writeObject(b);
            outObjectStream.writeObject(c);  
            System.out.println("save successfully  "+outFile);
            
      }catch(IOException e3){
         System.out.println("Wrong Entey");
         break;
     } 
      
     try{
           System.out.println("-----------------------------------------------------------");
             System.out.println("0: add another account ");
               System.out.println("press any number except zero to exite ");
                System.out.print("Enter your choise: ");
                   r = input.nextInt();
     }catch(Exception e1){
         System.out.println("Wrong Entey");
         break;
     } 
     
     
}while(r==0);
     
     //*****************************************************************
   
     
         
     
     
 }
 
 
}
