/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coe528.lab1;

/**
 *
 * @author ujjwal
 */
public class test {
    
   public int gcd(int p, int q){
       int gcd = 0;
         if(p>q){
	       if(q == 0){
                   gcd = p; 
               } 
               else{
                   while(q!=0){
                     int t = q;
                       q = p%q;
                       p = t;
                       gcd = p; 
                   }
               }
            }
       return gcd;
   }
   
   public static void main(String[] args){
       test one = new test();
        int answer = one.gcd(54,24);
        System.out.println(""+answer);
       
}
}