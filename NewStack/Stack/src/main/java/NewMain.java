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

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Arrclass as = new Arrclass(3);
       as.set(0, "Aluncedo");
       as.set(1, "Lundi");
       as.set(2, "Langa");
       System.out.println(as.get(1));
       Arrclass ss = new Arrclass(1);
       ss.set(0, "Sakhumzi Chuthsela");
       System.out.println(ss.get(0));
       System.out.println(as.size());
       as.resize();
       System.out.println(as.size());
       as.add(1, "Endinako");
       System.out.println(as.get(1));
       as.remove(0);
       System.out.println(as.size());
    }
}
    

