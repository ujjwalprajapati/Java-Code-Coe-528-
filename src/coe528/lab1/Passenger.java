package coe528.lab1;

public abstract class Passenger {
    private String name;
    protected int age;
    
    public Passenger(String name,int age){
        this.name=name;
        this.age=age;
    }
    public void setName(String n){
        this.name=n;
    }
    public String getName(){
        return name;
    }
    public void setAge(int a){
     this.age  = a;
    }
    public int getAge(){
        return age;
    }
    protected abstract double applyDiscount(double p);    
      
}
