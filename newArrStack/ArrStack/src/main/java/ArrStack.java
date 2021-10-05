/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Aluncedo Lundi Langa
 */
public class ArrStack {
     
      String[] a;
     int n;
     public ArrStack(int np){
     n = np;
     a = new String[n];
     }
     public int size() {
     return n;
     }

     public void set(int i, String x) {
     if ((i>=0)&&(i<n)){a[i] = x;}
     }
     public String get(int i) {
     String r = "Out of bound";
     if ((i>=0)&&(i<n)){r=a[i];}
     return(r);
     }
     public void add(int i, String name){
         if(n+1>a.length)resize();
         System.arraycopy(a, i, a, i+1, n-i);
          a[i] = name;
           n++;
     }
     public String remove(int i){
         String x = a[i];
         System.arraycopy(a, i+1, a, i, n-i-1);
         n--;
         if (a.length >= 3*n) resize();
         return x;
     }
     public void resize(){
            String [] b = new
         String[Math.max(n*2,1)];
          System.arraycopy(a, 0, b, 0, n);
          a = b;
     }
    
}
