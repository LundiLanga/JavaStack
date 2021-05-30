/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Aluncedo Lundi Langa
 */
public class TestBankAccountObject {

    public static void main(String[] args) {
         BankAccount BA = new BankAccount("456", "4567", 998765);
         BA.input_data();
         BA.validate_password();
         BA.output_results();
    }
    
}
