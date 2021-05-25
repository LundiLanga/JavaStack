
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
public class NewMain {
   

     static String AKHAWUNTI(){
        Scanner co = new Scanner(System.in);
        System.out.println("FAKA AMANANI AKHO EBHANKI ");
        String AMANANI_EBHANKI= co.next();
        return AMANANI_EBHANKI;
    }
     
      static String password(){
        Scanner co = new Scanner(System.in);
        System.out.println("FAKA IPINI YAKHO");
        String IPINI= co.next();
        if (IPINI.equals(" ")){
            System.out.println("AKUKHONTO, FAKA IPINI YAKHO");
        }
        return IPINI;
     }
     
       static double Init_bal(){
        Scanner co = new Scanner(System.in);
        System.out.println("BHALA IBHALANTSI YAKHO YOKUQALA");
        double IMALI_YOKUQALA = co.nextDouble();
        return IMALI_YOKUQALA;
      }
      
       static double deposit(){
          Scanner co = new Scanner(System.in);
          System.out.println("BHALA IMALI OFUNA UKUYIFAKA");
          double FAKA_IMALI = co.nextDouble();
          return FAKA_IMALI;
          
      }
      static double withdraw(){ 
      Scanner co = new Scanner(System.in);
        System.out.println("BHALA IMALI OFUNA UKUYIKHUPHA:");
        double KHUPHA_IMALI = co.nextDouble();
        return KHUPHA_IMALI;
      }
      
       static double DepositCurrent_Bal(){
  
       return Init_bal() + deposit();   
      }
   
       static double WithdrawalCurr_Bal(){
       
       return Init_bal()- withdraw();
     }
      
       static double output_results(){
      String transaction;
      Scanner co = new Scanner(System.in);
      
       System.out.println(" CHONGA UHLOBO LWENTENGISO:");
       transaction= co.next();
       if (transaction.equals("FAKA IMALI"))
          
       {
           System.out.println(deposit());
           System.out.println("IBHALANTSI YAKHO ENTSHA YILENA R"+ DepositCurrent_Bal());
       }
       
       if (transaction.equals("KHUPHA IMALI")){
           
          System.out.println(withdraw());
          System.out.println("IBHALANTSI YAKHO ENTSHA YILENA:R"+WithdrawalCurr_Bal());
            
       }
       return WithdrawalCurr_Bal();
    
      
      }

    
    public static void main(String[] args) {
        String W = AKHAWUNTI();
        String X = password();
        double Y = Init_bal();
        System.out.println(output_results());
      
  }    
}
