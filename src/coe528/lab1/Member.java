
package coe528.lab1;

public class Member extends Passenger{
    private int yearsOfMembership;

    public Member(String name, int age,int yearsOfMembership) {
        super(name, age);
        this.yearsOfMembership=yearsOfMembership;
    }
    
   

    @Override
    //Let p be the original price
    protected double applyDiscount(double p){
       if(yearsOfMembership>5){
         p = p/2;
       }
       if(yearsOfMembership>1 && yearsOfMembership<5){
         p = (p*9)/10;  }
       return p;
    }
       
    
    }

