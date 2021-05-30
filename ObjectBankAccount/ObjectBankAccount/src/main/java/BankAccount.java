
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Aluncedo Lundi Langa
 */
public class BankAccount {
    
     Scanner console = new Scanner(System.in);
    public String BANK_ACCOUNT;
    public String PASSWORD;
    public double INIT_BALANCE;
    public double DEPOSIT;
    public double WITHDRAW;
    public String transaction;
    
    public BankAccount(String AccNumb, String password, double init_balance){
        BANK_ACCOUNT = AccNumb;
        PASSWORD = password;
        INIT_BALANCE = init_balance;    
    }
    public void input_data(){
       
        
        System.out.println("FAKA AMANANI EBHANKI: ");
        BANK_ACCOUNT = console.next();
        System.out.println("FAKA IPINI YEBHANKI");
        PASSWORD= console.next();
        System.out.println("FAKA IBHALANTSI YOKUQALA: ");
        INIT_BALANCE = console.nextDouble();
        System.out.println("CHONGA UHLOBO LWENTENGISO:" + "\nNDIKHUPHA IMALI" + "\nNDIFAKA IMALI");
        transaction = console.next();
        
    } 
    public void validate_password(){
        
        if (PASSWORD.equals(" "))
        {
            System.out.println("AKUKHONTO, FAKA IPINI YEBHANKI");
        }   
    }
   public double DepositCurrent_Bal(){
  
       return INIT_BALANCE + DEPOSIT;   
   }
   
   public double WithdrawalCurr_Bal(){
       
       return INIT_BALANCE - WITHDRAW;
   }
   
   public void output_results(){
      
       
       if (transaction.equals("NDIFAKA_IMALI"))
       {
           System.out.println("BHALA IMALI OFUNA UKUYIFAKA:");
           DEPOSIT = console.nextDouble();
           System.out.println("IBHALANTSI YAKHO ENTSHA :R " + DepositCurrent_Bal());
       }
       if (transaction.equals("NDIKHUPHA_IMALI")){
           
           System.out.println("FAKA IMALI OFUNA UKUYIKHUPHA:");
           WITHDRAW = console.nextDouble();
           System.out.println("IBHALANTSI ENTSHA R" + WithdrawalCurr_Bal());
       }
          
   }
  
    
}
